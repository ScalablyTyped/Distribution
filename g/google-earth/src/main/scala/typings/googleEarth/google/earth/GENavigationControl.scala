package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GENavigationControl")
@js.native
class GENavigationControl () extends js.Object {
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

