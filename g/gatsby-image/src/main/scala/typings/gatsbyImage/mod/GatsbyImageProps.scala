package typings.gatsbyImage.mod

import typings.gatsbyImage.anon.WasCached
import typings.gatsbyImage.gatsbyImageStrings.`lazy`
import typings.gatsbyImage.gatsbyImageStrings.auto
import typings.gatsbyImage.gatsbyImageStrings.eager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbyImageProps extends js.Object {
  var Tag: js.UndefOr[String] = js.native
  var alt: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[String | Boolean] = js.native
  var className: js.UndefOr[String | js.Object] = js.native
  var critical: js.UndefOr[Boolean] = js.native
  var crossOrigin: js.UndefOr[String | Boolean] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var durationFadeIn: js.UndefOr[Double] = js.native
  var fadeIn: js.UndefOr[Boolean] = js.native
  var fixed: js.UndefOr[FixedObject | js.Array[FixedObject]] = js.native
  var fluid: js.UndefOr[FluidObject | js.Array[FluidObject]] = js.native
  var imgStyle: js.UndefOr[js.Object] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var loading: js.UndefOr[auto | `lazy` | eager] = js.native
  var onError: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var onStartLoad: js.UndefOr[js.Function1[/* param */ WasCached, Unit]] = js.native
  var placeholderClassName: js.UndefOr[String] = js.native
  var placeholderStyle: js.UndefOr[js.Object] = js.native
  var resolutions: js.UndefOr[FixedObject] = js.native
  var sizes: js.UndefOr[FluidObject] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var title: js.UndefOr[String] = js.native
}

object GatsbyImageProps {
  @scala.inline
  def apply(): GatsbyImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatsbyImageProps]
  }
  @scala.inline
  implicit class GatsbyImagePropsOps[Self <: GatsbyImageProps] (val x: Self) extends AnyVal {
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
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String | Boolean): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setClassName(value: String | js.Object): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCritical(value: Boolean): Self = this.set("critical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCritical: Self = this.set("critical", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String | Boolean): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setDurationFadeIn(value: Double): Self = this.set("durationFadeIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationFadeIn: Self = this.set("durationFadeIn", js.undefined)
    @scala.inline
    def setFadeIn(value: Boolean): Self = this.set("fadeIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeIn: Self = this.set("fadeIn", js.undefined)
    @scala.inline
    def setFixedVarargs(value: FixedObject*): Self = this.set("fixed", js.Array(value :_*))
    @scala.inline
    def setFixed(value: FixedObject | js.Array[FixedObject]): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setFluidVarargs(value: FluidObject*): Self = this.set("fluid", js.Array(value :_*))
    @scala.inline
    def setFluid(value: FluidObject | js.Array[FluidObject]): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    @scala.inline
    def setImgStyle(value: js.Object): Self = this.set("imgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgStyle: Self = this.set("imgStyle", js.undefined)
    @scala.inline
    def setItemProp(value: String): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", js.undefined)
    @scala.inline
    def setLoading(value: auto | `lazy` | eager): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setOnError(value: /* event */ js.Any => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnStartLoad(value: /* param */ WasCached => Unit): Self = this.set("onStartLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStartLoad: Self = this.set("onStartLoad", js.undefined)
    @scala.inline
    def setPlaceholderClassName(value: String): Self = this.set("placeholderClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderClassName: Self = this.set("placeholderClassName", js.undefined)
    @scala.inline
    def setPlaceholderStyle(value: js.Object): Self = this.set("placeholderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderStyle: Self = this.set("placeholderStyle", js.undefined)
    @scala.inline
    def setResolutions(value: FixedObject): Self = this.set("resolutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutions: Self = this.set("resolutions", js.undefined)
    @scala.inline
    def setSizes(value: FluidObject): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

