package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageStyle with Double] = js.native
  /* 1 */ @js.native
  object CIRCLE extends TopLevel[CIRCLE with Double]
  
  /* 0 */ @js.native
  object SQUARE extends TopLevel[SQUARE with Double]
  
}

