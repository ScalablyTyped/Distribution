package typings.emberApplication

import typings.emberEngine.instanceMod.EngineInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/application/instance", JSImport.Namespace)
@js.native
object instanceMod extends js.Object {
  @js.native
  class default () extends EngineInstance {
    /**
      *  Initialize the `EngineInstance` and return a promise that resolves
      *  with the instance itself when the boot process is complete.
      */
    /* CompleteClass */
    override def boot(): js.Promise[EngineInstance] = js.native
    /**
      * Unregister a factory.
      */
    /* CompleteClass */
    override def unregister(fullName: String): js.Any = js.native
  }
  
  type ApplicationInstance = EngineInstance
}

