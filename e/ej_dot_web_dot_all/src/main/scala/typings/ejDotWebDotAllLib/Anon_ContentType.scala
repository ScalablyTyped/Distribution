package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentType extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var ejPvtData: js.Any
  var `type`: java.lang.String
  var url: java.lang.String
}

object Anon_ContentType {
  @scala.inline
  def apply(
    ejPvtData: js.Any,
    `type`: java.lang.String,
    url: java.lang.String,
    contentType: java.lang.String = null,
    data: js.Any = null
  ): Anon_ContentType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("ejPvtData")(ejPvtData)
    __obj.updateDynamic("url")(url)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_ContentType]
  }
}

