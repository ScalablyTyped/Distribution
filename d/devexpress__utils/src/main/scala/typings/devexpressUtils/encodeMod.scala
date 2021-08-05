package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeMod {
  
  @JSImport("@devexpress/utils/lib/utils/encode", "EncodeUtils")
  @js.native
  class EncodeUtils () extends StObject
  /* static members */
  object EncodeUtils {
    
    @JSImport("@devexpress/utils/lib/utils/encode", "EncodeUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decodeHtml(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHtml")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decodeViaTextArea(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeViaTextArea")(html.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeHtml(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeHtml")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def prepareTextForCallBackRequest(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareTextForCallBackRequest")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def prepareTextForRequest(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareTextForRequest")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
