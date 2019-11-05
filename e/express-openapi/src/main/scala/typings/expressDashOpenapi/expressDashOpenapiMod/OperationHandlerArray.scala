package typings.expressDashOpenapi.expressDashOpenapiMod

import org.scalablytyped.runtime.NumberDictionary
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationHandlerArray
  extends /* index */ NumberDictionary[RequestHandler[ParamsDictionary]]
     with Operation {
  var apiDoc: js.UndefOr[typings.openapiDashTypes.openapiDashTypesMod.OpenAPI.Operation] = js.undefined
}

object OperationHandlerArray {
  @scala.inline
  def apply(
    NumberDictionary: /* index */ NumberDictionary[RequestHandler[ParamsDictionary]] = null,
    apiDoc: typings.openapiDashTypes.openapiDashTypesMod.OpenAPI.Operation = null
  ): OperationHandlerArray = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (apiDoc != null) __obj.updateDynamic("apiDoc")(apiDoc)
    __obj.asInstanceOf[OperationHandlerArray]
  }
}

