package typings.gitlab.userImpersonationTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gitlab.gitlabStrings.api
  - typings.gitlab.gitlabStrings.read_user
*/
trait ImpersonationTokenScope extends js.Object

object ImpersonationTokenScope {
  @scala.inline
  def api: typings.gitlab.gitlabStrings.api = this.cast("api")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def read_user: typings.gitlab.gitlabStrings.read_user = this.cast("read_user")
}

