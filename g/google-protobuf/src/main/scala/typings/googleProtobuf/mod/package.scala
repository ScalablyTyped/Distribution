package typings.googleProtobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyFieldType = typings.googleProtobuf.mod.ScalarFieldType | typings.googleProtobuf.mod.RepeatedFieldType | typings.std.Uint8Array
  
  type BinaryRead = js.Function2[
    /* msg */ js.Any, 
    /* reader */ typings.googleProtobuf.mod.BinaryReadReader, 
    scala.Unit
  ]
  
  type BinaryReadReader = js.Function2[
    /* msg */ js.Any, 
    /* binaryReader */ typings.googleProtobuf.mod.BinaryReader, 
    scala.Unit
  ]
  
  type BinaryWrite = js.Function3[
    /* fieldNumber */ scala.Double, 
    /* value */ js.Any, 
    /* writerCallback */ typings.googleProtobuf.mod.BinaryWriteCallback, 
    scala.Unit
  ]
  
  type BinaryWriteCallback = js.Function2[
    /* value */ js.Any, 
    /* binaryWriter */ typings.googleProtobuf.mod.BinaryWriter, 
    scala.Unit
  ]
  
  type ByteSource = typings.std.ArrayBuffer | typings.std.Uint8Array | js.Array[scala.Double] | java.lang.String
  
  type FieldValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | typings.std.Uint8Array | typings.googleProtobuf.mod.FieldValueArray
  ]
  
  type RepeatedFieldType = js.Array[typings.googleProtobuf.mod.ScalarFieldType | typings.std.Uint8Array]
  
  type ScalarFieldType = scala.Boolean | scala.Double | java.lang.String
}
