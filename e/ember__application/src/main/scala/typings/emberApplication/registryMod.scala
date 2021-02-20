package typings.emberApplication

import typings.emberApplication.anon.Singleton
import typings.emberObject.typesMod.EmberClassConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryMod {
  
  @JSImport("@ember/application/-private/registry", JSImport.Default)
  @js.native
  class default () extends Registry
  
  @js.native
  trait Registry extends StObject {
    
    def register(fullName: String, factory: EmberClassConstructor[_]): Unit = js.native
    def register(fullName: String, factory: EmberClassConstructor[_], options: Singleton): Unit = js.native
  }
}
