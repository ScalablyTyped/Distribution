package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The install resources for the device.
  */
trait SchemaInstallsListResponse extends StObject {
  
  /**
    * An installation of an app for a user on a specific device. The existence
    * of an install implies that the user must have an entitlement to the app.
    */
  var install: js.UndefOr[js.Array[SchemaInstall]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#installsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaInstallsListResponse {
  
  inline def apply(): SchemaInstallsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstallsListResponse]
  }
  
  extension [Self <: SchemaInstallsListResponse](x: Self) {
    
    inline def setInstall(value: js.Array[SchemaInstall]): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
    
    inline def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
    
    inline def setInstallVarargs(value: SchemaInstall*): Self = StObject.set(x, "install", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
