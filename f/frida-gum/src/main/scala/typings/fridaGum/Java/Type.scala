package typings.fridaGum.Java

import typings.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  /**
    * Size in bytes.
    */
  var byteSize: Double = js.native
  /**
    * Class name, if applicable.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Converts `value` from a JNI value to a JavaScript value.
    */
  var fromJni: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  /**
    * VM type name. For example `I` for `int`.
    */
  var name: String = js.native
  /**
    * Reads a value from memory.
    */
  var read: js.UndefOr[js.Function1[/* address */ NativePointerValue, _]] = js.native
  /**
    * Size in words.
    */
  var size: Double = js.native
  /**
    * Converts `value` from a JavaScript value to a JNI value.
    */
  var toJni: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  /**
    * Frida type name. For example `pointer` for a handle.
    */
  var `type`: String = js.native
  /**
    * Writes a value to memory.
    */
  var write: js.UndefOr[js.Function2[/* address */ NativePointerValue, /* value */ js.Any, Unit]] = js.native
  /**
    * Checks whether a given JavaScript `value` is compatible.
    */
  def isCompatible(value: js.Any): Boolean = js.native
}

object Type {
  @scala.inline
  def apply(byteSize: Double, isCompatible: js.Any => Boolean, name: String, size: Double, `type`: String): Type = {
    val __obj = js.Dynamic.literal(byteSize = byteSize.asInstanceOf[js.Any], isCompatible = js.Any.fromFunction1(isCompatible), name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setByteSize(value: Double): Self = this.set("byteSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCompatible(value: js.Any => Boolean): Self = this.set("isCompatible", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setFromJni(value: /* value */ js.Any => _): Self = this.set("fromJni", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFromJni: Self = this.set("fromJni", js.undefined)
    @scala.inline
    def setRead(value: /* address */ NativePointerValue => _): Self = this.set("read", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setToJni(value: /* value */ js.Any => _): Self = this.set("toJni", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToJni: Self = this.set("toJni", js.undefined)
    @scala.inline
    def setWrite(value: (/* address */ NativePointerValue, /* value */ js.Any) => Unit): Self = this.set("write", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
  
}

