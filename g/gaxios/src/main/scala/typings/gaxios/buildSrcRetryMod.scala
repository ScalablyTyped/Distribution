package typings.gaxios

import typings.gaxios.buildSrcCommonMod.GaxiosError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gaxios/build/src/retry", JSImport.Namespace)
@js.native
object buildSrcRetryMod extends js.Object {
  def getRetryConfig(err: GaxiosError[_]): js.Promise[Anon_Config | Anon_ConfigShouldRetry] = js.native
}

