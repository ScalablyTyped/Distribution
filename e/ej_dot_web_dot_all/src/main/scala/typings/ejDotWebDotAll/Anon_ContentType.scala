package typings.ejDotWebDotAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentType extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var ejPvtData: js.Any
  var `type`: String
  var url: String
}

object Anon_ContentType {
  @scala.inline
  def apply(ejPvtData: js.Any, `type`: String, url: String, contentType: String = null, data: js.Any = null): Anon_ContentType = {
    val __obj = js.Dynamic.literal(ejPvtData = ejPvtData.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContentType]
  }
}

