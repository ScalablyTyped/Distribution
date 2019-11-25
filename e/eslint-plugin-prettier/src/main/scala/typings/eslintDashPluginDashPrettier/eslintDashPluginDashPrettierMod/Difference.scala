package typings.eslintDashPluginDashPrettier.eslintDashPluginDashPrettierMod

import typings.eslintDashPluginDashPrettier.eslintDashPluginDashPrettierStrings.delete
import typings.eslintDashPluginDashPrettier.eslintDashPluginDashPrettierStrings.insert
import typings.eslintDashPluginDashPrettier.eslintDashPluginDashPrettierStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Difference extends js.Object {
  var deleteText: js.UndefOr[String] = js.undefined
  var insertText: js.UndefOr[String] = js.undefined
  var offset: Double
  var operation: insert | delete | replace
}

object Difference {
  @scala.inline
  def apply(
    offset: Double,
    operation: insert | delete | replace,
    deleteText: String = null,
    insertText: String = null
  ): Difference = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    if (deleteText != null) __obj.updateDynamic("deleteText")(deleteText.asInstanceOf[js.Any])
    if (insertText != null) __obj.updateDynamic("insertText")(insertText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Difference]
  }
}

