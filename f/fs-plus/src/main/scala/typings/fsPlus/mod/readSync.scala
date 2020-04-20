package typings.fsPlus.mod

import typings.node.NodeJS.ArrayBufferView
import typings.node.fsMod.ReadSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "readSync")
@js.native
object readSync extends js.Object {
  /**
    * Similar to the above `fs.readSync` function, this version takes an optional `options` object.
    * If no `options` object is specified, it will default with the above values.
    */
  def apply(fd: Double, buffer: ArrayBufferView): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  /**
    * Synchronously reads data from the file referenced by the supplied file descriptor, returning the number of bytes read.
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = js.native
}

