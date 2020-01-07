package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of columns within a table which share a common configuration.
  */
@js.native
trait Schema$ColumnFamily extends js.Object {
  /**
    * Garbage collection rule specified as a protobuf. Must serialize to at
    * most 500 bytes.  NOTE: Garbage collection executes opportunistically in
    * the background, and so it&#39;s possible for reads to return a cell even
    * if it matches the active GC expression for its family.
    */
  var gcRule: js.UndefOr[Schema$GcRule] = js.native
}

object Schema$ColumnFamily {
  @scala.inline
  def apply(gcRule: Schema$GcRule = null): Schema$ColumnFamily = {
    val __obj = js.Dynamic.literal()
    if (gcRule != null) __obj.updateDynamic("gcRule")(gcRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ColumnFamily]
  }
}

