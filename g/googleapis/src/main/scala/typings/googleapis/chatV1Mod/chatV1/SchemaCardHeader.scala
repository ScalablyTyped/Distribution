package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCardHeader extends js.Object {
  
  /**
    * The image&#39;s type (e.g. square border or circular border).
    */
  var imageStyle: js.UndefOr[String] = js.native
  
  /**
    * The URL of the image in the card header.
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /**
    * The subtitle of the card header.
    */
  var subtitle: js.UndefOr[String] = js.native
  
  /**
    * The title must be specified. The header has a fixed height: if both a
    * title and subtitle is specified, each will take up 1 line. If only the
    * title is specified, it will take up both lines.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaCardHeader {
  
  @scala.inline
  def apply(): SchemaCardHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCardHeader]
  }
  
  @scala.inline
  implicit class SchemaCardHeaderOps[Self <: SchemaCardHeader] (val x: Self) extends AnyVal {
    
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
    def setImageStyle(value: String): Self = this.set("imageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageStyle: Self = this.set("imageStyle", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
