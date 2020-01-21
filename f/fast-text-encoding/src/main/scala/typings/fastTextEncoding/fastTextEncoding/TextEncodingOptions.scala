package typings.fastTextEncoding.fastTextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for `TextDecoder.decode` and `TextEncoder.encode`.
  */
trait TextEncodingOptions extends js.Object {
  var stream: Boolean
}

object TextEncodingOptions {
  @scala.inline
  def apply(stream: Boolean): TextEncodingOptions = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextEncodingOptions]
  }
}

