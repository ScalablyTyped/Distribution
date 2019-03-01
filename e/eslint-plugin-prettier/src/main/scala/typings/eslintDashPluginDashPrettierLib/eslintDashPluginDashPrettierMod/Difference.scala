package typings
package eslintDashPluginDashPrettierLib.eslintDashPluginDashPrettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Difference extends js.Object {
  var deleteText: js.UndefOr[java.lang.String] = js.undefined
  var insertText: js.UndefOr[java.lang.String] = js.undefined
  var offset: scala.Double
  var operation: eslintDashPluginDashPrettierLib.eslintDashPluginDashPrettierLibStrings.insert | eslintDashPluginDashPrettierLib.eslintDashPluginDashPrettierLibStrings.delete | eslintDashPluginDashPrettierLib.eslintDashPluginDashPrettierLibStrings.replace
}

object Difference {
  @scala.inline
  def apply(
    offset: scala.Double,
    operation: eslintDashPluginDashPrettierLib.eslintDashPluginDashPrettierLibStrings.insert | eslintDashPluginDashPrettierLib.eslintDashPluginDashPrettierLibStrings.delete | eslintDashPluginDashPrettierLib.eslintDashPluginDashPrettierLibStrings.replace,
    deleteText: java.lang.String = null,
    insertText: java.lang.String = null
  ): Difference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (deleteText != null) __obj.updateDynamic("deleteText")(deleteText)
    if (insertText != null) __obj.updateDynamic("insertText")(insertText)
    __obj.asInstanceOf[Difference]
  }
}

