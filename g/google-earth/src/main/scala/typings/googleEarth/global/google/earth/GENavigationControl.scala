package typings.googleEarth.global.google.earth

import typings.googleEarth.google.earth.GENavigationControlEnum
import typings.googleEarth.google.earth.GEVisibilityEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.GENavigationControl")
@js.native
open class GENavigationControl ()
  extends StObject
     with typings.googleEarth.google.earth.GENavigationControl {
  
  /**
    * Specifies the size of the navigation control.
    *
    * See also:
    *
    * * GEPlugin.NAVIGATION_CONTROL_LARGE
    * * GEPlugin.NAVIGATION_CONTROL_SMALL
    */
  /* CompleteClass */
  override def getControlType(): GENavigationControlEnum = js.native
  
  /**
    * The position of the navigation controls in Google Earth
    */
  /* CompleteClass */
  override def getScreenXY(): typings.googleEarth.google.earth.KmlVec2 = js.native
  
  /**
    * Whether Street View is enabled in the navigation controls.
    */
  /* CompleteClass */
  override def getStreetViewEnabled(): Boolean = js.native
  
  /**
    * Whether the control is always visible, always hidden, or visible only when the user intends to use the control.
    *
    * See also:
    *
    * * GEPlugin.VISIBILITY_SHOW
    * * GEPlugin.VISIBILITY_HIDE
    * * GEPlugin.VISIBILITY_AUTO
    */
  /* CompleteClass */
  override def getVisibility(): GEVisibilityEnum = js.native
  
  /**
    * Specifies the size of the navigation control.
    *
    * See also:
    *
    * * GEPlugin.NAVIGATION_CONTROL_LARGE
    * * GEPlugin.NAVIGATION_CONTROL_SMALL
    */
  /* CompleteClass */
  override def setControlType(controlType: GENavigationControlEnum): Unit = js.native
  
  /**
    * Enables or disables user-initiated entry to Street View imagery.
    * When true, the Pegman icon is present in the navigation controls, allowing a user to drag the Pegman onto a street to initiate Street View.
    * Users can also zoom down to ground level to enter Street View when this is set to true.
    */
  /* CompleteClass */
  override def setStreetViewEnabled(streetViewEnabled: Boolean): Unit = js.native
  
  /**
    * Whether the control is always visible, always hidden, or visible only when the user intends to use the control.
    *
    * See also:
    *
    * * GEPlugin.VISIBILITY_SHOW
    * * GEPlugin.VISIBILITY_HIDE
    * * GEPlugin.VISIBILITY_AUTO
    */
  /* CompleteClass */
  override def setVisibility(visibility: GEVisibilityEnum): Unit = js.native
}
