package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentStyle extends js.Object {
  var background: js.UndefOr[Background] = js.undefined
  var defaultFooterId: js.UndefOr[java.lang.String] = js.undefined
  var defaultHeaderId: js.UndefOr[java.lang.String] = js.undefined
  var evenPageFooterId: js.UndefOr[java.lang.String] = js.undefined
  var evenPageHeaderId: js.UndefOr[java.lang.String] = js.undefined
  var firstPageFooterId: js.UndefOr[java.lang.String] = js.undefined
  var firstPageHeaderId: js.UndefOr[java.lang.String] = js.undefined
  var marginBottom: js.UndefOr[Dimension] = js.undefined
  var marginLeft: js.UndefOr[Dimension] = js.undefined
  var marginRight: js.UndefOr[Dimension] = js.undefined
  var marginTop: js.UndefOr[Dimension] = js.undefined
  var pageNumberStart: js.UndefOr[scala.Double] = js.undefined
  var pageSize: js.UndefOr[Size] = js.undefined
  var useEvenPageHeaderFooter: js.UndefOr[scala.Boolean] = js.undefined
  var useFirstPageHeaderFooter: js.UndefOr[scala.Boolean] = js.undefined
}

object DocumentStyle {
  @scala.inline
  def apply(
    background: Background = null,
    defaultFooterId: java.lang.String = null,
    defaultHeaderId: java.lang.String = null,
    evenPageFooterId: java.lang.String = null,
    evenPageHeaderId: java.lang.String = null,
    firstPageFooterId: java.lang.String = null,
    firstPageHeaderId: java.lang.String = null,
    marginBottom: Dimension = null,
    marginLeft: Dimension = null,
    marginRight: Dimension = null,
    marginTop: Dimension = null,
    pageNumberStart: scala.Int | scala.Double = null,
    pageSize: Size = null,
    useEvenPageHeaderFooter: js.UndefOr[scala.Boolean] = js.undefined,
    useFirstPageHeaderFooter: js.UndefOr[scala.Boolean] = js.undefined
  ): DocumentStyle = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (defaultFooterId != null) __obj.updateDynamic("defaultFooterId")(defaultFooterId)
    if (defaultHeaderId != null) __obj.updateDynamic("defaultHeaderId")(defaultHeaderId)
    if (evenPageFooterId != null) __obj.updateDynamic("evenPageFooterId")(evenPageFooterId)
    if (evenPageHeaderId != null) __obj.updateDynamic("evenPageHeaderId")(evenPageHeaderId)
    if (firstPageFooterId != null) __obj.updateDynamic("firstPageFooterId")(firstPageFooterId)
    if (firstPageHeaderId != null) __obj.updateDynamic("firstPageHeaderId")(firstPageHeaderId)
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom)
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft)
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight)
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop)
    if (pageNumberStart != null) __obj.updateDynamic("pageNumberStart")(pageNumberStart.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize)
    if (!js.isUndefined(useEvenPageHeaderFooter)) __obj.updateDynamic("useEvenPageHeaderFooter")(useEvenPageHeaderFooter)
    if (!js.isUndefined(useFirstPageHeaderFooter)) __obj.updateDynamic("useFirstPageHeaderFooter")(useFirstPageHeaderFooter)
    __obj.asInstanceOf[DocumentStyle]
  }
}

