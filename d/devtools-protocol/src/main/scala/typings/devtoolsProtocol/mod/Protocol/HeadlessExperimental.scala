package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg
import typings.devtoolsProtocol.devtoolsProtocolStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeadlessExperimental {
  
  trait BeginFrameRequest extends StObject {
    
    /**
      * Timestamp of this BeginFrame in Renderer TimeTicks (milliseconds of uptime). If not set,
      * the current time will be used.
      */
    var frameTimeTicks: js.UndefOr[Double] = js.undefined
    
    /**
      * The interval between BeginFrames that is reported to the compositor, in milliseconds.
      * Defaults to a 60 frames/second interval, i.e. about 16.666 milliseconds.
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether updates should not be committed and drawn onto the display. False by default. If
      * true, only side effects of the BeginFrame will be run, such as layout and animations, but
      * any visual updates may not be visible on the display or in screenshots.
      */
    var noDisplayUpdates: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, a screenshot of the frame will be captured and returned in the response. Otherwise,
      * no screenshot will be captured. Note that capturing a screenshot can fail, for example,
      * during renderer initialization. In such a case, no screenshot data will be returned.
      */
    var screenshot: js.UndefOr[ScreenshotParams] = js.undefined
  }
  object BeginFrameRequest {
    
    @scala.inline
    def apply(): BeginFrameRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeginFrameRequest]
    }
    
    @scala.inline
    implicit class BeginFrameRequestMutableBuilder[Self <: BeginFrameRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrameTimeTicks(value: Double): Self = StObject.set(x, "frameTimeTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameTimeTicksUndefined: Self = StObject.set(x, "frameTimeTicks", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setNoDisplayUpdates(value: Boolean): Self = StObject.set(x, "noDisplayUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDisplayUpdatesUndefined: Self = StObject.set(x, "noDisplayUpdates", js.undefined)
      
      @scala.inline
      def setScreenshot(value: ScreenshotParams): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
    }
  }
  
  trait BeginFrameResponse extends StObject {
    
    /**
      * Whether the BeginFrame resulted in damage and, thus, a new frame was committed to the
      * display. Reported for diagnostic uses, may be removed in the future.
      */
    var hasDamage: Boolean
    
    /**
      * Base64-encoded image data of the screenshot, if one was requested and successfully taken.
      */
    var screenshotData: js.UndefOr[String] = js.undefined
  }
  object BeginFrameResponse {
    
    @scala.inline
    def apply(hasDamage: Boolean): BeginFrameResponse = {
      val __obj = js.Dynamic.literal(hasDamage = hasDamage.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeginFrameResponse]
    }
    
    @scala.inline
    implicit class BeginFrameResponseMutableBuilder[Self <: BeginFrameResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasDamage(value: Boolean): Self = StObject.set(x, "hasDamage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenshotData(value: String): Self = StObject.set(x, "screenshotData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenshotDataUndefined: Self = StObject.set(x, "screenshotData", js.undefined)
    }
  }
  
  trait NeedsBeginFramesChangedEvent extends StObject {
    
    /**
      * True if BeginFrames are needed, false otherwise.
      */
    var needsBeginFrames: Boolean
  }
  object NeedsBeginFramesChangedEvent {
    
    @scala.inline
    def apply(needsBeginFrames: Boolean): NeedsBeginFramesChangedEvent = {
      val __obj = js.Dynamic.literal(needsBeginFrames = needsBeginFrames.asInstanceOf[js.Any])
      __obj.asInstanceOf[NeedsBeginFramesChangedEvent]
    }
    
    @scala.inline
    implicit class NeedsBeginFramesChangedEventMutableBuilder[Self <: NeedsBeginFramesChangedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNeedsBeginFrames(value: Boolean): Self = StObject.set(x, "needsBeginFrames", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScreenshotParams extends StObject {
    
    /**
      * Image compression format (defaults to png). (ScreenshotParamsFormat enum)
      */
    var format: js.UndefOr[jpeg | png] = js.undefined
    
    /**
      * Compression quality from range [0..100] (jpeg only).
      */
    var quality: js.UndefOr[integer] = js.undefined
  }
  object ScreenshotParams {
    
    @scala.inline
    def apply(): ScreenshotParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenshotParams]
    }
    
    @scala.inline
    implicit class ScreenshotParamsMutableBuilder[Self <: ScreenshotParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: jpeg | png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setQuality(value: integer): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg
    - typings.devtoolsProtocol.devtoolsProtocolStrings.png
  */
  trait ScreenshotParamsFormat extends StObject
  object ScreenshotParamsFormat {
    
    @scala.inline
    def Jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
    
    @scala.inline
    def Png: png = "png".asInstanceOf[png]
  }
}
