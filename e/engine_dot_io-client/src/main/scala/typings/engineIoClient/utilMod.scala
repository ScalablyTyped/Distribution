package typings.engineIoClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("engine.io-client/build/esm/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def byteLength(obj: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(obj.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def installTimerFunctions(obj: Any, opts: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("installTimerFunctions")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pick(obj: Any, attr: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pick")(scala.List(obj.asInstanceOf[js.Any]).`++`(attr.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
}
