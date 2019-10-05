package typings.dojo.dojox.dtl.ext_dojo.NodeList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces one or more classes on a node if not present.
  * Operates more quickly than calling removeClass() and addClass()
  *
  * @param addClassStr A String class name to add, or several space-separated class names,or an array of class names.
  * @param removeClassStr               OptionalA String class name to remove, or several space-separated class names,or an array of class names.
  */
@js.native
trait replaceClass extends js.Object {
  def apply(addClassStr: String, removeClassStr: String): Unit = js.native
  def apply(addClassStr: String, removeClassStr: js.Array[_]): Unit = js.native
  def apply(addClassStr: js.Array[_], removeClassStr: String): Unit = js.native
  def apply(addClassStr: js.Array[_], removeClassStr: js.Array[_]): Unit = js.native
}

