package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailingStreak extends js.Object {
  var FailingStreak: Double
  var Log: js.Array[End]
  var Status: String
}

object FailingStreak {
  @scala.inline
  def apply(FailingStreak: Double, Log: js.Array[End], Status: String): FailingStreak = {
    val __obj = js.Dynamic.literal(FailingStreak = FailingStreak.asInstanceOf[js.Any], Log = Log.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailingStreak]
  }
}

