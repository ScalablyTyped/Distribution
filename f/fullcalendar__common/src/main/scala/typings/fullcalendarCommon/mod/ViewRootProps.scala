package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewRootProps extends StObject {
  
  def children(
    rootElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    classNames: js.Array[String]
  ): Any
  
  var elRef: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any
  ] = js.undefined
  
  var viewSpec: ViewSpec
}
object ViewRootProps {
  
  inline def apply(
    children: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any, js.Array[String]) => Any,
    viewSpec: ViewSpec
  ): ViewRootProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), viewSpec = viewSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewRootProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewRootProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any, js.Array[String]) => Any
    ): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    inline def setElRef(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any
    ): Self = StObject.set(x, "elRef", value.asInstanceOf[js.Any])
    
    inline def setElRefUndefined: Self = StObject.set(x, "elRef", js.undefined)
    
    inline def setViewSpec(value: ViewSpec): Self = StObject.set(x, "viewSpec", value.asInstanceOf[js.Any])
  }
}
