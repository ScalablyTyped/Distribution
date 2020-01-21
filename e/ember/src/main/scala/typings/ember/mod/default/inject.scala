package typings.ember.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Namespace for injection helper methods.
  */
@JSImport("ember", "inject")
@js.native
object inject extends js.Object {
  /**
    * Creates a property that lazily looks up another controller in the container.
    * Can only be used when defining another controller.
    */
  def controller(): typings.ember.mod.Ember.ComputedProperty[typings.ember.mod.Ember.Controller, typings.ember.mod.Ember.Controller] = js.native
  def controller[K /* <: java.lang.String */](name: K): typings.ember.mod.Ember.ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any
  ] = js.native
  @js.native
  object service extends js.Object {
    def apply(): typings.emberObject.computedMod.ComputedProperty[typings.emberService.mod.Service, typings.emberService.mod.Service] = js.native
    def apply(target: js.Object, propertyKey: java.lang.String): Unit = js.native
    def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def apply[K /* <: java.lang.String */](name: K): typings.emberObject.computedMod.ComputedProperty[
        /* import warning: importer.ImportType#apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any
      ] = js.native
  }
  
}

