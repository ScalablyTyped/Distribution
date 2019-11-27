package typings.ember.emberMod.default

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
  def controller(): typings.ember.emberMod.Ember.ComputedProperty[typings.ember.emberMod.Ember.Controller, typings.ember.emberMod.Ember.Controller] = js.native
  def controller[K /* <: java.lang.String */](name: K): typings.ember.emberMod.Ember.ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any
  ] = js.native
  @js.native
  object service extends js.Object {
    def apply(): js.Any = js.native
    def apply(target: js.Object, propertyKey: java.lang.String): Unit = js.native
    def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def apply[K /* <: java.lang.String */](name: K): js.Any = js.native
  }
  
}

