package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A solid color fill.
  *
  * SolidFill objects are detached and immutable, so do not reflect changes made after
  * they have been created.
  */
trait SolidFill extends js.Object {
  def getAlpha(): Double
  def getColor(): Color
}

object SolidFill {
  @scala.inline
  def apply(getAlpha: () => Double, getColor: () => Color): SolidFill = {
    val __obj = js.Dynamic.literal(getAlpha = js.Any.fromFunction0(getAlpha), getColor = js.Any.fromFunction0(getColor))
  
    __obj.asInstanceOf[SolidFill]
  }
}

