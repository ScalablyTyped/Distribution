package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PageElementType extends js.Object
/**
  * The page element type.
  */
@JSGlobal("GoogleAppsScript.Slides.PageElementType")
@js.native
object PageElementType extends js.Object {
  
  @js.native
  sealed trait GROUP extends PageElementType
  
  @js.native
  sealed trait IMAGE extends PageElementType
  
  @js.native
  sealed trait LINE extends PageElementType
  
  @js.native
  sealed trait SHAPE extends PageElementType
  
  @js.native
  sealed trait SHEETS_CHART extends PageElementType
  
  @js.native
  sealed trait TABLE extends PageElementType
  
  @js.native
  sealed trait UNSUPPORTED extends PageElementType
  
  @js.native
  sealed trait VIDEO extends PageElementType
  
  @js.native
  sealed trait WORD_ART extends PageElementType
}
