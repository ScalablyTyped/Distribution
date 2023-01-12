package typings.firebaseFirestore.distLiteFirestoreTestUnitSpecsSpecTestRunnerMod

import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.TargetId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecUserListen extends StObject {
  
  var query: String | SpecQuery
  
  var targetId: TargetId
}
object SpecUserListen {
  
  inline def apply(query: String | SpecQuery, targetId: TargetId): SpecUserListen = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecUserListen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecUserListen] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: String | SpecQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: TargetId): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
