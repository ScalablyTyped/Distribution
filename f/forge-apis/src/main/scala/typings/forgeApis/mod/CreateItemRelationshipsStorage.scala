package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateItemRelationshipsStorage extends StObject {
  
  var data: js.UndefOr[CreateItemRelationshipsStorageData] = js.undefined
}
object CreateItemRelationshipsStorage {
  
  inline def apply(): CreateItemRelationshipsStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateItemRelationshipsStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateItemRelationshipsStorage] (val x: Self) extends AnyVal {
    
    inline def setData(value: CreateItemRelationshipsStorageData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
