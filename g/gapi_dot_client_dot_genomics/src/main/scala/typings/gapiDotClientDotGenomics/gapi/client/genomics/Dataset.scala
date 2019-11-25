package typings.gapiDotClientDotGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dataset extends js.Object {
  /** The time this dataset was created, in seconds from the epoch. */
  var createTime: js.UndefOr[String] = js.undefined
  /** The server-generated dataset ID, unique across all datasets. */
  var id: js.UndefOr[String] = js.undefined
  /** The dataset name. */
  var name: js.UndefOr[String] = js.undefined
  /** The Google Cloud project ID that this dataset belongs to. */
  var projectId: js.UndefOr[String] = js.undefined
}

object Dataset {
  @scala.inline
  def apply(createTime: String = null, id: String = null, name: String = null, projectId: String = null): Dataset = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
}

