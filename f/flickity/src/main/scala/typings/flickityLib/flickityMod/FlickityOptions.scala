package typings
package flickityLib.flickityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlickityOptions extends js.Object {
  /**
    * Enable keyboard navigation. Users can tab to a Flickity gallery, and pressing left & right keys to change cells.
    *
    * default: true
    */
  var accessibility: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Changes height of carousel to fit height of selected slide.
    */
  var adaptiveHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Draws the shape of the arrows in the previous & next buttons.
    * javascript dictionary of points or path to SVG file
    */
  var arrowShape: js.UndefOr[java.lang.String | flickityLib.Anon_X0] = js.undefined
  /**
    * Use one Flickity gallery as navigation for another.
    *
    * default: disabled
    */
  var asNavFor: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  /**
    * Automatically advances to the next cell.
    *
    * default: false
    */
  var autoPlay: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Loads cell background image when a cell is selected.
    * Set the background image's URL to load with the `data-flickity-bg-lazyload` attribute.
    * If set to `true`, lazyloads background image in selected slide
    * If set to a number n, load background images in selected slide and next n slides and previous n slides.
    * bgLazyLoad requires the flickity-bg-lazyload package. This package is not included and must be installed separately.
    */
  var bgLazyLoad: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Align cells within the gallery element.
    * opttions: 'left', 'center', 'right'
    *
    * default: 'center'
    */
  var cellAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify selector for cell elements. cellSelector is useful if you have other elements in your gallery elements that are not cells.
    *
    * default: '.gallery-cell'
    */
  var cellSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Contains cells to gallery element to prevent excess scroll at beginning or end. Has no effect if wrapAround is enabled
    *
    * default: true
    */
  var contain: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of pixels a mouse or touch has to move before dragging begins. Increase dragThreshold to allow for more wiggle room for vertical page scrolling on touch devices.
    *
    * default: 3
    */
  var dragThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enables dragging and flicking
    *
    * default: true
    */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables content to be freely scrolled and flicked without aligning cells to an end position.
    * Enable freeScroll and wrapAround and you can flick forever, man.
    *
    * default: false
    */
  var freeScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Slows movement of slider when freeScroll: true. Higher friction makes the slider feel stickier. Lower friction makes the slider feel looser.
    *
    * default: 0.075
    */
  var freeScrollFriction: js.UndefOr[scala.Double] = js.undefined
  /**
    * Friction slows the movement of slider. Higher friction makes the slider feel stickier and less bouncy. Lower friction makes the slider feel looser and more wobbly.
    *
    * default: 0.28
    */
  var friction: js.UndefOr[scala.Double] = js.undefined
  /**
    * Groups cells together in slides. Flicking, page dots, and previous/next buttons are mapped to group slides, not individual cells.
    * `is-selected` class is added to the multiple cells in the selected slide.
    * If set to true, group cells that fit in carousel viewport.
    * If set to a number, group cells by that number.
    * If set to a percent string, group cells that fit in the percent of the width of the carousel viewport.
    */
  var groupCells: js.UndefOr[scala.Boolean | scala.Double | java.lang.String] = js.undefined
  /**
    * Unloaded images have no size, which can throw off cell positions. To fix this, the imagesLoaded option re-positions cells once their images have loaded.
    *
    * default: true
    */
  var imagesLoaded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Zero-based index of the initial selected cell.
    */
  var initialIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Loads cell images when a cell is selected.
    * Set the image's URL to load with the `data-flickity-lazyload` attribute.
    * If set to `true`, lazyloads image in selected slide
    * If set to a number n, load images in selected slide and next n slides and previous n slides.
    *
    * default: false
    */
  var lazyLoad: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Creates and enables paging dots.
    *
    * default: true
    */
  var pageDots: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets positioning in percent values, rather than pixel values. If your cells do not have percent widths, we recommended percentPosition: false.
    *
    * default: false
    */
  var percentPosition: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Creates and enables previous & next buttons.
    *
    * default: true
    */
  var prevNextButtons: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Adjusts sizes and positions when window is resized.
    *
    * default: true
    */
  var resize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables right-to-left layout.
    *
    * default: false
    */
  var rightToLeft: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * selectedAttraction attracts the position of the slider to the selected cell. Higher attraction makes the slider move faster. Lower makes it move slower.
    *
    * default: 0.025
    */
  var selectedAttraction: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the height of the gallery to the height of the tallest cell.  Set to  false if you prefer to size the gallery with CSS, rather than using the size of cells.
    *
    * default: true
    */
  var setGallerySize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * You can enable and disable Flickity with CSS. watchCSS option watches the content of :after of the gallery element. Flickity is enabled if :after content is 'flickity'.
    * note: IE8 and Android 2.3 do not support watching :after. Flickity will be disabled when watchCSS: true. Set watchCSS: 'fallbackOn' to enable Flickity for these browsers.
    *
    * default: false
    */
  var watchCSS: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * At the end of cells, wrap-around to the other end for infinite scrolling.
    *
    * default: false
    */
  var wrapAround: js.UndefOr[scala.Boolean] = js.undefined
}

