package typings.googleGax.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IOneOf
import typings.protobufjs.mod.OneOfDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "protobuf.OneOf")
@js.native
class OneOf protected ()
  extends typings.protobufjs.mod.OneOf {
  /**
    * Constructs a new oneof instance.
    * @param name Oneof name
    * @param [fieldNames] Field names
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: String) = this()
  def this(name: String, fieldNames: js.Array[String]) = this()
  def this(name: String, fieldNames: StringDictionary[js.Any]) = this()
  def this(name: String, fieldNames: js.Array[String], options: StringDictionary[js.Any]) = this()
  def this(name: String, fieldNames: StringDictionary[js.Any], options: StringDictionary[js.Any]) = this()
  def this(name: String, fieldNames: Unit, options: StringDictionary[js.Any]) = this()
  def this(name: String, fieldNames: js.Array[String], options: StringDictionary[js.Any], comment: String) = this()
  def this(name: String, fieldNames: js.Array[String], options: Unit, comment: String) = this()
  def this(
    name: String,
    fieldNames: StringDictionary[js.Any],
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
  def this(name: String, fieldNames: StringDictionary[js.Any], options: Unit, comment: String) = this()
  def this(name: String, fieldNames: Unit, options: StringDictionary[js.Any], comment: String) = this()
  def this(name: String, fieldNames: Unit, options: Unit, comment: String) = this()
}
/* static members */
object OneOf {
  
  @JSImport("google-gax", "protobuf.OneOf")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * OneOf decorator (TypeScript).
    * @param fieldNames Field names
    * @returns Decorator function
    */
  @scala.inline
  def d[T /* <: String */](fieldNames: String*): OneOfDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldNames.asInstanceOf[js.Any]).asInstanceOf[OneOfDecorator]
  
  /**
    * Constructs a oneof from a oneof descriptor.
    * @param name Oneof name
    * @param json Oneof descriptor
    * @returns Created oneof
    * @throws {TypeError} If arguments are invalid
    */
  @scala.inline
  def fromJSON(name: String, json: IOneOf): typings.protobufjs.mod.OneOf = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.OneOf]
}
