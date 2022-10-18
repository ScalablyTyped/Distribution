package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotVerifyRepositoryCompactNodeInfo extends StObject {
  
  var name: Name
}
object SnapshotVerifyRepositoryCompactNodeInfo {
  
  inline def apply(name: Name): SnapshotVerifyRepositoryCompactNodeInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotVerifyRepositoryCompactNodeInfo]
  }
  
  extension [Self <: SnapshotVerifyRepositoryCompactNodeInfo](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
