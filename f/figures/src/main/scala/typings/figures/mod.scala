package typings.figures

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {None (string : string): string,  readonly main :figures.figures.FigureSet,  readonly windows :figures.figures.FigureSet} & figures.figures.FigureSet */
object mod {
  
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
  inline def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("figures", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("figures", "arrowDown")
  @js.native
  val arrowDown: String = js.native
  
  @JSImport("figures", "arrowLeft")
  @js.native
  val arrowLeft: String = js.native
  
  @JSImport("figures", "arrowRight")
  @js.native
  val arrowRight: String = js.native
  
  @JSImport("figures", "arrowUp")
  @js.native
  val arrowUp: String = js.native
  
  @JSImport("figures", "bullet")
  @js.native
  val bullet: String = js.native
  
  @JSImport("figures", "checkboxCircleOff")
  @js.native
  val checkboxCircleOff: String = js.native
  
  @JSImport("figures", "checkboxCircleOn")
  @js.native
  val checkboxCircleOn: String = js.native
  
  @JSImport("figures", "checkboxOff")
  @js.native
  val checkboxOff: String = js.native
  
  @JSImport("figures", "checkboxOn")
  @js.native
  val checkboxOn: String = js.native
  
  @JSImport("figures", "circle")
  @js.native
  val circle: String = js.native
  
  @JSImport("figures", "circleCircle")
  @js.native
  val circleCircle: String = js.native
  
  @JSImport("figures", "circleCross")
  @js.native
  val circleCross: String = js.native
  
  @JSImport("figures", "circleDotted")
  @js.native
  val circleDotted: String = js.native
  
  @JSImport("figures", "circleDouble")
  @js.native
  val circleDouble: String = js.native
  
  @JSImport("figures", "circleFilled")
  @js.native
  val circleFilled: String = js.native
  
  @JSImport("figures", "circlePipe")
  @js.native
  val circlePipe: String = js.native
  
  @JSImport("figures", "circleQuestionMark")
  @js.native
  val circleQuestionMark: String = js.native
  
  @JSImport("figures", "cross")
  @js.native
  val cross: String = js.native
  
  @JSImport("figures", "dot")
  @js.native
  val dot: String = js.native
  
  @JSImport("figures", "ellipsis")
  @js.native
  val ellipsis: String = js.native
  
  @JSImport("figures", "fiveEighths")
  @js.native
  val fiveEighths: String = js.native
  
  @JSImport("figures", "fiveSixths")
  @js.native
  val fiveSixths: String = js.native
  
  @JSImport("figures", "fourFifths")
  @js.native
  val fourFifths: String = js.native
  
  @JSImport("figures", "hamburger")
  @js.native
  val hamburger: String = js.native
  
  @JSImport("figures", "heart")
  @js.native
  val heart: String = js.native
  
  @JSImport("figures", "info")
  @js.native
  val info: String = js.native
  
  @JSImport("figures", "line")
  @js.native
  val line: String = js.native
  
  /**
  	Symbols to use when not running on Windows.
  	*/
  @JSImport("figures", "main")
  @js.native
  val main: FigureSet = js.native
  
  @JSImport("figures", "mustache")
  @js.native
  val mustache: String = js.native
  
  @JSImport("figures", "nodejs")
  @js.native
  val nodejs: String = js.native
  
  @JSImport("figures", "oneEighth")
  @js.native
  val oneEighth: String = js.native
  
  @JSImport("figures", "oneFifth")
  @js.native
  val oneFifth: String = js.native
  
  @JSImport("figures", "oneHalf")
  @js.native
  val oneHalf: String = js.native
  
  @JSImport("figures", "oneNinth")
  @js.native
  val oneNinth: String = js.native
  
  @JSImport("figures", "oneQuarter")
  @js.native
  val oneQuarter: String = js.native
  
  @JSImport("figures", "oneSeventh")
  @js.native
  val oneSeventh: String = js.native
  
  @JSImport("figures", "oneSixth")
  @js.native
  val oneSixth: String = js.native
  
  @JSImport("figures", "oneTenth")
  @js.native
  val oneTenth: String = js.native
  
  @JSImport("figures", "oneThird")
  @js.native
  val oneThird: String = js.native
  
  @JSImport("figures", "play")
  @js.native
  val play: String = js.native
  
  @JSImport("figures", "pointer")
  @js.native
  val pointer: String = js.native
  
  @JSImport("figures", "pointerSmall")
  @js.native
  val pointerSmall: String = js.native
  
  @JSImport("figures", "questionMarkPrefix")
  @js.native
  val questionMarkPrefix: String = js.native
  
  @JSImport("figures", "radioOff")
  @js.native
  val radioOff: String = js.native
  
  @JSImport("figures", "radioOn")
  @js.native
  val radioOn: String = js.native
  
  @JSImport("figures", "sevenEighth")
  @js.native
  val sevenEighth: String = js.native
  
  @JSImport("figures", "smiley")
  @js.native
  val smiley: String = js.native
  
  @JSImport("figures", "square")
  @js.native
  val square: String = js.native
  
  @JSImport("figures", "squareSmall")
  @js.native
  val squareSmall: String = js.native
  
  @JSImport("figures", "squareSmallFilled")
  @js.native
  val squareSmallFilled: String = js.native
  
  @JSImport("figures", "star")
  @js.native
  val star: String = js.native
  
  @JSImport("figures", "threeEighths")
  @js.native
  val threeEighths: String = js.native
  
  @JSImport("figures", "threeFifths")
  @js.native
  val threeFifths: String = js.native
  
  @JSImport("figures", "threeQuarters")
  @js.native
  val threeQuarters: String = js.native
  
  @JSImport("figures", "tick")
  @js.native
  val tick: String = js.native
  
  @JSImport("figures", "twoFifths")
  @js.native
  val twoFifths: String = js.native
  
  @JSImport("figures", "twoThirds")
  @js.native
  val twoThirds: String = js.native
  
  @JSImport("figures", "warning")
  @js.native
  val warning: String = js.native
  
  /**
  	Symbols to use when running on Windows.
  	*/
  @JSImport("figures", "windows")
  @js.native
  val windows: FigureSet = js.native
  
  trait FigureSet extends StObject {
    
    val arrowDown: String
    
    val arrowLeft: String
    
    val arrowRight: String
    
    val arrowUp: String
    
    val bullet: String
    
    val checkboxCircleOff: String
    
    val checkboxCircleOn: String
    
    val checkboxOff: String
    
    val checkboxOn: String
    
    val circle: String
    
    val circleCircle: String
    
    val circleCross: String
    
    val circleDotted: String
    
    val circleDouble: String
    
    val circleFilled: String
    
    val circlePipe: String
    
    val circleQuestionMark: String
    
    val cross: String
    
    val dot: String
    
    val ellipsis: String
    
    val fiveEighths: String
    
    val fiveSixths: String
    
    val fourFifths: String
    
    val hamburger: String
    
    val heart: String
    
    val info: String
    
    val line: String
    
    val mustache: String
    
    val nodejs: String
    
    val oneEighth: String
    
    val oneFifth: String
    
    val oneHalf: String
    
    val oneNinth: String
    
    val oneQuarter: String
    
    val oneSeventh: String
    
    val oneSixth: String
    
    val oneTenth: String
    
    val oneThird: String
    
    val play: String
    
    val pointer: String
    
    val pointerSmall: String
    
    val questionMarkPrefix: String
    
    val radioOff: String
    
    val radioOn: String
    
    val sevenEighth: String
    
    val smiley: String
    
    val square: String
    
    val squareSmall: String
    
    val squareSmallFilled: String
    
    val star: String
    
    val threeEighths: String
    
    val threeFifths: String
    
    val threeQuarters: String
    
    val tick: String
    
    val twoFifths: String
    
    val twoThirds: String
    
    val warning: String
  }
  object FigureSet {
    
    inline def apply(
      arrowDown: String,
      arrowLeft: String,
      arrowRight: String,
      arrowUp: String,
      bullet: String,
      checkboxCircleOff: String,
      checkboxCircleOn: String,
      checkboxOff: String,
      checkboxOn: String,
      circle: String,
      circleCircle: String,
      circleCross: String,
      circleDotted: String,
      circleDouble: String,
      circleFilled: String,
      circlePipe: String,
      circleQuestionMark: String,
      cross: String,
      dot: String,
      ellipsis: String,
      fiveEighths: String,
      fiveSixths: String,
      fourFifths: String,
      hamburger: String,
      heart: String,
      info: String,
      line: String,
      mustache: String,
      nodejs: String,
      oneEighth: String,
      oneFifth: String,
      oneHalf: String,
      oneNinth: String,
      oneQuarter: String,
      oneSeventh: String,
      oneSixth: String,
      oneTenth: String,
      oneThird: String,
      play: String,
      pointer: String,
      pointerSmall: String,
      questionMarkPrefix: String,
      radioOff: String,
      radioOn: String,
      sevenEighth: String,
      smiley: String,
      square: String,
      squareSmall: String,
      squareSmallFilled: String,
      star: String,
      threeEighths: String,
      threeFifths: String,
      threeQuarters: String,
      tick: String,
      twoFifths: String,
      twoThirds: String,
      warning: String
    ): FigureSet = {
      val __obj = js.Dynamic.literal(arrowDown = arrowDown.asInstanceOf[js.Any], arrowLeft = arrowLeft.asInstanceOf[js.Any], arrowRight = arrowRight.asInstanceOf[js.Any], arrowUp = arrowUp.asInstanceOf[js.Any], bullet = bullet.asInstanceOf[js.Any], checkboxCircleOff = checkboxCircleOff.asInstanceOf[js.Any], checkboxCircleOn = checkboxCircleOn.asInstanceOf[js.Any], checkboxOff = checkboxOff.asInstanceOf[js.Any], checkboxOn = checkboxOn.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], circleCircle = circleCircle.asInstanceOf[js.Any], circleCross = circleCross.asInstanceOf[js.Any], circleDotted = circleDotted.asInstanceOf[js.Any], circleDouble = circleDouble.asInstanceOf[js.Any], circleFilled = circleFilled.asInstanceOf[js.Any], circlePipe = circlePipe.asInstanceOf[js.Any], circleQuestionMark = circleQuestionMark.asInstanceOf[js.Any], cross = cross.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], ellipsis = ellipsis.asInstanceOf[js.Any], fiveEighths = fiveEighths.asInstanceOf[js.Any], fiveSixths = fiveSixths.asInstanceOf[js.Any], fourFifths = fourFifths.asInstanceOf[js.Any], hamburger = hamburger.asInstanceOf[js.Any], heart = heart.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], mustache = mustache.asInstanceOf[js.Any], nodejs = nodejs.asInstanceOf[js.Any], oneEighth = oneEighth.asInstanceOf[js.Any], oneFifth = oneFifth.asInstanceOf[js.Any], oneHalf = oneHalf.asInstanceOf[js.Any], oneNinth = oneNinth.asInstanceOf[js.Any], oneQuarter = oneQuarter.asInstanceOf[js.Any], oneSeventh = oneSeventh.asInstanceOf[js.Any], oneSixth = oneSixth.asInstanceOf[js.Any], oneTenth = oneTenth.asInstanceOf[js.Any], oneThird = oneThird.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], pointerSmall = pointerSmall.asInstanceOf[js.Any], questionMarkPrefix = questionMarkPrefix.asInstanceOf[js.Any], radioOff = radioOff.asInstanceOf[js.Any], radioOn = radioOn.asInstanceOf[js.Any], sevenEighth = sevenEighth.asInstanceOf[js.Any], smiley = smiley.asInstanceOf[js.Any], square = square.asInstanceOf[js.Any], squareSmall = squareSmall.asInstanceOf[js.Any], squareSmallFilled = squareSmallFilled.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], threeEighths = threeEighths.asInstanceOf[js.Any], threeFifths = threeFifths.asInstanceOf[js.Any], threeQuarters = threeQuarters.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], twoFifths = twoFifths.asInstanceOf[js.Any], twoThirds = twoThirds.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[FigureSet]
    }
    
    extension [Self <: FigureSet](x: Self) {
      
      inline def setArrowDown(value: String): Self = StObject.set(x, "arrowDown", value.asInstanceOf[js.Any])
      
      inline def setArrowLeft(value: String): Self = StObject.set(x, "arrowLeft", value.asInstanceOf[js.Any])
      
      inline def setArrowRight(value: String): Self = StObject.set(x, "arrowRight", value.asInstanceOf[js.Any])
      
      inline def setArrowUp(value: String): Self = StObject.set(x, "arrowUp", value.asInstanceOf[js.Any])
      
      inline def setBullet(value: String): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      inline def setCheckboxCircleOff(value: String): Self = StObject.set(x, "checkboxCircleOff", value.asInstanceOf[js.Any])
      
      inline def setCheckboxCircleOn(value: String): Self = StObject.set(x, "checkboxCircleOn", value.asInstanceOf[js.Any])
      
      inline def setCheckboxOff(value: String): Self = StObject.set(x, "checkboxOff", value.asInstanceOf[js.Any])
      
      inline def setCheckboxOn(value: String): Self = StObject.set(x, "checkboxOn", value.asInstanceOf[js.Any])
      
      inline def setCircle(value: String): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleCircle(value: String): Self = StObject.set(x, "circleCircle", value.asInstanceOf[js.Any])
      
      inline def setCircleCross(value: String): Self = StObject.set(x, "circleCross", value.asInstanceOf[js.Any])
      
      inline def setCircleDotted(value: String): Self = StObject.set(x, "circleDotted", value.asInstanceOf[js.Any])
      
      inline def setCircleDouble(value: String): Self = StObject.set(x, "circleDouble", value.asInstanceOf[js.Any])
      
      inline def setCircleFilled(value: String): Self = StObject.set(x, "circleFilled", value.asInstanceOf[js.Any])
      
      inline def setCirclePipe(value: String): Self = StObject.set(x, "circlePipe", value.asInstanceOf[js.Any])
      
      inline def setCircleQuestionMark(value: String): Self = StObject.set(x, "circleQuestionMark", value.asInstanceOf[js.Any])
      
      inline def setCross(value: String): Self = StObject.set(x, "cross", value.asInstanceOf[js.Any])
      
      inline def setDot(value: String): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setEllipsis(value: String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setFiveEighths(value: String): Self = StObject.set(x, "fiveEighths", value.asInstanceOf[js.Any])
      
      inline def setFiveSixths(value: String): Self = StObject.set(x, "fiveSixths", value.asInstanceOf[js.Any])
      
      inline def setFourFifths(value: String): Self = StObject.set(x, "fourFifths", value.asInstanceOf[js.Any])
      
      inline def setHamburger(value: String): Self = StObject.set(x, "hamburger", value.asInstanceOf[js.Any])
      
      inline def setHeart(value: String): Self = StObject.set(x, "heart", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMustache(value: String): Self = StObject.set(x, "mustache", value.asInstanceOf[js.Any])
      
      inline def setNodejs(value: String): Self = StObject.set(x, "nodejs", value.asInstanceOf[js.Any])
      
      inline def setOneEighth(value: String): Self = StObject.set(x, "oneEighth", value.asInstanceOf[js.Any])
      
      inline def setOneFifth(value: String): Self = StObject.set(x, "oneFifth", value.asInstanceOf[js.Any])
      
      inline def setOneHalf(value: String): Self = StObject.set(x, "oneHalf", value.asInstanceOf[js.Any])
      
      inline def setOneNinth(value: String): Self = StObject.set(x, "oneNinth", value.asInstanceOf[js.Any])
      
      inline def setOneQuarter(value: String): Self = StObject.set(x, "oneQuarter", value.asInstanceOf[js.Any])
      
      inline def setOneSeventh(value: String): Self = StObject.set(x, "oneSeventh", value.asInstanceOf[js.Any])
      
      inline def setOneSixth(value: String): Self = StObject.set(x, "oneSixth", value.asInstanceOf[js.Any])
      
      inline def setOneTenth(value: String): Self = StObject.set(x, "oneTenth", value.asInstanceOf[js.Any])
      
      inline def setOneThird(value: String): Self = StObject.set(x, "oneThird", value.asInstanceOf[js.Any])
      
      inline def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      inline def setPointer(value: String): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setPointerSmall(value: String): Self = StObject.set(x, "pointerSmall", value.asInstanceOf[js.Any])
      
      inline def setQuestionMarkPrefix(value: String): Self = StObject.set(x, "questionMarkPrefix", value.asInstanceOf[js.Any])
      
      inline def setRadioOff(value: String): Self = StObject.set(x, "radioOff", value.asInstanceOf[js.Any])
      
      inline def setRadioOn(value: String): Self = StObject.set(x, "radioOn", value.asInstanceOf[js.Any])
      
      inline def setSevenEighth(value: String): Self = StObject.set(x, "sevenEighth", value.asInstanceOf[js.Any])
      
      inline def setSmiley(value: String): Self = StObject.set(x, "smiley", value.asInstanceOf[js.Any])
      
      inline def setSquare(value: String): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareSmall(value: String): Self = StObject.set(x, "squareSmall", value.asInstanceOf[js.Any])
      
      inline def setSquareSmallFilled(value: String): Self = StObject.set(x, "squareSmallFilled", value.asInstanceOf[js.Any])
      
      inline def setStar(value: String): Self = StObject.set(x, "star", value.asInstanceOf[js.Any])
      
      inline def setThreeEighths(value: String): Self = StObject.set(x, "threeEighths", value.asInstanceOf[js.Any])
      
      inline def setThreeFifths(value: String): Self = StObject.set(x, "threeFifths", value.asInstanceOf[js.Any])
      
      inline def setThreeQuarters(value: String): Self = StObject.set(x, "threeQuarters", value.asInstanceOf[js.Any])
      
      inline def setTick(value: String): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
      
      inline def setTwoFifths(value: String): Self = StObject.set(x, "twoFifths", value.asInstanceOf[js.Any])
      
      inline def setTwoThirds(value: String): Self = StObject.set(x, "twoThirds", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
}
