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

@js.native
trait ImageProps extends js.Object {
  var alt: String = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var color: String = js.native
  var fit: js.UndefOr[cover | contain | none] = js.native
  var importance: js.UndefOr[high | low | auto] = js.native
  var loading: js.UndefOr[eager | `lazy` | auto] = js.native
  var naturalHeight: Double = js.native
  var naturalWidth: Double = js.native
  var onError: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var sizes: js.UndefOr[String] = js.native
  var src: String = js.native
  var srcSet: js.UndefOr[String] = js.native
}

object ImageProps {
  @scala.inline
  def apply(alt: String, color: String, naturalHeight: Double, naturalWidth: Double, src: String): ImageProps = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
  @scala.inline
  implicit class ImagePropsOps[Self <: ImageProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setNaturalHeight(value: Double): Self = this.set("naturalHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setNaturalWidth(value: Double): Self = this.set("naturalWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setFit(value: cover | contain | none): Self = this.set("fit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    @scala.inline
    def setImportance(value: high | low | auto): Self = this.set("importance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
    @scala.inline
    def setLoading(value: eager | `lazy` | auto): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setOnError(value: () => Unit): Self = this.set("onError", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setSrcSet(value: String): Self = this.set("srcSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcSet: Self = this.set("srcSet", js.undefined)
  }
  
}

