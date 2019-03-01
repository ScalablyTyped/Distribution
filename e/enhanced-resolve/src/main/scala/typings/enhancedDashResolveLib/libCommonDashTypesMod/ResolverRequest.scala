package typings
package enhancedDashResolveLib.libCommonDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverRequest extends js.Object {
  var __innerRequest: js.UndefOr[java.lang.String] = js.undefined
  var __innerRequest_relativePath: js.UndefOr[java.lang.String] = js.undefined
  var __innerRequest_request: js.UndefOr[java.lang.String] = js.undefined
  var context: ResolveContext
  var descriptionFileData: js.UndefOr[enhancedDashResolveLib.libDescriptionFileUtilsMod.DescriptionFileData] = js.undefined
  var descriptionFilePath: js.UndefOr[java.lang.String] = js.undefined
  var descriptionFileRoot: js.UndefOr[java.lang.String] = js.undefined
  var directory: js.UndefOr[scala.Boolean] = js.undefined
  var module: js.UndefOr[scala.Boolean] = js.undefined
  var path: java.lang.String
  var query: js.UndefOr[java.lang.String] = js.undefined
  var relativePath: js.UndefOr[java.lang.String] = js.undefined
  var request: java.lang.String
}

object ResolverRequest {
  @scala.inline
  def apply(
    context: ResolveContext,
    path: java.lang.String,
    request: java.lang.String,
    __innerRequest: java.lang.String = null,
    __innerRequest_relativePath: java.lang.String = null,
    __innerRequest_request: java.lang.String = null,
    descriptionFileData: enhancedDashResolveLib.libDescriptionFileUtilsMod.DescriptionFileData = null,
    descriptionFilePath: java.lang.String = null,
    descriptionFileRoot: java.lang.String = null,
    directory: js.UndefOr[scala.Boolean] = js.undefined,
    module: js.UndefOr[scala.Boolean] = js.undefined,
    query: java.lang.String = null,
    relativePath: java.lang.String = null
  ): ResolverRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("request")(request)
    if (__innerRequest != null) __obj.updateDynamic("__innerRequest")(__innerRequest)
    if (__innerRequest_relativePath != null) __obj.updateDynamic("__innerRequest_relativePath")(__innerRequest_relativePath)
    if (__innerRequest_request != null) __obj.updateDynamic("__innerRequest_request")(__innerRequest_request)
    if (descriptionFileData != null) __obj.updateDynamic("descriptionFileData")(descriptionFileData)
    if (descriptionFilePath != null) __obj.updateDynamic("descriptionFilePath")(descriptionFilePath)
    if (descriptionFileRoot != null) __obj.updateDynamic("descriptionFileRoot")(descriptionFileRoot)
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory)
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module)
    if (query != null) __obj.updateDynamic("query")(query)
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath)
    __obj.asInstanceOf[ResolverRequest]
  }
}

