package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGrandientStatic
  extends ScalablyTyped.runtime.Instantiable0[IGradient]
     with ScalablyTyped.runtime.Instantiable1[/* options */ IGradientOptions, IGradient] {
  /**
  	 * Returns instance from an SVG element
  	 * @param el SVG gradient element
  	 */
  def fromElement(el: stdLib.SVGGradientElement, instance: Object): IGradient = js.native
  /**
  	 * Returns instance from its object representation
  	 * @param [options] Options object
  	 */
  def fromObject(obj: js.Any, options: js.Array[_]): IGradient = js.native
}

