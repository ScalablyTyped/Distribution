package typings.emberObject.mod

import typings.emberObject.computedMod.ComputedProperty
import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/object", "defineProperty")
@js.native
object defineProperty extends js.Object {
  
  def apply(obj: js.Object, keyName: String): Unit = js.native
  def apply(
    obj: js.Object,
    keyName: String,
    desc: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    meta: js.Any
  ): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: js.UndefOr[scala.Nothing], data: js.Any): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: js.UndefOr[scala.Nothing], data: js.Any, meta: js.Any): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: ComputedProperty[_, _]): Unit = js.native
  def apply(
    obj: js.Object,
    keyName: String,
    desc: ComputedProperty[_, _],
    data: js.UndefOr[scala.Nothing],
    meta: js.Any
  ): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: ComputedProperty[_, _], data: js.Any): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: ComputedProperty[_, _], data: js.Any, meta: js.Any): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: PropertyDescriptor): Unit = js.native
  def apply(
    obj: js.Object,
    keyName: String,
    desc: PropertyDescriptor,
    data: js.UndefOr[scala.Nothing],
    meta: js.Any
  ): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: PropertyDescriptor, data: js.Any): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: PropertyDescriptor, data: js.Any, meta: js.Any): Unit = js.native
}
