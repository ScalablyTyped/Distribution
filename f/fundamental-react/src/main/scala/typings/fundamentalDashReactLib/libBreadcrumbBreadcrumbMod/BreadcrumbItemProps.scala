package typings
package fundamentalDashReactLib.libBreadcrumbBreadcrumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbItemProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* Text for the internal anchor tag. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /* An anchor tag will be generated and set to the url prop. Name or child text must be provided. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object BreadcrumbItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    name: java.lang.String = null,
    url: java.lang.String = null
  ): BreadcrumbItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BreadcrumbItemProps]
  }
}

