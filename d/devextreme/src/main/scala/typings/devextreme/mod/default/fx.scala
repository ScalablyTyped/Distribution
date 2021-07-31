package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.animationConfig
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fx {
  
  @JSImport("devextreme", "default.fx")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def animate(element: Element, config: animationConfig): Promise[Unit] & JQueryPromise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit] & JQueryPromise[Unit]]
  
  @scala.inline
  def isAnimating(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimating")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def stop(element: Element, jumpToEnd: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stop")(element.asInstanceOf[js.Any], jumpToEnd.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
