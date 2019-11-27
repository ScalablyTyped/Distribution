package typings.atEmberObject.atEmberObjectMod

import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object", "defineProperty")
@js.native
object defineProperty extends js.Object {
  def apply(obj: js.Object, keyName: String): Unit = js.native
  def apply(
    obj: js.Object,
    keyName: String,
    desc: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComputedProperty<any> */ js.Any
  ): Unit = js.native
  def apply(
    obj: js.Object,
    keyName: String,
    desc: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComputedProperty<any> */ js.Any,
    data: js.Any
  ): Unit = js.native
  def apply(
    obj: js.Object,
    keyName: String,
    desc: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComputedProperty<any> */ js.Any,
    data: js.Any,
    meta: js.Any
  ): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: PropertyDescriptor): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: PropertyDescriptor, data: js.Any): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: PropertyDescriptor, data: js.Any, meta: js.Any): Unit = js.native
}

