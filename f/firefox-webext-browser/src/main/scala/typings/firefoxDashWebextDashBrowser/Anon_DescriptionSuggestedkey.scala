package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionSuggestedkey extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var suggested_key: js.UndefOr[Anon_AdditionalProperties] = js.undefined
}

object Anon_DescriptionSuggestedkey {
  @scala.inline
  def apply(description: String = null, suggested_key: Anon_AdditionalProperties = null): Anon_DescriptionSuggestedkey = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (suggested_key != null) __obj.updateDynamic("suggested_key")(suggested_key)
    __obj.asInstanceOf[Anon_DescriptionSuggestedkey]
  }
}

