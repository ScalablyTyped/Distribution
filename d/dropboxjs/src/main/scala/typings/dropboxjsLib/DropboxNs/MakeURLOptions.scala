package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeURLOptions extends js.Object {
  var download: js.UndefOr[scala.Boolean] = js.undefined
  var downloadHack: js.UndefOr[scala.Boolean] = js.undefined
  var long: js.UndefOr[scala.Boolean] = js.undefined
  var longUrl: js.UndefOr[scala.Boolean] = js.undefined
}

object MakeURLOptions {
  @scala.inline
  def apply(
    download: js.UndefOr[scala.Boolean] = js.undefined,
    downloadHack: js.UndefOr[scala.Boolean] = js.undefined,
    long: js.UndefOr[scala.Boolean] = js.undefined,
    longUrl: js.UndefOr[scala.Boolean] = js.undefined
  ): MakeURLOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download)
    if (!js.isUndefined(downloadHack)) __obj.updateDynamic("downloadHack")(downloadHack)
    if (!js.isUndefined(long)) __obj.updateDynamic("long")(long)
    if (!js.isUndefined(longUrl)) __obj.updateDynamic("longUrl")(longUrl)
    __obj.asInstanceOf[MakeURLOptions]
  }
}

