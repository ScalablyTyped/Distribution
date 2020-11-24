package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SlideLinkingMode extends js.Object
/**
  * The mode of links between slides.
  */
@JSGlobal("GoogleAppsScript.Slides.SlideLinkingMode")
@js.native
object SlideLinkingMode extends js.Object {
  
  @js.native
  sealed trait LINKED extends SlideLinkingMode
  
  @js.native
  sealed trait NOT_LINKED extends SlideLinkingMode
  
  @js.native
  sealed trait UNSUPPORTED extends SlideLinkingMode
}
