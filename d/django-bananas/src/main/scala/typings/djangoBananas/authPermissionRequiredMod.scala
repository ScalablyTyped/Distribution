package typings.djangoBananas

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authPermissionRequiredMod extends Shortcut {
  
  @JSImport("django-bananas/auth/PermissionRequired", JSImport.Default)
  @js.native
  val default: FC[PermissionRequiredProps] = js.native
  
  trait PermissionRequiredProps extends StObject {
    
    var allMustMatch: js.UndefOr[Boolean] = js.undefined
    
    var permission: String | js.Array[String]
  }
  object PermissionRequiredProps {
    
    inline def apply(permission: String | js.Array[String]): PermissionRequiredProps = {
      val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionRequiredProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PermissionRequiredProps] (val x: Self) extends AnyVal {
      
      inline def setAllMustMatch(value: Boolean): Self = StObject.set(x, "allMustMatch", value.asInstanceOf[js.Any])
      
      inline def setAllMustMatchUndefined: Self = StObject.set(x, "allMustMatch", js.undefined)
      
      inline def setPermission(value: String | js.Array[String]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
      
      inline def setPermissionVarargs(value: String*): Self = StObject.set(x, "permission", js.Array(value*))
    }
  }
  
  type _To = FC[PermissionRequiredProps]
  
  /* This means you don't have to write `default`, but can instead just say `authPermissionRequiredMod.foo` */
  override def _to: FC[PermissionRequiredProps] = default
}
