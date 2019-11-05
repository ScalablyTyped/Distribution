package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageStyle extends js.Object

/**
  * An enum that defines an image cropping style.
  */
@JSGlobal("GoogleAppsScript.Card_Service.ImageStyle")
@js.native
object ImageStyle extends js.Object {
  @js.native
  sealed trait CIRCLE extends ImageStyle
  
  @js.native
  sealed trait SQUARE extends ImageStyle
  
  /* 1 */ val CIRCLE: typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.ImageStyle.CIRCLE with Double = js.native
  /* 0 */ val SQUARE: typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.ImageStyle.SQUARE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageStyle with Double] = js.native
}

