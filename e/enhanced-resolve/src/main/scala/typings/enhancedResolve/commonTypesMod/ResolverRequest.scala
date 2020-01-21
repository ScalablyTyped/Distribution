package typings.enhancedResolve.commonTypesMod

import typings.enhancedResolve.descriptionFileUtilsMod.DescriptionFileData
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
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (__innerRequest != null) __obj.updateDynamic("__innerRequest")(__innerRequest.asInstanceOf[js.Any])
    if (__innerRequest_relativePath != null) __obj.updateDynamic("__innerRequest_relativePath")(__innerRequest_relativePath.asInstanceOf[js.Any])
    if (__innerRequest_request != null) __obj.updateDynamic("__innerRequest_request")(__innerRequest_request.asInstanceOf[js.Any])
    if (descriptionFileData != null) __obj.updateDynamic("descriptionFileData")(descriptionFileData.asInstanceOf[js.Any])
    if (descriptionFilePath != null) __obj.updateDynamic("descriptionFilePath")(descriptionFilePath.asInstanceOf[js.Any])
    if (descriptionFileRoot != null) __obj.updateDynamic("descriptionFileRoot")(descriptionFileRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRequest]
  }
}

