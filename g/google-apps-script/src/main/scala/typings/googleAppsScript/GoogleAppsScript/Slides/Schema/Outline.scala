package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Outline extends js.Object {
  var dashStyle: js.UndefOr[String] = js.undefined
  var outlineFill: js.UndefOr[OutlineFill] = js.undefined
  var propertyState: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Dimension] = js.undefined
}

object Outline {
  @scala.inline
  def apply(
    dashStyle: String = null,
    outlineFill: OutlineFill = null,
    propertyState: String = null,
    weight: Dimension = null
  ): Outline = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (outlineFill != null) __obj.updateDynamic("outlineFill")(outlineFill.asInstanceOf[js.Any])
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outline]
  }
}

