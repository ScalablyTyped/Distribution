package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStorageDataRelationships extends StObject {
  
  var target: js.UndefOr[CreateStorageDataRelationshipsTarget] = js.native
}
object CreateStorageDataRelationships {
  
  @scala.inline
  def apply(): CreateStorageDataRelationships = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorageDataRelationships]
  }
  
  @scala.inline
  implicit class CreateStorageDataRelationshipsMutableBuilder[Self <: CreateStorageDataRelationships] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: CreateStorageDataRelationshipsTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
