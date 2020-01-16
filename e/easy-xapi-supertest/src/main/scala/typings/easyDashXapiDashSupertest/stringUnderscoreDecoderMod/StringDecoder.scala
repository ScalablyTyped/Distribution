package typings.easyDashXapiDashSupertest.stringUnderscoreDecoderMod

import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("string_decoder", "StringDecoder")
@js.native
class StringDecoder protected () extends NodeStringDecoder {
  def this(encoding: String) = this()
  /* CompleteClass */
  override def detectIncompleteChar(buffer: Buffer): Double = js.native
  /* CompleteClass */
  override def write(buffer: Buffer): String = js.native
}

@JSImport("string_decoder", "StringDecoder")
@js.native
object StringDecoder extends Instantiable1[/* encoding */ String, NodeStringDecoder]

