package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppRestrictionsSchema extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#appRestrictionsSchema". */
  var kind: js.UndefOr[String] = js.undefined
  /** The set of restrictions that make up this schema. */
  var restrictions: js.UndefOr[js.Array[AppRestrictionsSchemaRestriction]] = js.undefined
}

object AppRestrictionsSchema {
  @scala.inline
  def apply(kind: String = null, restrictions: js.Array[AppRestrictionsSchemaRestriction] = null): AppRestrictionsSchema = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppRestrictionsSchema]
  }
}

