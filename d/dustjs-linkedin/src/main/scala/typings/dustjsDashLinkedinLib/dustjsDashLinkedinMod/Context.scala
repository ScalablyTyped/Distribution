package typings
package dustjsDashLinkedinLib.dustjsDashLinkedinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  /**
      * Returns the head of the context stack.
      */
  def current(): js.Any = js.native
  /**
      * Retrieves the value at key from the context stack.
      */
  def get(key: java.lang.String): js.Any = js.native
  /**
      * Pushes an arbitrary value onto the context stack and returns a new context instance. Specify index and/or length to enable enumeration helpers.
      */
  def push(head: js.Any): Context = js.native
  /**
      * Pushes an arbitrary value onto the context stack and returns a new context instance. Specify index and/or length to enable enumeration helpers.
      */
  def push(head: js.Any, idx: scala.Double): Context = js.native
  /**
      * Pushes an arbitrary value onto the context stack and returns a new context instance. Specify index and/or length to enable enumeration helpers.
      */
  def push(head: js.Any, idx: scala.Double, len: scala.Double): Context = js.native
  /**
      * Returns a new context instance consisting only of the value at head, plus any previously defined global object.
      */
  def rebase(head: js.Any): Context = js.native
}

