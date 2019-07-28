package typings.fabric.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectAnimation[T] extends js.Object {
  /**
  	 * Animates object's properties
  	 * object.animate({ left: ..., top: ... }, { duration: ... });
  	 * @param properties Properties to animate
  	 * @param value Options object
  	 */
  def animate(properties: js.Any): Object = js.native
  def animate(properties: js.Any, options: IAnimationOptions): Object = js.native
  def animate(property: String, value: String): Object = js.native
  def animate(property: String, value: String, options: IAnimationOptions): Object = js.native
  /**
  	 * Animates object's properties
  	 * object.animate('left', ..., {duration: ...});
  	 * @param property Property to animate
  	 * @param value Value to animate property
  	 * @param options The animation options
  	 */
  def animate(property: String, value: Double): Object = js.native
  def animate(property: String, value: Double, options: IAnimationOptions): Object = js.native
}

