package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var iab: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Size {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    iab: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Size = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iab)) __obj.updateDynamic("iab")(iab.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

