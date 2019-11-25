package typings.emailDashTemplates.emailDashTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  var options: js.UndefOr[ViewOptions] = js.undefined
  /**
    * View root. Defaults to the current working directory's "emails" folder via path.resolve('emails')
    */
  var root: String
}

object View {
  @scala.inline
  def apply(root: String, options: ViewOptions = null): View = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
}

