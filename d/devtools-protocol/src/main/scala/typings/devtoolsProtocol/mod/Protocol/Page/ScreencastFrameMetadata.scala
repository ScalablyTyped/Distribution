package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreencastFrameMetadata extends StObject {
  
  /**
    * Device screen height in DIP.
    */
  var deviceHeight: Double
  
  /**
    * Device screen width in DIP.
    */
  var deviceWidth: Double
  
  /**
    * Top offset in DIP.
    */
  var offsetTop: Double
  
  /**
    * Page scale factor.
    */
  var pageScaleFactor: Double
  
  /**
    * Position of horizontal scroll in CSS pixels.
    */
  var scrollOffsetX: Double
  
  /**
    * Position of vertical scroll in CSS pixels.
    */
  var scrollOffsetY: Double
  
  /**
    * Frame swap timestamp.
    */
  var timestamp: js.UndefOr[TimeSinceEpoch] = js.undefined
}
object ScreencastFrameMetadata {
  
  inline def apply(
    deviceHeight: Double,
    deviceWidth: Double,
    offsetTop: Double,
    pageScaleFactor: Double,
    scrollOffsetX: Double,
    scrollOffsetY: Double
  ): ScreencastFrameMetadata = {
    val __obj = js.Dynamic.literal(deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], pageScaleFactor = pageScaleFactor.asInstanceOf[js.Any], scrollOffsetX = scrollOffsetX.asInstanceOf[js.Any], scrollOffsetY = scrollOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreencastFrameMetadata]
  }
  
  extension [Self <: ScreencastFrameMetadata](x: Self) {
    
    inline def setDeviceHeight(value: Double): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
    
    inline def setDeviceWidth(value: Double): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
    
    inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    inline def setPageScaleFactor(value: Double): Self = StObject.set(x, "pageScaleFactor", value.asInstanceOf[js.Any])
    
    inline def setScrollOffsetX(value: Double): Self = StObject.set(x, "scrollOffsetX", value.asInstanceOf[js.Any])
    
    inline def setScrollOffsetY(value: Double): Self = StObject.set(x, "scrollOffsetY", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: TimeSinceEpoch): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
