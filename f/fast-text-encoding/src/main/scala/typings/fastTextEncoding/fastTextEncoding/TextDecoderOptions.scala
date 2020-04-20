package typings.fastTextEncoding.fastTextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for TextDecoder constructor.
  */
trait TextDecoderOptions extends js.Object {
  var fatal: Boolean
}

object TextDecoderOptions {
  @scala.inline
  def apply(fatal: Boolean): TextDecoderOptions = {
    val __obj = js.Dynamic.literal(fatal = fatal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderOptions]
  }
}

