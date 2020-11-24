package typings.emberApplication

import typings.emberEngine.instanceMod.EngineInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/application/instance", JSImport.Namespace)
@js.native
object instanceMod extends js.Object {
  
  @js.native
  class default () extends EngineInstance
  
  type ApplicationInstance = EngineInstance
}
