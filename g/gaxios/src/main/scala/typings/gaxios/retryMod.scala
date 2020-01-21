package typings.gaxios

import typings.gaxios.commonMod.GaxiosError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gaxios/build/src/retry", JSImport.Namespace)
@js.native
object retryMod extends js.Object {
  def getRetryConfig(err: GaxiosError[_]): js.Promise[AnonConfig | AnonConfigShouldRetry] = js.native
}

