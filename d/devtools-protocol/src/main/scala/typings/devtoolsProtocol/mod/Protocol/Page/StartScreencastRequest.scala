package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg
import typings.devtoolsProtocol.devtoolsProtocolStrings.png
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartScreencastRequest extends StObject {
  
  /**
    * Send every n-th frame.
    */
  var everyNthFrame: js.UndefOr[integer] = js.native
  
  /**
    * Image compression format. (StartScreencastRequestFormat enum)
    */
  var format: js.UndefOr[jpeg | png] = js.native
  
  /**
    * Maximum screenshot height.
    */
  var maxHeight: js.UndefOr[integer] = js.native
  
  /**
    * Maximum screenshot width.
    */
  var maxWidth: js.UndefOr[integer] = js.native
  
  /**
    * Compression quality from range [0..100].
    */
  var quality: js.UndefOr[integer] = js.native
}
object StartScreencastRequest {
  
  @scala.inline
  def apply(): StartScreencastRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartScreencastRequest]
  }
  
  @scala.inline
  implicit class StartScreencastRequestMutableBuilder[Self <: StartScreencastRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEveryNthFrame(value: integer): Self = StObject.set(x, "everyNthFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEveryNthFrameUndefined: Self = StObject.set(x, "everyNthFrame", js.undefined)
    
    @scala.inline
    def setFormat(value: jpeg | png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: integer): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: integer): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setQuality(value: integer): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
