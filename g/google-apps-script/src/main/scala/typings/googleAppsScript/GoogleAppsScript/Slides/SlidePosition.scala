package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SlidePosition extends js.Object
/**
  * The relative position of a Slide.
  */
@JSGlobal("GoogleAppsScript.Slides.SlidePosition")
@js.native
object SlidePosition extends js.Object {
  
  @js.native
  sealed trait FIRST_SLIDE extends SlidePosition
  
  @js.native
  sealed trait LAST_SLIDE extends SlidePosition
  
  @js.native
  sealed trait NEXT_SLIDE extends SlidePosition
  
  @js.native
  sealed trait PREVIOUS_SLIDE extends SlidePosition
}
