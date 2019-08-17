package typings.atEmberService.atEmberServiceMod

import typings.atEmberObject.computedMod.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/service", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def inject(): ComputedProperty[Service, Service] = js.native
  def inject(target: js.Object, propertyKey: String): Unit = js.native
  def inject(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  def inject[K /* <: String */](name: K): ComputedProperty[
    /* import warning: ImportType.apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any
  ] = js.native
}

