package typings.fullcalendarVue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Vue extends StObject {
    
    var vue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_vnode.ScopedSlotChildren */ Any
  }
  object Vue {
    
    inline def apply(
      vue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_vnode.ScopedSlotChildren */ Any
    ): Vue = {
      val __obj = js.Dynamic.literal(vue = vue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Vue] (val x: Self) extends AnyVal {
      
      inline def setVue(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_vnode.ScopedSlotChildren */ Any
      ): Self = StObject.set(x, "vue", value.asInstanceOf[js.Any])
    }
  }
}
