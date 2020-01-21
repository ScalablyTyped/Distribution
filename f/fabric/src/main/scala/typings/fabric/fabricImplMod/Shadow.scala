package typings.fabric.fabricImplMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Shadow")
@js.native
class Shadow () extends IShadowOptions {
  def this(options: String) = this()
  def this(options: IShadowOptions) = this()
  def initialize(): Shadow = js.native
  def initialize(options: String): Shadow = js.native
  def initialize(options: IShadowOptions): Shadow = js.native
  /**
  	 * Returns object representation of a shadow
  	 * @return {Object} Object representation of a shadow instance
  	 */
  def toObject(): js.Any = js.native
  /**
  	 * Returns SVG representation of a shadow
  	 * @param {fabric.Object} object
  	 * @return {String} SVG representation of a shadow
  	 */
  def toSVG(`object`: Object): String = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Shadow")
@js.native
object Shadow extends js.Object {
  /**
  	 * Regex matching shadow offsetX, offsetY and blur (ex: "2px 2px 10px rgba(0,0,0,0.2)", "rgb(0,255,0) 2px 2px")
  	 * @static
  	 * @field
  	 * @memberOf fabric.Shadow
  	 */
  var reOffsetsAndBlur: RegExp = js.native
}

