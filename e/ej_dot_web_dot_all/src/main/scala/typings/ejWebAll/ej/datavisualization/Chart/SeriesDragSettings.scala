package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesDragSettings extends js.Object {
  
  /** drag/drop the series
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  
  /** Specifies the type of drag settings.
    * @Default {xy}
    */
  var `type`: js.UndefOr[String] = js.native
}
object SeriesDragSettings {
  
  @scala.inline
  def apply(): SeriesDragSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesDragSettings]
  }
  
  @scala.inline
  implicit class SeriesDragSettingsOps[Self <: SeriesDragSettings] (val x: Self) extends AnyVal {
    
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
