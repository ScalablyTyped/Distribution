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
    * Unique identifier
    */
  var id: scala.Double = js.native
  /**
  	 * The source for the pattern
  	 */
  /* CompleteClass */
  override var source: java.lang.String | stdLib.HTMLImageElement = js.native
  def setOptions(options: IPatternOptions): scala.Unit = js.native
  /**
  	 * Returns an instance of CanvasPattern
  	 * @param {CanvasRenderingContext2D} ctx Context to create pattern
  	 * @return {CanvasPattern}
  	 */
  def toLive(ctx: stdLib.CanvasRenderingContext2D): stdLib.CanvasPattern = js.native
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
  def toSVG(`object`: Object): java.lang.String = js.native
}

