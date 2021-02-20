package typings.ember.mod.Ember

import typings.emberObject.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implements some standard methods for comparing objects. Add this mixin to
  * any class you create that can compare its instances.
  */
@js.native
trait Comparable extends StObject {
  
  def compare(a: js.Any, b: js.Any): Double = js.native
}
object Comparable {
  
  @JSImport("ember", "Ember.Comparable")
  @js.native
  val ^ : typings.emberObject.mixinMod.default[Comparable, default] = js.native
  
  @scala.inline
  implicit class ComparableMutableBuilder[Self <: Comparable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompare(value: (js.Any, js.Any) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
  }
}
