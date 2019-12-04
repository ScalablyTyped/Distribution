package typings.atEmberEngine.instanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall $anonfun class extends from : EmberObject.extend(RegistryProxyMixin, ContainerProxyMixin) * / any */ trait EngineInstance extends js.Object {
  /**
    *  Initialize the `EngineInstance` and return a promise that resolves
    *  with the instance itself when the boot process is complete.
    */
  def boot(): js.Promise[EngineInstance]
  /**
    * Unregister a factory.
    */
  def unregister(fullName: String): js.Any
}

object EngineInstance {
  @scala.inline
  def apply(boot: () => js.Promise[EngineInstance], unregister: String => js.Any): EngineInstance = {
    val __obj = js.Dynamic.literal(boot = js.Any.fromFunction0(boot), unregister = js.Any.fromFunction1(unregister))
  
    __obj.asInstanceOf[EngineInstance]
  }
}

