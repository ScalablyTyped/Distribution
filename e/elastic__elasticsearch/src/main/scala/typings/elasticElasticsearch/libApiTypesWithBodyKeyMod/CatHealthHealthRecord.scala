package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatHealthHealthRecord extends StObject {
  
  var activeShardsPercent: js.UndefOr[String] = js.undefined
  
  var active_shards_percent: js.UndefOr[String] = js.undefined
  
  var asp: js.UndefOr[String] = js.undefined
  
  var cl: js.UndefOr[String] = js.undefined
  
  var cluster: js.UndefOr[String] = js.undefined
  
  var epoch: js.UndefOr[SpecUtilsStringified[EpochTime[UnitSeconds]]] = js.undefined
  
  var hhmmss: js.UndefOr[TimeOfDay] = js.undefined
  
  var hms: js.UndefOr[TimeOfDay] = js.undefined
  
  var i: js.UndefOr[String] = js.undefined
  
  var init: js.UndefOr[String] = js.undefined
  
  var maxTaskWaitTime: js.UndefOr[String] = js.undefined
  
  var max_task_wait_time: js.UndefOr[String] = js.undefined
  
  var mtwt: js.UndefOr[String] = js.undefined
  
  var nd: js.UndefOr[String] = js.undefined
  
  var nodeData: js.UndefOr[String] = js.undefined
  
  @JSName("node.data")
  var nodeDotdata: js.UndefOr[String] = js.undefined
  
  @JSName("node.total")
  var nodeDottotal: js.UndefOr[String] = js.undefined
  
  var nodeTotal: js.UndefOr[String] = js.undefined
  
  var nt: js.UndefOr[String] = js.undefined
  
  var p: js.UndefOr[String] = js.undefined
  
  var pendingTasks: js.UndefOr[String] = js.undefined
  
  var pending_tasks: js.UndefOr[String] = js.undefined
  
  var pri: js.UndefOr[String] = js.undefined
  
  var pt: js.UndefOr[String] = js.undefined
  
  var r: js.UndefOr[String] = js.undefined
  
  var relo: js.UndefOr[String] = js.undefined
  
  var sh: js.UndefOr[String] = js.undefined
  
  var shards: js.UndefOr[String] = js.undefined
  
  @JSName("shards.initializing")
  var shardsDotinitializing: js.UndefOr[String] = js.undefined
  
  @JSName("shards.primary")
  var shardsDotprimary: js.UndefOr[String] = js.undefined
  
  @JSName("shards.relocating")
  var shardsDotrelocating: js.UndefOr[String] = js.undefined
  
  @JSName("shards.total")
  var shardsDottotal: js.UndefOr[String] = js.undefined
  
  @JSName("shards.unassigned")
  var shardsDotunassigned: js.UndefOr[String] = js.undefined
  
  var shardsInitializing: js.UndefOr[String] = js.undefined
  
  var shardsPrimary: js.UndefOr[String] = js.undefined
  
  var shardsRelocating: js.UndefOr[String] = js.undefined
  
  var shardsTotal: js.UndefOr[String] = js.undefined
  
  var shardsUnassigned: js.UndefOr[String] = js.undefined
  
  var st: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var t: js.UndefOr[String] = js.undefined
  
  var time: js.UndefOr[SpecUtilsStringified[EpochTime[UnitSeconds]]] = js.undefined
  
  var timestamp: js.UndefOr[TimeOfDay] = js.undefined
  
  var ts: js.UndefOr[TimeOfDay] = js.undefined
  
  var u: js.UndefOr[String] = js.undefined
  
  var unassign: js.UndefOr[String] = js.undefined
}
object CatHealthHealthRecord {
  
