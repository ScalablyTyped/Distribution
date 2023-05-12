package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.browser.manifest.MatchPattern
import typings.firefoxWebextBrowser.browser.manifest.OptionalPermission
import typings.firefoxWebextBrowser.browser.manifest.Permission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Not allowed in: Content scripts, Devtools pages */
object permissions {
  
  trait AnyPermissions extends StObject {
    
    var origins: js.UndefOr[js.Array[MatchPattern]] = js.undefined
    
    var permissions: js.UndefOr[js.Array[Permission]] = js.undefined
  }
  object AnyPermissions {
    
    inline def apply(): AnyPermissions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnyPermissions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnyPermissions] (val x: Self) extends AnyVal {
      
      inline def setOrigins(value: js.Array[MatchPattern]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      inline def setOriginsVarargs(value: MatchPattern*): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setPermissions(value: js.Array[Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value*))
    }
  }
  
  /* permissions types */
  trait Permissions extends StObject {
    
    var origins: js.UndefOr[js.Array[MatchPattern]] = js.undefined
    
    var permissions: js.UndefOr[js.Array[OptionalPermission]] = js.undefined
  }
  object Permissions {
    
    inline def apply(): Permissions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Permissions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Permissions] (val x: Self) extends AnyVal {
      
      inline def setOrigins(value: js.Array[MatchPattern]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      inline def setOriginsVarargs(value: MatchPattern*): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setPermissions(value: js.Array[OptionalPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      inline def setPermissionsVarargs(value: OptionalPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
    }
  }
}
