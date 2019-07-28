package typings.enhancedDashResolve.libCommonDashTypesMod

import typings.enhancedDashResolve.libDescriptionFileUtilsMod.DescriptionFileData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverRequest extends js.Object {
  var __innerRequest: js.UndefOr[String] = js.undefined
  var __innerRequest_relativePath: js.UndefOr[String] = js.undefined
  var __innerRequest_request: js.UndefOr[String] = js.undefined
  var context: ResolveContext
  var descriptionFileData: js.UndefOr[DescriptionFileData] = js.undefined
  var descriptionFilePath: js.UndefOr[String] = js.undefined
  var descriptionFileRoot: js.UndefOr[String] = js.undefined
  var directory: js.UndefOr[Boolean] = js.undefined
  var module: js.UndefOr[Boolean] = js.undefined
  var path: String
  var query: js.UndefOr[String] = js.undefined
  var relativePath: js.UndefOr[String] = js.undefined
  var request: String
}

object ResolverRequest {
  @scala.inline
  def apply(
    context: ResolveContext,
    path: String,
    request: String,
    __innerRequest: String = null,
    __innerRequest_relativePath: String = null,
    __innerRequest_request: String = null,
    descriptionFileData: DescriptionFileData = null,
    descriptionFilePath: String = null,
    descriptionFileRoot: String = null,
    directory: js.UndefOr[Boolean] = js.undefined,
    module: js.UndefOr[Boolean] = js.undefined,
    query: String = null,
    relativePath: String = null
  ): ResolverRequest = {
    val __obj = js.Dynamic.literal(context = context, path = path, request = request)
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