  inline def apply(): CatHealthHealthRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatHealthHealthRecord]
  }
  
  extension [Self <: CatHealthHealthRecord](x: Self) {
    
    inline def setActiveShardsPercent(value: String): Self = StObject.set(x, "activeShardsPercent", value.asInstanceOf[js.Any])
    
    inline def setActiveShardsPercentUndefined: Self = StObject.set(x, "activeShardsPercent", js.undefined)
    
    inline def setActive_shards_percent(value: String): Self = StObject.set(x, "active_shards_percent", value.asInstanceOf[js.Any])
    
    inline def setActive_shards_percentUndefined: Self = StObject.set(x, "active_shards_percent", js.undefined)
    
    inline def setAsp(value: String): Self = StObject.set(x, "asp", value.asInstanceOf[js.Any])
    
    inline def setAspUndefined: Self = StObject.set(x, "asp", js.undefined)
    
    inline def setCl(value: String): Self = StObject.set(x, "cl", value.asInstanceOf[js.Any])
    
    inline def setClUndefined: Self = StObject.set(x, "cl", js.undefined)
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setEpoch(value: SpecUtilsStringified[EpochTime[UnitSeconds]]): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    inline def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
    
    inline def setHhmmss(value: TimeOfDay): Self = StObject.set(x, "hhmmss", value.asInstanceOf[js.Any])
    
    inline def setHhmmssUndefined: Self = StObject.set(x, "hhmmss", js.undefined)
    
    inline def setHms(value: TimeOfDay): Self = StObject.set(x, "hms", value.asInstanceOf[js.Any])
    
    inline def setHmsUndefined: Self = StObject.set(x, "hms", js.undefined)
    
    inline def setI(value: String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
    
    inline def setInit(value: String): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setMaxTaskWaitTime(value: String): Self = StObject.set(x, "maxTaskWaitTime", value.asInstanceOf[js.Any])
    
    inline def setMaxTaskWaitTimeUndefined: Self = StObject.set(x, "maxTaskWaitTime", js.undefined)
    
    inline def setMax_task_wait_time(value: String): Self = StObject.set(x, "max_task_wait_time", value.asInstanceOf[js.Any])
    
    inline def setMax_task_wait_timeUndefined: Self = StObject.set(x, "max_task_wait_time", js.undefined)
    
    inline def setMtwt(value: String): Self = StObject.set(x, "mtwt", value.asInstanceOf[js.Any])
    
    inline def setMtwtUndefined: Self = StObject.set(x, "mtwt", js.undefined)
    
    inline def setNd(value: String): Self = StObject.set(x, "nd", value.asInstanceOf[js.Any])
    
    inline def setNdUndefined: Self = StObject.set(x, "nd", js.undefined)
    
    inline def setNodeData(value: String): Self = StObject.set(x, "nodeData", value.asInstanceOf[js.Any])
    
    inline def setNodeDataUndefined: Self = StObject.set(x, "nodeData", js.undefined)
    
    inline def setNodeDotdata(value: String): Self = StObject.set(x, "node.data", value.asInstanceOf[js.Any])
    
    inline def setNodeDotdataUndefined: Self = StObject.set(x, "node.data", js.undefined)
    
    inline def setNodeDottotal(value: String): Self = StObject.set(x, "node.total", value.asInstanceOf[js.Any])
    
    inline def setNodeDottotalUndefined: Self = StObject.set(x, "node.total", js.undefined)
    
    inline def setNodeTotal(value: String): Self = StObject.set(x, "nodeTotal", value.asInstanceOf[js.Any])
    
    inline def setNodeTotalUndefined: Self = StObject.set(x, "nodeTotal", js.undefined)
    
    inline def setNt(value: String): Self = StObject.set(x, "nt", value.asInstanceOf[js.Any])
    
    inline def setNtUndefined: Self = StObject.set(x, "nt", js.undefined)
    
    inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setPendingTasks(value: String): Self = StObject.set(x, "pendingTasks", value.asInstanceOf[js.Any])
    
    inline def setPendingTasksUndefined: Self = StObject.set(x, "pendingTasks", js.undefined)
    
    inline def setPending_tasks(value: String): Self = StObject.set(x, "pending_tasks", value.asInstanceOf[js.Any])
    
    inline def setPending_tasksUndefined: Self = StObject.set(x, "pending_tasks", js.undefined)
    
    inline def setPri(value: String): Self = StObject.set(x, "pri", value.asInstanceOf[js.Any])
    
    inline def setPriUndefined: Self = StObject.set(x, "pri", js.undefined)
    
    inline def setPt(value: String): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
    
    inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setRelo(value: String): Self = StObject.set(x, "relo", value.asInstanceOf[js.Any])
    
    inline def setReloUndefined: Self = StObject.set(x, "relo", js.undefined)
    
    inline def setSh(value: String): Self = StObject.set(x, "sh", value.asInstanceOf[js.Any])
    
    inline def setShUndefined: Self = StObject.set(x, "sh", js.undefined)
    
    inline def setShards(value: String): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsDotinitializing(value: String): Self = StObject.set(x, "shards.initializing", value.asInstanceOf[js.Any])
    
    inline def setShardsDotinitializingUndefined: Self = StObject.set(x, "shards.initializing", js.undefined)
    
    inline def setShardsDotprimary(value: String): Self = StObject.set(x, "shards.primary", value.asInstanceOf[js.Any])
    
    inline def setShardsDotprimaryUndefined: Self = StObject.set(x, "shards.primary", js.undefined)
    
    inline def setShardsDotrelocating(value: String): Self = StObject.set(x, "shards.relocating", value.asInstanceOf[js.Any])
    
    inline def setShardsDotrelocatingUndefined: Self = StObject.set(x, "shards.relocating", js.undefined)
    
    inline def setShardsDottotal(value: String): Self = StObject.set(x, "shards.total", value.asInstanceOf[js.Any])
    
    inline def setShardsDottotalUndefined: Self = StObject.set(x, "shards.total", js.undefined)
    
    inline def setShardsDotunassigned(value: String): Self = StObject.set(x, "shards.unassigned", value.asInstanceOf[js.Any])
    
    inline def setShardsDotunassignedUndefined: Self = StObject.set(x, "shards.unassigned", js.undefined)
    
    inline def setShardsInitializing(value: String): Self = StObject.set(x, "shardsInitializing", value.asInstanceOf[js.Any])
    
    inline def setShardsInitializingUndefined: Self = StObject.set(x, "shardsInitializing", js.undefined)
    
    inline def setShardsPrimary(value: String): Self = StObject.set(x, "shardsPrimary", value.asInstanceOf[js.Any])
    
    inline def setShardsPrimaryUndefined: Self = StObject.set(x, "shardsPrimary", js.undefined)
    
    inline def setShardsRelocating(value: String): Self = StObject.set(x, "shardsRelocating", value.asInstanceOf[js.Any])
    
    inline def setShardsRelocatingUndefined: Self = StObject.set(x, "shardsRelocating", js.undefined)
    
    inline def setShardsTotal(value: String): Self = StObject.set(x, "shardsTotal", value.asInstanceOf[js.Any])
    
    inline def setShardsTotalUndefined: Self = StObject.set(x, "shardsTotal", js.undefined)
    
    inline def setShardsUnassigned(value: String): Self = StObject.set(x, "shardsUnassigned", value.asInstanceOf[js.Any])
    
    inline def setShardsUnassignedUndefined: Self = StObject.set(x, "shardsUnassigned", js.undefined)
    
    inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
    
    inline def setSt(value: String): Self = StObject.set(x, "st", value.asInstanceOf[js.Any])
    
    inline def setStUndefined: Self = StObject.set(x, "st", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
    
    inline def setTime(value: SpecUtilsStringified[EpochTime[UnitSeconds]]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTimestamp(value: TimeOfDay): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTs(value: TimeOfDay): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    inline def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    
    inline def setUUndefined: Self = StObject.set(x, "u", js.undefined)
    
    inline def setUnassign(value: String): Self = StObject.set(x, "unassign", value.asInstanceOf[js.Any])
    
    inline def setUnassignUndefined: Self = StObject.set(x, "unassign", js.undefined)
  }
}
