package typings
package figuresLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("figures", JSImport.Namespace)
@js.native
object figuresMod extends js.Object {
  val arrowDown: java.lang.String = js.native
  val arrowLeft: java.lang.String = js.native
  val arrowRight: java.lang.String = js.native
  val arrowUp: java.lang.String = js.native
  val bullet: java.lang.String = js.native
  val checkboxCircleOff: java.lang.String = js.native
  val checkboxCircleOn: java.lang.String = js.native
  val checkboxOff: java.lang.String = js.native
  val checkboxOn: java.lang.String = js.native
  val circle: java.lang.String = js.native
  val circleCircle: java.lang.String = js.native
  val circleCross: java.lang.String = js.native
  val circleDotted: java.lang.String = js.native
  val circleDouble: java.lang.String = js.native
  val circleFilled: java.lang.String = js.native
  val circlePipe: java.lang.String = js.native
  val circleQuestionMark: java.lang.String = js.native
  val cross: java.lang.String = js.native
  val dot: java.lang.String = js.native
  val ellipsis: java.lang.String = js.native
  val fiveEighths: java.lang.String = js.native
  val fiveSixths: java.lang.String = js.native
  val fourFifths: java.lang.String = js.native
  val hamburger: java.lang.String = js.native
  val heart: java.lang.String = js.native
  val info: java.lang.String = js.native
  val line: java.lang.String = js.native
  val mustache: java.lang.String = js.native
  val oneEighth: java.lang.String = js.native
  val oneFifth: java.lang.String = js.native
  val oneHalf: java.lang.String = js.native
  val oneNinth: java.lang.String = js.native
  val oneQuarter: java.lang.String = js.native
  val oneSeventh: java.lang.String = js.native
  val oneSixth: java.lang.String = js.native
  val oneTenth: java.lang.String = js.native
  val oneThird: java.lang.String = js.native
  val play: java.lang.String = js.native
  val pointer: java.lang.String = js.native
  val pointerSmall: java.lang.String = js.native
  val questionMarkPrefix: java.lang.String = js.native
  val radioOff: java.lang.String = js.native
  val radioOn: java.lang.String = js.native
  val sevenEighth: java.lang.String = js.native
  val smiley: java.lang.String = js.native
  val square: java.lang.String = js.native
  val squareSmall: java.lang.String = js.native
  val squareSmallFilled: java.lang.String = js.native
  val star: java.lang.String = js.native
  val threeEighths: java.lang.String = js.native
  val threeFifths: java.lang.String = js.native
  val threeQuarters: java.lang.String = js.native
  val tick: java.lang.String = js.native
  val twoFifths: java.lang.String = js.native
  val twoThirds: java.lang.String = js.native
  val warning: java.lang.String = js.native
  /**
  	Replace unicode symbols depending on the OS.
  	@param string - String where the Unicode symbols will be replaced with fallback symbols depending on the OS.
  	@returns The input with replaced fallback Unicode symbols on Windows.
  	@example
  	```
  	import figures = require('figures');
  	console.log(figures('✔︎ check'));
  	// On real OSes:  ✔︎ check
  	// On Windows:    √ check
  	console.log(figures.tick);
  	// On real OSes:  ✔︎
  	// On Windows:    √
  	```
  	*/
  def apply(string: java.lang.String): java.lang.String = js.native
}

