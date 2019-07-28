package typings.ftps.ftpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MirrorOptions extends js.Object {
  var filter: js.UndefOr[js.Any] = js.undefined
  var localDir: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[String] = js.undefined
  var parallel: js.UndefOr[Boolean | Double] = js.undefined
  var remoteDir: js.UndefOr[String] = js.undefined
  var upload: js.UndefOr[Boolean] = js.undefined
}

object MirrorOptions {
  @scala.inline
  def apply(
    filter: js.Any = null,
    localDir: String = null,
    options: String = null,
    parallel: Boolean | Double = null,
    remoteDir: String = null,
    upload: js.UndefOr[Boolean] = js.undefined
  ): MirrorOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (localDir != null) __obj.updateDynamic("localDir")(localDir)
    if (options != null) __obj.updateDynamic("options")(options)
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (remoteDir != null) __obj.updateDynamic("remoteDir")(remoteDir)
    if (!js.isUndefined(upload)) __obj.updateDynamic("upload")(upload)
    __obj.asInstanceOf[MirrorOptions]
  }
}

