package typings.fineDashUploader.libS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object s3 {
  import typings.fineDashUploader.libCoreMod.PromiseOptions

  type BucketFunction = js.Function1[/* id */ Double, PromiseOptions | String]
  type HostFunction = js.Function1[/* id */ Double, PromiseOptions | String]
  type KeyFunction = js.Function1[/* id */ Double, PromiseOptions | String]
  type OnCredentialsExpired = js.Function0[PromiseOptions]
  type S3CustomHeaderFunction = js.Function1[/* id */ Double, Unit]
}
