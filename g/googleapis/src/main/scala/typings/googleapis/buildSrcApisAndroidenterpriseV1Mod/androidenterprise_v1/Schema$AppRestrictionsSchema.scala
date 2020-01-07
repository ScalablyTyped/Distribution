package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the list of app restrictions available to be pre-configured for
  * the product.
  */
@js.native
trait Schema$AppRestrictionsSchema extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#appRestrictionsSchema&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The set of restrictions that make up this schema.
    */
  var restrictions: js.UndefOr[js.Array[Schema$AppRestrictionsSchemaRestriction]] = js.native
}

object Schema$AppRestrictionsSchema {
  @scala.inline
  def apply(kind: String = null, restrictions: js.Array[Schema$AppRestrictionsSchemaRestriction] = null): Schema$AppRestrictionsSchema = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AppRestrictionsSchema]
  }
}

