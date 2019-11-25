package typings.ejDotWebDotAll.ej.Rotator

import typings.ejDotWebDotAll.ej.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
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
  var dataSource: js.UndefOr[js.Any] = js.undefined
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
  var templateId: js.UndefOr[js.Array[_]] = js.undefined
  /** This event is fired when a thumbnail pager is clicked.
    */
  var thumbItemClick: js.UndefOr[js.Function1[/* e */ ThumbItemClickEventArgs, Unit]] = js.undefined
  /** Specifies the source for thumbnail elements.
    * @Default {null}
    */
  var thumbnailSourceID: js.UndefOr[js.Any] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    animationSpeed: String | Double = null,
    animationType: String = null,
    change: /* e */ ChangeEventArgs => Unit = null,
    circularMode: js.UndefOr[Boolean] = js.undefined,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    dataSource: js.Any = null,
    delay: Int | Double = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    displayItemsCount: String | Double = null,
    enableAutoPlay: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fields: Fields = null,
    frameSpace: String | Double = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    navigateSteps: String | Double = null,
    orientation: Orientation | String = null,
    pagerClick: /* e */ PagerClickEventArgs => Unit = null,
    pagerPosition: String | PagerPosition = null,
    query: String = null,
    showCaption: js.UndefOr[Boolean] = js.undefined,
    showNavigateButton: js.UndefOr[Boolean] = js.undefined,
    showPager: js.UndefOr[Boolean] = js.undefined,
    showPlayButton: js.UndefOr[Boolean] = js.undefined,
    showThumbnail: js.UndefOr[Boolean] = js.undefined,
    slideHeight: String | Double = null,
    slideWidth: String | Double = null,
    start: /* e */ StartEventArgs => Unit = null,
    startIndex: String | Double = null,
    stop: /* e */ StopEventArgs => Unit = null,
    stopOnHover: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    templateId: js.Array[_] = null,
    thumbItemClick: /* e */ ThumbItemClickEventArgs => Unit = null,
    thumbnailSourceID: js.Any = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation.asInstanceOf[js.Any])
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(circularMode)) __obj.updateDynamic("circularMode")(circularMode.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (displayItemsCount != null) __obj.updateDynamic("displayItemsCount")(displayItemsCount.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoPlay)) __obj.updateDynamic("enableAutoPlay")(enableAutoPlay.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (frameSpace != null) __obj.updateDynamic("frameSpace")(frameSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (navigateSteps != null) __obj.updateDynamic("navigateSteps")(navigateSteps.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pagerClick != null) __obj.updateDynamic("pagerClick")(js.Any.fromFunction1(pagerClick))
    if (pagerPosition != null) __obj.updateDynamic("pagerPosition")(pagerPosition.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(showCaption)) __obj.updateDynamic("showCaption")(showCaption.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavigateButton)) __obj.updateDynamic("showNavigateButton")(showNavigateButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showPager)) __obj.updateDynamic("showPager")(showPager.asInstanceOf[js.Any])
    if (!js.isUndefined(showPlayButton)) __obj.updateDynamic("showPlayButton")(showPlayButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showThumbnail)) __obj.updateDynamic("showThumbnail")(showThumbnail.asInstanceOf[js.Any])
    if (slideHeight != null) __obj.updateDynamic("slideHeight")(slideHeight.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (!js.isUndefined(stopOnHover)) __obj.updateDynamic("stopOnHover")(stopOnHover.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    if (thumbItemClick != null) __obj.updateDynamic("thumbItemClick")(js.Any.fromFunction1(thumbItemClick))
    if (thumbnailSourceID != null) __obj.updateDynamic("thumbnailSourceID")(thumbnailSourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

