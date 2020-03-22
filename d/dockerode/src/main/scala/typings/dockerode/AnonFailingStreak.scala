package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailingStreak extends js.Object {
  var FailingStreak: Double
  var Log: js.Array[AnonEnd]
  var Status: String
}

object AnonFailingStreak {
  @scala.inline
  def apply(FailingStreak: Double, Log: js.Array[AnonEnd], Status: String): AnonFailingStreak = {
    val __obj = js.Dynamic.literal(FailingStreak = FailingStreak.asInstanceOf[js.Any], Log = Log.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFailingStreak]
  }
}

