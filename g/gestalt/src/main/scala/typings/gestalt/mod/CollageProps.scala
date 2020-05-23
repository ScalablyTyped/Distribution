package typings.gestalt.mod

import typings.gestalt.anon.Height
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
  def renderImage(args: Height): ReactNode
}

object CollageProps {
  @scala.inline
  def apply(
    columns: Double,
    height: Double,
    renderImage: Height => ReactNode,
    width: Double,
    cover: js.UndefOr[Boolean] = js.undefined,
    gutter: js.UndefOr[Double] = js.undefined,
    layoutKey: js.UndefOr[Double] = js.undefined
  ): CollageProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], renderImage = js.Any.fromFunction1(renderImage), width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(cover)) __obj.updateDynamic("cover")(cover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gutter)) __obj.updateDynamic("gutter")(gutter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(layoutKey)) __obj.updateDynamic("layoutKey")(layoutKey.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollageProps]
  }
}

