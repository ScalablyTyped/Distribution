package typings.googleapisCommon.schemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleapisCommon.anon.Protocols
import typings.googleapisCommon.anon.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaMethod extends js.Object {
  var description: String
  var fragment: String
  var httpMethod: HttpMethod
  var id: String
  var mediaUpload: Protocols
  var parameterOrder: js.UndefOr[js.Array[String]] = js.undefined
  var parameters: js.UndefOr[StringDictionary[SchemaParameter]] = js.undefined
  var path: String
  var request: Ref
  var response: Ref
  var sampleUrl: String
  var scopes: js.Array[String]
}

object SchemaMethod {
  @scala.inline
  def apply(
    description: String,
    fragment: String,
    httpMethod: HttpMethod,
    id: String,
    mediaUpload: Protocols,
    path: String,
    request: Ref,
    response: Ref,
    sampleUrl: String,
    scopes: js.Array[String],
    parameterOrder: js.Array[String] = null,
    parameters: StringDictionary[SchemaParameter] = null
  ): SchemaMethod = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mediaUpload = mediaUpload.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], sampleUrl = sampleUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    if (parameterOrder != null) __obj.updateDynamic("parameterOrder")(parameterOrder.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMethod]
  }
}

