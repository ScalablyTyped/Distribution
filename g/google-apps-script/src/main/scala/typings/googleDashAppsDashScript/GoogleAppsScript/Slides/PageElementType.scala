package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageElementType with Double] = js.native
  /* 5 */ @js.native
  object GROUP extends TopLevel[GROUP with Double]
  
  /* 2 */ @js.native
  object IMAGE extends TopLevel[IMAGE with Double]
  
  /* 6 */ @js.native
  object LINE extends TopLevel[LINE with Double]
  
  /* 1 */ @js.native
  object SHAPE extends TopLevel[SHAPE with Double]
  
  /* 8 */ @js.native
  object SHEETS_CHART extends TopLevel[SHEETS_CHART with Double]
  
  /* 4 */ @js.native
  object TABLE extends TopLevel[TABLE with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
  /* 3 */ @js.native
  object VIDEO extends TopLevel[VIDEO with Double]
  
  /* 7 */ @js.native
  object WORD_ART extends TopLevel[WORD_ART with Double]
  
}

