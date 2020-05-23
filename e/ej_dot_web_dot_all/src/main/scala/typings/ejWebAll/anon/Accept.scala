package typings.ejWebAll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accept extends js.Object {
  var accept: String
  var data: js.Any
  var `type`: String
  var url: String
}

object Accept {
  @scala.inline
  def apply(accept: String, data: js.Any, `type`: String, url: String): Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
}

