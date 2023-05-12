package typings.glimmerDi

import typings.glimmerDi.distTypesFactoryMod.FactoryDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolverMod {
  
  @js.native
  trait Resolver extends StObject {
    
    def identify(specifier: String): String = js.native
    def identify(specifier: String, referrer: String): String = js.native
    
    def retrieve(specifier: String): FactoryDefinition[Any] = js.native
  }
}
