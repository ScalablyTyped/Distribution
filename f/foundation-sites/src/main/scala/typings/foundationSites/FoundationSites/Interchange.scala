package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/interchange.html#javascript-reference
trait Interchange extends js.Object {
  def destroy(): Unit
  def replace(path: String): Unit
}

object Interchange {
  @scala.inline
  def apply(destroy: () => Unit, replace: String => Unit): Interchange = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), replace = js.Any.fromFunction1(replace))
  
    __obj.asInstanceOf[Interchange]
  }
}

