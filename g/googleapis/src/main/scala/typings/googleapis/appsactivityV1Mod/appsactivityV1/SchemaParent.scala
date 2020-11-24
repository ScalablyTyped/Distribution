package typings.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a parent object. For example, a folder in Drive
  * is a parent for all files within it.
  */
@js.native
trait SchemaParent extends js.Object {
  
  /**
    * The parent&#39;s ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether this is the root folder.
    */
  var isRoot: js.UndefOr[Boolean] = js.native
  
  /**
    * The parent&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaParent {
  
  @scala.inline
  def apply(): SchemaParent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParent]
  }
  
  @scala.inline
  implicit class SchemaParentOps[Self <: SchemaParent] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsRoot(value: Boolean): Self = this.set("isRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRoot: Self = this.set("isRoot", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
