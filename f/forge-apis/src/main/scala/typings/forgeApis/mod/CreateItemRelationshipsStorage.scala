package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateItemRelationshipsStorage extends StObject {
  
  var data: js.UndefOr[CreateItemRelationshipsStorageData] = js.native
}
object CreateItemRelationshipsStorage {
  
  @scala.inline
  def apply(): CreateItemRelationshipsStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateItemRelationshipsStorage]
  }
  
  @scala.inline
  implicit class CreateItemRelationshipsStorageMutableBuilder[Self <: CreateItemRelationshipsStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CreateItemRelationshipsStorageData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
