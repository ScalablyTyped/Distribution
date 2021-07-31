package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  var group: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any
  
  var target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any
}
object Group {
  
  @scala.inline
  def apply(
    group: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any,
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any
  ): Group = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any
    ): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any
    ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
