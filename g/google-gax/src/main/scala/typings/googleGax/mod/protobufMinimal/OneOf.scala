package typings.googleGax.mod.protobufMinimal

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IOneOf
import typings.protobufjs.mod.OneOfDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "protobufMinimal.OneOf")
@js.native
class OneOf protected ()
  extends typings.protobufjs.minimalMod.OneOf {
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
  def this(name: String, fieldNames: js.UndefOr[scala.Nothing], options: StringDictionary[js.Any]) = this()
  def this(name: String, fieldNames: js.Array[String], options: StringDictionary[js.Any]) = this()
  def this(name: String, fieldNames: StringDictionary[js.Any], options: StringDictionary[js.Any]) = this()
  def this(
    name: String,
    fieldNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    comment: String
  ) = this()
  def this(
    name: String,
    fieldNames: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
  def this(name: String, fieldNames: js.Array[String], options: js.UndefOr[scala.Nothing], comment: String) = this()
  def this(name: String, fieldNames: js.Array[String], options: StringDictionary[js.Any], comment: String) = this()
  def this(
    name: String,
    fieldNames: StringDictionary[js.Any],
    options: js.UndefOr[scala.Nothing],
    comment: String
  ) = this()
  def this(
    name: String,
    fieldNames: StringDictionary[js.Any],
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
}
/* static members */
object OneOf {
  
  /**
    * OneOf decorator (TypeScript).
    * @param fieldNames Field names
    * @returns Decorator function
    */
  @JSImport("google-gax", "protobufMinimal.OneOf.d")
  @js.native
  def d[T /* <: String */](fieldNames: String*): OneOfDecorator = js.native
  
  /**
    * Constructs a oneof from a oneof descriptor.
    * @param name Oneof name
    * @param json Oneof descriptor
    * @returns Created oneof
    * @throws {TypeError} If arguments are invalid
    */
  @JSImport("google-gax", "protobufMinimal.OneOf.fromJSON")
  @js.native
  def fromJSON(name: String, json: IOneOf): typings.protobufjs.mod.OneOf = js.native
}
