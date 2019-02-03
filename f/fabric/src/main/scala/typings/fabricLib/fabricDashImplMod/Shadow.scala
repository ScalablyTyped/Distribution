package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Shadow")
@js.native
class Shadow () extends IShadowOptions {
  def this(options: IShadowOptions) = this()
  /**
  	 * Whether the shadow should affect stroke operations
  	 */
  /* CompleteClass */
  override var affectStrike: scala.Boolean = js.native
  /**
  	 * Shadow blur
  	 */
  /* CompleteClass */
  override var blur: scala.Double = js.native
  /**
  	 * Shadow color
  	 */
  /* CompleteClass */
  override var color: java.lang.String = js.native
  /**
  	 * Indicates whether toObject should include default values
  	 */
  /* CompleteClass */
  override var includeDefaultValues: scala.Boolean = js.native
  /**
  	 * Shadow horizontal offset
  	 */
  /* CompleteClass */
  override var offsetX: scala.Double = js.native
  /**
  	 * Shadow vertical offset
  	 */
  /* CompleteClass */
  override var offsetY: scala.Double = js.native
  /**
  	 * Regex matching shadow offsetX, offsetY and blur, Static
  	 */
  var reOffsetsAndBlur: stdLib.RegExp = js.native
  def initialize(): Shadow = js.native
  def initialize(options: IShadowOptions): Shadow = js.native
  def initialize(options: java.lang.String): Shadow = js.native
  /**
  	 * Returns object representation of a shadow
  	 */
  def toObject(): js.Any = js.native
  /**
  	 * Returns SVG representation of a shadow
  	 */
  def toSVG(`object`: Object): java.lang.String = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Shadow")
@js.native
object Shadow extends js.Object {
  var reOffsetsAndBlur: stdLib.RegExp = js.native
}

