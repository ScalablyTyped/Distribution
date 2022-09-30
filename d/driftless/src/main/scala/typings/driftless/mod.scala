package typings.driftless

import typings.driftless.anon.CustomClearTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("driftless", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearDriftless(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearDriftless")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearDriftless(id: Double, options: CustomClearTimeout): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearDriftless")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDriftlessInterval(callback: String, delayMs: Double, params: Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setDriftlessInterval")((scala.List(callback.asInstanceOf[js.Any], delayMs.asInstanceOf[js.Any])).`++`(params.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  inline def setDriftlessInterval(callback: js.Function1[/* repeated */ Any, Unit], delayMs: Double, params: Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setDriftlessInterval")((scala.List(callback.asInstanceOf[js.Any], delayMs.asInstanceOf[js.Any])).`++`(params.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  
  inline def setDriftlessTimeout(callback: String, delayMs: Double, params: Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setDriftlessTimeout")((scala.List(callback.asInstanceOf[js.Any], delayMs.asInstanceOf[js.Any])).`++`(params.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  inline def setDriftlessTimeout(callback: js.Function1[/* repeated */ Any, Unit], delayMs: Double, params: Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setDriftlessTimeout")((scala.List(callback.asInstanceOf[js.Any], delayMs.asInstanceOf[js.Any])).`++`(params.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
}
