package typings.gitlab.distTypesCoreServicesNotificationSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gitlab.gitlabStrings.disabled
  - typings.gitlab.gitlabStrings.participating
  - typings.gitlab.gitlabStrings.watch
  - typings.gitlab.gitlabStrings.global
  - typings.gitlab.gitlabStrings.mention
  - typings.gitlab.gitlabStrings.custom
*/
trait NotificationSettingLevel extends js.Object

object NotificationSettingLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def custom: typings.gitlab.gitlabStrings.custom = this.cast("custom")
  @scala.inline
  def disabled: typings.gitlab.gitlabStrings.disabled = this.cast("disabled")
  @scala.inline
  def global: typings.gitlab.gitlabStrings.global = this.cast("global")
  @scala.inline
  def mention: typings.gitlab.gitlabStrings.mention = this.cast("mention")
  @scala.inline
  def participating: typings.gitlab.gitlabStrings.participating = this.cast("participating")
  @scala.inline
  def watch: typings.gitlab.gitlabStrings.watch = this.cast("watch")
}

