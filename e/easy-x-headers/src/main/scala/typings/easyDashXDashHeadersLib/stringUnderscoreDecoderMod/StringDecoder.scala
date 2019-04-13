package typings
package easyDashXDashHeadersLib.stringUnderscoreDecoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("string_decoder", "StringDecoder")
@js.native
class StringDecoder protected () extends NodeStringDecoder {
  def this(encoding: java.lang.String) = this()
  /* CompleteClass */
  override def detectIncompleteChar(buffer: easyDashXDashHeadersLib.Buffer): scala.Double = js.native
  /* CompleteClass */
  override def write(buffer: easyDashXDashHeadersLib.Buffer): java.lang.String = js.native
}

@JSImport("string_decoder", "StringDecoder")
@js.native
object StringDecoder
  extends org.scalablytyped.runtime.Instantiable1[/* encoding */ java.lang.String, NodeStringDecoder]

