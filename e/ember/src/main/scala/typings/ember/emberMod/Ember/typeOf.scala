package typings.ember.emberMod.Ember

import typings.atEmberUtils.dashPrivateTypesMod.TypeLookup
import typings.atEmberUtils.dashPrivateTypesMod.TypeOf
import typings.ember.emberStrings.undefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.typeOf")
@js.native
object typeOf extends js.Object {
  def apply(): undefined = js.native
  def apply(item: js.Any): String = js.native
  def apply[T](value: T): TypeOf[TypeLookup, T] = js.native
}

