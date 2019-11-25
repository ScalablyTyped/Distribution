package typings.fundamentalDashReact.libBreadcrumbBreadcrumbMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbItemProps
  extends /* x */ StringDictionary[js.Any] {
  /* Text for the internal anchor tag. */
  var name: js.UndefOr[String] = js.undefined
  /* An anchor tag will be generated and set to the url prop. Name or child text must be provided. */
  var url: js.UndefOr[String] = js.undefined
}

object BreadcrumbItemProps {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[js.Any] = null, name: String = null, url: String = null): BreadcrumbItemProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbItemProps]
  }
}

