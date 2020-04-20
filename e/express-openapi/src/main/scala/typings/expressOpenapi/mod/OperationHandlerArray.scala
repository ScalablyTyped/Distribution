package typings.expressOpenapi.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationHandlerArray
  extends /* index */ NumberDictionary[RequestHandler[ParamsDictionary, _, _, Query]]
     with Operation {
  var apiDoc: js.UndefOr[typings.openapiTypes.mod.OpenAPI.Operation] = js.undefined
}

object OperationHandlerArray {
  @scala.inline
  def apply(
    NumberDictionary: /* index */ NumberDictionary[RequestHandler[ParamsDictionary, _, _, Query]] = null,
    apiDoc: typings.openapiTypes.mod.OpenAPI.Operation = null
  ): OperationHandlerArray = {
    val __obj = js.Dynamic.literal()
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (apiDoc != null) __obj.updateDynamic("apiDoc")(apiDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationHandlerArray]
  }
}

