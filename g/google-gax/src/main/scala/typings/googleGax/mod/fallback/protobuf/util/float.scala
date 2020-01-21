package typings.googleGax.mod.fallback.protobuf.util

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads / writes floats / doubles from / to buffers. */
@JSImport("google-gax", "fallback.protobuf.util.float")
@js.native
object float extends js.Object {
  /**
    * Reads a 64 bit double from a buffer using big endian byte order.
    * @param buf Source buffer
    * @param pos Source buffer offset
    * @returns Value read
    */
  def readDoubleBE(buf: Uint8Array, pos: Double): Double = js.native
  /**
    * Reads a 64 bit double from a buffer using little endian byte order.
    * @param buf Source buffer
    * @param pos Source buffer offset
    * @returns Value read
    */
  def readDoubleLE(buf: Uint8Array, pos: Double): Double = js.native
  /**
    * Reads a 32 bit float from a buffer using big endian byte order.
    * @param buf Source buffer
    * @param pos Source buffer offset
    * @returns Value read
    */
  def readFloatBE(buf: Uint8Array, pos: Double): Double = js.native
  /**
    * Reads a 32 bit float from a buffer using little endian byte order.
    * @param buf Source buffer
    * @param pos Source buffer offset
    * @returns Value read
    */
  def readFloatLE(buf: Uint8Array, pos: Double): Double = js.native
  /**
    * Writes a 64 bit double to a buffer using big endian byte order.
    * @param val Value to write
    * @param buf Target buffer
    * @param pos Target buffer offset
    */
  def writeDoubleBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
  /**
    * Writes a 64 bit double to a buffer using little endian byte order.
    * @param val Value to write
    * @param buf Target buffer
    * @param pos Target buffer offset
    */
  def writeDoubleLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
  /**
    * Writes a 32 bit float to a buffer using big endian byte order.
    * @param val Value to write
    * @param buf Target buffer
    * @param pos Target buffer offset
    */
  def writeFloatBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
  /**
    * Writes a 32 bit float to a buffer using little endian byte order.
    * @param val Value to write
    * @param buf Target buffer
    * @param pos Target buffer offset
    */
  def writeFloatLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
}

