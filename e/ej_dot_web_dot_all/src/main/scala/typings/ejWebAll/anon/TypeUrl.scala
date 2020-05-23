package typings.ejWebAll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeUrl extends js.Object {
  var `type`: String
  var url: String
}

object TypeUrl {
  @scala.inline
  def apply(`type`: String, url: String): TypeUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeUrl]
  }
}

