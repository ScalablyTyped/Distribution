package typings.gitlab.distTypesCoreServicesSnippetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gitlab.gitlabStrings.`private`
  - typings.gitlab.gitlabStrings.public
  - typings.gitlab.gitlabStrings.internal
*/
trait SnippetVisibility extends js.Object

object SnippetVisibility {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def internal: typings.gitlab.gitlabStrings.internal = this.cast("internal")
  @scala.inline
  def `private`: typings.gitlab.gitlabStrings.`private` = this.cast("private")
  @scala.inline
  def public: typings.gitlab.gitlabStrings.public = this.cast("public")
}

