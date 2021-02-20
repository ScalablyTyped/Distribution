package typings.gaxios

import typings.gaxios.anon.Config
import typings.gaxios.anon.ShouldRetry
import typings.gaxios.commonMod.GaxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryMod {
  
  @JSImport("gaxios/build/src/retry", "getRetryConfig")
  @js.native
  def getRetryConfig(err: GaxiosError[_]): js.Promise[Config | ShouldRetry] = js.native
}
