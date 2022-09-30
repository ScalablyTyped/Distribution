package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.bool
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.bytes
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.double
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.fixed32
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.fixed64
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.float
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.int32
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.int64
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.sfixed32
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.sfixed64
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.sint32
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.sint64
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.string
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.uint32
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.uint64
import typings.googleGax.mod.fallback.protobuf.MapField
import typings.protobufjs.mod.Buffer
import typings.protobufjs.mod.Constructor
import typings.protobufjs.mod.FieldDecorator
import typings.protobufjs.mod.IMapField
import typings.protobufjs.mod.Long
import typings.protobufjs.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMapField
  extends StObject
     with Instantiable4[/* name */ String, /* id */ Double, /* keyType */ String, /* type */ String, MapField] {
  
  def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | js.typedarray.Uint8Array | Buffer | js.Array[Double] | Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string | bytes
  ): FieldDecorator = js.native
  /**
    * Map field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldKeyType Field key type
    * @param fieldValueType Field value type
    * @returns Decorator function
    */
  def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | js.typedarray.Uint8Array | Buffer | js.Array[Double] | Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: js.Object
  ): FieldDecorator = js.native
  def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | js.typedarray.Uint8Array | Buffer | js.Array[Double] | Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: Constructor[js.Object]
  ): FieldDecorator = js.native
  
  /**
    * Constructs a map field from a map field descriptor.
    * @param name Field name
    * @param json Map field descriptor
    * @returns Created map field
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IMapField): typings.protobufjs.mod.MapField = js.native
}
