package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ElementEventModel
import typings.devextreme.anon.Hide
import typings.devextreme.anon.ReachedLeft
import typings.devextreme.anon.TitleElement
import typings.devextreme.anon.`6`
import typings.devextreme.devextremeStrings.nextButton
import typings.devextreme.devextremeStrings.scrollBottom
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.positionConfig
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxLookupOptions extends dxDropDownListOptions[dxLookup] {
  
  /**
    * [descr:dxLookup.Options.animation]
    * @deprecated [depNote:dxLookup.Options.animation]
    */
  var animation: js.UndefOr[Hide] = js.native
  
  /**
    * [descr:dxLookup.Options.applyButtonText]
    */
  var applyButtonText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxLookup.Options.cancelButtonText]
    */
  var cancelButtonText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxLookup.Options.cleanSearchOnOpening]
    */
  var cleanSearchOnOpening: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxLookup.Options.clearButtonText]
    */
  var clearButtonText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxLookup.Options.closeOnOutsideClick]
    * @deprecated [depNote:dxLookup.Options.closeOnOutsideClick]
    */
  var closeOnOutsideClick: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  
  /**
    * [descr:dxLookup.Options.dropDownCentered]
    */
  var dropDownCentered: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxLookup.Options.dropDownOptions]
    */
  @JSName("dropDownOptions")
  var dropDownOptions_dxLookupOptions: js.UndefOr[dxPopoverOptions[dxPopover]] = js.native
  
  /**
    * [descr:dxLookup.Options.fieldTemplate]
    */
  var fieldTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* selectedItem */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery])
  ] = js.native
  
  /**
    * [descr:dxLookup.Options.fullScreen]
    * @deprecated [depNote:dxLookup.Options.fullScreen]
    */
  var fullScreen: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxLookup.Options.nextButtonText]
    */
  var nextButtonText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxLookup.Options.onPageLoading]
    */
  var onPageLoading: js.UndefOr[js.Function1[/* e */ `6`, _]] = js.native
  
  /**
    * [descr:dxLookup.Options.onPullRefresh]
    */
  var onPullRefresh: js.UndefOr[js.Function1[/* e */ `6`, _]] = js.native
  
  /**
    * [descr:dxLookup.Options.onScroll]
    */
  var onScroll: js.UndefOr[js.Function1[/* e */ ReachedLeft, _]] = js.native
  
  /**
    * [descr:dxLookup.Options.onTitleRendered]
    * @deprecated [depNote:dxLookup.Options.onTitleRendered]
    */
  var onTitleRendered: js.UndefOr[js.Function1[/* e */ TitleElement, _]] = js.native
  
  /**
    * [descr:dxLookup.Options.onValueChanged]
    */
  @JSName("onValueChanged")
  var onValueChanged_dxLookupOptions: js.UndefOr[js.Function1[/* e */ ElementEventModel, _]] = js.native
  
  /**
    * [descr:dxLookup.Options.pageLoadMode]
    */
  var pageLoadMode: js.UndefOr[nextButton | scrollBottom] = js.native
  
  /**
    * [descr:dxLookup.Options.pageLoadingText]
    */
  var pageLoadingText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxLookup.Options.popupHeight]
    * @deprecated [depNote:dxLookup.Options.popupHeight]
    */
  var popupHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  
  /**
    * [descr:dxLookup.Options.popupWidth]
    * @deprecated [depNote:dxLookup.Options.popupWidth]
    */
  var popupWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  
  /**
    * [descr:dxLookup.Options.position]
    * @deprecated [depNote:dxLookup.Options.position]
    */
  var position: js.UndefOr[positionConfig] = js.native
  
  /**
    * [descr:dxLookup.Options.pullRefreshEnabled]
    */
  var pullRefreshEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxLookup.Options.pulledDownText]
    */
  var pulledDownText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxLookup.Options.pullingDownText]
    */
  var pullingDownText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxLookup.Options.refreshingText]
    */
  var refreshingText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxLookup.Options.searchPlaceholder]
    */
  var searchPlaceholder: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxLookup.Options.shading]
    * @deprecated [depNote:dxLookup.Options.shading]
    */
  var shading: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxLookup.Options.showCancelButton]
    */
  var showCancelButton: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxLookup.Options.showPopupTitle]
    * @deprecated [depNote:dxLookup.Options.showPopupTitle]
    */
  var showPopupTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxLookup.Options.title]
    * @deprecated [depNote:dxLookup.Options.title]
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxLookup.Options.titleTemplate]
    * @deprecated [depNote:dxLookup.Options.titleTemplate]
    */
  var titleTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* titleElement */ dxElement, String | Element | JQuery])
  ] = js.native
  
  /**
    * [descr:dxLookup.Options.useNativeScrolling]
    */
  var useNativeScrolling: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxLookup.Options.usePopover]
    */
  var usePopover: js.UndefOr[Boolean] = js.native
}
object dxLookupOptions {
  
