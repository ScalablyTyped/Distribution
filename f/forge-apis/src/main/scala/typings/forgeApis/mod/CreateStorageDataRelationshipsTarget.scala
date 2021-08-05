package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStorageDataRelationshipsTarget extends StObject {
  
  var data: js.UndefOr[StorageRelationshipsTargetData] = js.undefined
}
object CreateStorageDataRelationshipsTarget {
  
  inline def apply(): CreateStorageDataRelationshipsTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorageDataRelationshipsTarget]
  }
  
  extension [Self <: CreateStorageDataRelationshipsTarget](x: Self) {
    
    inline def setData(value: StorageRelationshipsTargetData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
