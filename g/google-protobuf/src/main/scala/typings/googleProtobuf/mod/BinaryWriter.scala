package typings.googleProtobuf.mod

import typings.googleProtobuf.mod.BinaryConstants.FieldType
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf", "BinaryWriter")
@js.native
class BinaryWriter () extends StObject {
  
  def beginSubMessage(field: Double): Unit = js.native
  
  def endSubMessage(field: Double): Unit = js.native
  
  def getResultBase64String(): String = js.native
  
  def getResultBuffer(): Uint8Array = js.native
  
  def maybeWriteSerializedMessage(): Unit = js.native
  def maybeWriteSerializedMessage(bytes: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], end: Double): Unit = js.native
  def maybeWriteSerializedMessage(bytes: js.UndefOr[scala.Nothing], start: Double): Unit = js.native
  def maybeWriteSerializedMessage(bytes: js.UndefOr[scala.Nothing], start: Double, end: Double): Unit = js.native
  def maybeWriteSerializedMessage(bytes: Uint8Array): Unit = js.native
  def maybeWriteSerializedMessage(bytes: Uint8Array, start: js.UndefOr[scala.Nothing], end: Double): Unit = js.native
  def maybeWriteSerializedMessage(bytes: Uint8Array, start: Double): Unit = js.native
  def maybeWriteSerializedMessage(bytes: Uint8Array, start: Double, end: Double): Unit = js.native
  
  def reset(): Unit = js.native
  
  def writeAny(fieldType: FieldType, field: Double, value: AnyFieldType): Unit = js.native
  
  def writeBool(field: Double): Unit = js.native
  def writeBool(field: Double, value: Boolean): Unit = js.native
  
  def writeBytes(field: Double): Unit = js.native
  def writeBytes(field: Double, value: ByteSource): Unit = js.native
  
  def writeDouble(field: Double): Unit = js.native
  def writeDouble(field: Double, value: Double): Unit = js.native
  
  def writeEnum(field: Double): Unit = js.native
  def writeEnum(field: Double, value: Double): Unit = js.native
  
  def writeFixed32(field: Double): Unit = js.native
  def writeFixed32(field: Double, value: Double): Unit = js.native
  
  def writeFixed64(field: Double): Unit = js.native
  def writeFixed64(field: Double, value: Double): Unit = js.native
  
  def writeFixed64String(field: Double): Unit = js.native
  def writeFixed64String(field: Double, value: String): Unit = js.native
  
  def writeFixedHash64(field: Double): Unit = js.native
  def writeFixedHash64(field: Double, value: String): Unit = js.native
  
  def writeFloat(field: Double): Unit = js.native
  def writeFloat(field: Double, value: Double): Unit = js.native
  
  def writeGroup(field: Double, value: js.Any, writeCallback: BinaryWriteCallback): Unit = js.native
  
  def writeInt32(field: Double): Unit = js.native
  def writeInt32(field: Double, value: Double): Unit = js.native
  
  def writeInt32String(field: Double): Unit = js.native
  def writeInt32String(field: Double, value: String): Unit = js.native
  
  def writeInt64(field: Double): Unit = js.native
  def writeInt64(field: Double, value: Double): Unit = js.native
  
  def writeInt64String(field: Double): Unit = js.native
  def writeInt64String(field: Double, value: String): Unit = js.native
  
  def writeMessage(fieldNumber: Double, value: js.Any, writerCallback: BinaryWriteCallback): Unit = js.native
  @JSName("writeMessage")
  var writeMessage_Original: BinaryWrite = js.native
  
  def writePackedBool(field: Double): Unit = js.native
  def writePackedBool(field: Double, value: js.Array[Boolean]): Unit = js.native
  
  def writePackedDouble(field: Double): Unit = js.native
  def writePackedDouble(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writePackedEnum(field: Double): Unit = js.native
  def writePackedEnum(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writePackedFixed32(field: Double): Unit = js.native
  def writePackedFixed32(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writePackedFixed64(field: Double): Unit = js.native
  def writePackedFixed64(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writePackedFixed64String(field: Double): Unit = js.native
  def writePackedFixed64String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writePackedFixedHash64(field: Double): Unit = js.native
  def writePackedFixedHash64(field: Double, value: js.Array[String]): Unit = js.native
  
  def writePackedFloat(field: Double): Unit = js.native
  def writePackedFloat(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writePackedInt32(field: Double): Unit = js.native
  def writePackedInt32(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writePackedInt32String(field: Double): Unit = js.native
  def writePackedInt32String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writePackedInt64(field: Double): Unit = js.native
  def writePackedInt64(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writePackedInt64String(field: Double): Unit = js.native
  def writePackedInt64String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writePackedSfixed32(field: Double): Unit = js.native
  def writePackedSfixed32(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writePackedSfixed64(field: Double): Unit = js.native
  def writePackedSfixed64(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writePackedSfixed64String(field: Double): Unit = js.native
  def writePackedSfixed64String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writePackedSint32(field: Double): Unit = js.native
  def writePackedSint32(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writePackedSint64(field: Double): Unit = js.native
  def writePackedSint64(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writePackedSint64String(field: Double): Unit = js.native
  def writePackedSint64String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writePackedUint32(field: Double): Unit = js.native
  def writePackedUint32(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writePackedUint32String(field: Double): Unit = js.native
  def writePackedUint32String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writePackedUint64(field: Double): Unit = js.native
  def writePackedUint64(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writePackedUint64String(field: Double): Unit = js.native
  def writePackedUint64String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writePackedVarintHash64(field: Double): Unit = js.native
  def writePackedVarintHash64(field: Double, value: js.Array[String]): Unit = js.native
  
  def writeRepeatedBool(field: Double): Unit = js.native
  def writeRepeatedBool(field: Double, value: js.Array[Boolean]): Unit = js.native
  
  def writeRepeatedBytes(field: Double): Unit = js.native
  def writeRepeatedBytes(field: Double, value: js.Array[ByteSource]): Unit = js.native
  
  def writeRepeatedDouble(field: Double): Unit = js.native
  def writeRepeatedDouble(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writeRepeatedEnum(field: Double): Unit = js.native
  def writeRepeatedEnum(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writeRepeatedFixed32(field: Double): Unit = js.native
  def writeRepeatedFixed32(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writeRepeatedFixed64(field: Double): Unit = js.native
  def writeRepeatedFixed64(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writeRepeatedFixed64String(field: Double): Unit = js.native
  def writeRepeatedFixed64String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writeRepeatedFixedHash64(field: Double): Unit = js.native
  def writeRepeatedFixedHash64(field: Double, value: js.Array[String]): Unit = js.native
  
  def writeRepeatedFloat(field: Double): Unit = js.native
  def writeRepeatedFloat(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writeRepeatedGroup(field: Double, value: js.Array[Message], writerCallback: BinaryWriteCallback): Unit = js.native
  
  def writeRepeatedInt32(field: Double): Unit = js.native
  def writeRepeatedInt32(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writeRepeatedInt32String(field: Double): Unit = js.native
  def writeRepeatedInt32String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writeRepeatedInt64(field: Double): Unit = js.native
  def writeRepeatedInt64(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writeRepeatedInt64String(field: Double): Unit = js.native
  def writeRepeatedInt64String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writeRepeatedMessage(field: Double, value: js.Array[Message], writerCallback: BinaryWriteCallback): Unit = js.native
  
  def writeRepeatedSfixed32(field: Double): Unit = js.native
  def writeRepeatedSfixed32(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writeRepeatedSfixed64(field: Double): Unit = js.native
  def writeRepeatedSfixed64(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writeRepeatedSfixed64String(field: Double): Unit = js.native
  def writeRepeatedSfixed64String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writeRepeatedSint32(field: Double): Unit = js.native
  def writeRepeatedSint32(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writeRepeatedSint64(field: Double): Unit = js.native
  def writeRepeatedSint64(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writeRepeatedSint64String(field: Double): Unit = js.native
  def writeRepeatedSint64String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writeRepeatedString(field: Double): Unit = js.native
  def writeRepeatedString(field: Double, value: js.Array[String]): Unit = js.native
  
  def writeRepeatedUint32(field: Double): Unit = js.native
  def writeRepeatedUint32(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writeRepeatedUint32String(field: Double): Unit = js.native
  def writeRepeatedUint32String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writeRepeatedUint64(field: Double): Unit = js.native
  def writeRepeatedUint64(field: Double, value: js.Array[Double]): Unit = js.native
  
  def writeRepeatedUint64String(field: Double): Unit = js.native
  def writeRepeatedUint64String(field: Double, value: js.Array[String]): Unit = js.native
  
  def writeRepeatedVarintHash64(field: Double): Unit = js.native
  def writeRepeatedVarintHash64(field: Double, value: js.Array[String]): Unit = js.native
  
  def writeSerializedMessage(bytes: Uint8Array, start: Double, end: Double): Unit = js.native
  
  def writeSfixed32(field: Double): Unit = js.native
  def writeSfixed32(field: Double, value: Double): Unit = js.native
  
  def writeSfixed64(field: Double): Unit = js.native
  def writeSfixed64(field: Double, value: Double): Unit = js.native
  
  def writeSfixed64String(field: Double): Unit = js.native
  def writeSfixed64String(field: Double, value: String): Unit = js.native
  
  def writeSint32(field: Double): Unit = js.native
  def writeSint32(field: Double, value: Double): Unit = js.native
  
  def writeSint64(field: Double): Unit = js.native
  def writeSint64(field: Double, value: Double): Unit = js.native
  
  def writeSint64String(field: Double): Unit = js.native
  def writeSint64String(field: Double, value: String): Unit = js.native
  
  def writeString(field: Double): Unit = js.native
  def writeString(field: Double, value: String): Unit = js.native
  
  def writeUint32(field: Double): Unit = js.native
  def writeUint32(field: Double, value: Double): Unit = js.native
  
  def writeUint32String(field: Double): Unit = js.native
  def writeUint32String(field: Double, value: String): Unit = js.native
  
  def writeUint64(field: Double): Unit = js.native
  def writeUint64(field: Double, value: Double): Unit = js.native
  
  def writeUint64String(field: Double): Unit = js.native
  def writeUint64String(field: Double, value: String): Unit = js.native
  
  def writeVarintHash64(field: Double): Unit = js.native
  def writeVarintHash64(field: Double, value: String): Unit = js.native
}
