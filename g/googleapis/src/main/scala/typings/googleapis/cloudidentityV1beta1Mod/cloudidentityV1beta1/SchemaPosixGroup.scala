package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPosixGroup extends StObject {
  
  /**
    * GID of the POSIX group.
    */
  var gid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the POSIX group.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * System identifier for which group name and gid apply to. If not specified it will default to empty value.
    */
  var systemId: js.UndefOr[String | Null] = js.undefined
}
object SchemaPosixGroup {
  
  inline def apply(): SchemaPosixGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosixGroup]
  }
  
  extension [Self <: SchemaPosixGroup](x: Self) {
    
    inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setGidNull: Self = StObject.set(x, "gid", null)
    
    inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    
    inline def setSystemIdNull: Self = StObject.set(x, "systemId", null)
    
    inline def setSystemIdUndefined: Self = StObject.set(x, "systemId", js.undefined)
  }
}
