package typings.expressDashOpenapi.expressDashOpenapiMod

import typings.expressDashOpenapi.expressDashOpenapiMod.OpenApiNs.ApiDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializedApi extends js.Object {
  var apiDoc: ApiDefinition
}

object InitializedApi {
  @scala.inline
  def apply(apiDoc: ApiDefinition): InitializedApi = {
    val __obj = js.Dynamic.literal(apiDoc = apiDoc)
  
    __obj.asInstanceOf[InitializedApi]
  }
}

