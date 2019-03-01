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

object DiscourseSSO {
  @scala.inline
  def apply(
    buildLoginString: js.Function1[
      discourseDashSsoLib.discourseDashSsoMod.DiscourseSSONs.UserParams, 
      java.lang.String
    ],
    getNonce: js.Function1[java.lang.String, java.lang.String],
    validate: js.Function2[java.lang.String, java.lang.String, scala.Boolean]
  ): DiscourseSSO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildLoginString")(buildLoginString)
    __obj.updateDynamic("getNonce")(getNonce)
    __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[DiscourseSSO]
  }
}

