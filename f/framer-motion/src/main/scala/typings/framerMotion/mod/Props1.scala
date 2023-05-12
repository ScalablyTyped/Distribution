package typings.framerMotion.mod

import typings.framerMotion.framerMotionBooleans.`true`
import typings.framerMotion.framerMotionStrings.position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props1[V] extends StObject {
  
  /**
    * A HTML element to render this component as. Defaults to `"li"`.
    *
    * @public
    */
  var as: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with typings.framerMotion.framerMotionStrings.a, typings.framerMotion.framerMotionStrings.abbr, typings.framerMotion.framerMotionStrings.address */ Any
  ] = js.undefined
  
  /**
    * A subset of layout options primarily used to disable layout="size"
    *
    * @public
    * @default true
    */
  var layout: js.UndefOr[`true` | position] = js.undefined
  
  /**
    * The value in the list that this component represents.
    *
    * @public
    */
  var value: V
}
object Props1 {
  
  inline def apply[V](value: V): Props1[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props1[V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Props1[?], V] (val x: Self & Props1[V]) extends AnyVal {
    
    inline def setAs(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with typings.framerMotion.framerMotionStrings.a, typings.framerMotion.framerMotionStrings.abbr, typings.framerMotion.framerMotionStrings.address */ Any
    ): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setLayout(value: `true` | position): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
