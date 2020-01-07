package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An initial split point for a newly created table.
  */
@js.native
trait Schema$Split extends js.Object {
  /**
    * Row key to use as an initial tablet boundary.
    */
  var key: js.UndefOr[String] = js.native
}

object Schema$Split {
  @scala.inline
  def apply(key: String = null): Schema$Split = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Split]
  }
}

