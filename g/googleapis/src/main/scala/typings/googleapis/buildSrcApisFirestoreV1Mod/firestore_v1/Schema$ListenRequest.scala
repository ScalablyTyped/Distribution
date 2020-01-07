package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for Firestore.Listen
  */
@js.native
trait Schema$ListenRequest extends js.Object {
  /**
    * A target to add to this stream.
    */
  var addTarget: js.UndefOr[Schema$Target] = js.native
  /**
    * Labels associated with this target change.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The ID of a target to remove from this stream.
    */
  var removeTarget: js.UndefOr[Double] = js.native
}

object Schema$ListenRequest {
  @scala.inline
  def apply(
    addTarget: Schema$Target = null,
    labels: StringDictionary[String] = null,
    removeTarget: Int | Double = null
  ): Schema$ListenRequest = {
    val __obj = js.Dynamic.literal()
    if (addTarget != null) __obj.updateDynamic("addTarget")(addTarget.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (removeTarget != null) __obj.updateDynamic("removeTarget")(removeTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListenRequest]
  }
}

