package typings.elliptic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reason extends js.Object {
  val reason: String
  val result: Boolean
}

object Reason {
  @scala.inline
  def apply(reason: String, result: Boolean): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
}

