package typings.firebase.mod.firebase.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result returned by list().
  */
@js.native
trait ListResult extends js.Object {
  
  /**
    * Objects in this directory.
    * You can call getMetadata() and getDownloadUrl() on them.
    */
  var items: js.Array[Reference] = js.native
  
  /**
    * If set, there might be more results for this list. Use this token to resume the list.
    */
  var nextPageToken: String | Null = js.native
  
  /**
    * References to prefixes (sub-folders). You can call list() on them to
    * get its contents.
    *
    * Folders are implicit based on '/' in the object paths.
    * For example, if a bucket has two objects '/a/b/1' and '/a/b/2', list('/a')
    * will return '/a/b' as a prefix.
    */
  var prefixes: js.Array[Reference] = js.native
}
object ListResult {
  
  @scala.inline
  def apply(items: js.Array[Reference], prefixes: js.Array[Reference]): ListResult = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResult]
  }
  
  @scala.inline
  implicit class ListResultOps[Self <: ListResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemsVarargs(value: Reference*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Reference]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixesVarargs(value: Reference*): Self = this.set("prefixes", js.Array(value :_*))
    
    @scala.inline
    def setPrefixes(value: js.Array[Reference]): Self = this.set("prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = this.set("nextPageToken", null)
  }
}
