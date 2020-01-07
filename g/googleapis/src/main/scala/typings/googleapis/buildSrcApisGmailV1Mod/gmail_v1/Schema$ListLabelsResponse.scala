package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListLabelsResponse extends js.Object {
  /**
    * List of labels.
    */
  var labels: js.UndefOr[js.Array[Schema$Label]] = js.native
}

object Schema$ListLabelsResponse {
  @scala.inline
  def apply(labels: js.Array[Schema$Label] = null): Schema$ListLabelsResponse = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListLabelsResponse]
  }
}

