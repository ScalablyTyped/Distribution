package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Pattern")
@js.native
class Pattern () extends IPatternOptions {
  def this(options: IPatternOptions) = this()
  /**
  	 * Pattern horizontal offset from object's left/top corner
  	 */
  /* CompleteClass */
  override var offsetX: scala.Double = js.native
  /**
  	 * Pattern vertical offset from object's left/top corner
  	 */
  /* CompleteClass */
  override var offsetY: scala.Double = js.native
  /**
  	 * Repeat property of a pattern (one of repeat, repeat-x, repeat-y or no-repeat)
  	 */
  /* CompleteClass */
  override var repeat: java.lang.String = js.native
  /**
  	 * The source for the pattern
  	 */
  /* CompleteClass */
  override var source: java.lang.String | stdLib.HTMLImageElement = js.native
  def initialise(): Pattern = js.native
  def initialise(options: IPatternOptions): Pattern = js.native
  /**
  	 * Returns an instance of CanvasPattern
  	 */
  def toLive(ctx: stdLib.CanvasRenderingContext2D): Pattern = js.native
  /**
  	 * Returns object representation of a pattern
  	 */
  def toObject(): js.Any = js.native
  /**
  	 * Returns SVG representation of a pattern
  	 */
  def toSVG(`object`: js.Object): java.lang.String = js.native
}

