package typings.expoDashFileDashSystem.buildFileSystemDotTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var md5: js.UndefOr[Boolean] = js.undefined
}

object DownloadOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String] = null,
    md5: js.UndefOr[Boolean] = js.undefined
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(md5)) __obj.updateDynamic("md5")(md5)
    __obj.asInstanceOf[DownloadOptions]
  }
}

