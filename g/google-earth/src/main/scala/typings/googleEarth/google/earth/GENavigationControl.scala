package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GENavigationControl extends StObject {
  
  /**
    * Specifies the size of the navigation control.
    *
    * See also:
    *
    * * GEPlugin.NAVIGATION_CONTROL_LARGE
    * * GEPlugin.NAVIGATION_CONTROL_SMALL
    */
  def getControlType(): GENavigationControlEnum
  
  /**
    * The position of the navigation controls in Google Earth
    */
  def getScreenXY(): KmlVec2
  
  /**
    * Whether Street View is enabled in the navigation controls.
    */
  def getStreetViewEnabled(): Boolean
  
  /**
    * Whether the control is always visible, always hidden, or visible only when the user intends to use the control.
    *
    * See also:
    *
    * * GEPlugin.VISIBILITY_SHOW
    * * GEPlugin.VISIBILITY_HIDE
    * * GEPlugin.VISIBILITY_AUTO
    */
  def getVisibility(): GEVisibilityEnum
  
  /**
    * Specifies the size of the navigation control.
    *
    * See also:
    *
    * * GEPlugin.NAVIGATION_CONTROL_LARGE
    * * GEPlugin.NAVIGATION_CONTROL_SMALL
    */
  def setControlType(controlType: GENavigationControlEnum): Unit
  
  /**
    * Enables or disables user-initiated entry to Street View imagery.
    * When true, the Pegman icon is present in the navigation controls, allowing a user to drag the Pegman onto a street to initiate Street View.
    * Users can also zoom down to ground level to enter Street View when this is set to true.
    */
  def setStreetViewEnabled(streetViewEnabled: Boolean): Unit
  
  /**
    * Whether the control is always visible, always hidden, or visible only when the user intends to use the control.
    *
    * See also:
    *
    * * GEPlugin.VISIBILITY_SHOW
    * * GEPlugin.VISIBILITY_HIDE
    * * GEPlugin.VISIBILITY_AUTO
    */
  def setVisibility(visibility: GEVisibilityEnum): Unit
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
  implicit class GENavigationControlMutableBuilder[Self <: GENavigationControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetControlType(value: () => GENavigationControlEnum): Self = StObject.set(x, "getControlType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScreenXY(value: () => KmlVec2): Self = StObject.set(x, "getScreenXY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStreetViewEnabled(value: () => Boolean): Self = StObject.set(x, "getStreetViewEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisibility(value: () => GEVisibilityEnum): Self = StObject.set(x, "getVisibility", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetControlType(value: GENavigationControlEnum => Unit): Self = StObject.set(x, "setControlType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStreetViewEnabled(value: Boolean => Unit): Self = StObject.set(x, "setStreetViewEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisibility(value: GEVisibilityEnum => Unit): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1(value))
  }
}
