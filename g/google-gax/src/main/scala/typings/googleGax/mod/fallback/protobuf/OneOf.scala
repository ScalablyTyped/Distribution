package typings.googleGax.mod.fallback.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IOneOf
import typings.protobufjs.mod.OneOfDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "fallback.protobuf.OneOf")
@js.native
open class OneOf protected ()
  extends typings.googleGax.fallbackMod.protobuf.OneOf {
  /**
    * Constructs a new oneof instance.
    * @param name Oneof name
    * @param [fieldNames] Field names
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: String) = this()
  def this(name: String, fieldNames: js.Array[String]) = this()
  def this(name: String, fieldNames: StringDictionary[Any]) = this()
  def this(name: String, fieldNames: js.Array[String], options: StringDictionary[Any]) = this()
  def this(name: String, fieldNames: StringDictionary[Any], options: StringDictionary[Any]) = this()
  def this(name: String, fieldNames: Unit, options: StringDictionary[Any]) = this()
  def this(name: String, fieldNames: js.Array[String], options: StringDictionary[Any], comment: String) = this()
  def this(name: String, fieldNames: js.Array[String], options: Unit, comment: String) = this()
  def this(name: String, fieldNames: StringDictionary[Any], options: StringDictionary[Any], comment: String) = this()
  def this(name: String, fieldNames: StringDictionary[Any], options: Unit, comment: String) = this()
  def this(name: String, fieldNames: Unit, options: StringDictionary[Any], comment: String) = this()
  def this(name: String, fieldNames: Unit, options: Unit, comment: String) = this()
}
/* static members */
object OneOf {
  
  @JSImport("google-gax", "fallback.protobuf.OneOf")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * OneOf decorator (TypeScript).
    * @param fieldNames Field names
    * @returns Decorator function
    */
  inline def d[T /* <: String */](fieldNames: String*): OneOfDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldNames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[OneOfDecorator]
  
  /**
    * Constructs a oneof from a oneof descriptor.
    * @param name Oneof name
    * @param json Oneof descriptor
    * @returns Created oneof
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IOneOf): typings.protobufjs.mod.OneOf = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.OneOf]
}
