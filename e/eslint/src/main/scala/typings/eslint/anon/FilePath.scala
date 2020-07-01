package typings.eslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePath extends js.Object {
  var filePath: js.UndefOr[String] = js.undefined
  var warnIgnored: js.UndefOr[Boolean] = js.undefined
}

object FilePath {
  @scala.inline
  def apply(filePath: String = null, warnIgnored: js.UndefOr[Boolean] = js.undefined): FilePath = {
    val __obj = js.Dynamic.literal()
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (!js.isUndefined(warnIgnored)) __obj.updateDynamic("warnIgnored")(warnIgnored.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePath]
  }
}

