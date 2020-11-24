package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PageBackgroundType extends js.Object
/**
  * The kinds of page backgrounds.
  */
@JSGlobal("GoogleAppsScript.Slides.PageBackgroundType")
@js.native
object PageBackgroundType extends js.Object {
  
  @js.native
  sealed trait NONE extends PageBackgroundType
  
  @js.native
  sealed trait PICTURE extends PageBackgroundType
  
  @js.native
  sealed trait SOLID extends PageBackgroundType
  
  @js.native
  sealed trait UNSUPPORTED extends PageBackgroundType
}
