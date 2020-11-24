package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Forms item.
  */
@js.native
trait SchemaForm extends js.Object {
  
  /**
    * URL of the form.
    */
  var formUrl: js.UndefOr[String] = js.native
  
  /**
    * URL of the form responses document. Only set if respsonses have been
    * recorded and only when the requesting user is an editor of the form.
    * Read-only.
    */
  var responseUrl: js.UndefOr[String] = js.native
  
  /**
    * URL of a thumbnail image of the Form.  Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  
  /**
    * Title of the Form.  Read-only.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaForm {
  
  @scala.inline
  def apply(): SchemaForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForm]
  }
  
  @scala.inline
  implicit class SchemaFormOps[Self <: SchemaForm] (val x: Self) extends AnyVal {
    
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
    def setFormUrl(value: String): Self = this.set("formUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormUrl: Self = this.set("formUrl", js.undefined)
    
    @scala.inline
    def setResponseUrl(value: String): Self = this.set("responseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseUrl: Self = this.set("responseUrl", js.undefined)
    
    @scala.inline
    def setThumbnailUrl(value: String): Self = this.set("thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailUrl: Self = this.set("thumbnailUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
