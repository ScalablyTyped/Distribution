package typings.dojo.dojox.encoding.compression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/compression/lzw.html
  *
  *
  */
trait lzw extends js.Object {
  /**
    *
    * @param n
    */
  def Decoder(n: js.Any): Unit
  /**
    *
    * @param n
    */
  def Encoder(n: js.Any): Unit
}

object lzw {
  @scala.inline
  def apply(Decoder: js.Any => Unit, Encoder: js.Any => Unit): lzw = {
    val __obj = js.Dynamic.literal(Decoder = js.Any.fromFunction1(Decoder), Encoder = js.Any.fromFunction1(Encoder))
    __obj.asInstanceOf[lzw]
  }
}

