package typings.fabric.fabricDashImplMod

import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Pattern")
@js.native
class Pattern () extends IPatternOptions {
  def this(options: IPatternOptions) = this()
  /**
  	 * Unique identifier
  	 */
  var id: Double = js.native
  /**
  	 * The source for the pattern
  	 */
  /* CompleteClass */
  override var source: String | HTMLImageElement = js.native
  def setOptions(options: IPatternOptions): Unit = js.native
  /**
  	 * Returns an instance of CanvasPattern
  	 * @param {CanvasRenderingContext2D} ctx Context to create pattern
  	 * @return {CanvasPattern}
  	 */
  def toLive(ctx: CanvasRenderingContext2D): CanvasPattern = js.native
  /**
  	 * Returns object representation of a pattern
  	 * @param {Array} [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return {Object} Object representation of a pattern instance
  	 */
  def toObject(propertiesToInclude: js.Any): js.Any = js.native
  /**
  	 * Returns SVG representation of a pattern
  	 * @param {fabric.Object} object
  	 * @return {String} SVG representation of a pattern
  	 */
  def toSVG(`object`: Object): String = js.native
}

