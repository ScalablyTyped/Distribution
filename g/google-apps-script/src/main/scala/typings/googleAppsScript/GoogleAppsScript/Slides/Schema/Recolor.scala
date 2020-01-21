package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recolor extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var recolorStops: js.UndefOr[js.Array[ColorStop]] = js.undefined
}

object Recolor {
  @scala.inline
  def apply(name: String = null, recolorStops: js.Array[ColorStop] = null): Recolor = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recolorStops != null) __obj.updateDynamic("recolorStops")(recolorStops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recolor]
  }
}

