package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable1
import typings.googleGax.mod.protobuf.Enum
import typings.protobufjs.mod.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEnumFromJSON
  extends StObject
     with Instantiable1[/* name */ String, Enum] {
  
  /**
    * Constructs an enum from an enum descriptor.
    * @param name Enum name
    * @param json Enum descriptor
    * @returns Created enum
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IEnum): typings.protobufjs.mod.Enum = js.native
}
