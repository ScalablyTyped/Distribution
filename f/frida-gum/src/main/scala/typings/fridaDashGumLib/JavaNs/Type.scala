package typings
package fridaDashGumLib.JavaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /**
    * Size in bytes.
    */
  var byteSize: scala.Double
  /**
    * Class name, if applicable.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Converts `value` from a JNI value to a JavaScript value.
    */
  var fromJni: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /**
    * VM type name. For example `I` for `int`.
    */
  var name: java.lang.String
  /**
    * Reads a value from memory.
    */
  var read: js.UndefOr[js.Function1[/* address */ fridaDashGumLib.NativePointerValue, _]] = js.undefined
  /**
    * Size in words.
    */
  var size: scala.Double
  /**
    * Converts `value` from a JavaScript value to a JNI value.
    */
  var toJni: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /**
    * Frida type name. For example `pointer` for a handle.
    */
  var `type`: java.lang.String
  /**
    * Writes a value to memory.
    */
  var write: js.UndefOr[
    js.Function2[/* address */ fridaDashGumLib.NativePointerValue, /* value */ js.Any, scala.Unit]
  ] = js.undefined
  /**
    * Checks whether a given JavaScript `value` is compatible.
    */
  def isCompatible(value: js.Any): scala.Boolean
}

object Type {
  @scala.inline
  def apply(
    byteSize: scala.Double,
    isCompatible: js.Any => scala.Boolean,
    name: java.lang.String,
    size: scala.Double,
    `type`: java.lang.String,
    className: java.lang.String = null,
    fromJni: /* value */ js.Any => _ = null,
    read: /* address */ fridaDashGumLib.NativePointerValue => _ = null,
    toJni: /* value */ js.Any => _ = null,
    write: (/* address */ fridaDashGumLib.NativePointerValue, /* value */ js.Any) => scala.Unit = null
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

