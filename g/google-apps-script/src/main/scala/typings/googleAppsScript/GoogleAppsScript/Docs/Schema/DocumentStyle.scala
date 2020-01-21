package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentStyle extends js.Object {
  var background: js.UndefOr[Background] = js.undefined
  var defaultFooterId: js.UndefOr[String] = js.undefined
  var defaultHeaderId: js.UndefOr[String] = js.undefined
  var evenPageFooterId: js.UndefOr[String] = js.undefined
  var evenPageHeaderId: js.UndefOr[String] = js.undefined
  var firstPageFooterId: js.UndefOr[String] = js.undefined
  var firstPageHeaderId: js.UndefOr[String] = js.undefined
  var marginBottom: js.UndefOr[Dimension] = js.undefined
  var marginLeft: js.UndefOr[Dimension] = js.undefined
  var marginRight: js.UndefOr[Dimension] = js.undefined
  var marginTop: js.UndefOr[Dimension] = js.undefined
  var pageNumberStart: js.UndefOr[Double] = js.undefined
  var pageSize: js.UndefOr[Size] = js.undefined
  var useEvenPageHeaderFooter: js.UndefOr[Boolean] = js.undefined
  var useFirstPageHeaderFooter: js.UndefOr[Boolean] = js.undefined
}

object DocumentStyle {
  @scala.inline
  def apply(
    background: Background = null,
    defaultFooterId: String = null,
    defaultHeaderId: String = null,
    evenPageFooterId: String = null,
    evenPageHeaderId: String = null,
    firstPageFooterId: String = null,
    firstPageHeaderId: String = null,
    marginBottom: Dimension = null,
    marginLeft: Dimension = null,
    marginRight: Dimension = null,
    marginTop: Dimension = null,
    pageNumberStart: Int | Double = null,
    pageSize: Size = null,
    useEvenPageHeaderFooter: js.UndefOr[Boolean] = js.undefined,
    useFirstPageHeaderFooter: js.UndefOr[Boolean] = js.undefined
  ): DocumentStyle = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (defaultFooterId != null) __obj.updateDynamic("defaultFooterId")(defaultFooterId.asInstanceOf[js.Any])
    if (defaultHeaderId != null) __obj.updateDynamic("defaultHeaderId")(defaultHeaderId.asInstanceOf[js.Any])
    if (evenPageFooterId != null) __obj.updateDynamic("evenPageFooterId")(evenPageFooterId.asInstanceOf[js.Any])
    if (evenPageHeaderId != null) __obj.updateDynamic("evenPageHeaderId")(evenPageHeaderId.asInstanceOf[js.Any])
    if (firstPageFooterId != null) __obj.updateDynamic("firstPageFooterId")(firstPageFooterId.asInstanceOf[js.Any])
    if (firstPageHeaderId != null) __obj.updateDynamic("firstPageHeaderId")(firstPageHeaderId.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (pageNumberStart != null) __obj.updateDynamic("pageNumberStart")(pageNumberStart.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useEvenPageHeaderFooter)) __obj.updateDynamic("useEvenPageHeaderFooter")(useEvenPageHeaderFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(useFirstPageHeaderFooter)) __obj.updateDynamic("useFirstPageHeaderFooter")(useFirstPageHeaderFooter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentStyle]
  }
}

