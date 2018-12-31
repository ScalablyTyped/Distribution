package typings
package discourseDashSsoLib.discourseDashSsoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscourseSSO extends js.Object {
  def buildLoginString(params: discourseDashSsoLib.discourseDashSsoMod.DiscourseSSONs.UserParams): java.lang.String
  def getNonce(payload: java.lang.String): java.lang.String
  def validate(payload: java.lang.String, sig: java.lang.String): scala.Boolean
}

