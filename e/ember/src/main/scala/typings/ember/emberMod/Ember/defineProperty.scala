package typings.ember.emberMod.Ember

import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.defineProperty")
@js.native
object defineProperty extends js.Object {
  def apply(obj: js.Object, keyName: String): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: typings.atEmberObject.computedMod.ComputedProperty[_, _]): Unit = js.native
  def apply(
    obj: js.Object,
    keyName: String,
    desc: typings.atEmberObject.computedMod.ComputedProperty[_, _],
    data: js.Any
  ): Unit = js.native
  def apply(
    obj: js.Object,
    keyName: String,
    desc: typings.atEmberObject.computedMod.ComputedProperty[_, _],
    data: js.Any,
    meta: js.Any
  ): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: PropertyDescriptor): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: PropertyDescriptor, data: js.Any): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: PropertyDescriptor, data: js.Any, meta: js.Any): Unit = js.native
}

