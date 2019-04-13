package typings
package discourseDashSsoLib.discourseDashSsoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscourseSSO extends js.Object {
  def buildLoginString(params: UserParams): java.lang.String
  def getNonce(payload: java.lang.String): java.lang.String
  def validate(payload: java.lang.String, sig: java.lang.String): scala.Boolean
}

object DiscourseSSO {
  @scala.inline
  def apply(
    buildLoginString: UserParams => java.lang.String,
    getNonce: java.lang.String => java.lang.String,
    validate: (java.lang.String, java.lang.String) => scala.Boolean
  ): DiscourseSSO = {
    val __obj = js.Dynamic.literal(buildLoginString = js.Any.fromFunction1(buildLoginString), getNonce = js.Any.fromFunction1(getNonce), validate = js.Any.fromFunction2(validate))
  
    __obj.asInstanceOf[DiscourseSSO]
  }
}

