package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetsChartEmbedType extends js.Object

/**
  * The Sheets chart's embed type.
  */
@JSGlobal("GoogleAppsScript.Slides.SheetsChartEmbedType")
@js.native
object SheetsChartEmbedType extends js.Object {
  @js.native
  sealed trait IMAGE extends SheetsChartEmbedType
  
  @js.native
  sealed trait UNSUPPORTED extends SheetsChartEmbedType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SheetsChartEmbedType with Double] = js.native
  /* 1 */ @js.native
  object IMAGE extends TopLevel[IMAGE with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

