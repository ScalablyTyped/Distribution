package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fancyboxLib {
  type FancyBoxInteractionMethod = js.Function2[
    /* slide */ js.UndefOr[FancyBoxSlide], 
    /* event */ js.UndefOr[jqueryLib.JQueryNs.Event], 
    FancyBoxInteractionTypes
  ]
  type FancyBoxInteractionTypes = fancyboxLib.fancyboxLibStrings.close | fancyboxLib.fancyboxLibStrings.next | fancyboxLib.fancyboxLibStrings.nextOrClose | fancyboxLib.fancyboxLibStrings.toggleControls | fancyboxLib.fancyboxLibStrings.zoom | fancyboxLib.fancyboxLibNumbers.`false`
  type FancyBoxInteractions = FancyBoxInteractionTypes | FancyBoxInteractionMethod
}
