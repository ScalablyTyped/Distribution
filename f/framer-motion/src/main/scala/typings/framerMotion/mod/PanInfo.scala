package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Passed in to pan event handlers like `onPan` the `PanInfo` object contains
  * information about the current state of the tap gesture such as its
  * `point`, `delta`, `offset` and `velocity`.
  *
  * ```jsx
  * <motion.div onPan={(event, info) => {
  *   console.log(info.point.x, info.point.y)
  * }} />
  * ```
  *
  * @public
  */
trait PanInfo extends StObject {
  
  /**
    * Contains `x` and `y` values for the distance moved since
    * the last event.
    *
    * ```jsx
    * function onPan(event, info) {
    *   console.log(info.delta.x, info.delta.y)
    * }
    *
    * <motion.div onPan={onPan} />
    * ```
    *
    * @public
    */
  var delta: Point
  
  /**
    * Contains `x` and `y` values for the distance moved from
    * the first pan event.
    *
    * ```jsx
    * function onPan(event, info) {
    *   console.log(info.offset.x, info.offset.y)
    * }
    *
    * <motion.div onPan={onPan} />
    * ```
    *
    * @public
    */
  var offset: Point
  
  /**
    * Contains `x` and `y` values for the current pan position relative
    * to the device or page.
    *
    * ```jsx
    * function onPan(event, info) {
    *   console.log(info.point.x, info.point.y)
    * }
    *
    * <motion.div onPan={onPan} />
    * ```
    *
    * @public
    */
  var point: Point
  
  /**
    * Contains `x` and `y` values for the current velocity of the pointer, in px/ms.
    *
    * ```jsx
    * function onPan(event, info) {
    *   console.log(info.velocity.x, info.velocity.y)
    * }
    *
    * <motion.div onPan={onPan} />
    * ```
    *
    * @public
    */
  var velocity: Point
}
object PanInfo {
  
  inline def apply(delta: Point, offset: Point, point: Point, velocity: Point): PanInfo = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PanInfo] (val x: Self) extends AnyVal {
    
    inline def setDelta(value: Point): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Point): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
