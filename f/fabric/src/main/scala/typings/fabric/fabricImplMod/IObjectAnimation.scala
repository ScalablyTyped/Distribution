package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectAnimation[T] extends StObject {
  
  /**
    * Animates object's properties
    * object.animate({ left: ..., top: ... }, { duration: ... });
    * @param properties Properties to animate with values to animate to
    * @param options The animation options
    */
  def animate(properties: StringDictionary[Double | String]): Object = js.native
  def animate(properties: StringDictionary[Double | String], options: IAnimationOptions): Object = js.native
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
