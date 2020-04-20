package typings.dojo.dojox.encoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/ascii85.html
  *
  *
  */
trait ascii85 extends js.Object {
  /**
    * decodes the input string back to array of numbers
    *
    * @param input the input string to decode
    */
  def decode(input: String): Unit
  /**
    * encodes input data in ascii85 string
    *
    * @param input an array of numbers (0-255) to encode
    */
  def encode(input: js.Array[_]): Unit
}

object ascii85 {
  @scala.inline
  def apply(decode: String => Unit, encode: js.Array[_] => Unit): ascii85 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[ascii85]
  }
}

