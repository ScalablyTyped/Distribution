package typings.devextreme

import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.centerBottom
import typings.devextreme.devextremeStrings.centerTop
import typings.devextreme.devextremeStrings.full
import typings.devextreme.devextremeStrings.leftBottom
import typings.devextreme.devextremeStrings.leftCenter
import typings.devextreme.devextremeStrings.leftTop
import typings.devextreme.devextremeStrings.rightBottom
import typings.devextreme.devextremeStrings.rightCenter
import typings.devextreme.devextremeStrings.rightTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocationUrl extends js.Object {
  var location: js.UndefOr[
    center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop
  ] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonLocationUrl {
  @scala.inline
  def apply(
    location: center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop = null,
    url: String = null
  ): AnonLocationUrl = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocationUrl]
  }
}

