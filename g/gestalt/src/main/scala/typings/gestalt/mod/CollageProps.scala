package typings.gestalt.mod

import typings.gestalt.AnonHeight
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollageProps extends js.Object {
  var columns: Double
  var cover: js.UndefOr[Boolean] = js.undefined
  var gutter: js.UndefOr[Double] = js.undefined
  var height: Double
  var layoutKey: js.UndefOr[Double] = js.undefined
  var width: Double
  def renderImage(args: AnonHeight): ReactNode
}

object CollageProps {
  @scala.inline
  def apply(
    columns: Double,
    height: Double,
    renderImage: AnonHeight => ReactNode,
    width: Double,
    cover: js.UndefOr[Boolean] = js.undefined,
    gutter: Int | Double = null,
    layoutKey: Int | Double = null
  ): CollageProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], renderImage = js.Any.fromFunction1(renderImage), width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(cover)) __obj.updateDynamic("cover")(cover.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (layoutKey != null) __obj.updateDynamic("layoutKey")(layoutKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollageProps]
  }
}

