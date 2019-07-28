package typings.googleDashProtobuf

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object googleDashProtobufMod {
  type AnyFieldType = ScalarFieldType | RepeatedFieldType | Uint8Array
  type BinaryRead = js.Function2[/* msg */ js.Any, /* reader */ BinaryReadReader, Unit]
  type BinaryReadReader = js.Function2[/* msg */ js.Any, /* binaryReader */ BinaryReader, Unit]
  type BinaryWrite = js.Function3[
    /* fieldNumber */ Double, 
    /* value */ js.Any, 
    /* writerCallback */ BinaryWriteCallback, 
    Unit
  ]
  type BinaryWriteCallback = js.Function2[/* value */ js.Any, /* binaryWriter */ BinaryWriter, Unit]
  type ByteSource = ArrayBuffer | Uint8Array | js.Array[Double] | String
  type FieldValue = js.UndefOr[String | Double | Boolean | Uint8Array | FieldValueArray]
  type RepeatedFieldType = js.Array[ScalarFieldType | Uint8Array]
  type ScalarFieldType = Boolean | Double | String
}
