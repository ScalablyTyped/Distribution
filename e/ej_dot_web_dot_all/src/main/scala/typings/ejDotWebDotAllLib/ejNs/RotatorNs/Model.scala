package typings
package ejDotWebDotAllLib.ejNs.RotatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Turns on keyboard interaction with the Rotator items. You must set this property to true to access the following keyboard shortcuts:
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the animationSpeed of slide transition.
    * @Default {600}
    */
  var animationSpeed: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Specifies the animationType type for the Rotator Item. animationType options include slide, fastSlide, slowSlide, and other custom easing animationTypes.
    * @Default {slide}
    */
  var animationType: js.UndefOr[java.lang.String] = js.undefined
  /** This event is fired when the Rotator slides are changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Enables the circular mode item rotation.
    * @Default {true}
    */
  var circularMode: js.UndefOr[scala.Boolean] = js.undefined
  /** This event is fired when the Rotator control is initialized.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Specify the CSS class to Rotator to achieve custom theme.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Specify the list of data which contains a set of data fields. Each data value is used to render an item for the Rotator.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Sets the delay between the Rotator Items move after the slide transition.
    * @Default {500}
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /** This event is fired when the Rotator control is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Specifies the number of Rotator Items to be displayed.
    * @Default {1}
    */
  var displayItemsCount: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Rotates the Rotator Items continuously without user interference.
    * @Default {false}
    */
  var enableAutoPlay: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies right to left transition of slides.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the Rotator control.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines mapping fields for the data items of the Rotator.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Sets the space between the Rotator Items.
    */
  var frameSpace: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Resizes the Rotator when the browser is resized.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the number of Rotator Items to navigate on a single click (next/previous/play buttons). The navigateSteps property value must be less than or equal to the
    * displayItemsCount property value.
    * @Default {1}
    */
  var navigateSteps: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Specifies the orientation for the Rotator control, that is, whether it must be rendered horizontally or vertically. See Orientation
    * @Default {ej.Orientation.Horizontal}
    */
  var orientation: js.UndefOr[ejDotWebDotAllLib.ejNs.Orientation | java.lang.String] = js.undefined
  /** This event is fired when a pager is clicked.
    */
  var pagerClick: js.UndefOr[js.Function1[/* e */ PagerClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the position of the showPager in the Rotator Item. See PagerPosition
    * @Default {outside}
    */
  var pagerPosition: js.UndefOr[java.lang.String | PagerPosition] = js.undefined
  /** Retrieves data from remote data. This property is applicable only when a remote data source is used.
    * @Default {null}
    */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /** If the Rotator Item is an image, you can specify a caption for the Rotator Item. The caption text for each Rotator Item must be set by using the title attribute of the respective
    * tag. The caption cannot be displayed if multiple Rotator Items are present.
    * @Default {false}
    */
  var showCaption: js.UndefOr[scala.Boolean] = js.undefined
  /** Turns on or off the slide buttons (next and previous) in the Rotator Items. Slide buttons are used to navigate the Rotator Items.
    * @Default {true}
    */
  var showNavigateButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Turns on or off the pager support in the Rotator control. The Pager is used to navigate the Rotator Items.
    * @Default {true}
    */
  var showPager: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable play / pause button on rotator.
    * @Default {false}
    */
  var showPlayButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Turns on or off thumbnail support in the Rotator control. Thumbnail is used to navigate between slides. Thumbnail supports only single slide transition You must specify the source
    * for thumbnail elements through the thumbnailSourceID property.
    * @Default {false}
    */
  var showThumbnail: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the height of a Rotator Item.
    */
  var slideHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the width of a Rotator Item.
    */
  var slideWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** This event is fired when enableAutoPlay is started.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, scala.Unit]] = js.undefined
  /** Sets the index of the slide that must be displayed first.
    * @Default {0}
    */
  var startIndex: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** This event is fired when autoplay is stopped or paused.
    */
  var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, scala.Unit]] = js.undefined
  /** Pause the auto play while hover on the rotator content.
    * @Default {false}
    */
  var stopOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /** The template to display the Rotator widget with customized appearance.
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** The templateId enables to bind multiple customized template items in Rotator.
    * @Default {null}
    */
  var templateId: js.UndefOr[js.Array[_]] = js.undefined
  /** This event is fired when a thumbnail pager is clicked.
    */
  var thumbItemClick: js.UndefOr[js.Function1[/* e */ ThumbItemClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the source for thumbnail elements.
    * @Default {null}
    */
  var thumbnailSourceID: js.UndefOr[js.Any] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    animationSpeed: java.lang.String | scala.Double = null,
    animationType: java.lang.String = null,
    change: /* e */ ChangeEventArgs => scala.Unit = null,
    circularMode: js.UndefOr[scala.Boolean] = js.undefined,
    create: /* e */ CreateEventArgs => scala.Unit = null,
    cssClass: java.lang.String = null,
    dataSource: js.Any = null,
    delay: scala.Int | scala.Double = null,
    destroy: /* e */ DestroyEventArgs => scala.Unit = null,
    displayItemsCount: java.lang.String | scala.Double = null,
    enableAutoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    fields: Fields = null,
    frameSpace: java.lang.String | scala.Double = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    navigateSteps: java.lang.String | scala.Double = null,
    orientation: ejDotWebDotAllLib.ejNs.Orientation | java.lang.String = null,
    pagerClick: /* e */ PagerClickEventArgs => scala.Unit = null,
    pagerPosition: java.lang.String | PagerPosition = null,
    query: java.lang.String = null,
    showCaption: js.UndefOr[scala.Boolean] = js.undefined,
    showNavigateButton: js.UndefOr[scala.Boolean] = js.undefined,
    showPager: js.UndefOr[scala.Boolean] = js.undefined,
    showPlayButton: js.UndefOr[scala.Boolean] = js.undefined,
    showThumbnail: js.UndefOr[scala.Boolean] = js.undefined,
    slideHeight: java.lang.String | scala.Double = null,
    slideWidth: java.lang.String | scala.Double = null,
    start: /* e */ StartEventArgs => scala.Unit = null,
    startIndex: java.lang.String | scala.Double = null,
    stop: /* e */ StopEventArgs => scala.Unit = null,
    stopOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String = null,
    templateId: js.Array[_] = null,
    thumbItemClick: /* e */ ThumbItemClickEventArgs => scala.Unit = null,
    thumbnailSourceID: js.Any = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(circularMode)) __obj.updateDynamic("circularMode")(circularMode)
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (displayItemsCount != null) __obj.updateDynamic("displayItemsCount")(displayItemsCount.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoPlay)) __obj.updateDynamic("enableAutoPlay")(enableAutoPlay)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (frameSpace != null) __obj.updateDynamic("frameSpace")(frameSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (navigateSteps != null) __obj.updateDynamic("navigateSteps")(navigateSteps.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pagerClick != null) __obj.updateDynamic("pagerClick")(js.Any.fromFunction1(pagerClick))
    if (pagerPosition != null) __obj.updateDynamic("pagerPosition")(pagerPosition.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(showCaption)) __obj.updateDynamic("showCaption")(showCaption)
    if (!js.isUndefined(showNavigateButton)) __obj.updateDynamic("showNavigateButton")(showNavigateButton)
    if (!js.isUndefined(showPager)) __obj.updateDynamic("showPager")(showPager)
    if (!js.isUndefined(showPlayButton)) __obj.updateDynamic("showPlayButton")(showPlayButton)
    if (!js.isUndefined(showThumbnail)) __obj.updateDynamic("showThumbnail")(showThumbnail)
    if (slideHeight != null) __obj.updateDynamic("slideHeight")(slideHeight.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (!js.isUndefined(stopOnHover)) __obj.updateDynamic("stopOnHover")(stopOnHover)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateId != null) __obj.updateDynamic("templateId")(templateId)
    if (thumbItemClick != null) __obj.updateDynamic("thumbItemClick")(js.Any.fromFunction1(thumbItemClick))
    if (thumbnailSourceID != null) __obj.updateDynamic("thumbnailSourceID")(thumbnailSourceID)
    __obj.asInstanceOf[Model]
  }
}

