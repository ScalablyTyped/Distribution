package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GitSourceContext denotes a particular revision in a third party Git
  * repository (e.g. GitHub).
  */
@js.native
trait Schema$GitSourceContext extends js.Object {
  /**
    * Git commit hash. required.
    */
  var revisionId: js.UndefOr[String] = js.native
  /**
    * Git repository URL.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$GitSourceContext {
  @scala.inline
  def apply(revisionId: String = null, url: String = null): Schema$GitSourceContext = {
    val __obj = js.Dynamic.literal()
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GitSourceContext]
  }
}

