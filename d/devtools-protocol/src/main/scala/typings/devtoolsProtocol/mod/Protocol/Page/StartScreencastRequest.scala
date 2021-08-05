package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg
import typings.devtoolsProtocol.devtoolsProtocolStrings.png
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartScreencastRequest extends StObject {
  
  /**
    * Send every n-th frame.
    */
  var everyNthFrame: js.UndefOr[integer] = js.undefined
  
  /**
    * Image compression format. (StartScreencastRequestFormat enum)
    */
  var format: js.UndefOr[jpeg | png] = js.undefined
  
  /**
    * Maximum screenshot height.
    */
  var maxHeight: js.UndefOr[integer] = js.undefined
  
  /**
    * Maximum screenshot width.
    */
  var maxWidth: js.UndefOr[integer] = js.undefined
  
  /**
    * Compression quality from range [0..100].
    */
  var quality: js.UndefOr[integer] = js.undefined
}
object StartScreencastRequest {
  
  inline def apply(): StartScreencastRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartScreencastRequest]
  }
  
  extension [Self <: StartScreencastRequest](x: Self) {
    
    inline def setEveryNthFrame(value: integer): Self = StObject.set(x, "everyNthFrame", value.asInstanceOf[js.Any])
    
    inline def setEveryNthFrameUndefined: Self = StObject.set(x, "everyNthFrame", js.undefined)
    
    inline def setFormat(value: jpeg | png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMaxHeight(value: integer): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: integer): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setQuality(value: integer): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
