package typings.emberEngine.instanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : EmberObject.extend(RegistryProxyMixin, ContainerProxyMixin) * / any */ @js.native
trait EngineInstance extends js.Object {
  
  /**
    *  Initialize the `EngineInstance` and return a promise that resolves
    *  with the instance itself when the boot process is complete.
    */
  def boot(): js.Promise[EngineInstance] = js.native
  
  /**
    * Unregister a factory.
    */
  def unregister(fullName: String): js.Any = js.native
}
object EngineInstance {
  
  @scala.inline
  def apply(boot: () => js.Promise[EngineInstance], unregister: String => js.Any): EngineInstance = {
    val __obj = js.Dynamic.literal(boot = js.Any.fromFunction0(boot), unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[EngineInstance]
  }
  
  @scala.inline
  implicit class EngineInstanceOps[Self <: EngineInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoot(value: () => js.Promise[EngineInstance]): Self = this.set("boot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnregister(value: String => js.Any): Self = this.set("unregister", js.Any.fromFunction1(value))
  }
}
