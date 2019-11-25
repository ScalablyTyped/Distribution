package typings.googleapisDashCommon.buildSrcSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleapisDashCommon.Anon_Protocols
import typings.googleapisDashCommon.Anon_Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaMethod extends js.Object {
  var description: String
  var fragment: String
  var httpMethod: HttpMethod
  var id: String
  var mediaUpload: Anon_Protocols
  var parameterOrder: js.UndefOr[js.Array[String]] = js.undefined
  var parameters: js.UndefOr[StringDictionary[SchemaParameter]] = js.undefined
  var path: String
  var request: Anon_Ref
  var response: Anon_Ref
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
    mediaUpload: Anon_Protocols,
    path: String,
    request: Anon_Ref,
    response: Anon_Ref,
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

