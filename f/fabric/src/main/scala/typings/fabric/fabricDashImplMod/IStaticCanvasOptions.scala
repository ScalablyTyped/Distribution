package typings.fabric.fabricDashImplMod

import typings.fabric.Anon_BlBrTl
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStaticCanvasOptions extends js.Object {
  /**
  	 * Indicates whether the browser can be scrolled when using a touchscreen and dragging on the canvas
  	 * @type Boolean
  	 */
  var allowTouchScrolling: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Background color of canvas instance.
  	 * Should be set via {@link fabric.StaticCanvas#setBackgroundColor}.
  	 * @type {(String|fabric.Pattern)}
  	 */
  var backgroundColor: js.UndefOr[String | Pattern] = js.undefined
  /**
  	 * Background image of canvas instance.
  	 * Should be set via {@link fabric.StaticCanvas#setBackgroundImage}.
  	 * <b>Backwards incompatibility note:</b> The "backgroundImageOpacity"
  	 * and "backgroundImageStretch" properties are deprecated since 1.3.9.
  	 * Use {@link fabric.Image#opacity}, {@link fabric.Image#width} and {@link fabric.Image#height}.
  	 * since 2.4.0 image caching is active, please when putting an image as background, add to the
  	 * canvas property a reference to the canvas it is on. Otherwise the image cannot detect the zoom
  	 * vale. As an alternative you can disable image objectCaching
  	 * @type fabric.Image
  	 */
  var backgroundImage: js.UndefOr[Image | String] = js.undefined
  /**
  	 * if set to false background image is not affected by viewport transform
  	 * @since 1.6.3
  	 * @type Boolean
  	 */
  var backgroundVpt: js.UndefOr[Boolean] = js.undefined
  /**
  	 * a fabricObject that, without stroke define a clipping area with their shape. filled in black
  	 * the clipPath object gets used when the canvas has rendered, and the context is placed in the
  	 * top left corner of the canvas.
  	 * clipPath will clip away controls, if you do not want this to happen use controlsAboveOverlay = true
  	 * @type fabric.Object
  	 */
  var clipPath: js.UndefOr[Object] = js.undefined
  /**
  	 * Function that determines clipping of entire canvas area
  	 * Being passed context as first argument.
  	 * If you are using code minification, ctx argument can be minified/manglied you should use
  	 * as a workaround `var ctx = arguments[0];` in the function;
  	 * See clipping canvas area in {@link https://github.com/kangax/fabric.js/wiki/FAQ}
  	 * @deprecated since 2.0.0
  	 * @type Function
  	 */
  var clipTo: js.UndefOr[js.Function1[/* context */ CanvasRenderingContext2D, Unit]] = js.undefined
  /**
  	 * Indicates whether object controls (borders/controls) are rendered above overlay image
  	 * @type Boolean
  	 */
  var controlsAboveOverlay: js.UndefOr[Boolean] = js.undefined
  /**
  	 * When true, canvas is scaled by devicePixelRatio for better rendering on retina screens
  	 * @type Boolean
  	 */
  var enableRetinaScaling: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Indicates whether this canvas will use image smoothing, this is on by default in browsers
  	 */
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Indicates whether toObject/toDatalessObject should include default values
  	 * if set to false, takes precedence over the object value.
  	 * @type Boolean
  	 */
  var includeDefaultValues: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Overlay color of canvas instance.
  	 * Should be set via {@link fabric.StaticCanvas#setOverlayColor}
  	 * @since 1.3.9
  	 * @type {(String|fabric.Pattern)}
  	 */
  var overlayColor: js.UndefOr[String | Pattern] = js.undefined
  /**
  	 * Overlay image of canvas instance.
  	 * Should be set via {@link fabric.StaticCanvas#setOverlayImage}.
  	 * <b>Backwards incompatibility note:</b> The "overlayImageLeft"
  	 * and "overlayImageTop" properties are deprecated since 1.3.9.
  	 * Use {@link fabric.Image#left} and {@link fabric.Image#top}.
  	 * since 2.4.0 image caching is active, please when putting an image as overlay, add to the
  	 * canvas property a reference to the canvas it is on. Otherwise the image cannot detect the zoom
  	 * vale. As an alternative you can disable image objectCaching
  	 * @type fabric.Image
  	 */
  var overlayImage: js.UndefOr[Image] = js.undefined
  /**
  	 * if set to false overlay image is not affected by viewport transform
  	 * @since 1.6.3
  	 * @type Boolean
  	 */
  var overlayVpt: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Indicates whether {@link fabric.Collection.add}, {@link fabric.Collection.insertAt} and {@link fabric.Collection.remove},
  	 * {@link fabric.StaticCanvas.moveTo}, {@link fabric.StaticCanvas.clear} and many more, should also re-render canvas.
  	 * Disabling this option will not give a performance boost when adding/removing a lot of objects to/from canvas at once
  	 * since the renders are quequed and executed one per frame.
  	 * Disabling is suggested anyway and managing the renders of the app manually is not a big effort ( canvas.requestRenderAll() )
  	 * Left default to true to do not break documentation and old app, fiddles.
  	 * @type Boolean
  	 */
  var renderOnAddRemove: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Based on vptCoords and object.aCoords, skip rendering of objects that
  	 * are not included in current viewport.
  	 * May greatly help in applications with crowded canvas and use of zoom/pan
  	 * If One of the corner of the bounding box of the object is on the canvas
  	 * the objects get rendered.
  	 * @memberOf fabric.StaticCanvas.prototype
  	 * @type Boolean
  	 */
  var skipOffscreen: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Indicates whether objects' state should be saved
  	 * @type Boolean
  	 */
  var stateful: js.UndefOr[Boolean] = js.undefined
  /**
  	 * When true, getSvgTransform() will apply the StaticCanvas.viewportTransform to the SVG transformation. When true,
  	 * a zoomed canvas will then produce zoomed SVG output.
  	 * @type Boolean
  	 */
  var svgViewportTransformation: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The transformation (in the format of Canvas transform) which focuses the viewport
  	 */
  var viewportTransform: js.UndefOr[js.Array[Double]] = js.undefined
  /**
  	 * Describe canvas element extension over design
  	 * properties are tl,tr,bl,br.
  	 * if canvas is not zoomed/panned those points are the four corner of canvas
  	 * if canvas is viewportTransformed you those points indicate the extension
  	 * of canvas element in plain untrasformed coordinates
  	 * The coordinates get updated with @method calcViewportBoundaries.
  	 * @memberOf fabric.StaticCanvas.prototype
  	 */
  var vptCoords: js.UndefOr[Anon_BlBrTl] = js.undefined
}

object IStaticCanvasOptions {
  @scala.inline
  def apply(
    allowTouchScrolling: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String | Pattern = null,
    backgroundImage: Image | String = null,
    backgroundVpt: js.UndefOr[Boolean] = js.undefined,
    clipPath: Object = null,
    clipTo: /* context */ CanvasRenderingContext2D => Unit = null,
    controlsAboveOverlay: js.UndefOr[Boolean] = js.undefined,
    enableRetinaScaling: js.UndefOr[Boolean] = js.undefined,
    imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined,
    includeDefaultValues: js.UndefOr[Boolean] = js.undefined,
    overlayColor: String | Pattern = null,
    overlayImage: Image = null,
    overlayVpt: js.UndefOr[Boolean] = js.undefined,
    renderOnAddRemove: js.UndefOr[Boolean] = js.undefined,
    skipOffscreen: js.UndefOr[Boolean] = js.undefined,
    stateful: js.UndefOr[Boolean] = js.undefined,
    svgViewportTransformation: js.UndefOr[Boolean] = js.undefined,
    viewportTransform: js.Array[Double] = null,
    vptCoords: Anon_BlBrTl = null
  ): IStaticCanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTouchScrolling)) __obj.updateDynamic("allowTouchScrolling")(allowTouchScrolling)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundVpt)) __obj.updateDynamic("backgroundVpt")(backgroundVpt)
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath)
    if (clipTo != null) __obj.updateDynamic("clipTo")(js.Any.fromFunction1(clipTo))
    if (!js.isUndefined(controlsAboveOverlay)) __obj.updateDynamic("controlsAboveOverlay")(controlsAboveOverlay)
    if (!js.isUndefined(enableRetinaScaling)) __obj.updateDynamic("enableRetinaScaling")(enableRetinaScaling)
    if (!js.isUndefined(imageSmoothingEnabled)) __obj.updateDynamic("imageSmoothingEnabled")(imageSmoothingEnabled)
    if (!js.isUndefined(includeDefaultValues)) __obj.updateDynamic("includeDefaultValues")(includeDefaultValues)
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (overlayImage != null) __obj.updateDynamic("overlayImage")(overlayImage)
    if (!js.isUndefined(overlayVpt)) __obj.updateDynamic("overlayVpt")(overlayVpt)
    if (!js.isUndefined(renderOnAddRemove)) __obj.updateDynamic("renderOnAddRemove")(renderOnAddRemove)
    if (!js.isUndefined(skipOffscreen)) __obj.updateDynamic("skipOffscreen")(skipOffscreen)
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful)
    if (!js.isUndefined(svgViewportTransformation)) __obj.updateDynamic("svgViewportTransformation")(svgViewportTransformation)
    if (viewportTransform != null) __obj.updateDynamic("viewportTransform")(viewportTransform)
    if (vptCoords != null) __obj.updateDynamic("vptCoords")(vptCoords)
    __obj.asInstanceOf[IStaticCanvasOptions]
  }
}

