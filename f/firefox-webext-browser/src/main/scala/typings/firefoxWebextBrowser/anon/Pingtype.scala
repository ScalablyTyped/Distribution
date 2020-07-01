package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pingtype extends js.Object {
  var ping_type: String
  var pioneer_id: js.UndefOr[Boolean] = js.undefined
  var public_key: Key
  var schemaNamespace: String
  var study_name: js.UndefOr[String] = js.undefined
}

object Pingtype {
  @scala.inline
  def apply(
    ping_type: String,
    public_key: Key,
    schemaNamespace: String,
    pioneer_id: js.UndefOr[Boolean] = js.undefined,
    study_name: String = null
  ): Pingtype = {
    val __obj = js.Dynamic.literal(ping_type = ping_type.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any], schemaNamespace = schemaNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(pioneer_id)) __obj.updateDynamic("pioneer_id")(pioneer_id.get.asInstanceOf[js.Any])
    if (study_name != null) __obj.updateDynamic("study_name")(study_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pingtype]
  }
}

