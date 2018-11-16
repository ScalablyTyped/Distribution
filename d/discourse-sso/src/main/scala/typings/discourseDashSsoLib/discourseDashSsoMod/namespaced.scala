package typings
package discourseDashSsoLib.discourseDashSsoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("discourse-sso", JSImport.Namespace)
@js.native
class namespaced protected () extends DiscourseSSO {
  def this(ssoSecret: java.lang.String) = this()
  /* CompleteClass */
  override def buildLoginString(params: discourseDashSsoLib.discourseDashSsoMod.DiscourseSSONs.UserParams): java.lang.String = js.native
  /* CompleteClass */
  override def getNonce(payload: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def validate(payload: java.lang.String, sig: java.lang.String): scala.Boolean = js.native
}

