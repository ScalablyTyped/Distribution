package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountHookProps[ContentArg] extends StObject {
  
  def children(
    rootElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any
  ): Any
  
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
object MountHookProps {
  
  inline def apply[ContentArg](
    children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any => Any,
    didMount: MountArg[ContentArg] => Unit,
    hookProps: ContentArg,
    willUnmount: MountArg[ContentArg] => Unit
  ): MountHookProps[ContentArg] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), didMount = js.Any.fromFunction1(didMount), hookProps = hookProps.asInstanceOf[js.Any], willUnmount = js.Any.fromFunction1(willUnmount))
    __obj.asInstanceOf[MountHookProps[ContentArg]]
  }
  
  extension [Self <: MountHookProps[?], ContentArg](x: Self & MountHookProps[ContentArg]) {
    
    inline def setChildren(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any => Any
    ): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setDidMount(value: MountArg[ContentArg] => Unit): Self = StObject.set(x, "didMount", js.Any.fromFunction1(value))
    
    inline def setElRef(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any
    ): Self = StObject.set(x, "elRef", value.asInstanceOf[js.Any])
    
    inline def setElRefUndefined: Self = StObject.set(x, "elRef", js.undefined)
    
    inline def setHookProps(value: ContentArg): Self = StObject.set(x, "hookProps", value.asInstanceOf[js.Any])
    
    inline def setWillUnmount(value: MountArg[ContentArg] => Unit): Self = StObject.set(x, "willUnmount", js.Any.fromFunction1(value))
  }
}
