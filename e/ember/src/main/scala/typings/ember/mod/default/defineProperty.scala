package typings.ember.mod.default

import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "defineProperty")
@js.native
object defineProperty extends js.Object {
  def apply(obj: js.Object, keyName: java.lang.String): Unit = js.native
  def apply(
    obj: js.Object,
    keyName: java.lang.String,
    desc: typings.emberObject.computedMod.ComputedProperty[_, _]
  ): Unit = js.native
  def apply(
    obj: js.Object,
    keyName: java.lang.String,
    desc: typings.emberObject.computedMod.ComputedProperty[_, _],
    data: js.Any
  ): Unit = js.native
  def apply(
    obj: js.Object,
    keyName: java.lang.String,
    desc: typings.emberObject.computedMod.ComputedProperty[_, _],
    data: js.Any,
    meta: js.Any
  ): Unit = js.native
  def apply(obj: js.Object, keyName: java.lang.String, desc: PropertyDescriptor): Unit = js.native
  def apply(obj: js.Object, keyName: java.lang.String, desc: PropertyDescriptor, data: js.Any): Unit = js.native
  def apply(obj: js.Object, keyName: java.lang.String, desc: PropertyDescriptor, data: js.Any, meta: js.Any): Unit = js.native
}

