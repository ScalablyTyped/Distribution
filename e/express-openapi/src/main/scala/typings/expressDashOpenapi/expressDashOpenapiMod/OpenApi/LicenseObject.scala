package typings.expressDashOpenapi.expressDashOpenapiMod.OpenApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseObject extends js.Object {
  var name: String
  var url: js.UndefOr[String] = js.undefined
}

object LicenseObject {
  @scala.inline
  def apply(name: String, url: String = null): LicenseObject = {
    val __obj = js.Dynamic.literal(name = name)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[LicenseObject]
  }
}

