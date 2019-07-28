package typings.fabric.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseFilter extends js.Object {
  /**
  	 * Sets filter's properties from options
  	 * @param [options] Options object
  	 */
  def setOptions(): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  /**
  	 * Returns a JSON representation of an instance
  	 */
  def toJSON(): String = js.native
  /**
  	 * Returns object representation of an instance
  	 */
  def toObject(): js.Any = js.native
}

