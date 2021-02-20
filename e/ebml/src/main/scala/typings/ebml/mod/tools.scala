package typings.ebml.mod

import typings.ebml.anon.Length
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tools {
  
  /**
    * concatenate two arrays of bytes
    * @param a1 First array
    * @param a2 Second array
    * @returns concatenated arrays
    */
  @JSImport("ebml", "tools.concatenate")
  @js.native
  def concatenate(a1: Buffer, a2: Buffer): Buffer = js.native
  
  /**
    * Reads the data from a tag
    * @param tagObj The tag object to be read
    * @param data Data to be transformed
    * @return result
    */
  @JSImport("ebml", "tools.readDataFromTag")
  @js.native
  def readDataFromTag(tagObj: TagMetadata, data: Buffer): Tag[_] = js.native
  
  /**
    * get a date from a buffer
    * @param buff buffer from which to read the date
    * @return result
    */
  @JSImport("ebml", "tools.readDate")
  @js.native
  def readDate(buff: Buffer): Date = js.native
  
  /**
    * get a floating-point number from a buffer
    * @param buff from which to read variable-length floating-point number
    * @returns result
    */
  @JSImport("ebml", "tools.readFloat")
  @js.native
  def readFloat(buff: Buffer): Double = js.native
  
  /**
    * get a hex text string from `buff[start,end)`
    * @param buff from which to read the string
    * @param [start=0] starting point (default `0`)
    * @param [end=buff.byteLength] ending point (default the whole buffer)
    * @returns the hex string
    */
  @JSImport("ebml", "tools.readHexString")
  @js.native
  def readHexString(buff: Buffer): String = js.native
  @JSImport("ebml", "tools.readHexString")
  @js.native
  def readHexString(buff: Buffer, start: js.UndefOr[scala.Nothing], end: Double): String = js.native
  @JSImport("ebml", "tools.readHexString")
  @js.native
  def readHexString(buff: Buffer, start: Double): String = js.native
  @JSImport("ebml", "tools.readHexString")
  @js.native
  def readHexString(buff: Buffer, start: Double, end: Double): String = js.native
  
  /**
    * get a signed number from a buffer
    * @param buff from which to read variable-length signed number
    * @returns result
    */
  @JSImport("ebml", "tools.readSigned")
  @js.native
  def readSigned(buff: Buffer): Double = js.native
  
  /**
    * get an unsigned number from a buffer
    * @param buff from which to read variable-length unsigned number
    * @returns result (in hex for lengths > 6)
    */
  @JSImport("ebml", "tools.readUnsigned")
  @js.native
  def readUnsigned(buff: Buffer): Double | String = js.native
  
  /**
    * tries to read out a UTF-8 encoded string
    * @param buff the buffer to attempt to read from
    * @return the decoded text, or `null` if unable to
    */
  @JSImport("ebml", "tools.readUtf8")
  @js.native
  def readUtf8(buff: Buffer): String | Null = js.native
  
  /**
    * read variable length integer per
    * https://www.matroska.org/technical/specs/index.html#EBML_ex
    * @param buffer containing input
    * @param [start=0] position in buffer
    * @returns value / length object
    */
  @JSImport("ebml", "tools.readVint")
  @js.native
  def readVint(buffer: Buffer): Length = js.native
  @JSImport("ebml", "tools.readVint")
  @js.native
  def readVint(buffer: Buffer, start: Double): Length = js.native
  
  /**
    * write variable length integer
    * @param value to store into buffer
    * @returns buffer containing the value
    */
  @JSImport("ebml", "tools.writeVint")
  @js.native
  def writeVint(value: Double): Buffer = js.native
}
