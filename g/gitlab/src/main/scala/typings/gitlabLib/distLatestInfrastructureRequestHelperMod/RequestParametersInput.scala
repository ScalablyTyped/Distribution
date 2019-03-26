package typings
package gitlabLib.distLatestInfrastructureRequestHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParametersInput extends js.Object {
  var body: js.UndefOr[js.Object] = js.undefined
  var formData: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any
  ] = js.undefined
  var headers: scala.Nothing
  var json: js.UndefOr[scala.Boolean] = js.undefined
  var qs: js.UndefOr[js.Object] = js.undefined
  var qsStringifyOptions: js.UndefOr[js.Object] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var resolveWithFullResponse: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object RequestParametersInput {
  @scala.inline
  def apply(
    headers: scala.Nothing,
    body: js.Object = null,
    formData: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    qs: js.Object = null,
    qsStringifyOptions: js.Object = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    resolveWithFullResponse: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
  ): RequestParametersInput = {
    val __obj = js.Dynamic.literal(headers = headers)
    if (body != null) __obj.updateDynamic("body")(body)
    if (formData != null) __obj.updateDynamic("formData")(formData)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (qs != null) __obj.updateDynamic("qs")(qs)
    if (qsStringifyOptions != null) __obj.updateDynamic("qsStringifyOptions")(qsStringifyOptions)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(resolveWithFullResponse)) __obj.updateDynamic("resolveWithFullResponse")(resolveWithFullResponse)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RequestParametersInput]
  }
}

