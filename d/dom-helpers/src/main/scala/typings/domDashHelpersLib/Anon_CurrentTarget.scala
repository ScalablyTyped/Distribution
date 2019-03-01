package typings
package domDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentTarget[T /* <: stdLib.Element */] extends js.Object {
  var currentTarget: T
  var target: T
}

object Anon_CurrentTarget {
  @scala.inline
  def apply[T /* <: stdLib.Element */](currentTarget: T, target: T): Anon_CurrentTarget[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CurrentTarget[T]]
  }
}

