package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeekNumberRootProps extends StObject {
  
  def children(
    rootElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    classNames: js.Array[String],
    innerElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    innerContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
  ): Any
  @JSName("children")
  var children_Original: RenderHookPropsChildren
  
  var date: js.Date
  
  var defaultFormat: DateFormatter
}
object WeekNumberRootProps {
  
  inline def apply(
    children: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* rootElRef */ Any, /* classNames */ js.Array[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* innerElRef */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ /* innerContent */ Any) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any,
    date: js.Date,
    defaultFormat: DateFormatter
  ): WeekNumberRootProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction4(children), date = date.asInstanceOf[js.Any], defaultFormat = defaultFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekNumberRootProps]
  }
  
  extension [Self <: WeekNumberRootProps](x: Self) {
    
    inline def setChildren(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* rootElRef */ Any, /* classNames */ js.Array[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* innerElRef */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ /* innerContent */ Any) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ): Self = StObject.set(x, "children", js.Any.fromFunction4(value))
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDefaultFormat(value: DateFormatter): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
  }
}
