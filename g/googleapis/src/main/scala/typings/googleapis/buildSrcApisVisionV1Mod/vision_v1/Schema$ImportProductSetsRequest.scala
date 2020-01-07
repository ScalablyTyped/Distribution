package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the `ImportProductSets` method.
  */
@js.native
trait Schema$ImportProductSetsRequest extends js.Object {
  /**
    * The input content for the list of requests.
    */
  var inputConfig: js.UndefOr[Schema$ImportProductSetsInputConfig] = js.native
}

object Schema$ImportProductSetsRequest {
  @scala.inline
  def apply(inputConfig: Schema$ImportProductSetsInputConfig = null): Schema$ImportProductSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (inputConfig != null) __obj.updateDynamic("inputConfig")(inputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImportProductSetsRequest]
  }
}

