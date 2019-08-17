package typings.atEmberEngine.atEmberEngineMod

import typings.atEmberEngine.dashPrivateTypesInitializerMod.Initializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/engine", JSImport.Default)
@js.native
class default () extends Engine

/* static members */
@JSImport("@ember/engine", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * The goal of initializers should be to register dependencies and injections.
    * This phase runs once. Because these initializers may load code, they are
    * allowed to defer application readiness and advance it. If you need to access
    * the container or store you should use an InstanceInitializer that will be run
    * after all initializers and therefore after all code is loaded and the app is
    * ready.
    */
  def initializer(initializer: Initializer[Engine]): Unit = js.native
  /**
    * Instance initializers run after all initializers have run. Because
    * instance initializers run after the app is fully set up. We have access
    * to the store, container, and other items. However, these initializers run
    * after code has loaded and are not allowed to defer readiness.
    */
  def instanceInitializer(instanceInitializer: Initializer[typings.atEmberEngine.instanceMod.default]): Unit = js.native
}

