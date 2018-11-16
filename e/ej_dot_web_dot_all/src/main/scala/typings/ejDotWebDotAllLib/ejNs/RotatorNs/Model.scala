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

