package typings.googleAppsScript.GoogleAppsScript.Slides

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
  
}

