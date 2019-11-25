package typings.fabric.fabricDashImplMod

import typings.fabric.Anon_BlBr
import typings.fabric.Anon_BlBrMb
import typings.fabric.Anon_E
import typings.fabric.Anon_EEvent
import typings.fabric.Anon_HeightLeft
import typings.fabric.Anon_PropertySet
import typings.fabric.Anon_ScaleX
import typings.fabric.Anon_X
import typings.fabric.fabricStrings.bl
import typings.fabric.fabricStrings.br
import typings.fabric.fabricStrings.fill
import typings.fabric.fabricStrings.mb
import typings.fabric.fabricStrings.ml
import typings.fabric.fabricStrings.mr
import typings.fabric.fabricStrings.mt
import typings.fabric.fabricStrings.mtr
import typings.fabric.fabricStrings.stroke
import typings.fabric.fabricStrings.tl
import typings.fabric.fabricStrings.tr
import typings.std.CanvasRenderingContext2D
import typings.std.Event
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Object")
@js.native
class Object ()
  extends IObservable[Object]
     with IObjectOptions
     with IObjectAnimation[Object] {
  def this(options: IObjectOptions) = this()
  var _controlsVisibility: Anon_BlBr = js.native
  /**
  	 * @private
  	 * @param {CanvasRenderingContext2D} ctx Context to render on
  	 * @param {Object} filler fabric.Pattern or fabric.Gradient
  	 * @return {Object} offset.offsetX offset for text rendering
  	 * @return {Object} offset.offsetY offset for text rendering
  	 */
  def _applyPatternGradientTransform(ctx: CanvasRenderingContext2D, filler: String): Unit = js.native
  def _applyPatternGradientTransform(ctx: CanvasRenderingContext2D, filler: Gradient): Unit = js.native
  def _applyPatternGradientTransform(ctx: CanvasRenderingContext2D, filler: Pattern): Unit = js.native
  /**
  	 * Determines which corner has been clicked
  	 * @private
  	 * @param {Object} pointer The pointer indicating the mouse position
  	 * @return {String|Boolean} corner code (tl, tr, bl, br, etc.), or false if nothing is found
  	 */
  def _findTargetCorner(pointer: Anon_X): Boolean | bl | br | mb | ml | mr | mt | tl | tr | mtr = js.native
  /**
  	 * Returns the instance of the control visibility set for this object.
  	 * @private
  	 * @returns {Object}
  	 */
  def _getControlsVisibility(): Anon_BlBrMb = js.native
  /**
  	 * Returns the top, left coordinates
  	 * @private
  	 * @return {fabric.Point}
  	 */
  def _getLeftTopCoords(): Point = js.native
  /*
  	 * Calculate object dimensions from its properties
  	 * @private
  	 * @return {Object} .x width dimension
  	 * @return {Object} .y height dimension
  	 */
  def _getNonTransformedDimensions(): Anon_X = js.native
  /*
  	 * Calculate object bounding box dimensions from its properties scale, skew.
  	 * @private
  	 * @return {Object} .x width dimension
  	 * @return {Object} .y height dimension
  	 */
  def _getTransformedDimensions(): Anon_X = js.native
  def _getTransformedDimensions(skewX: Double): Anon_X = js.native
  def _getTransformedDimensions(skewX: Double, skewY: Double): Anon_X = js.native
  /**
  	 * @private
  	 * @param {CanvasRenderingContext2D} ctx Context to render on
  	 */
  def _removeShadow(ctx: CanvasRenderingContext2D): Unit = js.native
  /**
  	 * @private
  	 * @param {CanvasRenderingContext2D} ctx Context to render on
  	 */
  def _render(ctx: CanvasRenderingContext2D): Unit = js.native
  /**
  	 * @private
  	 * @param {CanvasRenderingContext2D} ctx Context to render on
  	 */
  def _renderFill(ctx: CanvasRenderingContext2D): Unit = js.native
  /**
  	 * @private
  	 * @param {CanvasRenderingContext2D} ctx Context to render on
  	 */
  def _renderPaintInOrder(ctx: CanvasRenderingContext2D): Unit = js.native
  /**
  	 * @param ctx
  	 * @private
  	 */
  def _renderStroke(ctx: CanvasRenderingContext2D): Unit = js.native
  /**
  	 * @private
  	 * @param {String} key
  	 * @param {*} value
  	 */
  def _set(key: String, value: js.Any): Object = js.native
  /**
  	 * @private
  	 * Sets line dash
  	 * @param {CanvasRenderingContext2D} ctx Context to set the dash line on
  	 * @param {Array} dashArray array representing dashes
  	 * @param {Function} alternative function to call if browser does not support lineDash
  	 */
  def _setLineDash(ctx: CanvasRenderingContext2D, dashArray: js.Array[Double]): Unit = js.native
  def _setLineDash(
    ctx: CanvasRenderingContext2D,
    dashArray: js.Array[Double],
    alternative: js.Function1[/* ctx */ CanvasRenderingContext2D, Unit]
  ): Unit = js.native
  /**
  	 * @param to One of 'left', 'center', 'right'
  	 */
  def adjustPosition(to: String): Unit = js.native
  // functions from object stacking mixin
  // -----------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Moves an object up in stack of drawn objects
  	 * @param [intersecting] If `true`, send object in front of next upper intersecting object
  	 */
  def bringForward(): Object = js.native
  def bringForward(intersecting: Boolean): Object = js.native
  /**
  	 * Moves an object to the top of the stack of drawn objects
  	 */
  def bringToFront(): Object = js.native
  /**
  	 * Calculate and returns the .coords of an object.
  	 * @return {Object} Object with tl, tr, br, bl ....
  	 * @chainable
  	 */
  def calcCoords(): js.Any = js.native
  def calcCoords(absolute: Boolean): js.Any = js.native
  /**
  	 * calculate transform matrix that represents the current transformations from the
  	 * object's properties, this matrix does not include the group transformation
  	 * @return {Array} transform matrix for the object
  	 */
  def calcOwnMatrix(): js.Array[_] = js.native
  /**
  	 * calculate trasform Matrix that represent current transformation from
  	 * object properties.
  	 * @param {Boolean} [skipGroup] return transformMatrix for object and not go upward with parents
  	 * @return {Array} matrix Transform Matrix for the object
  	 */
  def calcTransformMatrix(): js.Array[_] = js.native
  def calcTransformMatrix(skipGroup: Boolean): js.Array[_] = js.native
  /**
  	 * Centers object vertically and horizontally on canvas to which is was added last
  	 * You might need to call `setCoords` on an object after centering, to update controls area.
  	 */
  def center(): Object = js.native
  /**
  	 * Centers object horizontally on canvas to which it was added last.
  	 * You might need to call `setCoords` on an object after centering, to update controls area.
  	 */
  def centerH(): Object = js.native
  /**
  	 * Centers object vertically on canvas to which it was added last.
  	 * You might need to call `setCoords` on an object after centering, to update controls area.
  	 */
  def centerV(): Object = js.native
  /**
  	 * Clones an instance, using a callback method will work for every object.
  	 * @param callback Callback is invoked with a clone as a first argument
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def clone(callback: js.Function): Unit = js.native
  def clone(callback: js.Function, propertiesToInclude: js.Array[String]): Unit = js.native
  /**
  	 * Creates an instance of fabric.Image out of an object
  	 * @param callback callback, invoked with an instance as a first argument
  	 */
  def cloneAsImage(callback: js.Function): Object = js.native
  def cloneAsImage(callback: js.Function, options: IDataURLOptions): Object = js.native
  /**
  	 * Returns complexity of an instance
  	 */
  def complexity(): Double = js.native
  /**
  	 * Checks if point is inside the object
  	 * @param {fabric.Point} point Point to check against
  	 * @param {Object} [lines] object returned from @method _getImageLines
  	 * @param {Boolean} [absolute] use coordinates without viewportTransform
  	 * @param {Boolean} [calculate] use coordinates of current position instead of .oCoords
  	 * @return {Boolean} true if point is inside the object
  	 */
  def containsPoint(point: Point): Boolean = js.native
  def containsPoint(point: Point, lines: js.Any): Boolean = js.native
  def containsPoint(point: Point, lines: js.Any, absolute: Boolean): Boolean = js.native
  def containsPoint(point: Point, lines: js.Any, absolute: Boolean, calculate: Boolean): Boolean = js.native
  // functions from interactivity mixin
  // -----------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Draws borders of an object's bounding box.
  	 * Requires public properties: width, height
  	 * Requires public options: padding, borderColor
  	 * @param {CanvasRenderingContext2D} ctx Context to draw on
  	 * @param {Object} styleOverride object to override the object style
  	 * @return {fabric.Object} thisArg
  	 * @chainable
  	 */
  def drawBorders(ctx: CanvasRenderingContext2D): Object = js.native
  def drawBorders(ctx: CanvasRenderingContext2D, styleOverride: js.Any): Object = js.native
  /**
  	 * Draws borders of an object's bounding box when it is inside a group.
  	 * Requires public properties: width, height
  	 * Requires public options: padding, borderColor
  	 * @param {CanvasRenderingContext2D} ctx Context to draw on
  	 * @param {object} options object representing current object parameters
  	 * @param {Object} styleOverride object to override the object style
  	 * @return {fabric.Object} thisArg
  	 * @chainable
  	 */
  def drawBordersInGroup(ctx: CanvasRenderingContext2D): Object = js.native
  def drawBordersInGroup(ctx: CanvasRenderingContext2D, options: js.Any): Object = js.native
  def drawBordersInGroup(ctx: CanvasRenderingContext2D, options: js.Any, styleOverride: js.Any): Object = js.native
  /**
  	 * Paint the cached copy of the object on the target context.
  	 * @param {CanvasRenderingContext2D} ctx Context to render on
  	 */
  def drawCacheOnCanvas(ctx: CanvasRenderingContext2D): Unit = js.native
  /**
  	 * Execute the drawing operation for an object clipPath
  	 * @param {CanvasRenderingContext2D} ctx Context to render on
  	 */
  def drawClipPathOnCache(ctx: CanvasRenderingContext2D): Unit = js.native
  /**
  	 * Draws corners of an object's bounding box.
  	 * Requires public properties: width, height
  	 * Requires public options: cornerSize, padding
  	 * @param {CanvasRenderingContext2D} ctx Context to draw on
  	 * @param {Object} styleOverride object to override the object style
  	 * @return {fabric.Object} thisArg
  	 * @chainable
  	 */
  def drawControls(ctx: CanvasRenderingContext2D): Object = js.native
  def drawControls(ctx: CanvasRenderingContext2D, styleOverride: js.Any): Object = js.native
  /**
  	 * Draws corners of an object's bounding box.
  	 * Requires public properties: width, height
  	 * Requires public options: cornerSize, padding
  	 * @param ctx Context to draw on
  	 */
  def drawCorners(context: CanvasRenderingContext2D): Object = js.native
  /**
  	 * Execute the drawing operation for an object on a specified context
  	 * @param {CanvasRenderingContext2D} ctx Context to render on
  	 */
  def drawObject(ctx: CanvasRenderingContext2D): Unit = js.native
  /**
  	 * Draws a colored layer behind the object, inside its selection borders.
  	 * Requires public options: padding, selectionBackgroundColor
  	 * this function is called when the context is transformed
  	 * has checks to be skipped when the object is on a staticCanvas
  	 * @param {CanvasRenderingContext2D} ctx Context to draw on
  	 * @return {fabric.Object} thisArg
  	 * @chainable
  	 */
  def drawSelectionBackground(ctx: CanvasRenderingContext2D): Object = js.native
  def fire(eventName: String): Unit = js.native
  def fire(eventName: String, options: js.Any): Unit = js.native
  /**
  	 * Same as straighten but with animation
  	 */
  def fxStraighten(callbacks: Callbacks): Object = js.native
  /**
  	 * Basic getter
  	 * @param property Property name
  	 */
  def get[K /* <: String */](property: K): /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any = js.native
  /**
  	 * Returns coordinates of object's bounding rectangle (left, top, width, height)
  	 * the box is intented as aligned to axis of canvas.
  	 * @param {Boolean} [absolute] use coordinates without viewportTransform
  	 * @param {Boolean} [calculate] use coordinates of current position instead of .oCoords / .aCoords
  	 * @return {Object} Object with left, top, width, height properties
  	 */
  def getBoundingRect(): Anon_HeightLeft = js.native
  def getBoundingRect(absolute: Boolean): Anon_HeightLeft = js.native
  def getBoundingRect(absolute: Boolean, calculate: Boolean): Anon_HeightLeft = js.native
  /**
  	 * Returns the real center coordinates of the object
  	 */
  def getCenterPoint(): Point = js.native
  /**
  	 * return correct set of coordinates for intersection
  	 */
  def getCoords(): js.Any = js.native
  def getCoords(absolute: Boolean): js.Any = js.native
  def getCoords(absolute: Boolean, calculate: Boolean): js.Any = js.native
  /**
  	 * Returns coordinates of a pointer relative to an object
  	 * @param e Event to operate upon
  	 * @param [pointer] Pointer to operate upon (instead of event)
  	 */
  def getLocalPointer(e: Event): Anon_X = js.native
  def getLocalPointer(e: Event, pointer: Anon_X): Anon_X = js.native
  /**
  	 * Return the object opacity counting also the group property
  	 * @return {Number}
  	 */
  def getObjectOpacity(): Double = js.native
  /**
  	 * Return the object scale factor counting also the group scaling
  	 * @return {Object} object with scaleX and scaleY properties
  	 */
  def getObjectScaling(): Anon_ScaleX = js.native
  /**
  	 * Returns the coordinates of the object as if it has a different origin
  	 * @param {String} originX Horizontal origin: 'left', 'center' or 'right'
  	 * @param {String} originY Vertical origin: 'top', 'center' or 'bottom'
  	 * @return {fabric.Point}
  	 */
  def getPointByOrigin(originX: String, originY: String): Point = js.native
  /**
  	 * Returns height of an object bounding box counting transformations
  	 * before 2.0 it was named getHeight();
  	 * @return {Number} height value
  	 */
  def getScaledHeight(): Double = js.native
  /**
  	 * Returns width of an object bounding box counting transformations
  	 * before 2.0 it was named getWidth();
  	 * @return {Number} width value
  	 */
  def getScaledWidth(): Double = js.native
  /**
  	 * Returns id attribute for svg output
  	 * @return {String}
  	 */
  def getSvgCommons(): String = js.native
  /**
  	 * Returns filter for svg shadow
  	 * @return {String}
  	 */
  def getSvgFilter(): String = js.native
  /**
  	 * Returns styles-string for svg-export
  	 * @param {Object} style the object from which to retrieve style properties
  	 * @param {Boolean} useWhiteSpace a boolean to include an additional attribute in the style.
  	 * @return {String}
  	 */
  def getSvgSpanStyles(style: js.Any): String = js.native
  def getSvgSpanStyles(style: js.Any, useWhiteSpace: Boolean): String = js.native
  // functions from object svg export mixin
  // -----------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Returns styles-string for svg-export
  	 * @param {Boolean} skipShadow a boolean to skip shadow filter output
  	 * @return {String}
  	 */
  def getSvgStyles(): String = js.native
  def getSvgStyles(skipShadow: Boolean): String = js.native
  /**
  	 * Returns text-decoration property for svg-export
  	 * @param {Object} style the object from which to retrieve style properties
  	 * @return {String}
  	 */
  def getSvgTextDecoration(style: js.Any): String = js.native
  /**
  	 * Returns transform-string for svg-export
  	 * @param {Boolean} use the full transform or the single object one.
  	 * @return {String}
  	 */
  def getSvgTransform(): String = js.native
  def getSvgTransform(full: Boolean): String = js.native
  def getSvgTransform(full: Boolean, additionalTransform: String): String = js.native
  /**
  	 * Returns transform-string for svg-export from the transform matrix of single elements
  	 */
  def getSvgTransformMatrix(): String = js.native
  /**
  	 * Return the object scale factor counting also the group scaling, zoom and retina
  	 * @return {Object} object with scaleX and scaleY properties
  	 */
  def getTotalObjectScaling(): Anon_ScaleX = js.native
  /**
  	 * Retrieves viewportTransform from Object's canvas if possible
  	 */
  def getViewportTransform(): js.Array[_] = js.native
  // functions from stateful mixin
  // -----------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Returns true if object state (one of its state properties) was changed
  	 * @param {String} [propertySet] optional name for the set of property we want to save
  	 * @return {Boolean} true if instance' state has changed since `{@link fabric.Object#saveState}` was called
  	 */
  def hasStateChanged(propertySet: String): Boolean = js.native
  def initialize(): Object = js.native
  def initialize(options: IObjectOptions): Object = js.native
  /**
  	 * Checks if object intersects with another object
  	 * @param {Object} other Object to test
  	 * @param {Boolean} [absolute] use coordinates without viewportTransform
  	 * @param {Boolean} [calculate] use coordinates of current position instead of .oCoords
  	 * @return {Boolean} true if object intersects with another object
  	 */
  def intersectsWithObject(other: Object): Boolean = js.native
  def intersectsWithObject(other: Object, absolute: Boolean): Boolean = js.native
  def intersectsWithObject(other: Object, absolute: Boolean, calculate: Boolean): Boolean = js.native
  /**
  	 * Checks if object intersects with an area formed by 2 points
  	 * @param {Object} pointTL top-left point of area
  	 * @param {Object} pointBR bottom-right point of area
  	 * @param {Boolean} [absolute] use coordinates without viewportTransform
  	 * @param {Boolean} [calculate] use coordinates of current position instead of .oCoords
  	 * @return {Boolean} true if object intersects with an area formed by 2 points
  	 */
  def intersectsWithRect(pointTL: js.Any, pointBR: js.Any): Boolean = js.native
  def intersectsWithRect(pointTL: js.Any, pointBR: js.Any, absolute: Boolean): Boolean = js.native
  def intersectsWithRect(pointTL: js.Any, pointBR: js.Any, absolute: Boolean, calculate: Boolean): Boolean = js.native
  /**
  	 * Check if cache is dirty
  	 * @param {Boolean} skipCanvas skip canvas checks because this object is painted
  	 * on parent canvas.
  	 */
  def isCacheDirty(): Boolean = js.native
  def isCacheDirty(skipCanvas: Boolean): Boolean = js.native
  /**
  	 * Checks if object is fully contained within area of another object
  	 * @param {Object} other Object to test
  	 * @param {Boolean} [absolute] use coordinates without viewportTransform
  	 * @param {Boolean} [calculate] use coordinates of current position instead of .oCoords
  	 * @return {Boolean} true if object is fully contained within area of another object
  	 */
  def isContainedWithinObject(other: Object): Boolean = js.native
  def isContainedWithinObject(other: Object, absolute: Boolean): Boolean = js.native
  def isContainedWithinObject(other: Object, absolute: Boolean, calculate: Boolean): Boolean = js.native
  /**
  	 * Checks if object is fully contained within area formed by 2 points
  	 * @param pointTL top-left point of area
  	 * @param pointBR bottom-right point of area
  	 */
  def isContainedWithinRect(pointTL: js.Any, pointBR: js.Any): Boolean = js.native
  def isContainedWithinRect(pointTL: js.Any, pointBR: js.Any, absolute: Boolean): Boolean = js.native
  def isContainedWithinRect(pointTL: js.Any, pointBR: js.Any, absolute: Boolean, calculate: Boolean): Boolean = js.native
  /**
  	 * Returns true if the specified control is visible, false otherwise.
  	 * @param controlName The name of the control. Possible values are 'tl', 'tr', 'br', 'bl', 'ml', 'mt', 'mr', 'mb', 'mtr'.
  	 */
  def isControlVisible(controlName: String): Boolean = js.native
  /**
  	 * Checks if object is contained within the canvas with current viewportTransform
  	 * the check is done stopping at first point that appears on screen
  	 * @param {Boolean} [calculate] use coordinates of current position instead of .aCoords
  	 * @return {Boolean} true if object is fully or partially contained within canvas
  	 */
  def isOnScreen(): Boolean = js.native
  def isOnScreen(calculate: Boolean): Boolean = js.native
  /**
  	 * Checks if object is partially contained within the canvas with current viewportTransform
  	 * @param {Boolean} [calculate] use coordinates of current position instead of .oCoords
  	 * @return {Boolean} true if object is partially contained within canvas
  	 */
  def isPartiallyOnScreen(): Boolean = js.native
  def isPartiallyOnScreen(calculate: Boolean): Boolean = js.native
  /**
  	 * Returns true if specified type is identical to the type of an instance
  	 * @param type Type to check against
  	 */
  def isType(`type`: String): Boolean = js.native
  /**
  	 * Moves an object to specified level in stack of drawn objects
  	 * @param index New position of object
  	 */
  def moveTo(index: Double): Object = js.native
  /**
  	 * When set to `true`, force the object to have its own cache, even if it is inside a group
  	 * it may be needed when your object behave in a particular way on the cache and always needs
  	 * its own isolated canvas to render correctly.
  	 * Created to be overridden
  	 * since 1.7.12
  	 * @returns false
  	 */
  def needsItsOwnCache(): Boolean = js.native
  /**
  	 * This callback function is called every time _discardActiveObject or _setActiveObject
  	 * try to to deselect this object. If the function returns true, the process is cancelled
  	 * @return {Boolean} true to cancel selection
  	 */
  def onDeselect(options: Anon_E): Boolean = js.native
  /**
  	 * This callback function is called every time _discardActiveObject or _setActiveObject
  	 * try to to select this object. If the function returns true, the process is cancelled
  	 */
  def onSelect(options: Anon_EEvent): Boolean = js.native
  /**
  	 * Renders an object on a specified context
  	 * @param {CanvasRenderingContext2D} ctx Context to render on
  	 */
  def render(ctx: CanvasRenderingContext2D): Unit = js.native
  /**
  	 * Sets "angle" of an instance
  	 * @param angle Angle value
  	 */
  def rotate(angle: Double): Object = js.native
  /**
  	 * Saves state of an object
  	 * @param [options] Object with additional `stateProperties` array to include when saving state
  	 * @return thisArg
  	 */
  def saveState(): Object = js.native
  def saveState(options: Anon_PropertySet): Object = js.native
  /**
  	 * Scales an object (equally by x and y)
  	 * @param value Scale factor
  	 * @return thisArg
  	 */
  def scale(value: Double): Object = js.native
  /**
  	 * Scales an object to a given height, with respect to bounding box (scaling by x/y equally)
  	 * @param value New height value
  	 */
  def scaleToHeight(value: Double): Object = js.native
  def scaleToHeight(value: Double, absolute: Boolean): Object = js.native
  /**
  	 * Scales an object to a given width, with respect to bounding box (scaling by x/y equally)
  	 * @param value New width value
  	 */
  def scaleToWidth(value: Double): Object = js.native
  def scaleToWidth(value: Double, absolute: Boolean): Object = js.native
  /**
  	 * Moves an object down in stack of drawn objects
  	 * @param [intersecting] If `true`, send object behind next lower intersecting object
  	 */
  def sendBackwards(): Object = js.native
  def sendBackwards(intersecting: Boolean): Object = js.native
  /**
  	 * Moves an object to the bottom of the stack of drawn objects
  	 */
  def sendToBack(): Object = js.native
  /**
  	 * Sets property to a given value.
  	 * When changing position/dimension -related properties (left, top, scale, angle, etc.) `set` does not update position of object's borders/controls.
  	 * If you need to update those, call `setCoords()`.
  	 * @param options Property object, iterate over the object properties
  	 */
  def set(options: Partial[this.type]): Object = js.native
  /**
  	 * Sets property to a given value.
  	 * When changing position/dimension -related properties (left, top, scale, angle, etc.) `set` does not update position of object's borders/controls.
  	 * If you need to update those, call `setCoords()`.
  	 * @param key Property name
  	 * @param value Property value (if function, the value is passed into it and its return value is used as a new one)
  	 */
  def set[K /* <: String */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
  ): Object = js.native
  def set[K /* <: String */](
    key: K,
    value: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
    ]
  ): Object = js.native
  /**
  	 * Sets "angle" of an instance
  	 * @param angle Angle value
  	 */
  def setAngle(angle: Double): Object = js.native
  /**
  	 * Sets "color" of an instance (alias of `set('fill', …)`)
  	 * @param color Color value
  	 */
  def setColor(color: String): Object = js.native
  /**
  	 * Sets the visibility of the specified control.
  	 * @param controlName The name of the control. Possible values are 'tl', 'tr', 'br', 'bl', 'ml', 'mt', 'mr', 'mb', 'mtr'.
  	 * @param visible true to set the specified control visible, false otherwise
  	 */
  def setControlVisible(controlName: String, visible: Boolean): Object = js.native
  /**
  	 * Sets the visibility state of object controls.
  	 * @param [options] Options object
  	 */
  def setControlsVisibility(): this.type = js.native
  def setControlsVisibility(options: Anon_BlBr): this.type = js.native
  // functions from geometry mixin
  // -------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Sets corner position coordinates based on current angle, width and height.
  	 * See {@link https://github.com/kangax/fabric.js/wiki/When-to-call-setCoords|When-to-call-setCoords}
  	 * @param {Boolean} [ignoreZoom] set oCoords with or without the viewport transform.
  	 * @param {Boolean} [skipAbsolute] skip calculation of aCoords, usefull in setViewportTransform
  	 * @return {fabric.Object} thisArg
  	 * @chainable
  	 */
  def setCoords(): Object = js.native
  def setCoords(ignoreZoom: Boolean): Object = js.native
  def setCoords(ignoreZoom: Boolean, skipAbsolute: Boolean): Object = js.native
  @JSName("setGradient")
  def setGradient_fill(property: fill): Object = js.native
  @JSName("setGradient")
  def setGradient_fill(property: fill, options: IGradientOptions): Object = js.native
  /**
  	 * Sets gradient (fill or stroke) of an object
  	 * **Backwards incompatibility note:** This method was named "setGradientFill" until v1.1.0
  	 * @param property Property name 'stroke' or 'fill'
  	 * @param [options] Options object
  	 */
  @JSName("setGradient")
  def setGradient_stroke(property: stroke): Object = js.native
  @JSName("setGradient")
  def setGradient_stroke(property: stroke, options: IGradientOptions): Object = js.native
  /**
  	 * This callback function is called by the parent group of an object every
  	 * time a non-delegated property changes on the group. It is passed the key
  	 * and value as parameters. Not adding in this function's signature to avoid
  	 * Travis build error about unused variables.
  	 */
  def setOnGroup(): Unit = js.native
  /**
  	 * Sets object's properties from options
  	 * @param [options] Options object
  	 */
  def setOptions(): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  /* Sets object's properties from options
  	 * @param {Object} [options] Options object
  	 */
  def setOptions(options: IObjectOptions): Unit = js.native
  /**
  	 * Sets pattern fill of an object
  	 * @param options Options object
  	 */
  def setPatternFill(options: IFillOptions, callback: js.Function): Object = js.native
  /**
  	 * Sets the position of the object taking into consideration the object's origin
  	 * @param pos The new position of the object
  	 * @param originX Horizontal origin: 'left', 'center' or 'right'
  	 * @param originY Vertical origin: 'top', 'center' or 'bottom'
  	 */
  def setPositionByOrigin(pos: Point, originX: String, originY: String): Unit = js.native
  /**
  	 * Sets shadow of an object
  	 * @param [options] Options object or string (e.g. "2px 2px 10px rgba(0,0,0,0.2)")
  	 */
  def setShadow(): Object = js.native
  def setShadow(options: String): Object = js.native
  def setShadow(options: Shadow): Object = js.native
  /**
  	 * Sets sourcePath of an object
  	 * @param value Value to set sourcePath to
  	 */
  def setSourcePath(value: String): Object = js.native
  /**
  	 * Setups state of an object
  	 * @param {Object} [options] Object with additional `stateProperties` array to include when saving state
  	 * @return {fabric.Object} thisArg
  	 */
  def setupState(): Object = js.native
  def setupState(options: js.Any): Object = js.native
  /**
  	 * Decide if the object should cache or not. Create its own cache level
  	 * objectCaching is a global flag, wins over everything
  	 * needsItsOwnCache should be used when the object drawing method requires
  	 * a cache step. None of the fabric classes requires it.
  	 * Generally you do not cache objects in groups because the group outside is cached.
  	 * @return {Boolean}
  	 */
  def shouldCache(): Boolean = js.native
  // functions from object straightening mixin
  // -----------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Straightens an object (rotating it from current angle to one of 0, 90, 180, 270, etc. depending on which is closer)
  	 */
  def straighten(): Object = js.native
  /**
  	 * Converts an object into a HTMLCanvas element
  	 * @param {Object} options Options object
  	 * @param {Number} [options.multiplier=1] Multiplier to scale by
  	 * @param {Number} [options.left] Cropping left offset. Introduced in v1.2.14
  	 * @param {Number} [options.top] Cropping top offset. Introduced in v1.2.14
  	 * @param {Number} [options.width] Cropping width. Introduced in v1.2.14
  	 * @param {Number} [options.height] Cropping height. Introduced in v1.2.14
  	 * @param {Boolean} [options.enableRetinaScaling] Enable retina scaling for clone image. Introduce in 1.6.4
  	 * @param {Boolean} [options.withoutTransform] Remove current object transform ( no scale , no angle, no flip, no skew ). Introduced in 2.3.4
  	 * @param {Boolean} [options.withoutShadow] Remove current object shadow. Introduced in 2.4.2
  	 * @return {String} Returns a data: URL containing a representation of the object in the format specified by options.format
  	 */
  def toCanvasElement(): String = js.native
  def toCanvasElement(options: IDataURLOptions): String = js.native
  /**
  	 * Returns svg clipPath representation of an instance
  	 * @param {Function} [reviver] Method for further parsing of svg representation.
  	 * @return {String} svg representation of an instance
  	 */
  def toClipPathSVG(): String = js.native
  def toClipPathSVG(reviver: js.Function): String = js.native
  /**
  	 * Converts an object into a data-url-like string
  	 * @param options Options object
  	 */
  def toDataURL(options: IDataURLOptions): String = js.native
  /**
  	 * Returns (dataless) object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toDatalessObject(): js.Any = js.native
  def toDatalessObject(propertiesToInclude: js.Array[String]): js.Any = js.native
  /**
  	 * Returns a JSON representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toJSON(): js.Any = js.native
  def toJSON(propertiesToInclude: js.Array[String]): js.Any = js.native
  /**
  	 * Returns the point in local coordinates
  	 * @param point The point relative to the global coordinate system
  	 * @param originX Horizontal origin: 'left', 'center' or 'right'
  	 * @param originY Vertical origin: 'top', 'center' or 'bottom'
  	 */
  def toLocalPoint(point: Point, originX: String, originY: String): Point = js.native
  /**
  	 * Returns an object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toObject(): js.Any = js.native
  def toObject(propertiesToInclude: js.Array[String]): js.Any = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @param {Function} [reviver] Method for further parsing of svg representation.
  	 * @return {String} svg representation of an instance
  	 */
  def toSVG(): String = js.native
  def toSVG(reviver: js.Function): String = js.native
  /**
  	 * Toggles specified property from `true` to `false` or from `false` to `true`
  	 * @param property Property to toggle
  	 */
  def toggle(property: String): Object = js.native
  /**
  	 * Transforms context when rendering an object
  	 * @param {CanvasRenderingContext2D} ctx Context
  	 */
  def transform(ctx: CanvasRenderingContext2D): Unit = js.native
  // functions from object origin mixin
  // -----------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Translates the coordinates from origin to center coordinates (based on the object's dimensions)
  	 * @param point The point which corresponds to the originX and originY params
  	 * @param originX Horizontal origin: 'left', 'center' or 'right'
  	 * @param originY Vertical origin: 'top', 'center' or 'bottom'
  	 */
  def translateToCenterPoint(point: Point, originX: String, originY: String): Point = js.native
  /**
  	 * Translates the coordinates from a set of origin to another (based on the object's dimensions)
  	 * @param {fabric.Point} point The point which corresponds to the originX and originY params
  	 * @param {String} fromOriginX Horizontal origin: 'left', 'center' or 'right'
  	 * @param {String} fromOriginY Vertical origin: 'top', 'center' or 'bottom'
  	 * @param {String} toOriginX Horizontal origin: 'left', 'center' or 'right'
  	 * @param {String} toOriginY Vertical origin: 'top', 'center' or 'bottom'
  	 * @return {fabric.Point}
  	 */
  def translateToGivenOrigin(pointL: Point, fromOriginX: String, fromOriginY: String, toOriginX: String, toOriginY: String): Point = js.native
  /**
  	 * Translates the coordinates from center to origin coordinates (based on the object's dimensions)
  	 * @param center The point which corresponds to center of the object
  	 * @param originX Horizontal origin: 'left', 'center' or 'right'
  	 * @param originY Vertical origin: 'top', 'center' or 'bottom'
  	 */
  def translateToOriginPoint(center: Point, originX: String, originY: String): Point = js.native
  /**
  	 * Centers object on current viewport of canvas to which it was added last.
  	 * You might need to call `setCoords` on an object after centering, to update controls area.
  	 * @return {fabric.Object} thisArg
  	 * @chainable
  	 */
  def viewportCenter(): Object = js.native
  /**
  	 * Centers object horizontally on current viewport of canvas to which it was added last.
  	 * You might need to call `setCoords` on an object after centering, to update controls area.
  	 * @return {fabric.Object} thisArg
  	 * @chainable
  	 */
  def viewportCenterH(): Object = js.native
  /**
  	 * Centers object vertically on current viewport of canvas to which it was added last.
  	 * You might need to call `setCoords` on an object after centering, to update controls area.
  	 * @return {fabric.Object} thisArg
  	 * @chainable
  	 */
  def viewportCenterV(): Object = js.native
  /**
  	 * Check if this object or a child object will cast a shadow
  	 * used by Group.shouldCache to know if child has a shadow recursively
  	 * @return {Boolean}
  	 */
  def willDrawShadow(): Boolean = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Object")
@js.native
object Object extends js.Object {
  /**
  	 * Creates fabric Object instance
  	 * @param {string} Class name
  	 * @param {fabric.Object} Original object
  	 * @param {Function} Callback when complete
  	 * @param {Object} Extra parameters for fabric.Object
  	 * @private
  	 * @return {fabric.Object}
  	 */
  def _fromObject(className: String, `object`: Object): Object = js.native
  def _fromObject(className: String, `object`: Object, callback: js.Function): Object = js.native
  def _fromObject(className: String, `object`: Object, callback: js.Function, extraParam: js.Any): Object = js.native
}

