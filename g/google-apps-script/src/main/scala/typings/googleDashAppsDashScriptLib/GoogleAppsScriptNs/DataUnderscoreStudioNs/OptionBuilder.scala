package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionBuilder extends js.Object {
  def setLabel(label: java.lang.String): OptionBuilder
  def setValue(value: java.lang.String): OptionBuilder
}

object OptionBuilder {
  @scala.inline
  def apply(
    setLabel: js.Function1[java.lang.String, OptionBuilder],
    setValue: js.Function1[java.lang.String, OptionBuilder]
  ): OptionBuilder = {
    val __obj = js.Dynamic.literal(setLabel = setLabel, setValue = setValue)
  
    __obj.asInstanceOf[OptionBuilder]
  }
}

