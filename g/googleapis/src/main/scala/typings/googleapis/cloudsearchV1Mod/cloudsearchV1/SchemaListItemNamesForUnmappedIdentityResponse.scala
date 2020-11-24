package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListItemNamesForUnmappedIdentityResponse extends js.Object {
  
  var itemNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListItemNamesForUnmappedIdentityResponse {
  
  @scala.inline
  def apply(): SchemaListItemNamesForUnmappedIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListItemNamesForUnmappedIdentityResponse]
  }
  
  @scala.inline
  implicit class SchemaListItemNamesForUnmappedIdentityResponseOps[Self <: SchemaListItemNamesForUnmappedIdentityResponse] (val x: Self) extends AnyVal {
    
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
    def setItemNamesVarargs(value: String*): Self = this.set("itemNames", js.Array(value :_*))
    
    @scala.inline
    def setItemNames(value: js.Array[String]): Self = this.set("itemNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemNames: Self = this.set("itemNames", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
