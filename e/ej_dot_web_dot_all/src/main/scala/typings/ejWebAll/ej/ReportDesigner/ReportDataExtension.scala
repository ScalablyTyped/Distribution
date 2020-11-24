package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportDataExtension extends js.Object {
  
  /** Gets or sets the class name of the data extension.
    * @Default {empty}
    */
  var className: js.UndefOr[String] = js.native
  
  /** Gets or sets the name for data extension item to display in the data pane tile.
    * @Default {empty}
    */
  var displayName: js.UndefOr[String] = js.native
  
  /** Gets or sets the image class name to load image in data pane tile.
    * @Default {empty}
    */
  var imageClass: js.UndefOr[String] = js.native
  
  /** Gets or sets the name of the datasource type.
    * @Default {empty}
    */
  var name: js.UndefOr[String] = js.native
}
object ReportDataExtension {
  
  @scala.inline
  def apply(): ReportDataExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportDataExtension]
  }
  
  @scala.inline
  implicit class ReportDataExtensionOps[Self <: ReportDataExtension] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setImageClass(value: String): Self = this.set("imageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageClass: Self = this.set("imageClass", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
