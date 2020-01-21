package typings.discourseSso.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("discourse-sso", JSImport.Namespace)
@js.native
class ^ protected () extends DiscourseSSO {
  def this(ssoSecret: String) = this()
  /* CompleteClass */
  override def buildLoginString(params: UserParams): String = js.native
  /* CompleteClass */
  override def getNonce(payload: String): String = js.native
  /* CompleteClass */
  override def validate(payload: String, sig: String): Boolean = js.native
}

