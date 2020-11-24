package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextBaselineOffset extends js.Object
/**
  * The text vertical offset from its normal position.
  */
@JSGlobal("GoogleAppsScript.Slides.TextBaselineOffset")
@js.native
object TextBaselineOffset extends js.Object {
  
  @js.native
  sealed trait NONE extends TextBaselineOffset
  
  @js.native
  sealed trait SUBSCRIPT extends TextBaselineOffset
  
  @js.native
  sealed trait SUPERSCRIPT extends TextBaselineOffset
  
  @js.native
  sealed trait UNSUPPORTED extends TextBaselineOffset
}
