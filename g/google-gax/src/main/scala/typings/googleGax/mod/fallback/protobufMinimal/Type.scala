package typings.googleGax.mod.fallback.protobufMinimal

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.Codegen
import typings.protobufjs.mod.IType
import typings.protobufjs.mod.TypeDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "fallback.protobufMinimal.Type")
@js.native
class Type protected ()
  extends typings.googleGax.fallbackMod.protobufMinimal.Type {
  /**
    * Constructs a new reflected message type instance.
    * @param name Message name
    * @param [options] Declared options
    */
  def this(name: String) = this()
  def this(name: String, options: StringDictionary[js.Any]) = this()
}
/* static members */
object Type {
  
  /**
    * Type decorator (TypeScript).
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Decorator function
    */
  @JSImport("google-gax", "fallback.protobufMinimal.Type.d")
  @js.native
  def d[T /* <: typings.protobufjs.mod.Message[T] */](): TypeDecorator[T] = js.native
  @JSImport("google-gax", "fallback.protobufMinimal.Type.d")
  @js.native
  def d[T /* <: typings.protobufjs.mod.Message[T] */](typeName: String): TypeDecorator[T] = js.native
  
  /**
    * Creates a message type from a message type descriptor.
    * @param name Message name
    * @param json Message type descriptor
    * @returns Created message type
    */
  @JSImport("google-gax", "fallback.protobufMinimal.Type.fromJSON")
  @js.native
  def fromJSON(name: String, json: IType): typings.protobufjs.mod.Type = js.native
  
  /**
    * Generates a constructor function for the specified type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  @JSImport("google-gax", "fallback.protobufMinimal.Type.generateConstructor")
  @js.native
  def generateConstructor(mtype: typings.protobufjs.mod.Type): Codegen = js.native
}
