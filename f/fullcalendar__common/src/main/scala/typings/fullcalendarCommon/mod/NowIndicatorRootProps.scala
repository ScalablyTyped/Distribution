package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NowIndicatorRootProps extends StObject {
  
  def children(
    rootElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    classNames: js.Array[String],
    innerElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    innerContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
  ): Any
  @JSName("children")
  var children_Original: RenderHookPropsChildren
  
  var date: js.Date
  
  var isAxis: Boolean
}
object NowIndicatorRootProps {
  
  inline def apply(
    children: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* rootElRef */ Any, /* classNames */ js.Array[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* innerElRef */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ /* innerContent */ Any) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any,
    date: js.Date,
    isAxis: Boolean
  ): NowIndicatorRootProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction4(children), date = date.asInstanceOf[js.Any], isAxis = isAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[NowIndicatorRootProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NowIndicatorRootProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* rootElRef */ Any, /* classNames */ js.Array[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* innerElRef */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ /* innerContent */ Any) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ): Self = StObject.set(x, "children", js.Any.fromFunction4(value))
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setIsAxis(value: Boolean): Self = StObject.set(x, "isAxis", value.asInstanceOf[js.Any])
  }
}
