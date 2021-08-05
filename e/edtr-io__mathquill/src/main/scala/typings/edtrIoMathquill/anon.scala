package typings.edtrIoMathquill

import typings.edtrIoMathquill.mod.MQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Edit extends StObject {
    
    var edit: js.UndefOr[js.Function1[/* mathField */ MQ, js.Any]] = js.undefined
    
    var enter: js.UndefOr[js.Function1[/* mathField */ MQ, js.Any]] = js.undefined
    
    var moveOutOf: js.UndefOr[js.Function2[/* direction */ Double, /* mathField */ MQ, js.Any]] = js.undefined
    
    var upOutOf: js.UndefOr[js.Function1[/* mathField */ MQ, js.Any]] = js.undefined
  }
  object Edit {
    
    inline def apply(): Edit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Edit]
    }
    
    extension [Self <: Edit](x: Self) {
      
      inline def setEdit(value: /* mathField */ MQ => js.Any): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
      
      inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      inline def setEnter(value: /* mathField */ MQ => js.Any): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setMoveOutOf(value: (/* direction */ Double, /* mathField */ MQ) => js.Any): Self = StObject.set(x, "moveOutOf", js.Any.fromFunction2(value))
      
      inline def setMoveOutOfUndefined: Self = StObject.set(x, "moveOutOf", js.undefined)
      
      inline def setUpOutOf(value: /* mathField */ MQ => js.Any): Self = StObject.set(x, "upOutOf", js.Any.fromFunction1(value))
      
      inline def setUpOutOfUndefined: Self = StObject.set(x, "upOutOf", js.undefined)
    }
  }
}
