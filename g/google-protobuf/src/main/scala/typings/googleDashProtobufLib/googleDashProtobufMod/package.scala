package typings
package googleDashProtobufLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object googleDashProtobufMod {
  type AnyFieldType = ScalarFieldType | RepeatedFieldType | stdLib.Uint8Array
  type BinaryRead = js.Function2[/* msg */ js.Any, /* reader */ BinaryReadReader, scala.Unit]
  type BinaryReadReader = js.Function2[/* msg */ js.Any, /* binaryReader */ BinaryReader, scala.Unit]
  type BinaryWrite = js.Function3[
    /* fieldNumber */ scala.Double, 
    /* value */ js.Any, 
    /* writerCallback */ BinaryWriteCallback, 
    scala.Unit
  ]
  type BinaryWriteCallback = js.Function2[/* value */ js.Any, /* binaryWriter */ BinaryWriter, scala.Unit]
  type ByteSource = stdLib.ArrayBuffer | stdLib.Uint8Array | js.Array[scala.Double] | java.lang.String
  type FieldValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | stdLib.Uint8Array | FieldValueArray
  ]
  type RepeatedFieldType = js.Array[ScalarFieldType | stdLib.Uint8Array]
  type ScalarFieldType = scala.Boolean | scala.Double | java.lang.String
}
