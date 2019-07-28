package typings.fridaDashGum.JavaNs

import typings.fridaDashGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /**
    * Size in bytes.
    */
  var byteSize: Double
  /**
    * Class name, if applicable.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Converts `value` from a JNI value to a JavaScript value.
    */
  var fromJni: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /**
    * VM type name. For example `I` for `int`.
    */
  var name: String
  /**
    * Reads a value from memory.
    */
  var read: js.UndefOr[js.Function1[/* address */ NativePointerValue, _]] = js.undefined
  /**
    * Size in words.
    */
  var size: Double
  /**
    * Converts `value` from a JavaScript value to a JNI value.
    */
  var toJni: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /**
    * Frida type name. For example `pointer` for a handle.
    */
  var `type`: String
  /**
    * Writes a value to memory.
    */
  var write: js.UndefOr[js.Function2[/* address */ NativePointerValue, /* value */ js.Any, Unit]] = js.undefined
  /**
    * Checks whether a given JavaScript `value` is compatible.
    */
  def isCompatible(value: js.Any): Boolean
}

object Type {
  @scala.inline
  def apply(
    byteSize: Double,
    isCompatible: js.Any => Boolean,
    name: String,
    size: Double,
    `type`: String,
    className: String = null,
    fromJni: /* value */ js.Any => _ = null,
    read: /* address */ NativePointerValue => _ = null,
    toJni: /* value */ js.Any => _ = null,
    write: (/* address */ NativePointerValue, /* value */ js.Any) => Unit = null
  ): Type = {
    val __obj = js.Dynamic.literal(byteSize = byteSize, isCompatible = js.Any.fromFunction1(isCompatible), name = name, size = size)
    __obj.updateDynamic("type")(`type`)
    if (className != null) __obj.updateDynamic("className")(className)
    if (fromJni != null) __obj.updateDynamic("fromJni")(js.Any.fromFunction1(fromJni))
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction1(read))
    if (toJni != null) __obj.updateDynamic("toJni")(js.Any.fromFunction1(toJni))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction2(write))
    __obj.asInstanceOf[Type]
  }
}

