package typings.googleCloudPubsub.anon

import typings.googleCloudPubsub.srcPubsubMod.RequestCallback
import typings.googleCloudPubsub.srcPubsubMod.RequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
}

