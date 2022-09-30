package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable1
import typings.googleGax.mod.fallback.protobufMinimal.Service
import typings.protobufjs.mod.IService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofServiceInstantiable
  extends StObject
     with Instantiable1[/* name */ String, Service] {
  
  /**
    * Constructs a service from a service descriptor.
    * @param name Service name
    * @param json Service descriptor
    * @returns Created service
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IService): typings.protobufjs.mod.Service = js.native
}
