package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fancybox {
  import org.scalablytyped.runtime.StringDictionary
  import typings.jquery.JQuery.Event

  type FancyBoxInteractionMethod = js.Function2[
    /* slide */ js.UndefOr[FancyBoxSlide], 
    /* event */ js.UndefOr[Event], 
    FancyBoxInteractionTypes
  ]
  type FancyBoxInteractions = FancyBoxInteractionTypes | FancyBoxInteractionMethod
  type FancyBoxInternationalizationOptions = StringDictionary[FancyBoxInternationalizatioObject]
  type FancyBoxPlainObject = StringDictionary[String | Double | Boolean | js.Function0[Unit]]
}
