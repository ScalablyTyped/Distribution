package typings.googleGax.mod.fallback.protobuf

import typings.protobufjs.mod.ITokenizerHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "fallback.protobuf.tokenize")
@js.native
object tokenize extends js.Object {
  def apply(source: String, alternateCommentMode: Boolean): ITokenizerHandle = js.native
  /**
    * Unescapes a string.
    * @param str String to unescape
    * @returns Unescaped string
    */
  def unescape(str: String): String = js.native
}

