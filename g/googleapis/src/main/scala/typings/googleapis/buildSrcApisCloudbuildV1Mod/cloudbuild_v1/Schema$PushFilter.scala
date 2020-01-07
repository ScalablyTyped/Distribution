package typings.googleapis.buildSrcApisCloudbuildV1Mod.cloudbuild_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Push contains filter properties for matching GitHub git pushes.
  */
@js.native
trait Schema$PushFilter extends js.Object {
  /**
    * Regexes of branches to match.  The syntax of the regular expressions
    * accepted is the syntax accepted by RE2 and described at
    * https://github.com/google/re2/wiki/Syntax
    */
  var branch: js.UndefOr[String] = js.native
  /**
    * Regexes of tags to match.  The syntax of the regular expressions accepted
    * is the syntax accepted by RE2 and described at
    * https://github.com/google/re2/wiki/Syntax
    */
  var tag: js.UndefOr[String] = js.native
}

object Schema$PushFilter {
  @scala.inline
  def apply(branch: String = null, tag: String = null): Schema$PushFilter = {
    val __obj = js.Dynamic.literal()
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PushFilter]
  }
}

