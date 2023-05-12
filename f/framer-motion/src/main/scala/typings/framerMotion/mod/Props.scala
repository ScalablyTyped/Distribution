package typings.framerMotion.mod

import typings.framerMotion.framerMotionStrings.x
import typings.framerMotion.framerMotionStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props[V] extends StObject {
  
  /**
    * A HTML element to render this component as. Defaults to `"ul"`.
    *
    * @public
    */
  var as: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with typings.framerMotion.framerMotionStrings.a, typings.framerMotion.framerMotionStrings.abbr, typings.framerMotion.framerMotionStrings.address */ Any
  ] = js.undefined
  
  /**
    * The axis to reorder along. By default, items will be draggable on this axis.
    * To make draggable on both axes, set `<Reorder.Item drag />`
    *
    * @public
    */
  var axis: js.UndefOr[x | y] = js.undefined
  
  /**
    * A callback to fire with the new value order. For instance, if the values
    * are provided as a state from `useState`, this could be the set state function.
    *
    * @public
    */
  def onReorder(newOrder: js.Array[Any]): Unit
  
  /**
    * The latest values state.
    *
    * ```jsx
    * function Component() {
    *   const [items, setItems] = useState([0, 1, 2])
    *
    *   return (
    *     <Reorder.Group values={items} onReorder={setItems}>
    *         {items.map((item) => <Reorder.Item key={item} value={item} />)}
    *     </Reorder.Group>
    *   )
    * }
    * ```
    *
    * @public
    */
  var values: js.Array[V]
}
object Props {
  
  inline def apply[V](onReorder: js.Array[Any] => Unit, values: js.Array[V]): Props[V] = {
    val __obj = js.Dynamic.literal(onReorder = js.Any.fromFunction1(onReorder), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Props[?], V] (val x: Self & Props[V]) extends AnyVal {
    
    inline def setAs(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with typings.framerMotion.framerMotionStrings.a, typings.framerMotion.framerMotionStrings.abbr, typings.framerMotion.framerMotionStrings.address */ Any
    ): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAxis(value: typings.framerMotion.framerMotionStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setOnReorder(value: js.Array[Any] => Unit): Self = StObject.set(x, "onReorder", js.Any.fromFunction1(value))
    
    inline def setValues(value: js.Array[V]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: V*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
