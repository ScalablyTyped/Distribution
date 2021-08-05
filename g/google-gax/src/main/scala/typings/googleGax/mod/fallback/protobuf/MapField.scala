package typings.googleGax.mod.fallback.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.googleGaxStrings.bool
import typings.googleGax.googleGaxStrings.bytes
import typings.googleGax.googleGaxStrings.double
import typings.googleGax.googleGaxStrings.fixed32
import typings.googleGax.googleGaxStrings.fixed64
import typings.googleGax.googleGaxStrings.float
import typings.googleGax.googleGaxStrings.int32
import typings.googleGax.googleGaxStrings.int64
import typings.googleGax.googleGaxStrings.sfixed32
import typings.googleGax.googleGaxStrings.sfixed64
import typings.googleGax.googleGaxStrings.sint32
import typings.googleGax.googleGaxStrings.sint64
import typings.googleGax.googleGaxStrings.string
import typings.googleGax.googleGaxStrings.uint32
import typings.googleGax.googleGaxStrings.uint64
import typings.protobufjs.mod.Buffer
import typings.protobufjs.mod.Constructor
import typings.protobufjs.mod.FieldDecorator
import typings.protobufjs.mod.IMapField
import typings.protobufjs.mod.Long
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "fallback.protobuf.MapField")
@js.native
class MapField protected ()
  extends typings.googleGax.fallbackMod.protobuf.MapField {
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
  def this(name: String, id: Double, keyType: String, `type`: String, options: Unit, comment: String) = this()
}
/* static members */
object MapField {
  
  @JSImport("google-gax", "fallback.protobuf.MapField")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Map field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldKeyType Field key type
    * @param fieldValueType Field value type
    * @returns Decorator function
    */
  inline def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | Uint8Array | Buffer | js.Array[Double] | typings.protobufjs.mod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string | bytes | js.Object | Constructor[js.Object]
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldKeyType.asInstanceOf[js.Any], fieldValueType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  
  /**
    * Constructs a map field from a map field descriptor.
    * @param name Field name
    * @param json Map field descriptor
    * @returns Created map field
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IMapField): typings.protobufjs.mod.MapField = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.MapField]
}
