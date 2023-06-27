package typings.exponentialBackoff

import typings.exponentialBackoff.distOptionsMod.BackoffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("exponential-backoff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def backOff[T](request: js.Function0[js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("backOff")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def backOff[T](request: js.Function0[js.Promise[T]], options: BackoffOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("backOff")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
