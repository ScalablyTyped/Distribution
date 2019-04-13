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
  type FancyBoxInteractions = FancyBoxInteractionTypes | FancyBoxInteractionMethod
  type FancyBoxInternationalizationOptions = org.scalablytyped.runtime.StringDictionary[FancyBoxInternationalizatioObject]
  type FancyBoxPlainObject = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Function0[scala.Unit]]
}
