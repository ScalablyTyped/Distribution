package typings.expoConfigureSplashScreen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends js.Object {
  
  var target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXNativeTarget */ js.Any = js.native
  
  var uuid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any = js.native
}
object Target {
  
  @scala.inline
  def apply(
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXNativeTarget */ js.Any,
    uuid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any
  ): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTarget(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXNativeTarget */ js.Any
    ): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any
    ): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
}
