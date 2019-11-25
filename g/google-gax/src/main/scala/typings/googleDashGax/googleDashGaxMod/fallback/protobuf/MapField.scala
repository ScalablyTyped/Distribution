package typings.googleDashGax.googleDashGaxMod.fallback.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleDashGax.googleDashGaxStrings.bool
import typings.googleDashGax.googleDashGaxStrings.bytes
import typings.googleDashGax.googleDashGaxStrings.double
import typings.googleDashGax.googleDashGaxStrings.fixed32
import typings.googleDashGax.googleDashGaxStrings.fixed64
import typings.googleDashGax.googleDashGaxStrings.float
import typings.googleDashGax.googleDashGaxStrings.int32
import typings.googleDashGax.googleDashGaxStrings.int64
import typings.googleDashGax.googleDashGaxStrings.sfixed32
import typings.googleDashGax.googleDashGaxStrings.sfixed64
import typings.googleDashGax.googleDashGaxStrings.sint32
import typings.googleDashGax.googleDashGaxStrings.sint64
import typings.googleDashGax.googleDashGaxStrings.string
import typings.googleDashGax.googleDashGaxStrings.uint32
import typings.googleDashGax.googleDashGaxStrings.uint64
import typings.protobufjs.protobufjsMod.Buffer
import typings.protobufjs.protobufjsMod.Constructor
import typings.protobufjs.protobufjsMod.FieldDecorator
import typings.protobufjs.protobufjsMod.IMapField
import typings.protobufjs.protobufjsMod.Long
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "fallback.protobuf.MapField")
@js.native
class MapField protected ()
  extends typings.googleDashGax.buildSrcFallbackMod.protobuf.MapField {
  /**
    * Constructs a new map field instance.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param keyType Key type
    * @param type Value type
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: String, id: Double, keyType: String, `type`: String) = this()
  def this(name: String, id: Double, keyType: String, `type`: String, options: StringDictionary[js.Any]) = this()
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
}

/* static members */
@JSImport("google-gax", "fallback.protobuf.MapField")
@js.native
object MapField extends js.Object {
  /**
    * Map field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldKeyType Field key type
    * @param fieldValueType Field value type
    * @returns Decorator function
    */
  def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | Uint8Array | Buffer | js.Array[Double] | typings.protobufjs.protobufjsMod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string | bytes | js.Object | Constructor[js.Object]
  ): FieldDecorator = js.native
  /**
    * Constructs a map field from a map field descriptor.
    * @param name Field name
    * @param json Map field descriptor
    * @returns Created map field
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IMapField): typings.protobufjs.protobufjsMod.MapField = js.native
}

