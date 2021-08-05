package typings.dragscroll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dragscroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  inline def reset(i: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(i.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def reset(i: Double, el: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reset")(i.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reset(i: Unit, el: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reset")(i.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
