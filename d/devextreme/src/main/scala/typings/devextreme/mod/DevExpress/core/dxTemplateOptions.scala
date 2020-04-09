package typings.devextreme.mod.DevExpress.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTemplateOptions extends js.Object {
  /** @name dxTemplate.Options.name */
  var name: js.UndefOr[String] = js.undefined
}

object dxTemplateOptions {
  @scala.inline
  def apply(name: String = null): dxTemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTemplateOptions]
  }
}

