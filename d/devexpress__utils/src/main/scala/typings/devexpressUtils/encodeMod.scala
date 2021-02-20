package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeMod {
  
  @JSImport("@devexpress/utils/lib/utils/encode", "EncodeUtils")
  @js.native
  class EncodeUtils () extends StObject
  /* static members */
  object EncodeUtils {
    
    @JSImport("@devexpress/utils/lib/utils/encode", "EncodeUtils.decodeHtml")
    @js.native
    def decodeHtml(text: String): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/encode", "EncodeUtils.decodeViaTextArea")
    @js.native
    def decodeViaTextArea(html: String): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/encode", "EncodeUtils.encodeHtml")
    @js.native
    def encodeHtml(text: String): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/encode", "EncodeUtils.prepareTextForCallBackRequest")
    @js.native
    def prepareTextForCallBackRequest(text: String): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/encode", "EncodeUtils.prepareTextForRequest")
    @js.native
    def prepareTextForRequest(text: String): String = js.native
  }
}
