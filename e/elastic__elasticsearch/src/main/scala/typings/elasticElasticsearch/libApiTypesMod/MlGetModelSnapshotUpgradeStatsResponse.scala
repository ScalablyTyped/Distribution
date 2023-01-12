package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetModelSnapshotUpgradeStatsResponse extends StObject {
  
  var count: long
  
  var model_snapshot_upgrades: js.Array[MlModelSnapshotUpgrade]
}
object MlGetModelSnapshotUpgradeStatsResponse {
  
  inline def apply(count: long, model_snapshot_upgrades: js.Array[MlModelSnapshotUpgrade]): MlGetModelSnapshotUpgradeStatsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], model_snapshot_upgrades = model_snapshot_upgrades.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetModelSnapshotUpgradeStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetModelSnapshotUpgradeStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setModel_snapshot_upgrades(value: js.Array[MlModelSnapshotUpgrade]): Self = StObject.set(x, "model_snapshot_upgrades", value.asInstanceOf[js.Any])
    
    inline def setModel_snapshot_upgradesVarargs(value: MlModelSnapshotUpgrade*): Self = StObject.set(x, "model_snapshot_upgrades", js.Array(value*))
  }
}
