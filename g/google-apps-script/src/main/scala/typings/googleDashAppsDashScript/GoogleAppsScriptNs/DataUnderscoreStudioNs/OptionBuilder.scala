package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionBuilder extends js.Object {
  def setLabel(label: String): OptionBuilder
  def setValue(value: String): OptionBuilder
}

object OptionBuilder {
  @scala.inline
  def apply(setLabel: String => OptionBuilder, setValue: String => OptionBuilder): OptionBuilder = {
    val __obj = js.Dynamic.literal(setLabel = js.Any.fromFunction1(setLabel), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[OptionBuilder]
  }
}

