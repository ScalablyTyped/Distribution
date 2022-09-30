package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable1
import typings.googleGax.mod.fallback.protobuf.OneOf
import typings.protobufjs.mod.IOneOf
import typings.protobufjs.mod.OneOfDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofOneOf
  extends StObject
     with Instantiable1[/* name */ String, OneOf] {
  
  /**
    * OneOf decorator (TypeScript).
    * @param fieldNames Field names
    * @returns Decorator function
    */
  def d[T /* <: String */](fieldNames: String*): OneOfDecorator = js.native
  
  /**
    * Constructs a oneof from a oneof descriptor.
    * @param name Oneof name
    * @param json Oneof descriptor
    * @returns Created oneof
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IOneOf): typings.protobufjs.mod.OneOf = js.native
}
