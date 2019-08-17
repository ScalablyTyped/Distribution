package typings.atEmberController.atEmberControllerMod

import typings.atEmberObject.computedMod.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/controller", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ControllerMixin: typings.atEmberObject.mixinMod.default[
    typings.atEmberController.atEmberControllerMod.ControllerMixin, 
    typings.atEmberObject.atEmberObjectMod.default
  ] = js.native
  def inject(): ComputedProperty[Controller, Controller] = js.native
  def inject(target: js.Object, propertyKey: String): Unit = js.native
  def inject(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  def inject[K /* <: String */](name: K): ComputedProperty[
    /* import warning: ImportType.apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any
  ] = js.native
}

