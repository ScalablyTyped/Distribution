package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AlignmentPosition extends js.Object
/**
  * The alignment position to apply.
  */
@JSGlobal("GoogleAppsScript.Slides.AlignmentPosition")
@js.native
object AlignmentPosition extends js.Object {
  
  @js.native
  sealed trait CENTER extends AlignmentPosition
  
  @js.native
  sealed trait HORIZONTAL_CENTER extends AlignmentPosition
  
  @js.native
  sealed trait VERTICAL_CENTER extends AlignmentPosition
}
