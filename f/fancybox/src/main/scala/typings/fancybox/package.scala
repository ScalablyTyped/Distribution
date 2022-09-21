package typings.fancybox

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type FancyBoxInteractionMethod = js.Function2[
/* slide */ js.UndefOr[FancyBoxSlide], 
/* event */ js.UndefOr[Event], 
FancyBoxInteractionTypes]

type FancyBoxInteractions = FancyBoxInteractionTypes | FancyBoxInteractionMethod

type FancyBoxInternationalizationOptions = StringDictionary[FancyBoxInternationalizatioObject]

type FancyBoxPlainObject = StringDictionary[String | Double | Boolean | js.Function0[Unit]]
