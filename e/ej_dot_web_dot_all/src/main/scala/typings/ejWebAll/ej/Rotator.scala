package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rotator
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Disables the Rotator control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enables the Rotator control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** This method is used to get the current slide index.
    * @returns {number}
    */
  def getIndex(): Double = js.native
  
  /** This method is used to move a slide to the specified index.
    * @param {number} index of an slide
    * @returns {void}
    */
  def gotoIndex(index: Double): Unit = js.native
  
  @JSName("model")
  var model_Rotator: Model = js.native
  
  /** This method is used to pause autoplay.
    * @returns {void}
    */
  def pause(): Unit = js.native
  
  /** This method is used to move slides continuously (or start autoplay) in the specified autoplay direction.
    * @returns {void}
    */
  def play(): Unit = js.native
  
  /** This method is used to move to the next slide from the current slide. If the current slide is the last slide, then the first slide will be treated as the next slide.
    * @returns {void}
    */
  def slideNext(): Unit = js.native
  
  /** This method is used to move to the previous slide from the current slide. If the current slide is the first slide, then the last slide will be treated as the previous slide.
    * @returns {void}
    */
  def slidePrevious(): Unit = js.native
  
  /** This method is used to update/modify the slide content of template rotator by using id based on index value.
    * @param {number} index of an slide
    * @param {string} id of a new updated slide
    * @returns {void}
    */
  def updateTemplateById(index: Double, id: String): Unit = js.native
}
object Rotator {
  
  @js.native
  sealed trait PagerPosition extends StObject
  @JSGlobal("ej.Rotator.PagerPosition")
  @js.native
  object PagerPosition extends StObject {
    
    ///string
    @js.native
    sealed trait BottomLeft
      extends StObject
         with PagerPosition
    
    ///string
    @js.native
    sealed trait BottomRight
      extends StObject
         with PagerPosition
    
    ///string
    @js.native
    sealed trait Outside
      extends StObject
         with PagerPosition
    
    ///string
    @js.native
    sealed trait TopCenter
      extends StObject
         with PagerPosition
    
    ///string
    @js.native
    sealed trait TopLeft
      extends StObject
         with PagerPosition
    
    ///string
    @js.native
    sealed trait TopRight
      extends StObject
         with PagerPosition
  }
  
  trait ChangeEventArgs extends StObject {
    
