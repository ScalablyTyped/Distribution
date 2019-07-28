package typings.gapiDotClientDotBigquery

import typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs.QueryParameterType
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
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Description]
  }
}