  @scala.inline
  def apply(): dxLookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLookupOptions]
  }
  
  @scala.inline
  implicit class dxLookupOptionsOps[Self <: dxLookupOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Hide): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setApplyButtonText(value: String): Self = this.set("applyButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyButtonText: Self = this.set("applyButtonText", js.undefined)
    
    @scala.inline
    def setCancelButtonText(value: String): Self = this.set("cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonText: Self = this.set("cancelButtonText", js.undefined)
    
    @scala.inline
    def setCleanSearchOnOpening(value: Boolean): Self = this.set("cleanSearchOnOpening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanSearchOnOpening: Self = this.set("cleanSearchOnOpening", js.undefined)
    
    @scala.inline
    def setClearButtonText(value: String): Self = this.set("clearButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearButtonText: Self = this.set("clearButtonText", js.undefined)
    
    @scala.inline
    def setCloseOnOutsideClickFunction0(value: () => Boolean): Self = this.set("closeOnOutsideClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseOnOutsideClick(value: Boolean | js.Function0[Boolean]): Self = this.set("closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnOutsideClick: Self = this.set("closeOnOutsideClick", js.undefined)
    
    @scala.inline
    def setDropDownCentered(value: Boolean): Self = this.set("dropDownCentered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropDownCentered: Self = this.set("dropDownCentered", js.undefined)
    
    @scala.inline
    def setDropDownOptions(value: dxPopoverOptions[dxPopover]): Self = this.set("dropDownOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropDownOptions: Self = this.set("dropDownOptions", js.undefined)
    
    @scala.inline
    def setFieldTemplateFunction2(value: (/* selectedItem */ js.Any, /* fieldElement */ dxElement) => String | Element | JQuery): Self = this.set("fieldTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFieldTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* selectedItem */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery])
    ): Self = this.set("fieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldTemplate: Self = this.set("fieldTemplate", js.undefined)
    
    @scala.inline
    def setFullScreen(value: Boolean): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    
    @scala.inline
    def setNextButtonText(value: String): Self = this.set("nextButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextButtonText: Self = this.set("nextButtonText", js.undefined)
    
    @scala.inline
    def setOnPageLoading(value: /* e */ `6` => _): Self = this.set("onPageLoading", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageLoading: Self = this.set("onPageLoading", js.undefined)
    
    @scala.inline
    def setOnPullRefresh(value: /* e */ `6` => _): Self = this.set("onPullRefresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPullRefresh: Self = this.set("onPullRefresh", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* e */ ReachedLeft => _): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnTitleRendered(value: /* e */ TitleElement => _): Self = this.set("onTitleRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTitleRendered: Self = this.set("onTitleRendered", js.undefined)
    
    @scala.inline
    def setOnValueChanged(value: /* e */ ElementEventModel => _): Self = this.set("onValueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChanged: Self = this.set("onValueChanged", js.undefined)
    
    @scala.inline
    def setPageLoadMode(value: nextButton | scrollBottom): Self = this.set("pageLoadMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageLoadMode: Self = this.set("pageLoadMode", js.undefined)
    
    @scala.inline
    def setPageLoadingText(value: String): Self = this.set("pageLoadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageLoadingText: Self = this.set("pageLoadingText", js.undefined)
    
    @scala.inline
    def setPopupHeightFunction0(value: () => Double | String): Self = this.set("popupHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPopupHeight(value: Double | String | (js.Function0[Double | String])): Self = this.set("popupHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupHeight: Self = this.set("popupHeight", js.undefined)
    
    @scala.inline
    def setPopupWidthFunction0(value: () => Double | String): Self = this.set("popupWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPopupWidth(value: Double | String | (js.Function0[Double | String])): Self = this.set("popupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupWidth: Self = this.set("popupWidth", js.undefined)
    
    @scala.inline
    def setPosition(value: positionConfig): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPullRefreshEnabled(value: Boolean): Self = this.set("pullRefreshEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRefreshEnabled: Self = this.set("pullRefreshEnabled", js.undefined)
    
    @scala.inline
    def setPulledDownText(value: String): Self = this.set("pulledDownText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePulledDownText: Self = this.set("pulledDownText", js.undefined)
    
    @scala.inline
    def setPullingDownText(value: String): Self = this.set("pullingDownText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullingDownText: Self = this.set("pullingDownText", js.undefined)
    
    @scala.inline
    def setRefreshingText(value: String): Self = this.set("refreshingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshingText: Self = this.set("refreshingText", js.undefined)
    
    @scala.inline
    def setSearchPlaceholder(value: String): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchPlaceholder: Self = this.set("searchPlaceholder", js.undefined)
    
    @scala.inline
    def setShading(value: Boolean): Self = this.set("shading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShading: Self = this.set("shading", js.undefined)
    
    @scala.inline
    def setShowCancelButton(value: Boolean): Self = this.set("showCancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCancelButton: Self = this.set("showCancelButton", js.undefined)
    
    @scala.inline
    def setShowPopupTitle(value: Boolean): Self = this.set("showPopupTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPopupTitle: Self = this.set("showPopupTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleTemplateFunction1(value: /* titleElement */ dxElement => String | Element | JQuery): Self = this.set("titleTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* titleElement */ dxElement, String | Element | JQuery])
    ): Self = this.set("titleTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTemplate: Self = this.set("titleTemplate", js.undefined)
    
    @scala.inline
    def setUseNativeScrolling(value: Boolean): Self = this.set("useNativeScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeScrolling: Self = this.set("useNativeScrolling", js.undefined)
    
    @scala.inline
    def setUsePopover(value: Boolean): Self = this.set("usePopover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePopover: Self = this.set("usePopover", js.undefined)
  }
}
