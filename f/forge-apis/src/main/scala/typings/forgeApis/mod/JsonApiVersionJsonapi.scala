package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonApiVersionJsonapi extends js.Object {
  var version: String
}

object JsonApiVersionJsonapi {
  @scala.inline
  def apply(version: String): JsonApiVersionJsonapi = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonApiVersionJsonapi]
  }
}

