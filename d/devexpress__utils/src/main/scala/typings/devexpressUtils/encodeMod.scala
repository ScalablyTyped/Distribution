package typings.devexpressUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/encode", JSImport.Namespace)
@js.native
object encodeMod extends js.Object {
  
  @js.native
  class EncodeUtils () extends js.Object
  /* static members */
  @js.native
  object EncodeUtils extends js.Object {
    
    def decodeHtml(text: String): String = js.native
    
    def decodeViaTextArea(html: String): String = js.native
    
    def encodeHtml(text: String): String = js.native
    
    def prepareTextForCallBackRequest(text: String): String = js.native
    
    def prepareTextForRequest(text: String): String = js.native
  }
}
