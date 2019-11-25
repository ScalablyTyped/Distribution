package typings.atGoogleDashCloudPubsub

import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.RequestCallback
import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.RequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Callback extends js.Object {
  def apply[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
}

