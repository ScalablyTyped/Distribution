package typings.fabric.fabricImplMod

import typings.fabric.anon.Tl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStaticCanvasOptions extends StObject {
  
  /**
    * Indicates whether the browser can be scrolled when using a touchscreen and dragging on the canvas
    */
  var allowTouchScrolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Background color of canvas instance.
    * Should be set via {@link fabric.StaticCanvas#setBackgroundColor}.
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
    */
  var backgroundImage: js.UndefOr[Image | String] = js.undefined
  
  /**
    * if set to false background image is not affected by viewport transform
    * @since 1.6.3
    */
  var backgroundVpt: js.UndefOr[Boolean] = js.undefined
  
  /**
    * a fabricObject that, without stroke define a clipping area with their shape. filled in black
    * the clipPath object gets used when the canvas has rendered, and the context is placed in the
    * top left corner of the canvas.
    * clipPath will clip away controls, if you do not want this to happen use controlsAboveOverlay = true
    */
  var clipPath: js.UndefOr[Object] = js.undefined
  
  /**
    * Indicates whether object controls (borders/controls) are rendered above overlay image
    */
  var controlsAboveOverlay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, canvas is scaled by devicePixelRatio for better rendering on retina screens
    */
  var enableRetinaScaling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether this canvas will use image smoothing, this is on by default in browsers
    */
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether toObject/toDatalessObject should include default values
    * if set to false, takes precedence over the object value.
    */
  var includeDefaultValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Overlay color of canvas instance.
    * Should be set via {@link fabric.StaticCanvas#setOverlayColor}
    * @since 1.3.9
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
    */
  var overlayImage: js.UndefOr[Image] = js.undefined
  
  /**
    * if set to false overlay image is not affected by viewport transform
    * @since 1.6.3
    */
  var overlayVpt: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether {@link fabric.Collection.add}, {@link fabric.Collection.insertAt} and {@link fabric.Collection.remove},
    * {@link fabric.StaticCanvas.moveTo}, {@link fabric.StaticCanvas.clear} and many more, should also re-render canvas.
    * Disabling this option will not give a performance boost when adding/removing a lot of objects to/from canvas at once
    * since the renders are quequed and executed one per frame.
    * Disabling is suggested anyway and managing the renders of the app manually is not a big effort ( canvas.requestRenderAll() )
    * Left default to true to do not break documentation and old app, fiddles.
    */
  var renderOnAddRemove: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Based on vptCoords and object.aCoords, skip rendering of objects that
    * are not included in current viewport.
    * May greatly help in applications with crowded canvas and use of zoom/pan
    * If One of the corner of the bounding box of the object is on the canvas
    * the objects get rendered.
    */
  var skipOffscreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether objects' state should be saved
    */
  var stateful: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, getSvgTransform() will apply the StaticCanvas.viewportTransform to the SVG transformation. When true,
    * a zoomed canvas will then produce zoomed SVG output.
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
    */
  var vptCoords: js.UndefOr[Tl] = js.undefined
}
object IStaticCanvasOptions {
  
  inline def apply(): IStaticCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStaticCanvasOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IStaticCanvasOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowTouchScrolling(value: Boolean): Self = StObject.set(x, "allowTouchScrolling", value.asInstanceOf[js.Any])
    
    inline def setAllowTouchScrollingUndefined: Self = StObject.set(x, "allowTouchScrolling", js.undefined)
    
    inline def setBackgroundColor(value: String | Pattern): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundImage(value: Image | String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setBackgroundVpt(value: Boolean): Self = StObject.set(x, "backgroundVpt", value.asInstanceOf[js.Any])
    
    inline def setBackgroundVptUndefined: Self = StObject.set(x, "backgroundVpt", js.undefined)
    
    inline def setClipPath(value: Object): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    inline def setControlsAboveOverlay(value: Boolean): Self = StObject.set(x, "controlsAboveOverlay", value.asInstanceOf[js.Any])
    
    inline def setControlsAboveOverlayUndefined: Self = StObject.set(x, "controlsAboveOverlay", js.undefined)
    
    inline def setEnableRetinaScaling(value: Boolean): Self = StObject.set(x, "enableRetinaScaling", value.asInstanceOf[js.Any])
    
    inline def setEnableRetinaScalingUndefined: Self = StObject.set(x, "enableRetinaScaling", js.undefined)
    
    inline def setImageSmoothingEnabled(value: Boolean): Self = StObject.set(x, "imageSmoothingEnabled", value.asInstanceOf[js.Any])
    
    inline def setImageSmoothingEnabledUndefined: Self = StObject.set(x, "imageSmoothingEnabled", js.undefined)
    
    inline def setIncludeDefaultValues(value: Boolean): Self = StObject.set(x, "includeDefaultValues", value.asInstanceOf[js.Any])
    
    inline def setIncludeDefaultValuesUndefined: Self = StObject.set(x, "includeDefaultValues", js.undefined)
    
    inline def setOverlayColor(value: String | Pattern): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
    
    inline def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
    
    inline def setOverlayImage(value: Image): Self = StObject.set(x, "overlayImage", value.asInstanceOf[js.Any])
    
    inline def setOverlayImageUndefined: Self = StObject.set(x, "overlayImage", js.undefined)
    
    inline def setOverlayVpt(value: Boolean): Self = StObject.set(x, "overlayVpt", value.asInstanceOf[js.Any])
    
    inline def setOverlayVptUndefined: Self = StObject.set(x, "overlayVpt", js.undefined)
    
    inline def setRenderOnAddRemove(value: Boolean): Self = StObject.set(x, "renderOnAddRemove", value.asInstanceOf[js.Any])
    
    inline def setRenderOnAddRemoveUndefined: Self = StObject.set(x, "renderOnAddRemove", js.undefined)
    
    inline def setSkipOffscreen(value: Boolean): Self = StObject.set(x, "skipOffscreen", value.asInstanceOf[js.Any])
    
    inline def setSkipOffscreenUndefined: Self = StObject.set(x, "skipOffscreen", js.undefined)
    
    inline def setStateful(value: Boolean): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
    
    inline def setStatefulUndefined: Self = StObject.set(x, "stateful", js.undefined)
    
    inline def setSvgViewportTransformation(value: Boolean): Self = StObject.set(x, "svgViewportTransformation", value.asInstanceOf[js.Any])
    
    inline def setSvgViewportTransformationUndefined: Self = StObject.set(x, "svgViewportTransformation", js.undefined)
    
    inline def setViewportTransform(value: js.Array[Double]): Self = StObject.set(x, "viewportTransform", value.asInstanceOf[js.Any])
    
    inline def setViewportTransformUndefined: Self = StObject.set(x, "viewportTransform", js.undefined)
    
    inline def setViewportTransformVarargs(value: Double*): Self = StObject.set(x, "viewportTransform", js.Array(value*))
    
    inline def setVptCoords(value: Tl): Self = StObject.set(x, "vptCoords", value.asInstanceOf[js.Any])
    
    inline def setVptCoordsUndefined: Self = StObject.set(x, "vptCoords", js.undefined)
  }
}
