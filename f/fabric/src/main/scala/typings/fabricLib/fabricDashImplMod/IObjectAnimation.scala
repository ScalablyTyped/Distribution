package typings
package fabricLib.fabricDashImplMod

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
  /**
  	 * Animates object's properties
  	 * object.animate({ left: ..., top: ... }, { duration: ... });
  	 * @param properties Properties to animate
  	 * @param value Options object
  	 */
  def animate(properties: js.Any, options: IAnimationOptions): Object = js.native
  /**
  	 * Animates object's properties
  	 * object.animate('left', ..., {duration: ...});
  	 * @param property Property to animate
  	 * @param value Value to animate property
  	 * @param options The animation options
  	 */
  def animate(property: java.lang.String, value: java.lang.String): Object = js.native
  /**
  	 * Animates object's properties
  	 * object.animate('left', ..., {duration: ...});
  	 * @param property Property to animate
  	 * @param value Value to animate property
  	 * @param options The animation options
  	 */
  def animate(property: java.lang.String, value: java.lang.String, options: IAnimationOptions): Object = js.native
  /**
  	 * Animates object's properties
  	 * object.animate('left', ..., {duration: ...});
  	 * @param property Property to animate
  	 * @param value Value to animate property
  	 * @param options The animation options
  	 */
  def animate(property: java.lang.String, value: scala.Double): Object = js.native
  /**
  	 * Animates object's properties
  	 * object.animate('left', ..., {duration: ...});
  	 * @param property Property to animate
  	 * @param value Value to animate property
  	 * @param options The animation options
  	 */
  def animate(property: java.lang.String, value: scala.Double, options: IAnimationOptions): Object = js.native
}

