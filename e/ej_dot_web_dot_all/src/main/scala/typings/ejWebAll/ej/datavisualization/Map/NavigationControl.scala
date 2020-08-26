package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationControl extends js.Object {
  /** Set the absolutePosition for navigation control
    * @Default {{x:0,y:0}}
    */
  var absolutePosition: js.UndefOr[js.Any] = js.native
  /** Specifies the navigation control template for map
    * @Default {null}
    */
  var content: js.UndefOr[String] = js.native
  /** Set the dockPosition value for navigation control
    * @Default {centerleft}
    */
  var dockPosition: js.UndefOr[Position | String] = js.native
  /** Enables or Disables the Navigation for handling zooming map
    * @Default {false}
    */
  var enableNavigation: js.UndefOr[Boolean] = js.native
  /** Set the orientation value for navigation control
    * @Default {vertical}
    */
  var orientation: js.UndefOr[LabelOrientation | String] = js.native
}

object NavigationControl {
  @scala.inline
  def apply(): NavigationControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationControl]
  }
  @scala.inline
  implicit class NavigationControlOps[Self <: NavigationControl] (val x: Self) extends AnyVal {
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
    def setAbsolutePosition(value: js.Any): Self = this.set("absolutePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsolutePosition: Self = this.set("absolutePosition", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDockPosition(value: Position | String): Self = this.set("dockPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDockPosition: Self = this.set("dockPosition", js.undefined)
    @scala.inline
    def setEnableNavigation(value: Boolean): Self = this.set("enableNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableNavigation: Self = this.set("enableNavigation", js.undefined)
    @scala.inline
    def setOrientation(value: LabelOrientation | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
  
}

