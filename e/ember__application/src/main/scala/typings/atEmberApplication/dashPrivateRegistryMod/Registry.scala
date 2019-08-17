package typings.atEmberApplication.dashPrivateRegistryMod

import typings.atEmberApplication.Anon_Singleton
import typings.atEmberObject.dashPrivateTypesMod.EmberClassConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Registry extends js.Object {
  def register(fullName: String, factory: EmberClassConstructor[_]): Unit = js.native
  def register(fullName: String, factory: EmberClassConstructor[_], options: Anon_Singleton): Unit = js.native
}

