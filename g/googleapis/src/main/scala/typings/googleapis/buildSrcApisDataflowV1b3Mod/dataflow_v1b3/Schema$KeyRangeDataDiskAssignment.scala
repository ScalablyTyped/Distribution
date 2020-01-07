package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data disk assignment information for a specific key-range of a sharded
  * computation. Currently we only support UTF-8 character splits to simplify
  * encoding into JSON.
  */
@js.native
trait Schema$KeyRangeDataDiskAssignment extends js.Object {
  /**
    * The name of the data disk where data for this range is stored. This name
    * is local to the Google Cloud Platform project and uniquely identifies the
    * disk within that project, for example
    * &quot;myproject-1014-104817-4c2-harness-0-disk-1&quot;.
    */
  var dataDisk: js.UndefOr[String] = js.native
  /**
    * The end (exclusive) of the key range.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * The start (inclusive) of the key range.
    */
  var start: js.UndefOr[String] = js.native
}

object Schema$KeyRangeDataDiskAssignment {
  @scala.inline
  def apply(dataDisk: String = null, end: String = null, start: String = null): Schema$KeyRangeDataDiskAssignment = {
    val __obj = js.Dynamic.literal()
    if (dataDisk != null) __obj.updateDynamic("dataDisk")(dataDisk.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$KeyRangeDataDiskAssignment]
  }
}

