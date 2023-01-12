package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderHookProps[ContentArg] extends StObject {
  
  def children(
    rootElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    classNames: js.Array[String],
    innerElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    innerContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
  ): Any
  @JSName("children")
  var children_Original: RenderHookPropsChildren
  
  var classNames: ClassNamesGenerator[ContentArg]
  
  var content: CustomContentGenerator[ContentArg]
  
  var defaultContent: js.UndefOr[DefaultContentGenerator[ContentArg]] = js.undefined
  
  def didMount(mountArg: MountArg[ContentArg]): Unit
  @JSName("didMount")
  var didMount_Original: DidMountHandler[MountArg[ContentArg]]
  
  var elRef: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any
  ] = js.undefined
  
  var hookProps: ContentArg
  
  def willUnmount(mountArg: MountArg[ContentArg]): Unit
  @JSName("willUnmount")
  var willUnmount_Original: WillUnmountHandler[MountArg[ContentArg]]
}
object RenderHookProps {
  
  inline def apply[ContentArg](
    children: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* rootElRef */ Any, /* classNames */ js.Array[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* innerElRef */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ /* innerContent */ Any) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any,
    classNames: ClassNamesGenerator[ContentArg],
    content: CustomContentGenerator[ContentArg],
    didMount: MountArg[ContentArg] => Unit,
    hookProps: ContentArg,
    willUnmount: MountArg[ContentArg] => Unit
  ): RenderHookProps[ContentArg] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction4(children), classNames = classNames.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], didMount = js.Any.fromFunction1(didMount), hookProps = hookProps.asInstanceOf[js.Any], willUnmount = js.Any.fromFunction1(willUnmount))
    __obj.asInstanceOf[RenderHookProps[ContentArg]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderHookProps[?], ContentArg] (val x: Self & RenderHookProps[ContentArg]) extends AnyVal {
    
    inline def setChildren(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* rootElRef */ Any, /* classNames */ js.Array[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* innerElRef */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ /* innerContent */ Any) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ): Self = StObject.set(x, "children", js.Any.fromFunction4(value))
    
    inline def setClassNames(value: ClassNamesGenerator[ContentArg]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesFunction1(value: ContentArg => ClassNamesInput): Self = StObject.set(x, "classNames", js.Any.fromFunction1(value))
    
    inline def setClassNamesVarargs(value: String*): Self = StObject.set(x, "classNames", js.Array(value*))
    
    inline def setContent(value: CustomContentGenerator[ContentArg]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: ContentArg => CustomContent): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setDefaultContent(
      value: ContentArg => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ): Self = StObject.set(x, "defaultContent", js.Any.fromFunction1(value))
    
    inline def setDefaultContentUndefined: Self = StObject.set(x, "defaultContent", js.undefined)
    
    inline def setDidMount(value: MountArg[ContentArg] => Unit): Self = StObject.set(x, "didMount", js.Any.fromFunction1(value))
    
    inline def setElRef(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any
    ): Self = StObject.set(x, "elRef", value.asInstanceOf[js.Any])
    
    inline def setElRefUndefined: Self = StObject.set(x, "elRef", js.undefined)
    
    inline def setHookProps(value: ContentArg): Self = StObject.set(x, "hookProps", value.asInstanceOf[js.Any])
    
    inline def setWillUnmount(value: MountArg[ContentArg] => Unit): Self = StObject.set(x, "willUnmount", js.Any.fromFunction1(value))
  }
}
