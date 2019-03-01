package typings
package googleDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SocialAction extends js.Object {
  var socialAction: java.lang.String
  var socialNetwork: java.lang.String
  var socialTarget: java.lang.String
}

object Anon_SocialAction {
  @scala.inline
  def apply(socialAction: java.lang.String, socialNetwork: java.lang.String, socialTarget: java.lang.String): Anon_SocialAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("socialAction")(socialAction)
    __obj.updateDynamic("socialNetwork")(socialNetwork)
    __obj.updateDynamic("socialTarget")(socialTarget)
    __obj.asInstanceOf[Anon_SocialAction]
  }
}

