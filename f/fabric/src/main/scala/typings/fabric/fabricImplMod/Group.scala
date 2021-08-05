package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fabric.fabricImplMod.IObjectOptions because Already inherited
- typings.fabric.fabricImplMod.IGroupOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, canvas, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined subTargetCheck, useSetOnGroup */ @JSImport("fabric/fabric-impl", "Group")
@js.native
/**
  * Constructor
  * @param objects Group objects
  * @param [options] Options object
  */
class Group ()
  extends Object
     with ICollection[Group] {
  def this(objects: js.Array[Object]) = this()
  def this(objects: js.Array[Object], options: IGroupOptions) = this()
  def this(objects: Unit, options: IGroupOptions) = this()
  def this(objects: js.Array[Object], options: Unit, isAlreadyGrouped: Boolean) = this()
  def this(objects: js.Array[Object], options: IGroupOptions, isAlreadyGrouped: Boolean) = this()
  def this(objects: Unit, options: Unit, isAlreadyGrouped: Boolean) = this()
  def this(objects: Unit, options: IGroupOptions, isAlreadyGrouped: Boolean) = this()
  
  /**
    * @private
    */
  def _calcBounds(): Unit = js.native
  def _calcBounds(onlyWidthHeight: Boolean): Unit = js.native
  
  /**
    * @private
    */
  def _onObjectRemoved(`object`: Object): Unit = js.native
  
  /**
    * Retores original state of each of group objects (original state is that which was before group was created).
    * @private
    * @return {fabric.Group} thisArg
    * @chainable
    */
  def _restoreObjectsState(): Group = js.native
  
  /**
    * @private
    * @param {Boolean} [skipCoordsChange] if true, coordinates of objects enclosed in a group do not change
    */
  def _updateObjectsCoords(): Unit = js.native
  def _updateObjectsCoords(center: Point): Unit = js.native
  
  /**
    * Adds an object to a group; Then recalculates group's dimension, position.
    * @param [Object] object
    * @return thisArg
    * @chainable
    */
  def addWithUpdate(): Group = js.native
  def addWithUpdate(`object`: Object): Group = js.native
  
  /**
    * Returns complexity of an instance
    */
  /* InferMemberOverrides */
  override def complexity(): Double = js.native
  
  /**
    * Destroys a group (restoring state of its objects)
    * @return {fabric.Group} thisArg
    * @chainable
    */
  def destroy(): Group = js.native
  
  /**
    * Check if this group or its parent group are caching, recursively up
    * @return {Boolean}
    */
  def isOnACache(): Boolean = js.native
  
  /**
    * Realises the transform from this group onto the supplied object
    * i.e. it tells you what would happen if the supplied object was in
    * the group, and then the group was destroyed. It mutates the supplied
    * object.
    * @param {fabric.Object} object
    * @return {fabric.Object} transformedObject
    */
  def realizeTransform(`object`: Object): Object = js.native
  
  /**
    * Removes an object from a group; Then recalculates group's dimension, position.
    * @return thisArg
    * @chainable
    */
  def removeWithUpdate(`object`: Object): Group = js.native
  
  /**
    * Sets coordinates of all group objects
    * @return thisArg
    * @chainable
    */
  def setObjectsCoords(): Group = js.native
  
  /**
    * Indicates if click, mouseover, mouseout events & hoverCursor should also check for subtargets
    * @type Boolean
    */
  var subTargetCheck: js.UndefOr[Boolean] = js.native
  
  /**
    * make a group an active selection, remove the group from canvas
    * the group has to be on canvas for this to work.
    * @return {fabric.ActiveSelection} thisArg
    * @chainable
    */
  def toActiveSelection(): ActiveSelection = js.native
  
  /**
    * Destroys a group (restoring state of its objects)
    * @return {fabric.Group} thisArg
    * @chainable
    */
  def ungroupOnCanvas(): Group = js.native
  
  /**
    * setOnGroup is a method used for TextBox that is no more used since 2.0.0 The behavior is still
    * available setting this boolean to true.
    * @type Boolean
    * @since 2.0.0
    * @default
    */
  var useSetOnGroup: js.UndefOr[Boolean] = js.native
}
/* static members */
object Group {
  
  @JSImport("fabric/fabric-impl", "Group")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns {@link fabric.Group} instance from an object representation
    * @param object Object to create a group from
    * @param [callback] Callback to invoke when an group instance is created
    */
  inline def fromObject(`object`: js.Any, callback: js.Function1[/* group */ this.type, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
