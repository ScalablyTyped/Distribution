package typings.fineUploader.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object s3 {
  type BucketFunction = js.Function1[
    /* id */ scala.Double, 
    typings.fineUploader.coreMod.PromiseOptions | java.lang.String
  ]
  type HostFunction = js.Function1[
    /* id */ scala.Double, 
    typings.fineUploader.coreMod.PromiseOptions | java.lang.String
  ]
  type KeyFunction = js.Function1[
    /* id */ scala.Double, 
    typings.fineUploader.coreMod.PromiseOptions | java.lang.String
  ]
  type OnCredentialsExpired = js.Function0[typings.fineUploader.coreMod.PromiseOptions]
  type S3CustomHeaderFunction = js.Function1[/* id */ scala.Double, scala.Unit]
}
