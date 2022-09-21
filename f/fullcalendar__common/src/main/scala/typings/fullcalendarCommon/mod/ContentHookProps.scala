package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentHookProps[HookProps] extends StObject {
  
  var backupElRef: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefObject<any> */ Any
  ] = js.undefined
  
  def children(
    innerElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    innerContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
  ): Any
  
  var content: CustomContentGenerator[HookProps]
  
  var defaultContent: js.UndefOr[DefaultContentGenerator[HookProps]] = js.undefined
  
  var hookProps: HookProps
}
object ContentHookProps {
  
  inline def apply[HookProps](
    children: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any) => Any,
    content: CustomContentGenerator[HookProps],
    hookProps: HookProps
  ): ContentHookProps[HookProps] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), content = content.asInstanceOf[js.Any], hookProps = hookProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentHookProps[HookProps]]
  }
  
  extension [Self <: ContentHookProps[?], HookProps](x: Self & ContentHookProps[HookProps]) {
    
    inline def setBackupElRef(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefObject<any> */ Any
    ): Self = StObject.set(x, "backupElRef", value.asInstanceOf[js.Any])
    
    inline def setBackupElRefUndefined: Self = StObject.set(x, "backupElRef", js.undefined)
    
    inline def setChildren(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any) => Any
    ): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    inline def setContent(value: CustomContentGenerator[HookProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: HookProps => CustomContent): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setDefaultContent(
      value: HookProps => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ): Self = StObject.set(x, "defaultContent", js.Any.fromFunction1(value))
    
    inline def setDefaultContentUndefined: Self = StObject.set(x, "defaultContent", js.undefined)
    
    inline def setHookProps(value: HookProps): Self = StObject.set(x, "hookProps", value.asInstanceOf[js.Any])
  }
}
