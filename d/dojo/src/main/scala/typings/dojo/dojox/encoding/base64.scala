package typings.dojo.dojox.encoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/base64.html
  *
  *
  */
trait base64 extends js.Object {
  /**
    * Convert a base64-encoded string to an array of bytes
    *
    * @param str
    */
  def decode(str: String): Unit
  /**
    * Encode an array of bytes as a base64-encoded string
    *
    * @param ba
    */
  def encode(ba: js.Array[Double]): Unit
}

object base64 {
  @scala.inline
  def apply(decode: String => Unit, encode: js.Array[Double] => Unit): base64 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[base64]
  }
}

