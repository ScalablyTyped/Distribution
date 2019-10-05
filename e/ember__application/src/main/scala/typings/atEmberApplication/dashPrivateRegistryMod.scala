package typings.atEmberApplication

import typings.atEmberApplication.dashPrivateRegistryMod.Registry
import typings.atEmberObject.dashPrivateTypesMod.EmberClassConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/application/-private/registry", JSImport.Namespace)
@js.native
object dashPrivateRegistryMod extends js.Object {
  @js.native
  trait Registry extends js.Object {
    def register(fullName: String, factory: EmberClassConstructor[_]): Unit = js.native
    def register(fullName: String, factory: EmberClassConstructor[_], options: Anon_Singleton): Unit = js.native
  }
  
  @js.native
  class default () extends Registry
  
}

