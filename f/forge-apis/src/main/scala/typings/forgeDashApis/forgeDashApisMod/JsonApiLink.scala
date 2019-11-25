package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonApiLink extends js.Object {
  var href: String
}

object JsonApiLink {
  @scala.inline
  def apply(href: String): JsonApiLink = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonApiLink]
  }
}

