package typings.googleGax.mod.protobuf

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
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "protobuf.Field")
@js.native
class Field protected ()
  extends typings.protobufjs.mod.Field {
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
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[js.Any]) = this()
  def this(name: String, id: Double, `type`: String, rule: js.UndefOr[scala.Nothing], extend: String) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: StringDictionary[js.Any]
  ) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: String) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: StringDictionary[js.Any]) = this()
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[js.Any], extend: String) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: String,
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: StringDictionary[js.Any],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: String,
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: StringDictionary[js.Any],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: String,
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: StringDictionary[js.Any],
    options: StringDictionary[js.Any]
  ) = this()
}
/* static members */
object Field {
  
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @param [defaultValue] Default value
    * @returns Decorator function
    */
  @JSImport("google-gax", "protobuf.Field.d")
  @js.native
  def d[T /* <: Double | (js.Array[Boolean | Buffer | Double | Long | String | Uint8Array]) | Long | String | Boolean | Uint8Array | Buffer */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: js.UndefOr[optional | required | repeated],
    defaultValue: js.UndefOr[T]
  ): FieldDecorator = js.native
  @JSImport("google-gax", "protobuf.Field.d")
  @js.native
  def d[T /* <: typings.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String): FieldDecorator = js.native
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @returns Decorator function
    */
  @JSImport("google-gax", "protobuf.Field.d")
  @js.native
  def d[T /* <: typings.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T]): FieldDecorator = js.native
  @JSImport("google-gax", "protobuf.Field.d")
  @js.native
  def d_optional[T /* <: typings.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: optional): FieldDecorator = js.native
  @JSImport("google-gax", "protobuf.Field.d")
  @js.native
  def d_optional[T /* <: typings.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: optional): FieldDecorator = js.native
  @JSImport("google-gax", "protobuf.Field.d")
  @js.native
  def d_repeated[T /* <: typings.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: repeated): FieldDecorator = js.native
  @JSImport("google-gax", "protobuf.Field.d")
  @js.native
  def d_repeated[T /* <: typings.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: repeated): FieldDecorator = js.native
  @JSImport("google-gax", "protobuf.Field.d")
  @js.native
  def d_required[T /* <: typings.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: required): FieldDecorator = js.native
  @JSImport("google-gax", "protobuf.Field.d")
  @js.native
  def d_required[T /* <: typings.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: required): FieldDecorator = js.native
  
  /**
    * Constructs a field from a field descriptor.
    * @param name Field name
    * @param json Field descriptor
    * @returns Created field
    * @throws {TypeError} If arguments are invalid
    */
  @JSImport("google-gax", "protobuf.Field.fromJSON")
  @js.native
  def fromJSON(name: String, json: IField): typings.protobufjs.mod.Field = js.native
}
