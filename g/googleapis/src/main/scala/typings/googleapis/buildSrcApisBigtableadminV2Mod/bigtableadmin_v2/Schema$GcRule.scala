package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rule for determining which cells to delete during garbage collection.
  */
@js.native
trait Schema$GcRule extends js.Object {
  /**
    * Delete cells that would be deleted by every nested rule.
    */
  var intersection: js.UndefOr[Schema$Intersection] = js.native
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
  var union: js.UndefOr[Schema$Union] = js.native
}

object Schema$GcRule {
  @scala.inline
  def apply(
    intersection: Schema$Intersection = null,
    maxAge: String = null,
    maxNumVersions: Int | Double = null,
    union: Schema$Union = null
  ): Schema$GcRule = {
    val __obj = js.Dynamic.literal()
    if (intersection != null) __obj.updateDynamic("intersection")(intersection.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (maxNumVersions != null) __obj.updateDynamic("maxNumVersions")(maxNumVersions.asInstanceOf[js.Any])
    if (union != null) __obj.updateDynamic("union")(union.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GcRule]
  }
}

