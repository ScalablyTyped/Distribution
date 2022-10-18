package typings.googleGax.buildSrcFallbackMod.protobufMinimal

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.googleGaxStrings.bool
import typings.googleGax.googleGaxStrings.bytes
import typings.googleGax.googleGaxStrings.double
import typings.googleGax.googleGaxStrings.fixed32
import typings.googleGax.googleGaxStrings.fixed64
import typings.googleGax.googleGaxStrings.float
import typings.googleGax.googleGaxStrings.int32
import typings.googleGax.googleGaxStrings.int64
import typings.googleGax.googleGaxStrings.optional
import typings.googleGax.googleGaxStrings.repeated
import typings.googleGax.googleGaxStrings.required
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
import typings.protobufjs.mod.IField
import typings.protobufjs.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "protobufMinimal.Field")
@js.native
open class Field protected ()
  extends typings.protobufjs.minimalMod.Field {
  /**
    * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param type Value type
    * @param [rule="optional"] Field rule
    * @param [extend] Extended type if different from parent
    * @param [options] Declared options
    */
  def this(name: String, id: Double, `type`: String) = this()
  def this(name: String, id: Double, `type`: String, rule: String) = this()
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[Any]) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: String) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: StringDictionary[Any]) = this()
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[Any], extend: String) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[Any],
    extend: StringDictionary[Any]
  ) = this()
  def this(name: String, id: Double, `type`: String, rule: Unit, extend: String) = this()
  def this(name: String, id: Double, `type`: String, rule: Unit, extend: StringDictionary[Any]) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: String,
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: StringDictionary[Any],
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: Unit,
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[Any],
    extend: String,
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[Any],
    extend: StringDictionary[Any],
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[Any],
    extend: Unit,
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: Unit,
    extend: String,
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: Unit,
    extend: StringDictionary[Any],
    options: StringDictionary[Any]
  ) = this()
  def this(name: String, id: Double, `type`: String, rule: Unit, extend: Unit, options: StringDictionary[Any]) = this()
}
/* static members */
object Field {
  
  @JSImport("google-gax/build/src/fallback", "protobufMinimal.Field")
  @js.native
  val ^ : js.Any = js.native
  
  inline def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated,
    defaultValue: String
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: optional | repeated | required,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated,
    defaultValue: js.typedarray.Uint8Array
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated,
    defaultValue: Boolean
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated,
    defaultValue: Double
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated,
    defaultValue: Long
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: Unit,
    defaultValue: String
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: Unit,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: Unit,
    defaultValue: js.typedarray.Uint8Array
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: Unit,
    defaultValue: Boolean
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: Unit,
    defaultValue: Double
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: Unit,
    defaultValue: Long
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: optional | required | repeated,
    defaultValue: String
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: optional | repeated | required,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: optional | required | repeated,
    defaultValue: js.typedarray.Uint8Array
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: optional | required | repeated,
    defaultValue: Boolean
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: optional | required | repeated,
    defaultValue: Double
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: optional | required | repeated,
    defaultValue: Long
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(fieldId: Double, fieldType: js.Object, fieldRule: Unit, defaultValue: String): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: Unit,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(fieldId: Double, fieldType: js.Object, fieldRule: Unit, defaultValue: js.typedarray.Uint8Array): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(fieldId: Double, fieldType: js.Object, fieldRule: Unit, defaultValue: Boolean): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(fieldId: Double, fieldType: js.Object, fieldRule: Unit, defaultValue: Double): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d(fieldId: Double, fieldType: js.Object, fieldRule: Unit, defaultValue: Long): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: Double | (js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]) | Long | String | Boolean | js.typedarray.Uint8Array | Buffer */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: Double | (js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]) | Long | String | Boolean | js.typedarray.Uint8Array | Buffer */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: typings.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: typings.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: optional | required | repeated): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @param [defaultValue] Default value
    * @returns Decorator function
    */
  inline def d[T /* <: Double | (js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]) | Long | String | Boolean | js.typedarray.Uint8Array | Buffer */](fieldId: Double, fieldType: js.Object): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: Double | (js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]) | Long | String | Boolean | js.typedarray.Uint8Array | Buffer */](fieldId: Double, fieldType: js.Object, fieldRule: optional | required | repeated): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @returns Decorator function
    */
  inline def d[T /* <: typings.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T]): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: typings.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: optional | required | repeated): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  
  /**
    * Constructs a field from a field descriptor.
    * @param name Field name
    * @param json Field descriptor
    * @returns Created field
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IField): typings.protobufjs.mod.Field = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Field]
}
