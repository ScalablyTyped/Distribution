package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreencastFrameMetadata extends StObject {
  
  /**
    * Device screen height in DIP.
    */
  var deviceHeight: Double = js.native
  
  /**
    * Device screen width in DIP.
    */
  var deviceWidth: Double = js.native
  
  /**
    * Top offset in DIP.
    */
  var offsetTop: Double = js.native
  
  /**
    * Page scale factor.
    */
  var pageScaleFactor: Double = js.native
  
  /**
    * Position of horizontal scroll in CSS pixels.
    */
  var scrollOffsetX: Double = js.native
  
  /**
    * Position of vertical scroll in CSS pixels.
    */
  var scrollOffsetY: Double = js.native
  
  /**
    * Frame swap timestamp.
    */
  var timestamp: js.UndefOr[TimeSinceEpoch] = js.native
}
object ScreencastFrameMetadata {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ScreencastFrameMetadataMutableBuilder[Self <: ScreencastFrameMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceHeight(value: Double): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceWidth(value: Double): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageScaleFactor(value: Double): Self = StObject.set(x, "pageScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOffsetX(value: Double): Self = StObject.set(x, "scrollOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOffsetY(value: Double): Self = StObject.set(x, "scrollOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: TimeSinceEpoch): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
