package typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod

import typings.firebaseFirestore.distFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distFirestoreTestUtilHelpersMod.TestSnapshotVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecWatchSnapshot extends StObject {
  
  var resumeToken: js.UndefOr[String] = js.undefined
  
  var targetIds: js.Array[TargetId]
  
  var version: TestSnapshotVersion
}
object SpecWatchSnapshot {
  
  inline def apply(targetIds: js.Array[TargetId], version: TestSnapshotVersion): SpecWatchSnapshot = {
    val __obj = js.Dynamic.literal(targetIds = targetIds.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWatchSnapshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecWatchSnapshot] (val x: Self) extends AnyVal {
    
    inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    inline def setTargetIds(value: js.Array[TargetId]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    inline def setTargetIdsVarargs(value: TargetId*): Self = StObject.set(x, "targetIds", js.Array(value*))
    
    inline def setVersion(value: TestSnapshotVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
