package typings.emotionNative.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[C /* <: ComponentClass[Any, ComponentState] */] extends StObject {
  
  var ref: js.UndefOr[typings.react.mod.Ref[InstanceType[C]]] = js.undefined
}
object `0` {
  
  inline def apply[C /* <: ComponentClass[Any, ComponentState] */](): `0`[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`[?], C /* <: ComponentClass[Any, ComponentState] */] (val x: Self & `0`[C]) extends AnyVal {
    
    inline def setRef(value: typings.react.mod.Ref[InstanceType[C]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ InstanceType[C] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
