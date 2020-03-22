package typings.emberTestHelpers

import typings.emberEngine.instanceMod.EngineInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ember.ember.default.ApplicationInstance & {factoryFor (fullName : string, options ? : {}): any} */
@js.native
trait ApplicationInstancefactor extends js.Object {
  /**
    *  Initialize the `EngineInstance` and return a promise that resolves
    *  with the instance itself when the boot process is complete.
    */
  def boot(): js.Promise[EngineInstance] = js.native
  def factoryFor(fullName: String): js.Any = js.native
  def factoryFor(fullName: String, options: js.Object): js.Any = js.native
  /**
    * Unregister a factory.
    */
  def unregister(fullName: String): js.Any = js.native
}

