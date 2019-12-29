package typings.fundamentalDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  /* Text for the internal anchor tag. */
  var name: js.UndefOr[String] = js.undefined
  /* An anchor tag will be generated and set to the url prop. Name or child text must be provided. */
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: String = null, url: String = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

