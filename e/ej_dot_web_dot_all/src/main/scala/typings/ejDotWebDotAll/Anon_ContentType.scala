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
    val __obj = js.Dynamic.literal(ejPvtData = ejPvtData, url = url)
    __obj.updateDynamic("type")(`type`)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_ContentType]
  }
}

