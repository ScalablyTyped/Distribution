package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.animationConfig
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fx {
  
  @JSImport("devextreme", "default.fx.animate")
  @js.native
  def animate(element: Element, config: animationConfig): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  @JSImport("devextreme", "default.fx.isAnimating")
  @js.native
  def isAnimating(element: Element): Boolean = js.native
  
  @JSImport("devextreme", "default.fx.stop")
  @js.native
  def stop(element: Element, jumpToEnd: Boolean): Unit = js.native
}
