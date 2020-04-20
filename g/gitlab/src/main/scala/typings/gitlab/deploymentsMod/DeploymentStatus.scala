package typings.gitlab.deploymentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gitlab.gitlabStrings.created
  - typings.gitlab.gitlabStrings.running
  - typings.gitlab.gitlabStrings.success
  - typings.gitlab.gitlabStrings.failed
  - typings.gitlab.gitlabStrings.canceled
*/
trait DeploymentStatus extends js.Object

object DeploymentStatus {
  @scala.inline
  def canceled: typings.gitlab.gitlabStrings.canceled = "canceled".asInstanceOf[typings.gitlab.gitlabStrings.canceled]
  @scala.inline
  def created: typings.gitlab.gitlabStrings.created = "created".asInstanceOf[typings.gitlab.gitlabStrings.created]
  @scala.inline
  def failed: typings.gitlab.gitlabStrings.failed = "failed".asInstanceOf[typings.gitlab.gitlabStrings.failed]
  @scala.inline
  def running: typings.gitlab.gitlabStrings.running = "running".asInstanceOf[typings.gitlab.gitlabStrings.running]
  @scala.inline
  def success: typings.gitlab.gitlabStrings.success = "success".asInstanceOf[typings.gitlab.gitlabStrings.success]
}

