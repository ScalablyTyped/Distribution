package typings.ember.mod.Ember

import org.scalablytyped.runtime.TopLevel
import typings.emberObject.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implements some standard methods for comparing objects. Add this mixin to
  * any class you create that can compare its instances.
  */
@js.native
trait Comparable extends js.Object {
  
  def compare(a: js.Any, b: js.Any): Double = js.native
}
@JSImport("ember", "Ember.Comparable")
@js.native
object Comparable
  extends TopLevel[typings.emberObject.mixinMod.default[Comparable, default]]
