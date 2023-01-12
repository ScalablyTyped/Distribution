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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStorageDataRelationships] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: CreateStorageDataRelationshipsTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
