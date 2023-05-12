package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Passed in to tap event handlers like `onTap` the `TapInfo` object contains
  * information about the tap gesture such as it‘s location.
  *
  * ```jsx
  * function onTap(event, info) {
  *   console.log(info.point.x, info.point.y)
  * }
  *
  * <motion.div onTap={onTap} />
  * ```
  *
  * @public
  */
trait TapInfo extends StObject {
  
  /**
    * Contains `x` and `y` values for the tap gesture relative to the
    * device or page.
    *
    * ```jsx
    * function onTapStart(event, info) {
    *   console.log(info.point.x, info.point.y)
    * }
    *
    * <motion.div onTapStart={onTapStart} />
    * ```
    *
    * @public
    */
  var point: Point
}
object TapInfo {
  
  inline def apply(point: Point): TapInfo = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TapInfo] (val x: Self) extends AnyVal {
    
    inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
