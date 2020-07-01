package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rule for determining which cells to delete during garbage collection.
  */
@js.native
trait SchemaGcRule extends js.Object {
  /**
    * Delete cells that would be deleted by every nested rule.
    */
  var intersection: js.UndefOr[SchemaIntersection] = js.native
  /**
    * Delete cells in a column older than the given age. Values must be at
    * least one millisecond, and will be truncated to microsecond granularity.
    */
  var maxAge: js.UndefOr[String] = js.native
  /**
    * Delete all cells in a column except the most recent N.
    */
  var maxNumVersions: js.UndefOr[Double] = js.native
  /**
    * Delete cells that would be deleted by any nested rule.
    */
  var union: js.UndefOr[SchemaUnion] = js.native
}

object SchemaGcRule {
  @scala.inline
  def apply(
    intersection: SchemaIntersection = null,
    maxAge: String = null,
    maxNumVersions: js.UndefOr[Double] = js.undefined,
    union: SchemaUnion = null
  ): SchemaGcRule = {
    val __obj = js.Dynamic.literal()
    if (intersection != null) __obj.updateDynamic("intersection")(intersection.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNumVersions)) __obj.updateDynamic("maxNumVersions")(maxNumVersions.get.asInstanceOf[js.Any])
    if (union != null) __obj.updateDynamic("union")(union.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGcRule]
  }
}

