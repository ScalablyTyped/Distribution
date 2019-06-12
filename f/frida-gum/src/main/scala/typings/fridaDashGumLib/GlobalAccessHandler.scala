package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalAccessHandler extends js.Object {
  /**
    * Queries which additional globals exist.
    */
  def enumerate(): js.Array[java.lang.String]
  /**
    * Called whenever an attempt to access a non-existent global variable is
    * made. Return `undefined` to treat the variable as inexistent.
    *
    * @param property Name of non-existent global that is being accessed.
    */
  def get(property: java.lang.String): js.Any
}

object GlobalAccessHandler {
  @scala.inline
  def apply(enumerate: () => js.Array[java.lang.String], get: java.lang.String => js.Any): GlobalAccessHandler = {
    val __obj = js.Dynamic.literal(enumerate = js.Any.fromFunction0(enumerate), get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[GlobalAccessHandler]
  }
}

