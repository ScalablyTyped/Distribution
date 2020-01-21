package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the list of app restrictions available to be pre-configured for
  * the product.
  */
@js.native
trait SchemaAppRestrictionsSchema extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#appRestrictionsSchema&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The set of restrictions that make up this schema.
    */
  var restrictions: js.UndefOr[js.Array[SchemaAppRestrictionsSchemaRestriction]] = js.native
}

object SchemaAppRestrictionsSchema {
  @scala.inline
  def apply(kind: String = null, restrictions: js.Array[SchemaAppRestrictionsSchemaRestriction] = null): SchemaAppRestrictionsSchema = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppRestrictionsSchema]
  }
}