    /** returns the current slide index.
      */
    var activeItemIndex: js.UndefOr[Double] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** the current rotator id.
      */
    var itemId: js.UndefOr[String] = js.undefined
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ChangeEventArgs {
    
    inline def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    extension [Self <: ChangeEventArgs](x: Self) {
      
      inline def setActiveItemIndex(value: Double): Self = StObject.set(x, "activeItemIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveItemIndexUndefined: Self = StObject.set(x, "activeItemIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    extension [Self <: CreateEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    extension [Self <: DestroyEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    /** Specifies a link for the image.
      */
    var linkAttribute: js.UndefOr[String] = js.undefined
    
    /** Specifies where to open a given link.
      */
    var targetAttribute: js.UndefOr[String] = js.undefined
    
    /** Specifies a caption for the image.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies a caption for the thumbnail image.
      */
    var thumbnailText: js.UndefOr[String] = js.undefined
    
    /** Specifies the URL for an thumbnail image.
      */
    var thumbnailUrl: js.UndefOr[String] = js.undefined
    
    /** Specifies the URL for an image.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    inline def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setLinkAttribute(value: String): Self = StObject.set(x, "linkAttribute", value.asInstanceOf[js.Any])
      
      inline def setLinkAttributeUndefined: Self = StObject.set(x, "linkAttribute", js.undefined)
      
      inline def setTargetAttribute(value: String): Self = StObject.set(x, "targetAttribute", value.asInstanceOf[js.Any])
      
      inline def setTargetAttributeUndefined: Self = StObject.set(x, "targetAttribute", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setThumbnailText(value: String): Self = StObject.set(x, "thumbnailText", value.asInstanceOf[js.Any])
      
      inline def setThumbnailTextUndefined: Self = StObject.set(x, "thumbnailText", js.undefined)
      
      inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Turns on keyboard interaction with the Rotator items. You must set this property to true to access the following keyboard shortcuts:
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the animationSpeed of slide transition.
      * @Default {600}
      */
    var animationSpeed: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies the animationType type for the Rotator Item. animationType options include slide, fastSlide, slowSlide, and other custom easing animationTypes.
      * @Default {slide}
      */
    var animationType: js.UndefOr[String] = js.undefined
    
    /** This event is fired when the Rotator slides are changed.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Enables the circular mode item rotation.
      * @Default {true}
      */
    var circularMode: js.UndefOr[Boolean] = js.undefined
    
    /** This event is fired when the Rotator control is initialized.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Specify the CSS class to Rotator to achieve custom theme.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Specify the list of data which contains a set of data fields. Each data value is used to render an item for the Rotator.
      * @Default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Sets the delay between the Rotator Items move after the slide transition.
      * @Default {500}
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /** This event is fired when the Rotator control is destroyed.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Specifies the number of Rotator Items to be displayed.
      * @Default {1}
      */
    var displayItemsCount: js.UndefOr[String | Double] = js.undefined
    
    /** Rotates the Rotator Items continuously without user interference.
      * @Default {false}
      */
    var enableAutoPlay: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies right to left transition of slides.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the Rotator control.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Defines mapping fields for the data items of the Rotator.
      * @Default {null}
      */
    var fields: js.UndefOr[Fields] = js.undefined
    
    /** Sets the space between the Rotator Items.
      */
    var frameSpace: js.UndefOr[String | Double] = js.undefined
    
    /** Resizes the Rotator when the browser is resized.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the number of Rotator Items to navigate on a single click (next/previous/play buttons). The navigateSteps property value must be less than or equal to the
      * displayItemsCount property value.
      * @Default {1}
      */
    var navigateSteps: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies the orientation for the Rotator control, that is, whether it must be rendered horizontally or vertically. See Orientation
      * @Default {ej.Orientation.Horizontal}
      */
    var orientation: js.UndefOr[Orientation | String] = js.undefined
    
    /** This event is fired when a pager is clicked.
      */
    var pagerClick: js.UndefOr[js.Function1[/* e */ PagerClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the position of the showPager in the Rotator Item. See PagerPosition
      * @Default {outside}
      */
    var pagerPosition: js.UndefOr[String | PagerPosition] = js.undefined
    
    /** Retrieves data from remote data. This property is applicable only when a remote data source is used.
      * @Default {null}
      */
    var query: js.UndefOr[String] = js.undefined
    
    /** If the Rotator Item is an image, you can specify a caption for the Rotator Item. The caption text for each Rotator Item must be set by using the title attribute of the respective
      * tag. The caption cannot be displayed if multiple Rotator Items are present.
      * @Default {false}
      */
    var showCaption: js.UndefOr[Boolean] = js.undefined
    
    /** Turns on or off the slide buttons (next and previous) in the Rotator Items. Slide buttons are used to navigate the Rotator Items.
      * @Default {true}
      */
    var showNavigateButton: js.UndefOr[Boolean] = js.undefined
    
    /** Turns on or off the pager support in the Rotator control. The Pager is used to navigate the Rotator Items.
      * @Default {true}
      */
    var showPager: js.UndefOr[Boolean] = js.undefined
    
    /** Enable play / pause button on rotator.
      * @Default {false}
      */
    var showPlayButton: js.UndefOr[Boolean] = js.undefined
    
    /** Turns on or off thumbnail support in the Rotator control. Thumbnail is used to navigate between slides. Thumbnail supports only single slide transition You must specify the source
      * for thumbnail elements through the thumbnailSourceID property.
      * @Default {false}
      */
    var showThumbnail: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the height of a Rotator Item.
      */
    var slideHeight: js.UndefOr[String | Double] = js.undefined
    
    /** Sets the width of a Rotator Item.
      */
    var slideWidth: js.UndefOr[String | Double] = js.undefined
    
    /** This event is fired when enableAutoPlay is started.
      */
    var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.undefined
    
    /** Sets the index of the slide that must be displayed first.
      * @Default {0}
      */
    var startIndex: js.UndefOr[String | Double] = js.undefined
    
    /** This event is fired when autoplay is stopped or paused.
      */
    var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, Unit]] = js.undefined
    
    /** Pause the auto play while hover on the rotator content.
      * @Default {false}
      */
    var stopOnHover: js.UndefOr[Boolean] = js.undefined
    
    /** The template to display the Rotator widget with customized appearance.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** The templateId enables to bind multiple customized template items in Rotator.
      * @Default {null}
      */
    var templateId: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** This event is fired when a thumbnail pager is clicked.
      */
    var thumbItemClick: js.UndefOr[js.Function1[/* e */ ThumbItemClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the source for thumbnail elements.
      * @Default {null}
      */
    var thumbnailSourceID: js.UndefOr[Any] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Rotator.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Rotator.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.Rotator.Model](x: Self) {
      
      inline def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      inline def setAnimationSpeed(value: String | Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      inline def setAnimationType(value: String): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
      
      inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setCircularMode(value: Boolean): Self = StObject.set(x, "circularMode", value.asInstanceOf[js.Any])
      
      inline def setCircularModeUndefined: Self = StObject.set(x, "circularMode", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDisplayItemsCount(value: String | Double): Self = StObject.set(x, "displayItemsCount", value.asInstanceOf[js.Any])
      
      inline def setDisplayItemsCountUndefined: Self = StObject.set(x, "displayItemsCount", js.undefined)
      
      inline def setEnableAutoPlay(value: Boolean): Self = StObject.set(x, "enableAutoPlay", value.asInstanceOf[js.Any])
      
      inline def setEnableAutoPlayUndefined: Self = StObject.set(x, "enableAutoPlay", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFrameSpace(value: String | Double): Self = StObject.set(x, "frameSpace", value.asInstanceOf[js.Any])
      
      inline def setFrameSpaceUndefined: Self = StObject.set(x, "frameSpace", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setNavigateSteps(value: String | Double): Self = StObject.set(x, "navigateSteps", value.asInstanceOf[js.Any])
      
      inline def setNavigateStepsUndefined: Self = StObject.set(x, "navigateSteps", js.undefined)
      
      inline def setOrientation(value: Orientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPagerClick(value: /* e */ PagerClickEventArgs => Unit): Self = StObject.set(x, "pagerClick", js.Any.fromFunction1(value))
      
      inline def setPagerClickUndefined: Self = StObject.set(x, "pagerClick", js.undefined)
      
      inline def setPagerPosition(value: String | PagerPosition): Self = StObject.set(x, "pagerPosition", value.asInstanceOf[js.Any])
      
      inline def setPagerPositionUndefined: Self = StObject.set(x, "pagerPosition", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setShowCaption(value: Boolean): Self = StObject.set(x, "showCaption", value.asInstanceOf[js.Any])
      
      inline def setShowCaptionUndefined: Self = StObject.set(x, "showCaption", js.undefined)
      
      inline def setShowNavigateButton(value: Boolean): Self = StObject.set(x, "showNavigateButton", value.asInstanceOf[js.Any])
      
      inline def setShowNavigateButtonUndefined: Self = StObject.set(x, "showNavigateButton", js.undefined)
      
      inline def setShowPager(value: Boolean): Self = StObject.set(x, "showPager", value.asInstanceOf[js.Any])
      
      inline def setShowPagerUndefined: Self = StObject.set(x, "showPager", js.undefined)
      
      inline def setShowPlayButton(value: Boolean): Self = StObject.set(x, "showPlayButton", value.asInstanceOf[js.Any])
      
      inline def setShowPlayButtonUndefined: Self = StObject.set(x, "showPlayButton", js.undefined)
      
      inline def setShowThumbnail(value: Boolean): Self = StObject.set(x, "showThumbnail", value.asInstanceOf[js.Any])
      
      inline def setShowThumbnailUndefined: Self = StObject.set(x, "showThumbnail", js.undefined)
      
      inline def setSlideHeight(value: String | Double): Self = StObject.set(x, "slideHeight", value.asInstanceOf[js.Any])
      
      inline def setSlideHeightUndefined: Self = StObject.set(x, "slideHeight", js.undefined)
      
      inline def setSlideWidth(value: String | Double): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      inline def setSlideWidthUndefined: Self = StObject.set(x, "slideWidth", js.undefined)
      
      inline def setStart(value: /* e */ StartEventArgs => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartIndex(value: String | Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: /* e */ StopEventArgs => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      
      inline def setStopOnHover(value: Boolean): Self = StObject.set(x, "stopOnHover", value.asInstanceOf[js.Any])
      
      inline def setStopOnHoverUndefined: Self = StObject.set(x, "stopOnHover", js.undefined)
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateId(value: js.Array[Any]): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
      
      inline def setTemplateIdVarargs(value: Any*): Self = StObject.set(x, "templateId", js.Array(value*))
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setThumbItemClick(value: /* e */ ThumbItemClickEventArgs => Unit): Self = StObject.set(x, "thumbItemClick", js.Any.fromFunction1(value))
      
      inline def setThumbItemClickUndefined: Self = StObject.set(x, "thumbItemClick", js.undefined)
      
      inline def setThumbnailSourceID(value: Any): Self = StObject.set(x, "thumbnailSourceID", value.asInstanceOf[js.Any])
      
      inline def setThumbnailSourceIDUndefined: Self = StObject.set(x, "thumbnailSourceID", js.undefined)
    }
  }
  
  trait PagerClickEventArgs extends StObject {
    
    /** returns the current slide index.
      */
    var activeItemIndex: js.UndefOr[Double] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** the current rotator id.
      */
    var itemId: js.UndefOr[String] = js.undefined
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PagerClickEventArgs {
    
    inline def apply(): PagerClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerClickEventArgs]
    }
    
    extension [Self <: PagerClickEventArgs](x: Self) {
      
      inline def setActiveItemIndex(value: Double): Self = StObject.set(x, "activeItemIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveItemIndexUndefined: Self = StObject.set(x, "activeItemIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait StartEventArgs extends StObject {
    
    /** returns the current slide index.
      */
    var activeItemIndex: js.UndefOr[Double] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** the current rotator id.
      */
    var itemId: js.UndefOr[String] = js.undefined
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object StartEventArgs {
    
    inline def apply(): StartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartEventArgs]
    }
    
    extension [Self <: StartEventArgs](x: Self) {
      
      inline def setActiveItemIndex(value: Double): Self = StObject.set(x, "activeItemIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveItemIndexUndefined: Self = StObject.set(x, "activeItemIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait StopEventArgs extends StObject {
    
    /** returns the current slide index.
      */
    var activeItemIndex: js.UndefOr[Double] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** the current rotator id.
      */
    var itemId: js.UndefOr[String] = js.undefined
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object StopEventArgs {
    
    inline def apply(): StopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopEventArgs]
    }
    
    extension [Self <: StopEventArgs](x: Self) {
      
      inline def setActiveItemIndex(value: Double): Self = StObject.set(x, "activeItemIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveItemIndexUndefined: Self = StObject.set(x, "activeItemIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ThumbItemClickEventArgs extends StObject {
    
    /** returns the current slide index.
      */
    var activeItemIndex: js.UndefOr[Double] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** the current rotator id.
      */
    var itemId: js.UndefOr[String] = js.undefined
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ThumbItemClickEventArgs {
    
    inline def apply(): ThumbItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbItemClickEventArgs]
    }
    
    extension [Self <: ThumbItemClickEventArgs](x: Self) {
      
      inline def setActiveItemIndex(value: Double): Self = StObject.set(x, "activeItemIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveItemIndexUndefined: Self = StObject.set(x, "activeItemIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
