package typings.atFormatjsIntlDashRelativetimeformat.distTypesMod

import typings.atFormatjsIntlDashRelativetimeformat.Anon_0
import typings.atFormatjsIntlDashRelativetimeformat.Anon_Future
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldData extends js.Object {
  var displayName: String
  var relative: Anon_0
  var relativePeriod: js.UndefOr[String] = js.undefined
  var relativeTime: Anon_Future
}

object FieldData {
  @scala.inline
  def apply(displayName: String, relative: Anon_0, relativeTime: Anon_Future, relativePeriod: String = null): FieldData = {
    val __obj = js.Dynamic.literal(displayName = displayName, relative = relative, relativeTime = relativeTime)
    if (relativePeriod != null) __obj.updateDynamic("relativePeriod")(relativePeriod)
    __obj.asInstanceOf[FieldData]
  }
}

