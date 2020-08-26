package typings.flickity.mod

import typings.flickity.anon.X0
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Enable keyboard navigation. Users can tab to a Flickity gallery, and pressing left & right keys to change cells.
    *
    * default: true
    */
  var accessibility: js.UndefOr[Boolean] = js.native
  /**
    * Changes height of carousel to fit height of selected slide.
    */
  var adaptiveHeight: js.UndefOr[Boolean] = js.native
  /**
    * Draws the shape of the arrows in the previous & next buttons.
    * javascript dictionary of points or path to SVG file
    */
  var arrowShape: js.UndefOr[String | X0] = js.native
  /**
    * Use one Flickity gallery as navigation for another.
    *
    * default: disabled
    */
  var asNavFor: js.UndefOr[String | HTMLElement] = js.native
  /**
    * Automatically advances to the next cell.
    *
    * default: false
    */
  var autoPlay: js.UndefOr[Boolean | Double] = js.native
  /**
    * Loads cell background image when a cell is selected.
    * Set the background image's URL to load with the `data-flickity-bg-lazyload` attribute.
    * If set to `true`, lazyloads background image in selected slide
    * If set to a number n, load background images in selected slide and next n slides and previous n slides.
    * bgLazyLoad requires the flickity-bg-lazyload package. This package is not included and must be installed separately.
    */
  var bgLazyLoad: js.UndefOr[Boolean | Double] = js.native
  /**
    * Align cells within the gallery element.
    * opttions: 'left', 'center', 'right'
    *
    * default: 'center'
    */
  var cellAlign: js.UndefOr[String] = js.native
  /**
    * Specify selector for cell elements. cellSelector is useful if you have other elements in your gallery elements that are not cells.
    *
    * default: '.gallery-cell'
    */
  var cellSelector: js.UndefOr[String] = js.native
  /**
    * Contains cells to gallery element to prevent excess scroll at beginning or end. Has no effect if wrapAround is enabled
    *
    * default: true
    */
  var contain: js.UndefOr[Boolean] = js.native
  /**
    * The number of pixels a mouse or touch has to move before dragging begins. Increase dragThreshold to allow for more wiggle room for vertical page scrolling on touch devices.
    *
    * default: 3
    */
  var dragThreshold: js.UndefOr[Double] = js.native
  /**
    * Enables dragging and flicking
    *
    * default: true
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * Enables content to be freely scrolled and flicked without aligning cells to an end position.
    * Enable freeScroll and wrapAround and you can flick forever, man.
    *
    * default: false
    */
  var freeScroll: js.UndefOr[Boolean] = js.native
  /**
    * Slows movement of slider when freeScroll: true. Higher friction makes the slider feel stickier. Lower friction makes the slider feel looser.
    *
    * default: 0.075
    */
  var freeScrollFriction: js.UndefOr[Double] = js.native
  /**
    * Friction slows the movement of slider. Higher friction makes the slider feel stickier and less bouncy. Lower friction makes the slider feel looser and more wobbly.
    *
    * default: 0.28
    */
  var friction: js.UndefOr[Double] = js.native
  /**
    * Groups cells together in slides. Flicking, page dots, and previous/next buttons are mapped to group slides, not individual cells.
    * `is-selected` class is added to the multiple cells in the selected slide.
    * If set to true, group cells that fit in carousel viewport.
    * If set to a number, group cells by that number.
    * If set to a percent string, group cells that fit in the percent of the width of the carousel viewport.
    */
  var groupCells: js.UndefOr[Boolean | Double | String] = js.native
  /**
    * Enables hash navigation to select slides with links and URLs.
    * default: false
    */
  var hash: js.UndefOr[Boolean] = js.native
  /**
    * Unloaded images have no size, which can throw off cell positions. To fix this, the imagesLoaded option re-positions cells once their images have loaded.
    *
    * default: true
    */
  var imagesLoaded: js.UndefOr[Boolean] = js.native
  /**
    * Zero-based index of the initial selected cell.
    */
  var initialIndex: js.UndefOr[Double] = js.native
  /**
    * Loads cell images when a cell is selected.
    * Set the image's URL to load with the `data-flickity-lazyload` attribute.
    * If set to `true`, lazyloads image in selected slide
    * If set to a number n, load images in selected slide and next n slides and previous n slides.
    *
    * default: false
    */
  var lazyLoad: js.UndefOr[Boolean | Double] = js.native
  /**
    * Bind events within Flickity's options by setting on to an Object. The object's keys should match the event names. on is useful for capturing events as Flickity is initialized, like ready
    */
  var on: js.UndefOr[EventBindings] = js.native
  /**
    * Creates and enables paging dots.
    *
    * default: true
    */
  var pageDots: js.UndefOr[Boolean] = js.native
  /**
    * Sets positioning in percent values, rather than pixel values. If your cells do not have percent widths, we recommended percentPosition: false.
    *
    * default: false
    */
  var percentPosition: js.UndefOr[Boolean] = js.native
  /**
    * Creates and enables previous & next buttons.
    *
    * default: true
    */
  var prevNextButtons: js.UndefOr[Boolean] = js.native
  /**
    * Adjusts sizes and positions when window is resized.
    *
    * default: true
    */
  var resize: js.UndefOr[Boolean] = js.native
  /**
    * Enables right-to-left layout.
    *
    * default: false
    */
  var rightToLeft: js.UndefOr[Boolean] = js.native
  /**
    * selectedAttraction attracts the position of the slider to the selected cell. Higher attraction makes the slider move faster. Lower makes it move slower.
    *
    * default: 0.025
    */
  var selectedAttraction: js.UndefOr[Double] = js.native
  /**
    * Sets the height of the gallery to the height of the tallest cell.  Set to  false if you prefer to size the gallery with CSS, rather than using the size of cells.
    *
    * default: true
    */
  var setGallerySize: js.UndefOr[Boolean] = js.native
  /**
    * You can enable and disable Flickity with CSS. watchCSS option watches the content of :after of the gallery element. Flickity is enabled if :after content is 'flickity'.
    * note: IE8 and Android 2.3 do not support watching :after. Flickity will be disabled when watchCSS: true. Set watchCSS: 'fallbackOn' to enable Flickity for these browsers.
    *
    * default: false
    */
  var watchCSS: js.UndefOr[Boolean | String] = js.native
  /**
    * At the end of cells, wrap-around to the other end for infinite scrolling.
    *
    * default: false
    */
  var wrapAround: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAccessibility(value: Boolean): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    @scala.inline
    def setAdaptiveHeight(value: Boolean): Self = this.set("adaptiveHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdaptiveHeight: Self = this.set("adaptiveHeight", js.undefined)
    @scala.inline
    def setArrowShape(value: String | X0): Self = this.set("arrowShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowShape: Self = this.set("arrowShape", js.undefined)
    @scala.inline
    def setAsNavFor(value: String | HTMLElement): Self = this.set("asNavFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsNavFor: Self = this.set("asNavFor", js.undefined)
    @scala.inline
    def setAutoPlay(value: Boolean | Double): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setBgLazyLoad(value: Boolean | Double): Self = this.set("bgLazyLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgLazyLoad: Self = this.set("bgLazyLoad", js.undefined)
    @scala.inline
    def setCellAlign(value: String): Self = this.set("cellAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellAlign: Self = this.set("cellAlign", js.undefined)
    @scala.inline
    def setCellSelector(value: String): Self = this.set("cellSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellSelector: Self = this.set("cellSelector", js.undefined)
    @scala.inline
    def setContain(value: Boolean): Self = this.set("contain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContain: Self = this.set("contain", js.undefined)
    @scala.inline
    def setDragThreshold(value: Double): Self = this.set("dragThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragThreshold: Self = this.set("dragThreshold", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setFreeScroll(value: Boolean): Self = this.set("freeScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeScroll: Self = this.set("freeScroll", js.undefined)
    @scala.inline
    def setFreeScrollFriction(value: Double): Self = this.set("freeScrollFriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeScrollFriction: Self = this.set("freeScrollFriction", js.undefined)
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    @scala.inline
    def setGroupCells(value: Boolean | Double | String): Self = this.set("groupCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupCells: Self = this.set("groupCells", js.undefined)
    @scala.inline
    def setHash(value: Boolean): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setImagesLoaded(value: Boolean): Self = this.set("imagesLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagesLoaded: Self = this.set("imagesLoaded", js.undefined)
    @scala.inline
    def setInitialIndex(value: Double): Self = this.set("initialIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialIndex: Self = this.set("initialIndex", js.undefined)
    @scala.inline
    def setLazyLoad(value: Boolean | Double): Self = this.set("lazyLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyLoad: Self = this.set("lazyLoad", js.undefined)
    @scala.inline
    def setOn(value: EventBindings): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setPageDots(value: Boolean): Self = this.set("pageDots", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageDots: Self = this.set("pageDots", js.undefined)
    @scala.inline
    def setPercentPosition(value: Boolean): Self = this.set("percentPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentPosition: Self = this.set("percentPosition", js.undefined)
    @scala.inline
    def setPrevNextButtons(value: Boolean): Self = this.set("prevNextButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevNextButtons: Self = this.set("prevNextButtons", js.undefined)
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setRightToLeft(value: Boolean): Self = this.set("rightToLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightToLeft: Self = this.set("rightToLeft", js.undefined)
    @scala.inline
    def setSelectedAttraction(value: Double): Self = this.set("selectedAttraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedAttraction: Self = this.set("selectedAttraction", js.undefined)
    @scala.inline
    def setSetGallerySize(value: Boolean): Self = this.set("setGallerySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetGallerySize: Self = this.set("setGallerySize", js.undefined)
    @scala.inline
    def setWatchCSS(value: Boolean | String): Self = this.set("watchCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchCSS: Self = this.set("watchCSS", js.undefined)
    @scala.inline
    def setWrapAround(value: Boolean): Self = this.set("wrapAround", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapAround: Self = this.set("wrapAround", js.undefined)
  }
  
}

