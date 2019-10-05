package typings.atEmberApplication

import typings.atEmberApplication.instanceMod.ApplicationInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/application/instance", JSImport.Namespace)
@js.native
object instanceMod extends js.Object {
  @js.native
  class default () extends ApplicationInstance
  
  type ApplicationInstance = typings.atEmberEngine.instanceMod.default
}

