package typings.gapiDotClientDotClouddebugger.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitSourceContext extends js.Object {
  /**
    * Git commit hash.
    * required.
    */
  var revisionId: js.UndefOr[String] = js.undefined
  /** Git repository URL. */
  var url: js.UndefOr[String] = js.undefined
}

object GitSourceContext {
  @scala.inline
  def apply(revisionId: String = null, url: String = null): GitSourceContext = {
    val __obj = js.Dynamic.literal()
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitSourceContext]
  }
}

