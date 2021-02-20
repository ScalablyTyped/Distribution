package typings.googleGax.mod.fallback.protobufMinimal

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "fallback.protobufMinimal.Service")
@js.native
class Service protected ()
  extends typings.googleGax.fallbackMod.protobufMinimal.Service {
  /**
    * Constructs a new service instance.
    * @param name Service name
    * @param [options] Service options
    * @throws {TypeError} If arguments are invalid
    */
  def this(name: String) = this()
  def this(name: String, options: StringDictionary[js.Any]) = this()
}
/* static members */
object Service {
  
  /**
    * Constructs a service from a service descriptor.
    * @param name Service name
    * @param json Service descriptor
    * @returns Created service
    * @throws {TypeError} If arguments are invalid
    */
  @JSImport("google-gax", "fallback.protobufMinimal.Service.fromJSON")
  @js.native
  def fromJSON(name: String, json: IService): typings.protobufjs.mod.Service = js.native
}
