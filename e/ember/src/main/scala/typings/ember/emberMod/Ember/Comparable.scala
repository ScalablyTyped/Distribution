package typings.ember.emberMod.Ember

import org.scalablytyped.runtime.TopLevel
import typings.atEmberObject.atEmberObjectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implements some standard methods for comparing objects. Add this mixin to
  * any class you create that can compare its instances.
  */
trait Comparable extends js.Object {
  def compare(a: js.Any, b: js.Any): Double
}

@JSImport("ember", "Ember.Comparable")
@js.native
object Comparable
  extends TopLevel[typings.atEmberObject.mixinMod.default[Comparable, default]]

