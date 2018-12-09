package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Object")
@js.native
class Object ()
  extends IObservable[Object]
     with IObjectOptions
     with IObjectAnimation[Object] {
  var overlayFill: java.lang.String = js.native
  var stateProperties: js.Array[_] = js.native
  /**
  	 * @param to One of 'left', 'center', 'right'
  	 */
  def adjustPosition(to: java.lang.String): scala.Unit = js.native
  // functions from object stacking mixin
  // -----------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Moves an object up in stack of drawn objects
  	 * @param [intersecting] If `true`, send object in front of next upper intersecting object
  	 */
  def bringForward(): this.type = js.native
  // functions from object stacking mixin
  // -----------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Moves an object up in stack of drawn objects
  	 * @param [intersecting] If `true`, send object in front of next upper intersecting object
  	 */
  def bringForward(intersecting: scala.Boolean): this.type = js.native
  /**
  	 * Moves an object to the top of the stack of drawn objects
  	 */
  def bringToFront(): this.type = js.native
  /**
  	 * Centers object vertically and horizontally on canvas to which is was added last
  	 * You might need to call `setCoords` on an object after centering, to update controls area.
  	 */
  def center(): this.type = js.native
  /**
  	 * Centers object horizontally on canvas to which it was added last.
  	 * You might need to call `setCoords` on an object after centering, to update controls area.
  	 */
  def centerH(): this.type = js.native
  /**
  	 * Centers object vertically on canvas to which it was added last.
  	 * You might need to call `setCoords` on an object after centering, to update controls area.
  	 */
  def centerV(): this.type = js.native
  /**
  	 * Clones an instance, using a callback method will work for every object.
  	 * @param callback Callback is invoked with a clone as a first argument
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def clone(callback: js.Function1[/* clone */ this.type, scala.Unit]): scala.Unit = js.native
  /**
  	 * Clones an instance, using a callback method will work for every object.
  	 * @param callback Callback is invoked with a clone as a first argument
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def clone(
    callback: js.Function1[/* clone */ this.type, scala.Unit],
    propertiesToInclude: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
  	 * Creates an instance of fabric.Image out of an object
  	 * @param callback callback, invoked with an instance as a first argument
  	 */
  def cloneAsImage(callback: js.Function1[/* image */ Image, scala.Unit]): this.type = js.native
  /**
  	 * Returns complexity of an instance
  	 */
  def complexity(): scala.Double = js.native
  /**
  	 * Checks if point is inside the object
  	 * @param point Point to check against
  	 */
  def containsPoint(point: Point): scala.Boolean = js.native
  // functions from interactivity mixin
  // -----------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Draws borders of an object's bounding box.
  	 * Requires public properties: width, height
  	 * Requires public options: padding, borderColor
  	 * @param ctx Context to draw on
  	 */
  def drawBorders(context: stdLib.CanvasRenderingContext2D): this.type = js.native
  /**
  	 * Draws corners of an object's bounding box.
  	 * Requires public properties: width, height
  	 * Requires public options: cornerSize, padding
  	 * @param ctx Context to draw on
  	 */
  def drawCorners(context: stdLib.CanvasRenderingContext2D): Object = js.native
  /**
  	 * Same as straighten but with animation
  	 */
  def fxStraighten(callbacks: Callbacks): this.type = js.native
  /**
  	 * Basic getter
  	 * @param property Property name
  	 */
  def get[K /* <: java.lang.String */](property: K): /* import warning: Failed type conversion: TsTypeLookup(TsTypeThis(),Left(TsIdentSimple(K))) */js.Any = js.native
  def getAngle(): scala.Double = js.native
  def getBorderColor(): java.lang.String = js.native
  def getBorderScaleFactor(): scala.Double = js.native
  /**
  	 * Returns coordinates of object's bounding rectangle (left, top, width, height)
       * @param absoluteopt use coordinates without viewportTransform
       * @param calculateopt use coordinates of current position instead of .oCoords / .aCoords
  	 * @return Object with left, top, width, height properties
  	 */
  def getBoundingRect(): fabricLib.Anon_Top = js.native
  /**
  	 * Returns coordinates of object's bounding rectangle (left, top, width, height)
       * @param absoluteopt use coordinates without viewportTransform
       * @param calculateopt use coordinates of current position instead of .oCoords / .aCoords
  	 * @return Object with left, top, width, height properties
  	 */
  def getBoundingRect(absoluteopt: scala.Boolean): fabricLib.Anon_Top = js.native
  /**
  	 * Returns coordinates of object's bounding rectangle (left, top, width, height)
       * @param absoluteopt use coordinates without viewportTransform
       * @param calculateopt use coordinates of current position instead of .oCoords / .aCoords
  	 * @return Object with left, top, width, height properties
  	 */
  def getBoundingRect(absoluteopt: scala.Boolean, calculateopt: scala.Boolean): fabricLib.Anon_Top = js.native
  /**
  	 * Returns the real center coordinates of the object
  	 */
  def getCenterPoint(): Point = js.native
  def getCornersize(): scala.Double = js.native
  def getCurrentHeight(): scala.Double = js.native
  def getCurrentWidth(): scala.Double = js.native
  def getFill(): java.lang.String = js.native
  def getFillRule(): java.lang.String = js.native
  def getFlipX(): scala.Boolean = js.native
  def getFlipY(): scala.Boolean = js.native
  def getHeight(): scala.Double = js.native
  def getLeft(): scala.Double = js.native
  /**
  	 * Returns coordinates of a pointer relative to an object
  	 * @param e Event to operate upon
  	 * @param [pointer] Pointer to operate upon (instead of event)
  	 */
  def getLocalPointer(e: stdLib.Event): fabricLib.Anon_Y = js.native
  /**
  	 * Returns coordinates of a pointer relative to an object
  	 * @param e Event to operate upon
  	 * @param [pointer] Pointer to operate upon (instead of event)
  	 */
  def getLocalPointer(e: stdLib.Event, pointer: fabricLib.Anon_Y): fabricLib.Anon_Y = js.native
  def getOpacity(): scala.Double = js.native
  def getOverlayFill(): java.lang.String = js.native
  /**
  	 * Returns the coordinates of the object as if it has a different origin
  	 * @param originX Horizontal origin: 'left', 'center' or 'right'
  	 * @param originY Vertical origin: 'top', 'center' or 'bottom'
  	 */
  def getPointByOrigin(): Point = js.native
  def getScaleX(): scala.Double = js.native
  def getScaleY(): scala.Double = js.native
  def getShadow(): Object = js.native
  def getSkewX(): scala.Double = js.native
  def getSkewY(): scala.Double = js.native
  // functions from object svg export mixin
  // -----------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Returns styles-string for svg-export
  	 */
  def getSvgStyles(): java.lang.String = js.native
  /**
  	 * Returns transform-string for svg-export
  	 */
  def getSvgTransform(): java.lang.String = js.native
  /**
  	 * Returns transform-string for svg-export from the transform matrix of single elements
  	 */
  def getSvgTransformMatrix(): java.lang.String = js.native
  def getTop(): scala.Double = js.native
  /**
  	 * Retrieves viewportTransform from Object's canvas if possible
  	 */
  def getViewportTransform(): scala.Boolean = js.native
  def getWidth(): scala.Double = js.native
  // functions from stateful mixin
  // -----------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Returns true if object state (one of its state properties) was changed
  	 */
  def hasStateChanged(): scala.Boolean = js.native
  /**
  	 * Checks if object intersects with another object
  	 * @param other Object to test
  	 */
  def intersectsWithObject(other: Object): scala.Boolean = js.native
  /**
  	 * Checks if object intersects with an area formed by 2 points
  	 * @param pointTL top-left point of area
  	 * @param pointBR bottom-right point of area
  	 */
  def intersectsWithRect(pointTL: js.Any, pointBR: js.Any): scala.Boolean = js.native
  /**
  	 * Checks if object is fully contained within area of another object
  	 * @param other Object to test
  	 */
  def isContainedWithinObject(other: Object): scala.Boolean = js.native
  /**
  	 * Checks if object is fully contained within area formed by 2 points
  	 * @param pointTL top-left point of area
  	 * @param pointBR bottom-right point of area
  	 */
  def isContainedWithinRect(pointTL: js.Any, pointBR: js.Any): scala.Boolean = js.native
  /**
  	 * Returns true if the specified control is visible, false otherwise.
  	 * @param controlName The name of the control. Possible values are 'tl', 'tr', 'br', 'bl', 'ml', 'mt', 'mr', 'mb', 'mtr'.
  	 */
  def isControlVisible(controlName: java.lang.String): scala.Boolean = js.native
  /**
  	 * Returns true if specified type is identical to the type of an instance
  	 * @param type Type to check against
  	 */
  def isType(`type`: java.lang.String): scala.Boolean = js.native
  /**
  	 * Moves an object to specified level in stack of drawn objects
  	 * @param index New position of object
  	 */
  def moveTo(index: scala.Double): this.type = js.native
  /**
  	 * Removes object from canvas to which it was added last
  	 */
  def remove(): Object = js.native
  /**
  	 * Renders an object on a specified context
  	 * @param ctx Context to render on
  	 * @param [noTransform] When true, context is not transformed
  	 */
  def render(ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  /**
  	 * Renders an object on a specified context
  	 * @param ctx Context to render on
  	 * @param [noTransform] When true, context is not transformed
  	 */
  def render(ctx: stdLib.CanvasRenderingContext2D, noTransform: scala.Boolean): scala.Unit = js.native
  /**
  	 * Sets "angle" of an instance
  	 * @param angle Angle value
  	 */
  def rotate(angle: scala.Double): this.type = js.native
  /**
  	 * Saves state of an object
  	 * @param [options] Object with additional `stateProperties` array to include when saving state
  	 * @return thisArg
  	 */
  def saveState(): this.type = js.native
  /**
  	 * Saves state of an object
  	 * @param [options] Object with additional `stateProperties` array to include when saving state
  	 * @return thisArg
  	 */
  def saveState(options: fabricLib.Anon_StateProperties): this.type = js.native
  /**
  	 * Scales an object (equally by x and y)
  	 * @param value Scale factor
  	 * @return thisArg
  	 */
  def scale(value: scala.Double): this.type = js.native
  /**
  	 * Scales an object to a given height, with respect to bounding box (scaling by x/y equally)
  	 * @param value New height value
  	 */
  def scaleToHeight(value: scala.Double): this.type = js.native
  /**
  	 * Scales an object to a given width, with respect to bounding box (scaling by x/y equally)
  	 * @param value New width value
  	 */
  def scaleToWidth(value: scala.Double): this.type = js.native
  /**
  	 * Moves an object down in stack of drawn objects
  	 * @param [intersecting] If `true`, send object behind next lower intersecting object
  	 */
  def sendBackwards(): this.type = js.native
  /**
  	 * Moves an object down in stack of drawn objects
  	 * @param [intersecting] If `true`, send object behind next lower intersecting object
  	 */
  def sendBackwards(intersecting: scala.Boolean): this.type = js.native
  /**
  	 * Moves an object to the bottom of the stack of drawn objects
  	 */
  def sendToBack(): this.type = js.native
  /**
  	 * Sets property to a given value.
  	 * When changing position/dimension -related properties (left, top, scale, angle, etc.) `set` does not update position of object's borders/controls.
  	 * If you need to update those, call `setCoords()`.
  	 * @param options Property object, iterate over the object properties
  	 */
  def set(options: stdLib.Partial[this.type]): this.type = js.native
  /**
  	 * Sets property to a given value.
  	 * When changing position/dimension -related properties (left, top, scale, angle, etc.) `set` does not update position of object's borders/controls.
  	 * If you need to update those, call `setCoords()`.
  	 * @param key Property name
  	 * @param value Property value (if function, the value is passed into it and its return value is used as a new one)
  	 */
  def set[K /* <: java.lang.String */](
    key: K,
    value: /* import warning: Failed type conversion: TsTypeLookup(TsTypeThis(),Left(TsIdentSimple(K))) */js.Any
  ): this.type = js.native
  /**
  	 * Sets property to a given value.
  	 * When changing position/dimension -related properties (left, top, scale, angle, etc.) `set` does not update position of object's borders/controls.
  	 * If you need to update those, call `setCoords()`.
  	 * @param key Property name
  	 * @param value Property value (if function, the value is passed into it and its return value is used as a new one)
  	 */
  def set[K /* <: java.lang.String */](
    key: K,
    value: js.Function1[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeThis(),Left(TsIdentSimple(K))) *//* value */ js.Any, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeThis(),Left(TsIdentSimple(K))) */js.Any
    ]
  ): this.type = js.native
  def setAngle(value: scala.Double): Object = js.native
  /**
  	 * Sets "angle" of an instance
  	 * @param angle Angle value
  	 */
  @JSName("setAngle")
  def `setAngle_<this>`(angle: scala.Double): this.type = js.native
  def setBorderColor(value: java.lang.String): Object = js.native
  /**
  	 * Sets "color" of an instance (alias of `set('fill', …)`)
  	 * @param color Color value
  	 */
  def setColor(color: java.lang.String): this.type = js.native
  /**
  	 * Sets the visibility of the specified control.
  	 * @param controlName The name of the control. Possible values are 'tl', 'tr', 'br', 'bl', 'ml', 'mt', 'mr', 'mb', 'mtr'.
  	 * @param visible true to set the specified control visible, false otherwise
  	 */
  def setControlVisible(controlName: java.lang.String, visible: scala.Boolean): this.type = js.native
  /**
  	 * Sets the visibility state of object controls.
  	 * @param [options] Options object
  	 */
  def setControlsVisibility(): this.type = js.native
  /**
  	 * Sets the visibility state of object controls.
  	 * @param [options] Options object
  	 */
  def setControlsVisibility(options: fabricLib.Anon_Mb): this.type = js.native
  // functions from geometry mixin
  // -------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Sets corner position coordinates based on current angle, width and height
  	 * See https://github.com/kangax/fabric.js/wiki/When-to-call-setCoords
  	 */
  def setCoords(): this.type = js.native
  def setCornersize(value: scala.Double): Object = js.native
  def setFill(value: java.lang.String): Object = js.native
  def setFillRule(value: java.lang.String): Object = js.native
  def setFlipX(value: scala.Boolean): Object = js.native
  def setFlipY(value: scala.Boolean): Object = js.native
  /**
  	 * Sets gradient (fill or stroke) of an object
  	 * **Backwards incompatibility note:** This method was named "setGradientFill" until v1.1.0
  	 * @param property Property name 'stroke' or 'fill'
  	 * @param [options] Options object
  	 */
  @JSName("setGradient")
  def setGradient_fill(property: fabricLib.fabricLibStrings.fill, options: IGradientOptions): this.type = js.native
  /**
  	 * Sets gradient (fill or stroke) of an object
  	 * **Backwards incompatibility note:** This method was named "setGradientFill" until v1.1.0
  	 * @param property Property name 'stroke' or 'fill'
  	 * @param [options] Options object
  	 */
  @JSName("setGradient")
  def setGradient_stroke(property: fabricLib.fabricLibStrings.stroke, options: IGradientOptions): this.type = js.native
  def setHeight(value: scala.Double): Object = js.native
  def setLeft(value: scala.Double): Object = js.native
  def setOpacity(value: scala.Double): Object = js.native
  /* * Sets object's properties from options
  		* @param {Object} [options] Options object
  		*/
  def setOptions(options: IObjectOptions): scala.Unit = js.native
  /**
  	 * Sets object's properties from options
  	 * @param [options] Options object
  	 */
  def setOptions(options: js.Any): scala.Unit = js.native
  def setOverlayFill(value: java.lang.String): Object = js.native
  /**
  	 * Sets pattern fill of an object
  	 * @param options Options object
  	 */
  def setPatternFill(options: IFillOptions): this.type = js.native
  /**
  	 * Sets the position of the object taking into consideration the object's origin
  	 * @param pos The new position of the object
  	 * @param originX Horizontal origin: 'left', 'center' or 'right'
  	 * @param originY Vertical origin: 'top', 'center' or 'bottom'
  	 */
  def setPositionByOrigin(pos: Point, originX: java.lang.String, originY: java.lang.String): scala.Unit = js.native
  def setScaleX(value: scala.Double): Object = js.native
  def setScaleY(value: scala.Double): Object = js.native
  /**
  	 * Sets shadow of an object
  	 * @param [options] Options object or string (e.g. "2px 2px 10px rgba(0,0,0,0.2)")
  	 */
  def setShadow(): this.type = js.native
  /**
  	 * Sets shadow of an object
  	 * @param [options] Options object or string (e.g. "2px 2px 10px rgba(0,0,0,0.2)")
  	 */
  def setShadow(options: Shadow): this.type = js.native
  /**
  	 * Sets shadow of an object
  	 * @param [options] Options object or string (e.g. "2px 2px 10px rgba(0,0,0,0.2)")
  	 */
  def setShadow(options: java.lang.String): this.type = js.native
  def setShadow(options: js.Any): Object = js.native
  def setSkewX(value: scala.Double): Object = js.native
  def setSkewY(value: scala.Double): Object = js.native
  /**
  	 * Sets sourcePath of an object
  	 * @param value Value to set sourcePath to
  	 */
  def setSourcePath(value: java.lang.String): Object = js.native
  /**
  	 * Sets sourcePath of an object
  	 * @param value Value to set sourcePath to
  	 */
  @JSName("setSourcePath")
  def `setSourcePath_<this>`(value: java.lang.String): this.type = js.native
  def setTop(value: scala.Double): Object = js.native
  def setWidth(value: scala.Double): Object = js.native
  /**
  	 * Setups state of an object
  	 */
  def setupState(): this.type = js.native
  // functions from object straightening mixin
  // -----------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Straightens an object (rotating it from current angle to one of 0, 90, 180, 270, etc. depending on which is closer)
  	 */
  def straighten(): this.type = js.native
  /**
  	 * Converts an object into a data-url-like string
  	 * @param options Options object
  	 */
  def toDataURL(options: IDataURLOptions): java.lang.String = js.native
  /**
  	 * Returns (dataless) object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toDatalessObject(): js.Any = js.native
  /**
  	 * Returns (dataless) object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toDatalessObject(propertiesToInclude: js.Array[java.lang.String]): js.Any = js.native
  /**
  	 * Returns a JSON representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toJSON(): js.Any = js.native
  /**
  	 * Returns a JSON representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toJSON(propertiesToInclude: js.Array[java.lang.String]): js.Any = js.native
  /**
  	 * Returns the point in local coordinates
  	 * @param point The point relative to the global coordinate system
  	 * @param originX Horizontal origin: 'left', 'center' or 'right'
  	 * @param originY Vertical origin: 'top', 'center' or 'bottom'
  	 */
  def toLocalPoint(point: Point, originX: java.lang.String, originY: java.lang.String): Point = js.native
  /**
  	 * Returns an object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toObject(): js.Any = js.native
  /**
  	 * Returns an object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toObject(propertiesToInclude: js.Array[java.lang.String]): js.Any = js.native
  /**
  	 * Toggles specified property from `true` to `false` or from `false` to `true`
  	 * @param property Property to toggle
  	 */
  def toggle(property: java.lang.String): this.type = js.native
  /**
  	 * Transforms context when rendering an object
  	 * @param ctx Context
  	 * @param fromLeft When true, context is transformed to object's top/left corner. This is used when rendering text on Node
  	 */
  def transform(ctx: stdLib.CanvasRenderingContext2D, fromLeft: scala.Boolean): scala.Unit = js.native
  // functions from object origin mixin
  // -----------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Translates the coordinates from origin to center coordinates (based on the object's dimensions)
  	 * @param point The point which corresponds to the originX and originY params
  	 * @param originX Horizontal origin: 'left', 'center' or 'right'
  	 * @param originY Vertical origin: 'top', 'center' or 'bottom'
  	 */
  def translateToCenterPoint(point: Point, originX: java.lang.String, originY: java.lang.String): Point = js.native
  /**
  	 * Translates the coordinates from center to origin coordinates (based on the object's dimensions)
  	 * @param center The point which corresponds to center of the object
  	 * @param originX Horizontal origin: 'left', 'center' or 'right'
  	 * @param originY Vertical origin: 'top', 'center' or 'bottom'
  	 */
  def translateToOriginPoint(center: Point, originX: java.lang.String, originY: java.lang.String): Point = js.native
}

