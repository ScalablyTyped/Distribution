package typings.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: Null
  var headers: Null
  var statusCode: Null
  var warnings: Null
}

object AnonBody {
  @scala.inline
  def apply(body: Null, headers: Null, statusCode: Null, warnings: Null): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

