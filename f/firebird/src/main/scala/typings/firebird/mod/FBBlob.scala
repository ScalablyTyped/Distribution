package typings.firebird.mod

import typings.node.Buffer
import typings.std.Error
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
  def _closeSync(): Unit = js.native
  /**
    * Synchronously opens blob for reading.
    */
  def _openSync(): Unit = js.native
  /**
    * Asynchronously reads BLOB segment (chunk) into buffer. Tries to fill whole buffer with data.
    *
    * @param buffer Node buffer to fill with data.
    * @param callback function(err,buffer,len), err - Error object in case of error, or null;buffer - buffer filled with data; len - actual data length.
    */
  def _read(
    buffer: Buffer,
    callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]
  ): Unit = js.native
  /**
    * Asynchronously reads all data from BLOB field.
    * Object emits events while reading data error, drain',end`.
    *
    * @param initialSize - optional, initial result buffer to allocate, default = 0
    * @param chunkSize - optional, size of chunk used to read data, default = 1024
    * @param callback - optional, function (err, buffer, len), err - Error object in case of error, or null;buffer - buffer filled with data; len - actual data length.
    */
  def _readAll(): Unit = js.native
  def _readAll(callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]): Unit = js.native
  def _readAll(
    initialSize: js.UndefOr[scala.Nothing],
    chunkSize: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]
  ): Unit = js.native
  def _readAll(initialSize: js.UndefOr[scala.Nothing], chunkSize: Double): Unit = js.native
  def _readAll(
    initialSize: js.UndefOr[scala.Nothing],
    chunkSize: Double,
    callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]
  ): Unit = js.native
  def _readAll(initialSize: Double): Unit = js.native
  def _readAll(
    initialSize: Double,
    callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]
  ): Unit = js.native
  def _readAll(
    initialSize: Double,
    chunkSize: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]
  ): Unit = js.native
  def _readAll(initialSize: Double, chunkSize: Double): Unit = js.native
  def _readAll(
    initialSize: Double,
    chunkSize: Double,
    callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]
  ): Unit = js.native
  /**
    * Synchronously reads BLOB segment (chunk) into buffer. Tries to fill whole buffer with data.
    *
    * @param buffer Node buffer to fill with data.
    * @returns actual number of bytes read.
    */
  def _readSync(buffer: Buffer): Double = js.native
  /**
    * Asynchronously writes BLOB segment (chunk) from buffer and calls callback function if any.
    *
    * @param buffer Node buffer to write from to blob;
    * @param len optional length parameter, if specified only len bytes from buffer will be writen.
    * @param callback function(err), err - Error object in case of error, or null;
    */
  def _write(buffer: Buffer): Unit = js.native
  def _write(
    buffer: Buffer,
    len: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  def _write(buffer: Buffer, len: Double): Unit = js.native
  def _write(buffer: Buffer, len: Double, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Synchronously writes BLOB segment (chunk) from buffer.
    *
    * @param buffer Node buffer to write from to blob;
    * @param len optional length parameter, if specified only len bytes from buffer will be writen.
    * @returns number of bytes actually writen.
    */
  def _writeSync(buffer: Buffer): Double = js.native
  def _writeSync(buffer: Buffer, len: Double): Double = js.native
}

