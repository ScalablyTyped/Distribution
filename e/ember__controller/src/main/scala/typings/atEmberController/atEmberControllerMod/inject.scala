package typings.atEmberController.atEmberControllerMod

import typings.atEmberObject.computedMod.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/controller", "inject")
@js.native
object inject extends js.Object {
  def apply(): ComputedProperty[Controller, Controller] = js.native
  def apply(target: js.Object, propertyKey: String): Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  def apply[K /* <: String */](name: K): ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any
  ] = js.native
}

