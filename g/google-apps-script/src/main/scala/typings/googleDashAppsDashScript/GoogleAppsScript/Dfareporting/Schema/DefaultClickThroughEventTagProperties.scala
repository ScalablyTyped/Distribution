package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultClickThroughEventTagProperties extends js.Object {
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.undefined
  var overrideInheritedEventTag: js.UndefOr[Boolean] = js.undefined
}

object DefaultClickThroughEventTagProperties {
  @scala.inline
  def apply(
    defaultClickThroughEventTagId: String = null,
    overrideInheritedEventTag: js.UndefOr[Boolean] = js.undefined
  ): DefaultClickThroughEventTagProperties = {
    val __obj = js.Dynamic.literal()
    if (defaultClickThroughEventTagId != null) __obj.updateDynamic("defaultClickThroughEventTagId")(defaultClickThroughEventTagId)
    if (!js.isUndefined(overrideInheritedEventTag)) __obj.updateDynamic("overrideInheritedEventTag")(overrideInheritedEventTag)
    __obj.asInstanceOf[DefaultClickThroughEventTagProperties]
  }
}

