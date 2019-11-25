package typings.gapiDotClientDotBigquery

import typings.gapiDotClientDotBigquery.gapi.client.bigquery.QueryParameterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  /** [Optional] Human-oriented description of the field. */
  var description: js.UndefOr[String] = js.undefined
  /** [Optional] The name of this field. */
  var name: js.UndefOr[String] = js.undefined
  /** [Required] The type of this field. */
  var `type`: js.UndefOr[QueryParameterType] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(description: String = null, name: String = null, `type`: QueryParameterType = null): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Description]
  }
}

