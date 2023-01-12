package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateItemRelationships extends StObject {
  
  var storage: js.UndefOr[CreateItemRelationshipsStorage] = js.undefined
}
object CreateItemRelationships {
  
  inline def apply(): CreateItemRelationships = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateItemRelationships]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateItemRelationships] (val x: Self) extends AnyVal {
    
    inline def setStorage(value: CreateItemRelationshipsStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
