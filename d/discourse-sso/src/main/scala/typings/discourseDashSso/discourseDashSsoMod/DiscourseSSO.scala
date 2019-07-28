package typings.discourseDashSso.discourseDashSsoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscourseSSO extends js.Object {
  def buildLoginString(params: UserParams): String
  def getNonce(payload: String): String
  def validate(payload: String, sig: String): Boolean
}

object DiscourseSSO {
  @scala.inline
  def apply(
    buildLoginString: UserParams => String,
    getNonce: String => String,
    validate: (String, String) => Boolean
  ): DiscourseSSO = {
    val __obj = js.Dynamic.literal(buildLoginString = js.Any.fromFunction1(buildLoginString), getNonce = js.Any.fromFunction1(getNonce), validate = js.Any.fromFunction2(validate))
  
    __obj.asInstanceOf[DiscourseSSO]
  }
}