object FlickityOptions {
  @scala.inline
  def apply(
    accessibility: js.UndefOr[scala.Boolean] = js.undefined,
    adaptiveHeight: js.UndefOr[scala.Boolean] = js.undefined,
    arrowShape: java.lang.String | flickityLib.Anon_X0 = null,
    asNavFor: java.lang.String | stdLib.HTMLElement = null,
    autoPlay: scala.Boolean | scala.Double = null,
    bgLazyLoad: scala.Boolean | scala.Double = null,
    cellAlign: java.lang.String = null,
    cellSelector: java.lang.String = null,
    contain: js.UndefOr[scala.Boolean] = js.undefined,
    dragThreshold: scala.Int | scala.Double = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    freeScroll: js.UndefOr[scala.Boolean] = js.undefined,
    freeScrollFriction: scala.Int | scala.Double = null,
    friction: scala.Int | scala.Double = null,
    groupCells: scala.Boolean | scala.Double | java.lang.String = null,
    imagesLoaded: js.UndefOr[scala.Boolean] = js.undefined,
    initialIndex: scala.Int | scala.Double = null,
    lazyLoad: scala.Boolean | scala.Double = null,
    pageDots: js.UndefOr[scala.Boolean] = js.undefined,
    percentPosition: js.UndefOr[scala.Boolean] = js.undefined,
    prevNextButtons: js.UndefOr[scala.Boolean] = js.undefined,
    resize: js.UndefOr[scala.Boolean] = js.undefined,
    rightToLeft: js.UndefOr[scala.Boolean] = js.undefined,
    selectedAttraction: scala.Int | scala.Double = null,
    setGallerySize: js.UndefOr[scala.Boolean] = js.undefined,
    watchCSS: scala.Boolean | java.lang.String = null,
    wrapAround: js.UndefOr[scala.Boolean] = js.undefined
  ): FlickityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessibility)) __obj.updateDynamic("accessibility")(accessibility)
    if (!js.isUndefined(adaptiveHeight)) __obj.updateDynamic("adaptiveHeight")(adaptiveHeight)
    if (arrowShape != null) __obj.updateDynamic("arrowShape")(arrowShape.asInstanceOf[js.Any])
    if (asNavFor != null) __obj.updateDynamic("asNavFor")(asNavFor.asInstanceOf[js.Any])
    if (autoPlay != null) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (bgLazyLoad != null) __obj.updateDynamic("bgLazyLoad")(bgLazyLoad.asInstanceOf[js.Any])
    if (cellAlign != null) __obj.updateDynamic("cellAlign")(cellAlign)
    if (cellSelector != null) __obj.updateDynamic("cellSelector")(cellSelector)
    if (!js.isUndefined(contain)) __obj.updateDynamic("contain")(contain)
    if (dragThreshold != null) __obj.updateDynamic("dragThreshold")(dragThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(freeScroll)) __obj.updateDynamic("freeScroll")(freeScroll)
    if (freeScrollFriction != null) __obj.updateDynamic("freeScrollFriction")(freeScrollFriction.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (groupCells != null) __obj.updateDynamic("groupCells")(groupCells.asInstanceOf[js.Any])
    if (!js.isUndefined(imagesLoaded)) __obj.updateDynamic("imagesLoaded")(imagesLoaded)
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(lazyLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(pageDots)) __obj.updateDynamic("pageDots")(pageDots)
    if (!js.isUndefined(percentPosition)) __obj.updateDynamic("percentPosition")(percentPosition)
    if (!js.isUndefined(prevNextButtons)) __obj.updateDynamic("prevNextButtons")(prevNextButtons)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (!js.isUndefined(rightToLeft)) __obj.updateDynamic("rightToLeft")(rightToLeft)
    if (selectedAttraction != null) __obj.updateDynamic("selectedAttraction")(selectedAttraction.asInstanceOf[js.Any])
    if (!js.isUndefined(setGallerySize)) __obj.updateDynamic("setGallerySize")(setGallerySize)
    if (watchCSS != null) __obj.updateDynamic("watchCSS")(watchCSS.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround)
    __obj.asInstanceOf[FlickityOptions]
  }
}

