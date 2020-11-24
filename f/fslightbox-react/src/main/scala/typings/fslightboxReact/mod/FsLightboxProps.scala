package typings.fslightboxReact.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FsLightboxProps extends js.Object {
  
  // custom sources
  var customSources: js.UndefOr[js.Array[Element]] = js.native
  
  // types
  var disableLocalStorage: js.UndefOr[Boolean] = js.native
  
  // preferences
  var loadOnlyCurrentSource: js.UndefOr[Boolean] = js.native
  
  var maxYoutubeVideoDimensions: js.UndefOr[VideoDimensions] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  
  // events
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var openOnMount: js.UndefOr[Boolean] = js.native
  
  // slide number controlling
  var slide: js.UndefOr[Double] = js.native
  
  var slideDistance: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var sourceIndex: js.UndefOr[Double] = js.native
  
  var sources: js.UndefOr[js.Array[String]] = js.native
  
  var toggler: Boolean = js.native
  
  var `type`: js.UndefOr[SourceType] = js.native
  
  var types: js.UndefOr[js.Array[SourceType]] = js.native
  
  // sources
  var videosPosters: js.UndefOr[js.Array[VideoPoster]] = js.native
}
object FsLightboxProps {
  
  @scala.inline
  def apply(toggler: Boolean): FsLightboxProps = {
    val __obj = js.Dynamic.literal(toggler = toggler.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsLightboxProps]
  }
  
  @scala.inline
  implicit class FsLightboxPropsOps[Self <: FsLightboxProps] (val x: Self) extends AnyVal {
    
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
    def setToggler(value: Boolean): Self = this.set("toggler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSourcesVarargs(value: Element*): Self = this.set("customSources", js.Array(value :_*))
    
    @scala.inline
    def setCustomSources(value: js.Array[Element]): Self = this.set("customSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSources: Self = this.set("customSources", js.undefined)
    
    @scala.inline
    def setDisableLocalStorage(value: Boolean): Self = this.set("disableLocalStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableLocalStorage: Self = this.set("disableLocalStorage", js.undefined)
    
    @scala.inline
    def setLoadOnlyCurrentSource(value: Boolean): Self = this.set("loadOnlyCurrentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadOnlyCurrentSource: Self = this.set("loadOnlyCurrentSource", js.undefined)
    
    @scala.inline
    def setMaxYoutubeVideoDimensions(value: VideoDimensions): Self = this.set("maxYoutubeVideoDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxYoutubeVideoDimensions: Self = this.set("maxYoutubeVideoDimensions", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnInit(value: () => Unit): Self = this.set("onInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOpenOnMount(value: Boolean): Self = this.set("openOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenOnMount: Self = this.set("openOnMount", js.undefined)
    
    @scala.inline
    def setSlide(value: Double): Self = this.set("slide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlide: Self = this.set("slide", js.undefined)
    
    @scala.inline
    def setSlideDistance(value: Double): Self = this.set("slideDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideDistance: Self = this.set("slideDistance", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceIndex(value: Double): Self = this.set("sourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIndex: Self = this.set("sourceIndex", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: String*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[String]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    
    @scala.inline
    def setType(value: SourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    
    @scala.inline
    def setTypesVarargs(value: SourceType*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[SourceType]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    
    @scala.inline
    def setVideosPostersVarargs(value: VideoPoster*): Self = this.set("videosPosters", js.Array(value :_*))
    
    @scala.inline
    def setVideosPosters(value: js.Array[VideoPoster]): Self = this.set("videosPosters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideosPosters: Self = this.set("videosPosters", js.undefined)
  }
}
