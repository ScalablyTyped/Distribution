package typings.gitlab

import typings.gitlab.jobsMod.JobScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScope extends js.Object {
  var scope: JobScope
}

object AnonScope {
  @scala.inline
  def apply(scope: JobScope): AnonScope = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScope]
  }
}

