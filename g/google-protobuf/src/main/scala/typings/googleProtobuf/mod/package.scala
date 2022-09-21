package typings.googleProtobuf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyFieldType = ScalarFieldType | RepeatedFieldType | js.typedarray.Uint8Array

type BinaryRead = js.Function2[/* msg */ Any, /* reader */ BinaryReadReader, Any]

type BinaryReadCallback = js.Function2[/* value */ Any, /* binaryReader */ BinaryReader, Unit]

type BinaryReadReader = js.Function2[/* msg */ Any, /* binaryReader */ BinaryReader, Unit]

type BinaryWrite = js.Function3[
/* fieldNumber */ Double, 
/* value */ Any, 
/* writerCallback */ BinaryWriteCallback, 
Unit]

type BinaryWriteCallback = js.Function2[/* value */ Any, /* binaryWriter */ BinaryWriter, Unit]

type ByteSource = js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.Array[Double] | String

type FieldValue = js.UndefOr[String | Double | Boolean | js.typedarray.Uint8Array | FieldValueArray]

type RepeatedFieldType = js.Array[ScalarFieldType | js.typedarray.Uint8Array]

type ScalarFieldType = Boolean | Double | String
