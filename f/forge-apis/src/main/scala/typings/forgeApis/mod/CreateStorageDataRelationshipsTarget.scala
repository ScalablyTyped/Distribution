package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStorageDataRelationshipsTarget extends StObject {
  
  var data: js.UndefOr[StorageRelationshipsTargetData] = js.native
}
object CreateStorageDataRelationshipsTarget {
  
  @scala.inline
  def apply(): CreateStorageDataRelationshipsTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorageDataRelationshipsTarget]
  }
  
  @scala.inline
  implicit class CreateStorageDataRelationshipsTargetMutableBuilder[Self <: CreateStorageDataRelationshipsTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: StorageRelationshipsTargetData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
