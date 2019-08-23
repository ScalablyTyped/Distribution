package typings.atGoogleDashCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcHmacKeyMod {
  import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
  import typings.std.Error

  type HmacKeyMetadataCallback = js.Function3[
    /* err */ Error | Null, 
    /* metadata */ js.UndefOr[HmacKeyMetadata], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type HmacKeyMetadataResponse = js.Tuple2[HmacKeyMetadata, Metadata]
}
