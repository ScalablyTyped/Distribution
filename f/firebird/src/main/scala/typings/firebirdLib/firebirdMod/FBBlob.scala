package typings
package firebirdLib.firebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents BLOB data type.
  */
@js.native
trait FBBlob extends js.Object {
  /**
    * Synchronously closes previously opened blob.
    */
  def _closeSync(): scala.Unit = js.native
  /**
    * Synchronously opens blob for reading.
    */
  def _openSync(): scala.Unit = js.native
  /**
    * Asynchronously reads BLOB segment (chunk) into buffer. Tries to fill whole buffer with data.
    *
    * @param buffer Node buffer to fill with data.
    * @param callback function(err,buffer,len), err - Error object in case of error, or null;buffer - buffer filled with data; len - actual data length.
    */
  def _read(
    buffer: nodeLib.Buffer,
    callback: js.Function3[
      /* err */ stdLib.Error | scala.Null, 
      /* buffer */ nodeLib.Buffer, 
      /* len */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Asynchronously reads all data from BLOB field.
    * Object emits events while reading data error, drain',end`.
    *
    * @param initialSize - optional, initial result buffer to allocate, default = 0
    * @param chunkSize - optional, size of chunk used to read data, default = 1024
    * @param callback - optional, function (err, buffer, len), err - Error object in case of error, or null;buffer - buffer filled with data; len - actual data length.
    */
  def _readAll(): scala.Unit = js.native
  def _readAll(
    callback: js.Function3[
      /* err */ stdLib.Error | scala.Null, 
      /* buffer */ nodeLib.Buffer, 
      /* len */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def _readAll(initialSize: scala.Double): scala.Unit = js.native
  def _readAll(
    initialSize: scala.Double,
    callback: js.Function3[
      /* err */ stdLib.Error | scala.Null, 
      /* buffer */ nodeLib.Buffer, 
      /* len */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def _readAll(initialSize: scala.Double, chunkSize: scala.Double): scala.Unit = js.native
  def _readAll(
    initialSize: scala.Double,
    chunkSize: scala.Double,
    callback: js.Function3[
      /* err */ stdLib.Error | scala.Null, 
      /* buffer */ nodeLib.Buffer, 
      /* len */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Synchronously reads BLOB segment (chunk) into buffer. Tries to fill whole buffer with data.
    *
    * @param buffer Node buffer to fill with data.
    * @returns actual number of bytes read.
    */
  def _readSync(buffer: nodeLib.Buffer): scala.Double = js.native
  /**
    * Asynchronously writes BLOB segment (chunk) from buffer and calls callback function if any.
    *
    * @param buffer Node buffer to write from to blob;
    * @param len optional length parameter, if specified only len bytes from buffer will be writen.
    * @param callback function(err), err - Error object in case of error, or null;
    */
  def _write(buffer: nodeLib.Buffer): scala.Unit = js.native
  def _write(buffer: nodeLib.Buffer, len: scala.Double): scala.Unit = js.native
  def _write(
    buffer: nodeLib.Buffer,
    len: scala.Double,
    callback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Synchronously writes BLOB segment (chunk) from buffer.
    *
    * @param buffer Node buffer to write from to blob;
    * @param len optional length parameter, if specified only len bytes from buffer will be writen.
    * @returns number of bytes actually writen.
    */
  def _writeSync(buffer: nodeLib.Buffer): scala.Double = js.native
  def _writeSync(buffer: nodeLib.Buffer, len: scala.Double): scala.Double = js.native
}

