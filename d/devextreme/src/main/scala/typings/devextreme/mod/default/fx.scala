package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.AnimationConfig
import typings.devextreme.mod.DevExpress.core.utils.DxPromise
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fx {
  
  @JSImport("devextreme", "default.fx")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Animates an element.
    */
  inline def animate(element: Element, config: AnimationConfig): DxPromise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[DxPromise[Unit]]
  
  /**
    * Checks whether an element is being animated.
    */
  inline def isAnimating(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimating")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Stops an element&apos;s animation.
    */
  inline def stop(element: Element, jumpToEnd: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stop")(element.asInstanceOf[js.Any], jumpToEnd.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
