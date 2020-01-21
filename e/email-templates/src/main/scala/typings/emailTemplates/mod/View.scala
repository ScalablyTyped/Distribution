package typings.emailTemplates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  var options: js.UndefOr[ViewOptions] = js.undefined
  /**
    * View root. Defaults to the current working directory's "emails" folder via path.resolve('emails')
    */
  var root: js.UndefOr[String] = js.undefined
}

object View {
  @scala.inline
  def apply(options: ViewOptions = null, root: String = null): View = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
}

