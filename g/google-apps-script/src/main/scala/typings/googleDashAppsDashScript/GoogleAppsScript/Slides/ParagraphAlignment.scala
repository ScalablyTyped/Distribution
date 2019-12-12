package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ParagraphAlignment.CENTER
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ParagraphAlignment.END
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ParagraphAlignment.JUSTIFIED
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ParagraphAlignment.START
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ParagraphAlignment.UNSUPPORTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphAlignment extends js.Object

/**
  * The types of text alignment for a paragraph.
  */
@JSGlobal("GoogleAppsScript.Slides.ParagraphAlignment")
@js.native
object ParagraphAlignment extends js.Object {
  @js.native
  sealed trait CENTER extends ParagraphAlignment
  
  @js.native
  sealed trait END extends ParagraphAlignment
  
  @js.native
  sealed trait JUSTIFIED extends ParagraphAlignment
  
  @js.native
  sealed trait START extends ParagraphAlignment
  
  @js.native
  sealed trait UNSUPPORTED extends ParagraphAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphAlignment with Double] = js.native
  /* 2 */ @js.native
  object CENTER extends TopLevel[CENTER with Double]
  
  /* 3 */ @js.native
  object END extends TopLevel[END with Double]
  
  /* 4 */ @js.native
  object JUSTIFIED extends TopLevel[JUSTIFIED with Double]
  
  /* 1 */ @js.native
  object START extends TopLevel[START with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

