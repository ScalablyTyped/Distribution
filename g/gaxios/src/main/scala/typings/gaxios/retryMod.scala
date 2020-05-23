package typings.gaxios

import typings.gaxios.anon.Config
import typings.gaxios.anon.ShouldRetry
import typings.gaxios.commonMod.GaxiosError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gaxios/build/src/retry", JSImport.Namespace)
@js.native
object retryMod extends js.Object {
  def getRetryConfig(err: GaxiosError[_]): js.Promise[Config | ShouldRetry] = js.native
}

