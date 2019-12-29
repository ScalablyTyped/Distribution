package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineCategory extends js.Object

/**
  * The line category.
  *
  * The exact LineType created is determined based on the category and how it's routed to
  * connect to other page elements.
  */
@JSGlobal("GoogleAppsScript.Slides.LineCategory")
@js.native
object LineCategory extends js.Object {
  @js.native
  sealed trait BENT extends LineCategory
  
  @js.native
  sealed trait CURVED extends LineCategory
  
  @js.native
  sealed trait STRAIGHT extends LineCategory
  
  @js.native
  sealed trait UNSUPPORTED extends LineCategory
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineCategory with Double] = js.native
  /* 2 */ @js.native
  object BENT extends TopLevel[BENT with Double]
  
  /* 3 */ @js.native
  object CURVED extends TopLevel[CURVED with Double]
  
  /* 1 */ @js.native
  object STRAIGHT extends TopLevel[STRAIGHT with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

