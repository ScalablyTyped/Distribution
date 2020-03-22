package typings.figures.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("figures", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val arrowDown: String = js.native
  val arrowLeft: String = js.native
  val arrowRight: String = js.native
  val arrowUp: String = js.native
  val bullet: String = js.native
  val checkboxCircleOff: String = js.native
  val checkboxCircleOn: String = js.native
  val checkboxOff: String = js.native
  val checkboxOn: String = js.native
  val circle: String = js.native
  val circleCircle: String = js.native
  val circleCross: String = js.native
  val circleDotted: String = js.native
  val circleDouble: String = js.native
  val circleFilled: String = js.native
  val circlePipe: String = js.native
  val circleQuestionMark: String = js.native
  val cross: String = js.native
  val dot: String = js.native
  val ellipsis: String = js.native
  val fiveEighths: String = js.native
  val fiveSixths: String = js.native
  val fourFifths: String = js.native
  val hamburger: String = js.native
  val heart: String = js.native
  val info: String = js.native
  val line: String = js.native
  /**
  	Symbols to use when not running on Windows.
  	*/
  val main: FigureSet = js.native
  val mustache: String = js.native
  val nodejs: String = js.native
  val oneEighth: String = js.native
  val oneFifth: String = js.native
  val oneHalf: String = js.native
  val oneNinth: String = js.native
  val oneQuarter: String = js.native
  val oneSeventh: String = js.native
  val oneSixth: String = js.native
  val oneTenth: String = js.native
  val oneThird: String = js.native
  val play: String = js.native
  val pointer: String = js.native
  val pointerSmall: String = js.native
  val questionMarkPrefix: String = js.native
  val radioOff: String = js.native
  val radioOn: String = js.native
  val sevenEighth: String = js.native
  val smiley: String = js.native
  val square: String = js.native
  val squareSmall: String = js.native
  val squareSmallFilled: String = js.native
  val star: String = js.native
  val threeEighths: String = js.native
  val threeFifths: String = js.native
  val threeQuarters: String = js.native
  val tick: String = js.native
  val twoFifths: String = js.native
  val twoThirds: String = js.native
  val warning: String = js.native
  /**
  	Symbols to use when running on Windows.
  	*/
  val windows: FigureSet = js.native
  /**
  	Replace Unicode symbols depending on the OS.
  	@param string - String where the Unicode symbols will be replaced with fallback symbols depending on the OS.
  	@returns The input with replaced fallback Unicode symbols on Windows.
  	@example
  	```
  	import figures = require('figures');
  	console.log(figures('✔︎ check'));
  	// On non-Windows OSes:  ✔︎ check
  	// On Windows:           √ check
  	console.log(figures.tick);
  	// On non-Windows OSes:  ✔︎
  	// On Windows:           √
  	```
  	*/
  def apply(string: String): String = js.native
}

