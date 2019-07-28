package typings.domDashHelpers

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentTarget[T /* <: Element */] extends js.Object {
  var currentTarget: T
  var target: T
}

object Anon_CurrentTarget {
  @scala.inline
  def apply[T /* <: Element */](currentTarget: T, target: T): Anon_CurrentTarget[T] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CurrentTarget[T]]
  }
}

