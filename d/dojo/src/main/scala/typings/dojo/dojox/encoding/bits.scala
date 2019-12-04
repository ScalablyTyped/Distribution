package typings.dojo.dojox.encoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/bits.html
  *
  *
  */
trait bits extends js.Object {
  /**
    *
    * @param buffer
    * @param width
    */
  def InputStream(buffer: js.Any, width: js.Any): Unit
  /**
    *
    */
  def OutputStream(): Unit
}

object bits {
  @scala.inline
  def apply(InputStream: (js.Any, js.Any) => Unit, OutputStream: () => Unit): bits = {
    val __obj = js.Dynamic.literal(InputStream = js.Any.fromFunction2(InputStream), OutputStream = js.Any.fromFunction0(OutputStream))
  
    __obj.asInstanceOf[bits]
  }
}

