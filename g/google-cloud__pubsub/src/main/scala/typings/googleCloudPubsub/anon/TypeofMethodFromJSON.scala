package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable9
import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Method
import typings.protobufjs.mod.IMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMethodFromJSON
  extends StObject
     with Instantiable9[
      /* name */ String, 
      /* type */ js.UndefOr[String], 
      /* requestType */ String, 
      /* responseType */ String, 
      /* requestStream */ js.UndefOr[Boolean | StringDictionary[Any]], 
      /* responseStream */ js.UndefOr[Boolean | StringDictionary[Any]], 
      /* options */ js.UndefOr[StringDictionary[Any]], 
      /* comment */ js.UndefOr[String], 
      /* parsedOptions */ js.UndefOr[StringDictionary[Any]], 
      Method
    ] {
  
  /**
    * Constructs a method from a method descriptor.
    * @param name Method name
    * @param json Method descriptor
    * @returns Created method
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IMethod): typings.protobufjs.mod.Method = js.native
}
