package typings.gaxios

import typings.gaxios.anon.Config
import typings.gaxios.anon.ShouldRetry
import typings.gaxios.commonMod.GaxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryMod {
  
  @JSImport("gaxios/build/src/retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRetryConfig(err: GaxiosError[Any]): js.Promise[Config | ShouldRetry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRetryConfig")(err.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Config | ShouldRetry]]
}
