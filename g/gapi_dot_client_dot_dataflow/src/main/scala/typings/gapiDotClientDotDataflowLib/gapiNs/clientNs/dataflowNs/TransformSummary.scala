package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformSummary extends js.Object {
  /** Transform-specific display data. */
  var displayData: js.UndefOr[js.Array[DisplayData]] = js.undefined
  /** SDK generated id of this transform instance. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** User names for all collection inputs to this transform. */
  var inputCollectionName: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Type of transform. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** User provided name for this transform instance. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** User  names for all collection outputs to this transform. */
  var outputCollectionName: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TransformSummary {
  @scala.inline
  def apply(
    displayData: js.Array[DisplayData] = null,
    id: java.lang.String = null,
    inputCollectionName: js.Array[java.lang.String] = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    outputCollectionName: js.Array[java.lang.String] = null
  ): TransformSummary = {
    val __obj = js.Dynamic.literal()
    if (displayData != null) __obj.updateDynamic("displayData")(displayData)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputCollectionName != null) __obj.updateDynamic("inputCollectionName")(inputCollectionName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (outputCollectionName != null) __obj.updateDynamic("outputCollectionName")(outputCollectionName)
    __obj.asInstanceOf[TransformSummary]
  }
}

