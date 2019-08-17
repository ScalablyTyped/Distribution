package typings.atEmberEngine.atEmberEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall $anonfun class extends from : EmberObject.extend(RegistryProxyMixin) * / any */ @js.native
trait Engine extends js.Object {
  /**
    * Set this to provide an alternate class to `Ember.DefaultResolver`
    */
  var resolver: typings.atEmberEngine.dashPrivateResolverMod.default = js.native
  /**
    * Create an EngineInstance for this Engine.
    */
  def buildInstance(): typings.atEmberEngine.instanceMod.default = js.native
  def buildInstance(options: js.Object): typings.atEmberEngine.instanceMod.default = js.native
}

