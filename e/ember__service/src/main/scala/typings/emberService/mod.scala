package typings.emberService

import typings.emberObject.computedMod.ComputedProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/service", JSImport.Default)
  @js.native
  class default ()
    extends typings.emberObject.mod.default
  
  @JSImport("@ember/service", "inject")
  @js.native
  def inject(): ComputedProperty[Service, Service] = js.native
  @JSImport("@ember/service", "inject")
  @js.native
  def inject(target: js.Object, propertyKey: String): Unit = js.native
  @JSImport("@ember/service", "inject")
  @js.native
  def inject(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  @JSImport("@ember/service", "inject")
  @js.native
  def inject[K /* <: /* keyof @ember/service.@ember/service.Registry */ String */](name: K): ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any
  ] = js.native
  
  // @inject('store') foo      @inject() foo
  // A type registry for Ember `Service`s. Meant to be declaration-merged so
  // string lookups resolve to the correct type.
  // tslint:disable-next-line no-empty-interface strict-export-declare-modifiers
  @js.native
  trait Registry extends StObject
  
  type Service = typings.emberObject.mod.default
}
