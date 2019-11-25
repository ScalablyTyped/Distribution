package typings.gapiDotClientDotGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLabelsResponse extends js.Object {
  /** List of labels. */
  var labels: js.UndefOr[js.Array[Label]] = js.undefined
}

object ListLabelsResponse {
  @scala.inline
  def apply(labels: js.Array[Label] = null): ListLabelsResponse = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLabelsResponse]
  }
}

