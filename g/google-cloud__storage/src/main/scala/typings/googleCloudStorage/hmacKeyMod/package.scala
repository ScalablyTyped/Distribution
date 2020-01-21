package typings.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hmacKeyMod {
  type HmacKeyMetadataCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* metadata */ js.UndefOr[typings.googleCloudStorage.hmacKeyMod.HmacKeyMetadata], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type HmacKeyMetadataResponse = js.Tuple2[
    typings.googleCloudStorage.hmacKeyMod.HmacKeyMetadata, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
