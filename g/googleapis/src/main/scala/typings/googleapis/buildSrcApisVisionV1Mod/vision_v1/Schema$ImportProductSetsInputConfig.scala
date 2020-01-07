package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The input content for the `ImportProductSets` method.
  */
@js.native
trait Schema$ImportProductSetsInputConfig extends js.Object {
  /**
    * The Google Cloud Storage location for a csv file which preserves a list
    * of ImportProductSetRequests in each line.
    */
  var gcsSource: js.UndefOr[Schema$ImportProductSetsGcsSource] = js.native
}

object Schema$ImportProductSetsInputConfig {
  @scala.inline
  def apply(gcsSource: Schema$ImportProductSetsGcsSource = null): Schema$ImportProductSetsInputConfig = {
    val __obj = js.Dynamic.literal()
    if (gcsSource != null) __obj.updateDynamic("gcsSource")(gcsSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImportProductSetsInputConfig]
  }
}

