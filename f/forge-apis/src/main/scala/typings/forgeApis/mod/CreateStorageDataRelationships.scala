package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStorageDataRelationships extends StObject {
  
  var target: js.UndefOr[CreateStorageDataRelationshipsTarget] = js.undefined
}
object CreateStorageDataRelationships {
  
  inline def apply(): CreateStorageDataRelationships = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorageDataRelationships]
  }
  
  extension [Self <: CreateStorageDataRelationships](x: Self) {
    
    inline def setTarget(value: CreateStorageDataRelationshipsTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
