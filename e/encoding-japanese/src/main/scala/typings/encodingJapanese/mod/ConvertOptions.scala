package typings.encodingJapanese.mod

import typings.encodingJapanese.encodingJapaneseStrings.array
import typings.encodingJapanese.encodingJapaneseStrings.arraybuffer
import typings.encodingJapanese.encodingJapaneseStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.encodingJapanese.mod.ConvertStringOptions
  - typings.encodingJapanese.mod.ConvertArrayBufferOptions
  - typings.encodingJapanese.mod.ConvertArrayOptions
  - typings.encodingJapanese.mod.ConvertUnknownOptions
*/
trait ConvertOptions extends js.Object
object ConvertOptions {
  
  @scala.inline
  def ConvertStringOptions(to: Encoding, `type`: string): ConvertOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
  
  @scala.inline
  def ConvertArrayBufferOptions(to: Encoding, `type`: arraybuffer): ConvertOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
  
  @scala.inline
  def ConvertArrayOptions(to: Encoding, `type`: array): ConvertOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
  
  @scala.inline
  def ConvertUnknownOptions(to: Encoding): ConvertOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
}
