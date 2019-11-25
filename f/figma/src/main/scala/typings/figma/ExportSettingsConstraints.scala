package typings.figma

import typings.figma.figmaStrings.HEIGHT
import typings.figma.figmaStrings.SCALE
import typings.figma.figmaStrings.WIDTH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettingsConstraints extends js.Object {
  var `type`: SCALE | WIDTH | HEIGHT
  var value: Double
}

object ExportSettingsConstraints {
  @scala.inline
  def apply(`type`: SCALE | WIDTH | HEIGHT, value: Double): ExportSettingsConstraints = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsConstraints]
  }
}

