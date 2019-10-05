package typings.expressDashOpenapi.expressDashOpenapiMod

import org.scalablytyped.runtime.NumberDictionary
import typings.express.expressMod.RequestHandler
import typings.expressDashOpenapi.expressDashOpenapiMod.OpenApi.OperationObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationHandlerArray
  extends /* index */ NumberDictionary[RequestHandler]
     with Operation {
  var apiDoc: js.UndefOr[OperationObject] = js.undefined
}

object OperationHandlerArray {
  @scala.inline
  def apply(
    NumberDictionary: /* index */ NumberDictionary[RequestHandler] = null,
    apiDoc: OperationObject = null
  ): OperationHandlerArray = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (apiDoc != null) __obj.updateDynamic("apiDoc")(apiDoc)
    __obj.asInstanceOf[OperationHandlerArray]
  }
}

