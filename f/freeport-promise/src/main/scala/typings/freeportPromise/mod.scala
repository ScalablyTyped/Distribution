package typings.freeportPromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("freeport-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def freeport(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("freeport")().asInstanceOf[js.Promise[Double]]
}
