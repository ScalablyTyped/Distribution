package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientFileReadOptions extends js.Object {
  var arrayBuffer: js.UndefOr[Boolean] = js.undefined
  var binary: js.UndefOr[Boolean] = js.undefined
  var blob: js.UndefOr[Boolean] = js.undefined
  var buffer: js.UndefOr[Boolean] = js.undefined
  var httpCache: js.UndefOr[Boolean] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var rev: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var versionTag: js.UndefOr[String] = js.undefined
}

object ClientFileReadOptions {
  @scala.inline
  def apply(
    arrayBuffer: js.UndefOr[Boolean] = js.undefined,
    binary: js.UndefOr[Boolean] = js.undefined,
    blob: js.UndefOr[Boolean] = js.undefined,
    buffer: js.UndefOr[Boolean] = js.undefined,
    httpCache: js.UndefOr[Boolean] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    rev: String = null,
    start: js.UndefOr[Double] = js.undefined,
    versionTag: String = null
  ): ClientFileReadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrayBuffer)) __obj.updateDynamic("arrayBuffer")(arrayBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blob)) __obj.updateDynamic("blob")(blob.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(httpCache)) __obj.updateDynamic("httpCache")(httpCache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (rev != null) __obj.updateDynamic("rev")(rev.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (versionTag != null) __obj.updateDynamic("versionTag")(versionTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientFileReadOptions]
  }
}

