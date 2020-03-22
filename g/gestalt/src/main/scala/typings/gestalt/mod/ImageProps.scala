package typings.gestalt.mod

import typings.gestalt.gestaltStrings.`lazy`
import typings.gestalt.gestaltStrings.auto
import typings.gestalt.gestaltStrings.contain
import typings.gestalt.gestaltStrings.cover
import typings.gestalt.gestaltStrings.eager
import typings.gestalt.gestaltStrings.high
import typings.gestalt.gestaltStrings.low
import typings.gestalt.gestaltStrings.none
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps extends js.Object {
  var alt: String
  var children: js.UndefOr[ReactNode] = js.undefined
  var color: String
  var fit: js.UndefOr[cover | contain | none] = js.undefined
  var importance: js.UndefOr[high | low | auto] = js.undefined
  var loading: js.UndefOr[eager | `lazy` | auto] = js.undefined
  var naturalHeight: Double
  var naturalWidth: Double
  var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var src: String
  var srcSet: js.UndefOr[String] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    alt: String,
    color: String,
    naturalHeight: Double,
    naturalWidth: Double,
    src: String,
    children: ReactNode = null,
    fit: cover | contain | none = null,
    importance: high | low | auto = null,
    loading: eager | `lazy` | auto = null,
    onError: () => Unit = null,
    onLoad: () => Unit = null,
    sizes: String = null,
    srcSet: String = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (importance != null) __obj.updateDynamic("importance")(importance.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
}

