package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateStampProperties extends js.Object {
  
  /**
    * The height of the rectangle.
    */
  var dateAreaHeight: js.UndefOr[String] = js.native
  
  /**
    * The width of the rectangle.
    */
  var dateAreaWidth: js.UndefOr[String] = js.native
  
  /**
    * The X axis position of the top-left corner.
    */
  var dateAreaX: js.UndefOr[String] = js.native
  
  /**
    * The Y axis position of the top-left corner.
    */
  var dateAreaY: js.UndefOr[String] = js.native
}
object DateStampProperties {
  
  @scala.inline
  def apply(): DateStampProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateStampProperties]
  }
  
  @scala.inline
  implicit class DateStampPropertiesOps[Self <: DateStampProperties] (val x: Self) extends AnyVal {
    
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
    def setDateAreaHeight(value: String): Self = this.set("dateAreaHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateAreaHeight: Self = this.set("dateAreaHeight", js.undefined)
    
    @scala.inline
    def setDateAreaWidth(value: String): Self = this.set("dateAreaWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateAreaWidth: Self = this.set("dateAreaWidth", js.undefined)
    
    @scala.inline
    def setDateAreaX(value: String): Self = this.set("dateAreaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateAreaX: Self = this.set("dateAreaX", js.undefined)
    
    @scala.inline
    def setDateAreaY(value: String): Self = this.set("dateAreaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateAreaY: Self = this.set("dateAreaY", js.undefined)
  }
}
