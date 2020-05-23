package typings.easyXapiSupertest.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instantiable
  extends Instantiable1[
      (/* array */ js.Array[js.Any]) | (/* size */ Double) | (/* str */ String) | (/* size */ Uint8Array), 
      Buffer
    ]
     with Instantiable2[/* str */ String, /* encoding */ String, Buffer] {
  /**
    * Gives the actual byte length of a string. encoding defaults to 'utf8'.
    * This is not the same as String.prototype.length since that returns the number of characters in a string.
    *
    * @param string string to test.
    * @param encoding encoding used to evaluate (defaults to 'utf8')
    */
  def byteLength(string: String): Double = js.native
  def byteLength(string: String, encoding: String): Double = js.native
  /**
    * The same as buf1.compare(buf2).
    */
  def compare(buf1: Buffer, buf2: Buffer): Double = js.native
  /**
    * Returns a buffer which is the result of concatenating all the buffers in the list together.
    *
    * If the list has no items, or if the totalLength is 0, then it returns a zero-length buffer.
    * If the list has exactly one item, then the first item of the list is returned.
    * If the list has more than one item, then a new Buffer is created.
    *
    * @param list An array of Buffer objects to concatenate
    * @param totalLength Total length of the buffers when concatenated.
    *   If totalLength is not provided, it is read from the buffers in the list. However, this adds an additional loop to the function, so it is faster to provide the length explicitly.
    */
  def concat(list: js.Array[Buffer]): Buffer = js.native
  def concat(list: js.Array[Buffer], totalLength: Double): Buffer = js.native
  /**
    * Returns true if {obj} is a Buffer
    *
    * @param obj object to test.
    */
  def isBuffer(obj: js.Any): Boolean = js.native
  /**
    * Returns true if {encoding} is a valid encoding argument.
    * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
    *
    * @param encoding string to test.
    */
  def isEncoding(encoding: String): Boolean = js.native
}

