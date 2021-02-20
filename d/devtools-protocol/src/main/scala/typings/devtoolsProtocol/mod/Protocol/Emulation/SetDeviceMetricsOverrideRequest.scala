package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.mod.Protocol.Page.Viewport
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDeviceMetricsOverrideRequest extends StObject {
  
  /**
    * Overriding device scale factor value. 0 disables the override.
    */
  var deviceScaleFactor: Double = js.native
  
  /**
    * If set, the display feature of a multi-segment screen. If not set, multi-segment support
    * is turned-off.
    */
  var displayFeature: js.UndefOr[DisplayFeature] = js.native
  
  /**
    * Do not set visible view size, rely upon explicit setVisibleSize call.
    */
  var dontSetVisibleSize: js.UndefOr[Boolean] = js.native
  
  /**
    * Overriding height value in pixels (minimum 0, maximum 10000000). 0 disables the override.
    */
  var height: integer = js.native
  
  /**
    * Whether to emulate mobile device. This includes viewport meta tag, overlay scrollbars, text
    * autosizing and more.
    */
  var mobile: Boolean = js.native
  
  /**
    * Overriding view X position on screen in pixels (minimum 0, maximum 10000000).
    */
  var positionX: js.UndefOr[integer] = js.native
  
  /**
    * Overriding view Y position on screen in pixels (minimum 0, maximum 10000000).
    */
  var positionY: js.UndefOr[integer] = js.native
  
  /**
    * Scale to apply to resulting view image.
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * Overriding screen height value in pixels (minimum 0, maximum 10000000).
    */
  var screenHeight: js.UndefOr[integer] = js.native
  
  /**
    * Screen orientation override.
    */
  var screenOrientation: js.UndefOr[ScreenOrientation] = js.native
  
  /**
    * Overriding screen width value in pixels (minimum 0, maximum 10000000).
    */
  var screenWidth: js.UndefOr[integer] = js.native
  
  /**
    * If set, the visible area of the page will be overridden to this viewport. This viewport
    * change is not observed by the page, e.g. viewport-relative elements do not change positions.
    */
  var viewport: js.UndefOr[Viewport] = js.native
  
  /**
    * Overriding width value in pixels (minimum 0, maximum 10000000). 0 disables the override.
    */
  var width: integer = js.native
}
object SetDeviceMetricsOverrideRequest {
  
  @scala.inline
  def apply(deviceScaleFactor: Double, height: integer, mobile: Boolean, width: integer): SetDeviceMetricsOverrideRequest = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDeviceMetricsOverrideRequest]
  }
  
  @scala.inline
  implicit class SetDeviceMetricsOverrideRequestMutableBuilder[Self <: SetDeviceMetricsOverrideRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFeature(value: DisplayFeature): Self = StObject.set(x, "displayFeature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFeatureUndefined: Self = StObject.set(x, "displayFeature", js.undefined)
    
    @scala.inline
    def setDontSetVisibleSize(value: Boolean): Self = StObject.set(x, "dontSetVisibleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontSetVisibleSizeUndefined: Self = StObject.set(x, "dontSetVisibleSize", js.undefined)
    
    @scala.inline
    def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionX(value: integer): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
    
    @scala.inline
    def setPositionY(value: integer): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setScreenHeight(value: integer): Self = StObject.set(x, "screenHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenHeightUndefined: Self = StObject.set(x, "screenHeight", js.undefined)
    
    @scala.inline
    def setScreenOrientation(value: ScreenOrientation): Self = StObject.set(x, "screenOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenOrientationUndefined: Self = StObject.set(x, "screenOrientation", js.undefined)
    
    @scala.inline
    def setScreenWidth(value: integer): Self = StObject.set(x, "screenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenWidthUndefined: Self = StObject.set(x, "screenWidth", js.undefined)
    
    @scala.inline
    def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    
    @scala.inline
    def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
