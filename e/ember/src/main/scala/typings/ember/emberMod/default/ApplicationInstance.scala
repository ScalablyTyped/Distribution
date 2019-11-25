package typings.ember.emberMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "ApplicationInstance")
@js.native
class ApplicationInstance ()
  extends typings.atEmberEngine.instanceMod.EngineInstance {
  /**
    *  Initialize the `EngineInstance` and return a promise that resolves
    *  with the instance itself when the boot process is complete.
    */
  /* CompleteClass */
  override def boot(): js.Promise[typings.atEmberEngine.instanceMod.EngineInstance] = js.native
  /**
    * Unregister a factory.
    */
  /* CompleteClass */
  override def unregister(fullName: java.lang.String): js.Any = js.native
}

