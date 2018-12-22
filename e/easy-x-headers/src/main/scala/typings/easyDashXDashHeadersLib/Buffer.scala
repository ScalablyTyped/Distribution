package typings
package easyDashXDashHeadersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Raw data is stored in instances of the Buffer class.
 * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
 * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
 */
@JSGlobal("Buffer")
@js.native
object Buffer
  extends /**
     * Allocates a new buffer containing the given {str}.
     *
     * @param str String to store in buffer.
     * @param encoding encoding to use, optional.  Default is 'utf8'
     */
org.scalablytyped.runtime.Instantiable2[/* str */ java.lang.String, /* encoding */ java.lang.String, Buffer]
     with /**
     * Allocates a new buffer containing the given {str}.
     *
     * @param str String to store in buffer.
     * @param encoding encoding to use, optional.  Default is 'utf8'
     */
/**
     * Allocates a new buffer of {size} octets.
     *
     * @param size count of octets to allocate.
     */
/**
     * Allocates a new buffer containing the given {array} of octets.
     *
     * @param array The octets to store.
     */
org.scalablytyped.runtime.Instantiable1[
      (/* array */ js.Array[js.Any]) | (/* size */ scala.Double) | (/* str */ java.lang.String) | (/* array */ stdLib.Uint8Array), 
      Buffer
    ] {
  /**
       * Gives the actual byte length of a string. encoding defaults to 'utf8'.
       * This is not the same as String.prototype.length since that returns the number of characters in a string.
       *
       * @param string string to test.
       * @param encoding encoding used to evaluate (defaults to 'utf8')
       */
  def byteLength(string: java.lang.String): scala.Double = js.native
  /**
       * Gives the actual byte length of a string. encoding defaults to 'utf8'.
       * This is not the same as String.prototype.length since that returns the number of characters in a string.
       *
       * @param string string to test.
       * @param encoding encoding used to evaluate (defaults to 'utf8')
       */
  def byteLength(string: java.lang.String, encoding: java.lang.String): scala.Double = js.native
  /**
       * The same as buf1.compare(buf2).
       */
  def compare(buf1: easyDashXDashHeadersLib.Buffer, buf2: easyDashXDashHeadersLib.Buffer): scala.Double = js.native
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
  def concat(list: js.Array[easyDashXDashHeadersLib.Buffer]): easyDashXDashHeadersLib.Buffer = js.native
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
  def concat(list: js.Array[easyDashXDashHeadersLib.Buffer], totalLength: scala.Double): easyDashXDashHeadersLib.Buffer = js.native
  /**
       * Returns true if {obj} is a Buffer
       *
       * @param obj object to test.
       */
  def isBuffer(obj: js.Any): scala.Boolean = js.native
  /**
       * Returns true if {encoding} is a valid encoding argument.
       * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
       *
       * @param encoding string to test.
       */
  def isEncoding(encoding: java.lang.String): scala.Boolean = js.native
}

