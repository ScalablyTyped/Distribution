package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FillType extends js.Object
/**
  * The kinds of fill.
  */
@JSGlobal("GoogleAppsScript.Slides.FillType")
@js.native
object FillType extends js.Object {
  
  @js.native
  sealed trait NONE extends FillType
  
  @js.native
  sealed trait SOLID extends FillType
  
  @js.native
  sealed trait UNSUPPORTED extends FillType
}
