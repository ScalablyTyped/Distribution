package typings.firebaseFirestore.distLiteFirestoreTestUnitSpecsSpecTestRunnerMod

import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.TargetId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecWatchRemove extends StObject {
  
  var cause: js.UndefOr[SpecError] = js.undefined
  
  var targetIds: js.Array[TargetId]
}
object SpecWatchRemove {
  
  inline def apply(targetIds: js.Array[TargetId]): SpecWatchRemove = {
    val __obj = js.Dynamic.literal(targetIds = targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWatchRemove]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecWatchRemove] (val x: Self) extends AnyVal {
    
    inline def setCause(value: SpecError): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setTargetIds(value: js.Array[TargetId]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    inline def setTargetIdsVarargs(value: TargetId*): Self = StObject.set(x, "targetIds", js.Array(value*))
  }
}
