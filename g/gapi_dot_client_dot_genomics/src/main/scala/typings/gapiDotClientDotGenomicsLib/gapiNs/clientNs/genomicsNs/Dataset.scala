package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dataset extends js.Object {
  /** The time this dataset was created, in seconds from the epoch. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** The server-generated dataset ID, unique across all datasets. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The dataset name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The Google Cloud project ID that this dataset belongs to. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

object Dataset {
  @scala.inline
  def apply(
    createTime: java.lang.String = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    projectId: java.lang.String = null
  ): Dataset = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[Dataset]
  }
}

