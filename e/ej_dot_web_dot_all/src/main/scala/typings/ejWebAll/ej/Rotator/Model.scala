package typings.ejWebAll.ej.Rotator

import typings.ejWebAll.ej.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Turns on keyboard interaction with the Rotator items. You must set this property to true to access the following keyboard shortcuts:
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  
  /** Sets the animationSpeed of slide transition.
    * @Default {600}
    */
  var animationSpeed: js.UndefOr[String | Double] = js.native
  
  /** Specifies the animationType type for the Rotator Item. animationType options include slide, fastSlide, slowSlide, and other custom easing animationTypes.
    * @Default {slide}
    */
  var animationType: js.UndefOr[String] = js.native
  
  /** This event is fired when the Rotator slides are changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  
  /** Enables the circular mode item rotation.
    * @Default {true}
    */
  var circularMode: js.UndefOr[Boolean] = js.native
  
  /** This event is fired when the Rotator control is initialized.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Specify the CSS class to Rotator to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Specify the list of data which contains a set of data fields. Each data value is used to render an item for the Rotator.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /** Sets the delay between the Rotator Items move after the slide transition.
    * @Default {500}
    */
  var delay: js.UndefOr[Double] = js.native
  
  /** This event is fired when the Rotator control is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Specifies the number of Rotator Items to be displayed.
    * @Default {1}
    */
  var displayItemsCount: js.UndefOr[String | Double] = js.native
  
  /** Rotates the Rotator Items continuously without user interference.
    * @Default {false}
    */
  var enableAutoPlay: js.UndefOr[Boolean] = js.native
  
  /** Specifies right to left transition of slides.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the Rotator control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Defines mapping fields for the data items of the Rotator.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  
  /** Sets the space between the Rotator Items.
    */
  var frameSpace: js.UndefOr[String | Double] = js.native
  
  /** Resizes the Rotator when the browser is resized.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Specifies the number of Rotator Items to navigate on a single click (next/previous/play buttons). The navigateSteps property value must be less than or equal to the
    * displayItemsCount property value.
    * @Default {1}
    */
  var navigateSteps: js.UndefOr[String | Double] = js.native
  
  /** Specifies the orientation for the Rotator control, that is, whether it must be rendered horizontally or vertically. See Orientation
    * @Default {ej.Orientation.Horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.native
  
  /** This event is fired when a pager is clicked.
    */
  var pagerClick: js.UndefOr[js.Function1[/* e */ PagerClickEventArgs, Unit]] = js.native
  
  /** Specifies the position of the showPager in the Rotator Item. See PagerPosition
    * @Default {outside}
    */
  var pagerPosition: js.UndefOr[String | PagerPosition] = js.native
  
  /** Retrieves data from remote data. This property is applicable only when a remote data source is used.
    * @Default {null}
    */
  var query: js.UndefOr[String] = js.native
  
  /** If the Rotator Item is an image, you can specify a caption for the Rotator Item. The caption text for each Rotator Item must be set by using the title attribute of the respective
    * tag. The caption cannot be displayed if multiple Rotator Items are present.
    * @Default {false}
    */
  var showCaption: js.UndefOr[Boolean] = js.native
  
  /** Turns on or off the slide buttons (next and previous) in the Rotator Items. Slide buttons are used to navigate the Rotator Items.
    * @Default {true}
    */
  var showNavigateButton: js.UndefOr[Boolean] = js.native
  
  /** Turns on or off the pager support in the Rotator control. The Pager is used to navigate the Rotator Items.
    * @Default {true}
    */
  var showPager: js.UndefOr[Boolean] = js.native
  
  /** Enable play / pause button on rotator.
    * @Default {false}
    */
  var showPlayButton: js.UndefOr[Boolean] = js.native
  
  /** Turns on or off thumbnail support in the Rotator control. Thumbnail is used to navigate between slides. Thumbnail supports only single slide transition You must specify the source
    * for thumbnail elements through the thumbnailSourceID property.
    * @Default {false}
    */
  var showThumbnail: js.UndefOr[Boolean] = js.native
  
  /** Sets the height of a Rotator Item.
    */
  var slideHeight: js.UndefOr[String | Double] = js.native
  
  /** Sets the width of a Rotator Item.
    */
  var slideWidth: js.UndefOr[String | Double] = js.native
  
  /** This event is fired when enableAutoPlay is started.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.native
  
  /** Sets the index of the slide that must be displayed first.
    * @Default {0}
    */
  var startIndex: js.UndefOr[String | Double] = js.native
  
  /** This event is fired when autoplay is stopped or paused.
    */
  var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, Unit]] = js.native
  
  /** Pause the auto play while hover on the rotator content.
    * @Default {false}
    */
  var stopOnHover: js.UndefOr[Boolean] = js.native
  
  /** The template to display the Rotator widget with customized appearance.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  
  /** The templateId enables to bind multiple customized template items in Rotator.
    * @Default {null}
    */
  var templateId: js.UndefOr[js.Array[_]] = js.native
  
  /** This event is fired when a thumbnail pager is clicked.
    */
  var thumbItemClick: js.UndefOr[js.Function1[/* e */ ThumbItemClickEventArgs, Unit]] = js.native
  
  /** Specifies the source for thumbnail elements.
    * @Default {null}
    */
  var thumbnailSourceID: js.UndefOr[js.Any] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    
    @scala.inline
    def setAnimationSpeed(value: String | Double): Self = this.set("animationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationSpeed: Self = this.set("animationSpeed", js.undefined)
    
    @scala.inline
    def setAnimationType(value: String): Self = this.set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setCircularMode(value: Boolean): Self = this.set("circularMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircularMode: Self = this.set("circularMode", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDisplayItemsCount(value: String | Double): Self = this.set("displayItemsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayItemsCount: Self = this.set("displayItemsCount", js.undefined)
    
    @scala.inline
    def setEnableAutoPlay(value: Boolean): Self = this.set("enableAutoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoPlay: Self = this.set("enableAutoPlay", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFields(value: Fields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFrameSpace(value: String | Double): Self = this.set("frameSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameSpace: Self = this.set("frameSpace", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setNavigateSteps(value: String | Double): Self = this.set("navigateSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigateSteps: Self = this.set("navigateSteps", js.undefined)
    
    @scala.inline
    def setOrientation(value: Orientation | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPagerClick(value: /* e */ PagerClickEventArgs => Unit): Self = this.set("pagerClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePagerClick: Self = this.set("pagerClick", js.undefined)
    
    @scala.inline
    def setPagerPosition(value: String | PagerPosition): Self = this.set("pagerPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagerPosition: Self = this.set("pagerPosition", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setShowCaption(value: Boolean): Self = this.set("showCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCaption: Self = this.set("showCaption", js.undefined)
    
    @scala.inline
    def setShowNavigateButton(value: Boolean): Self = this.set("showNavigateButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNavigateButton: Self = this.set("showNavigateButton", js.undefined)
    
    @scala.inline
    def setShowPager(value: Boolean): Self = this.set("showPager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPager: Self = this.set("showPager", js.undefined)
    
    @scala.inline
    def setShowPlayButton(value: Boolean): Self = this.set("showPlayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPlayButton: Self = this.set("showPlayButton", js.undefined)
    
    @scala.inline
    def setShowThumbnail(value: Boolean): Self = this.set("showThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowThumbnail: Self = this.set("showThumbnail", js.undefined)
    
    @scala.inline
    def setSlideHeight(value: String | Double): Self = this.set("slideHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideHeight: Self = this.set("slideHeight", js.undefined)
    
    @scala.inline
    def setSlideWidth(value: String | Double): Self = this.set("slideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideWidth: Self = this.set("slideWidth", js.undefined)
    
    @scala.inline
    def setStart(value: /* e */ StartEventArgs => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStartIndex(value: String | Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setStop(value: /* e */ StopEventArgs => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    
    @scala.inline
    def setStopOnHover(value: Boolean): Self = this.set("stopOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOnHover: Self = this.set("stopOnHover", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateIdVarargs(value: js.Any*): Self = this.set("templateId", js.Array(value :_*))
    
    @scala.inline
    def setTemplateId(value: js.Array[_]): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
    
    @scala.inline
    def setThumbItemClick(value: /* e */ ThumbItemClickEventArgs => Unit): Self = this.set("thumbItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteThumbItemClick: Self = this.set("thumbItemClick", js.undefined)
    
    @scala.inline
    def setThumbnailSourceID(value: js.Any): Self = this.set("thumbnailSourceID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailSourceID: Self = this.set("thumbnailSourceID", js.undefined)
  }
}
