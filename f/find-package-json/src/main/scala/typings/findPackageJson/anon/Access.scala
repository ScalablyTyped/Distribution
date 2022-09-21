package typings.findPackageJson.anon

import org.scalablytyped.runtime.StringDictionary
import typings.findPackageJson.findPackageJsonStrings.public
import typings.findPackageJson.findPackageJsonStrings.restricted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Access
  extends StObject
     with /* k */ StringDictionary[js.UndefOr[Any]] {
  
  var access: js.UndefOr[public | restricted] = js.undefined
  
  var registry: js.UndefOr[String] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
}
object Access {
  
  inline def apply(): Access = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Access]
  }
  
  extension [Self <: Access](x: Self) {
    
    inline def setAccess(value: public | restricted): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
