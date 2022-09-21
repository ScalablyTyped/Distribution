package typings.fbjs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollMod {
  
  @JSImport("fbjs/lib/Scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLeft(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeft")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getTop(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def setLeft(element: HTMLElement, newLeft: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLeft")(element.asInstanceOf[js.Any], newLeft.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTop(element: HTMLElement, newTop: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTop")(element.asInstanceOf[js.Any], newTop.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
