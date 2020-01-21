package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An initial split point for a newly created table.
  */
@js.native
trait SchemaSplit extends js.Object {
  /**
    * Row key to use as an initial tablet boundary.
    */
  var key: js.UndefOr[String] = js.native
}

object SchemaSplit {
  @scala.inline
  def apply(key: String = null): SchemaSplit = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSplit]
  }
}

