package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GENavigationControl extends js.Object {
  /**
    * Specifies the size of the navigation control.
    *
    * See also:
    *
    * * GEPlugin.NAVIGATION_CONTROL_LARGE
    * * GEPlugin.NAVIGATION_CONTROL_SMALL
    */
  def getControlType(): GENavigationControlEnum = js.native
  /**
    * The position of the navigation controls in Google Earth
    */
  def getScreenXY(): KmlVec2 = js.native
  /**
    * Whether Street View is enabled in the navigation controls.
    */
  def getStreetViewEnabled(): Boolean = js.native
  /**
    * Whether the control is always visible, always hidden, or visible only when the user intends to use the control.
    *
    * See also:
    *
    * * GEPlugin.VISIBILITY_SHOW
    * * GEPlugin.VISIBILITY_HIDE
    * * GEPlugin.VISIBILITY_AUTO
    */
  def getVisibility(): GEVisibilityEnum = js.native
  /**
    * Specifies the size of the navigation control.
    *
    * See also:
    *
    * * GEPlugin.NAVIGATION_CONTROL_LARGE
    * * GEPlugin.NAVIGATION_CONTROL_SMALL
    */
  def setControlType(controlType: GENavigationControlEnum): Unit = js.native
  /**
    * Enables or disables user-initiated entry to Street View imagery.
    * When true, the Pegman icon is present in the navigation controls, allowing a user to drag the Pegman onto a street to initiate Street View.
    * Users can also zoom down to ground level to enter Street View when this is set to true.
    */
  def setStreetViewEnabled(streetViewEnabled: Boolean): Unit = js.native
  /**
    * Whether the control is always visible, always hidden, or visible only when the user intends to use the control.
    *
    * See also:
    *
    * * GEPlugin.VISIBILITY_SHOW
    * * GEPlugin.VISIBILITY_HIDE
    * * GEPlugin.VISIBILITY_AUTO
    */
  def setVisibility(visibility: GEVisibilityEnum): Unit = js.native
}

object GENavigationControl {
  @scala.inline
  def apply(
    getControlType: () => GENavigationControlEnum,
    getScreenXY: () => KmlVec2,
    getStreetViewEnabled: () => Boolean,
    getVisibility: () => GEVisibilityEnum,
    setControlType: GENavigationControlEnum => Unit,
    setStreetViewEnabled: Boolean => Unit,
    setVisibility: GEVisibilityEnum => Unit
  ): GENavigationControl = {
    val __obj = js.Dynamic.literal(getControlType = js.Any.fromFunction0(getControlType), getScreenXY = js.Any.fromFunction0(getScreenXY), getStreetViewEnabled = js.Any.fromFunction0(getStreetViewEnabled), getVisibility = js.Any.fromFunction0(getVisibility), setControlType = js.Any.fromFunction1(setControlType), setStreetViewEnabled = js.Any.fromFunction1(setStreetViewEnabled), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[GENavigationControl]
  }
  @scala.inline
  implicit class GENavigationControlOps[Self <: GENavigationControl] (val x: Self) extends AnyVal {
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
    def setGetControlType(value: () => GENavigationControlEnum): Self = this.set("getControlType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScreenXY(value: () => KmlVec2): Self = this.set("getScreenXY", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStreetViewEnabled(value: () => Boolean): Self = this.set("getStreetViewEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVisibility(value: () => GEVisibilityEnum): Self = this.set("getVisibility", js.Any.fromFunction0(value))
    @scala.inline
    def setSetControlType(value: GENavigationControlEnum => Unit): Self = this.set("setControlType", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStreetViewEnabled(value: Boolean => Unit): Self = this.set("setStreetViewEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVisibility(value: GEVisibilityEnum => Unit): Self = this.set("setVisibility", js.Any.fromFunction1(value))
  }
  
}

