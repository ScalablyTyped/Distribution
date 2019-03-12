package typings
package enhancedDashResolveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item extends js.Object {
  def push(item: java.lang.String): scala.Unit
}

object Anon_Item {
  @scala.inline
  def apply(push: java.lang.String => scala.Unit): Anon_Item = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
  
    __obj.asInstanceOf[Anon_Item]
  }
}

