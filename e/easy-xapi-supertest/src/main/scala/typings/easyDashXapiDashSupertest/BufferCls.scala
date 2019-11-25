package typings.easyDashXapiDashSupertest

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Buffer")
@js.native
class BufferCls protected () extends NodeBuffer {
  /**
    * Allocates a new buffer containing the given {array} of octets.
    *
    * @param array The octets to store.
    */
  def this(array: js.Array[_]) = this()
  /**
    * Allocates a new buffer containing the given {array} of octets.
    *
    * @param array The octets to store.
    */
  def this(array: Uint8Array) = this()
  /**
    * Allocates a new buffer of {size} octets.
    *
    * @param size count of octets to allocate.
    */
  def this(size: Double) = this()
  /**
    * Allocates a new buffer containing the given {str}.
    *
    * @param str String to store in buffer.
    * @param encoding encoding to use, optional.  Default is 'utf8'
    */
  def this(str: String) = this()
  def this(str: String, encoding: String) = this()
}

