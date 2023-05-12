package typings.getNpmTarballUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Registry extends StObject {
    
    var registry: js.UndefOr[String] = js.undefined
  }
  object Registry {
    
    inline def apply(): Registry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Registry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Registry] (val x: Self) extends AnyVal {
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
}
