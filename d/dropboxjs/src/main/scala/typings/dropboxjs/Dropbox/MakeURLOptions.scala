package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeURLOptions extends js.Object {
  var download: js.UndefOr[Boolean] = js.undefined
  var downloadHack: js.UndefOr[Boolean] = js.undefined
  var long: js.UndefOr[Boolean] = js.undefined
  var longUrl: js.UndefOr[Boolean] = js.undefined
}

object MakeURLOptions {
  @scala.inline
  def apply(
    download: js.UndefOr[Boolean] = js.undefined,
    downloadHack: js.UndefOr[Boolean] = js.undefined,
    long: js.UndefOr[Boolean] = js.undefined,
    longUrl: js.UndefOr[Boolean] = js.undefined
  ): MakeURLOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.get.asInstanceOf[js.Any])
    if (!js.isUndefined(downloadHack)) __obj.updateDynamic("downloadHack")(downloadHack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(long)) __obj.updateDynamic("long")(long.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longUrl)) __obj.updateDynamic("longUrl")(longUrl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeURLOptions]
  }
}

