package typings.googleapis.buildSrcApisTpuV1alpha1Mod.tpu_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for ListAcceleratorTypes.
  */
@js.native
trait Schema$ListAcceleratorTypesResponse extends js.Object {
  /**
    * The listed nodes.
    */
  var acceleratorTypes: js.UndefOr[js.Array[Schema$AcceleratorType]] = js.native
  /**
    * The next page token or empty if none.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListAcceleratorTypesResponse {
  @scala.inline
  def apply(acceleratorTypes: js.Array[Schema$AcceleratorType] = null, nextPageToken: String = null): Schema$ListAcceleratorTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (acceleratorTypes != null) __obj.updateDynamic("acceleratorTypes")(acceleratorTypes.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAcceleratorTypesResponse]
  }
}

