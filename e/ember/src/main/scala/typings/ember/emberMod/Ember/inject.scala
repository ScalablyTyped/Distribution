package typings.ember.emberMod.Ember

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Namespace for injection helper methods.
  */
@JSImport("ember", "Ember.inject")
@js.native
object inject extends js.Object {
  /**
    * Creates a property that lazily looks up another controller in the container.
    * Can only be used when defining another controller.
    */
  def controller(): ComputedProperty[Controller, Controller] = js.native
  def controller[K /* <: String */](name: K): ComputedProperty[
    /* import warning: ImportType.apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any
  ] = js.native
  @js.native
  object service extends js.Object {
    def apply(): typings.atEmberObject.computedMod.ComputedProperty[
        typings.atEmberService.atEmberServiceMod.Service, 
        typings.atEmberService.atEmberServiceMod.Service
      ] = js.native
    def apply(target: js.Object, propertyKey: String): Unit = js.native
    def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def apply[K /* <: String */](name: K): typings.atEmberObject.computedMod.ComputedProperty[
        /* import warning: ImportType.apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any, 
        /* import warning: ImportType.apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any
      ] = js.native
  }
  
}

