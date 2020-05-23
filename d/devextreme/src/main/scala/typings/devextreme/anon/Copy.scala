package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Copy extends js.Object {
  var copy: js.UndefOr[Boolean] = js.undefined
  var create: js.UndefOr[Boolean] = js.undefined
  var download: js.UndefOr[Boolean] = js.undefined
  var move: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
  var rename: js.UndefOr[Boolean] = js.undefined
  var upload: js.UndefOr[Boolean] = js.undefined
}

object Copy {
  @scala.inline
  def apply(
    copy: js.UndefOr[Boolean] = js.undefined,
    create: js.UndefOr[Boolean] = js.undefined,
    download: js.UndefOr[Boolean] = js.undefined,
    move: js.UndefOr[Boolean] = js.undefined,
    remove: js.UndefOr[Boolean] = js.undefined,
    rename: js.UndefOr[Boolean] = js.undefined,
    upload: js.UndefOr[Boolean] = js.undefined
  ): Copy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(copy)) __obj.updateDynamic("copy")(copy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create.get.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.get.asInstanceOf[js.Any])
    if (!js.isUndefined(move)) __obj.updateDynamic("move")(move.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rename)) __obj.updateDynamic("rename")(rename.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upload)) __obj.updateDynamic("upload")(upload.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copy]
  }
}

