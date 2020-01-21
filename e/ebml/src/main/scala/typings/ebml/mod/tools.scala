package typings.ebml.mod

import typings.ebml.AnonLength
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ebml", "tools")
@js.native
object tools extends js.Object {
  /**
    * concatenate two arrays of bytes
    * @param a1 First array
    * @param a2 Second array
    * @returns concatenated arrays
    */
  def concatenate(a1: Buffer, a2: Buffer): Buffer = js.native
  /**
    * Reads the data from a tag
    * @param tagObj The tag object to be read
    * @param data Data to be transformed
    * @return result
    */
  def readDataFromTag(tagObj: TagMetadata, data: Buffer): Tag[_] = js.native
  /**
    * get a date from a buffer
    * @param buff buffer from which to read the date
    * @return result
    */
  def readDate(buff: Buffer): Date = js.native
  /**
    * get a floating-point number from a buffer
    * @param buff from which to read variable-length floating-point number
    * @returns result
    */
  def readFloat(buff: Buffer): Double = js.native
  /**
    * get a hex text string from `buff[start,end)`
    * @param buff from which to read the string
    * @param [start=0] starting point (default `0`)
    * @param [end=buff.byteLength] ending point (default the whole buffer)
    * @returns the hex string
    */
  def readHexString(buff: Buffer): String = js.native
  def readHexString(buff: Buffer, start: Double): String = js.native
  def readHexString(buff: Buffer, start: Double, end: Double): String = js.native
  /**
    * get a signed number from a buffer
    * @param buff from which to read variable-length signed number
    * @returns result
    */
  def readSigned(buff: Buffer): Double = js.native
  /**
    * get an unsigned number from a buffer
    * @param buff from which to read variable-length unsigned number
    * @returns result (in hex for lengths > 6)
    */
  def readUnsigned(buff: Buffer): Double | String = js.native
  /**
    * tries to read out a UTF-8 encoded string
    * @param buff the buffer to attempt to read from
    * @return the decoded text, or `null` if unable to
    */
  def readUtf8(buff: Buffer): String | Null = js.native
  /**
    * read variable length integer per
    * https://www.matroska.org/technical/specs/index.html#EBML_ex
    * @param buffer containing input
    * @param [start=0] position in buffer
    * @returns value / length object
    */
  def readVint(buffer: Buffer): AnonLength = js.native
  def readVint(buffer: Buffer, start: Double): AnonLength = js.native
  /**
    * write variable length integer
    * @param value to store into buffer
    * @returns buffer containing the value
    */
  def writeVint(value: Double): Buffer = js.native
}

