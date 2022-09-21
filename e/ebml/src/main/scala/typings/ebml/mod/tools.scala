package typings.ebml.mod

import typings.ebml.anon.Length
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tools {
  
  @JSImport("ebml", "tools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * concatenate two arrays of bytes
    * @param a1 First array
    * @param a2 Second array
    * @returns concatenated arrays
    */
  inline def concatenate(a1: Buffer, a2: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * Reads the data from a tag
    * @param tagObj The tag object to be read
    * @param data Data to be transformed
    * @return result
    */
  inline def readDataFromTag(tagObj: TagMetadata, data: Buffer): Tag[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readDataFromTag")(tagObj.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Tag[Any]]
  
  /**
    * get a date from a buffer
    * @param buff buffer from which to read the date
    * @return result
    */
  inline def readDate(buff: Buffer): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("readDate")(buff.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  /**
    * get a floating-point number from a buffer
    * @param buff from which to read variable-length floating-point number
    * @returns result
    */
  inline def readFloat(buff: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readFloat")(buff.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * get a hex text string from `buff[start,end)`
    * @param buff from which to read the string
    * @param [start=0] starting point (default `0`)
    * @param [end=buff.byteLength] ending point (default the whole buffer)
    * @returns the hex string
    */
  inline def readHexString(buff: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readHexString")(buff.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def readHexString(buff: Buffer, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readHexString")(buff.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readHexString(buff: Buffer, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readHexString")(buff.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readHexString(buff: Buffer, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readHexString")(buff.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * get a signed number from a buffer
    * @param buff from which to read variable-length signed number
    * @returns result
    */
  inline def readSigned(buff: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readSigned")(buff.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * get an unsigned number from a buffer
    * @param buff from which to read variable-length unsigned number
    * @returns result (in hex for lengths > 6)
    */
  inline def readUnsigned(buff: Buffer): Double | String = ^.asInstanceOf[js.Dynamic].applyDynamic("readUnsigned")(buff.asInstanceOf[js.Any]).asInstanceOf[Double | String]
  
  /**
    * tries to read out a UTF-8 encoded string
    * @param buff the buffer to attempt to read from
    * @return the decoded text, or `null` if unable to
    */
  inline def readUtf8(buff: Buffer): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readUtf8")(buff.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /**
    * read variable length integer per
    * https://www.matroska.org/technical/specs/index.html#EBML_ex
    * @param buffer containing input
    * @param [start=0] position in buffer
    * @returns value / length object
    */
  inline def readVint(buffer: Buffer): Length = ^.asInstanceOf[js.Dynamic].applyDynamic("readVint")(buffer.asInstanceOf[js.Any]).asInstanceOf[Length]
  inline def readVint(buffer: Buffer, start: Double): Length = (^.asInstanceOf[js.Dynamic].applyDynamic("readVint")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Length]
  
  /**
    * write variable length integer
    * @param value to store into buffer
    * @returns buffer containing the value
    */
  inline def writeVint(value: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("writeVint")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
