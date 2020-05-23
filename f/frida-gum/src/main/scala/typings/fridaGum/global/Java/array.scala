package typings.fridaGum.global.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Java.array")
@js.native
object array extends js.Object {
  /**
    * Creates a Java array with elements of the specified `type`, from a
    * JavaScript array `elements`. The resulting Java array behaves like
    * a JS array, but can be passed by reference to Java APIs in order to
    * allow them to modify its contents.
    *
    * @param type Type name of elements.
    * @param elements Array of JavaScript values to use for constructing the
    *                 Java array.
    */
  def apply(`type`: String, elements: js.Array[_]): js.Array[_] = js.native
}

