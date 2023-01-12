package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatAllocationAllocationRecord extends StObject {
  
  var da: js.UndefOr[ByteSize | Null] = js.undefined
  
  var di: js.UndefOr[ByteSize | Null] = js.undefined
  
  var diskAvail: js.UndefOr[ByteSize | Null] = js.undefined
  
  @JSName("disk.avail")
  var diskDotavail: js.UndefOr[ByteSize | Null] = js.undefined
  
  @JSName("disk.indices")
  var diskDotindices: js.UndefOr[ByteSize | Null] = js.undefined
  
  @JSName("disk.percent")
  var diskDotpercent: js.UndefOr[Percentage | Null] = js.undefined
  
  @JSName("disk.total")
  var diskDottotal: js.UndefOr[ByteSize | Null] = js.undefined
  
  @JSName("disk.used")
  var diskDotused: js.UndefOr[ByteSize | Null] = js.undefined
  
  var diskIndices: js.UndefOr[ByteSize | Null] = js.undefined
  
  var diskPercent: js.UndefOr[Percentage | Null] = js.undefined
  
  var diskTotal: js.UndefOr[ByteSize | Null] = js.undefined
  
  var diskUsed: js.UndefOr[ByteSize | Null] = js.undefined
  
  var dp: js.UndefOr[Percentage | Null] = js.undefined
  
  var dt: js.UndefOr[ByteSize | Null] = js.undefined
  
  var du: js.UndefOr[ByteSize | Null] = js.undefined
  
  var h: js.UndefOr[Host | Null] = js.undefined
  
  var host: js.UndefOr[Host | Null] = js.undefined
  
  var ip: js.UndefOr[Ip | Null] = js.undefined
  
  var n: js.UndefOr[String] = js.undefined
  
  var node: js.UndefOr[String] = js.undefined
  
  var s: js.UndefOr[String] = js.undefined
  
  var shards: js.UndefOr[String] = js.undefined
}
object CatAllocationAllocationRecord {
  
  inline def apply(): CatAllocationAllocationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatAllocationAllocationRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatAllocationAllocationRecord] (val x: Self) extends AnyVal {
    
    inline def setDa(value: ByteSize): Self = StObject.set(x, "da", value.asInstanceOf[js.Any])
    
    inline def setDaNull: Self = StObject.set(x, "da", null)
    
    inline def setDaUndefined: Self = StObject.set(x, "da", js.undefined)
    
    inline def setDi(value: ByteSize): Self = StObject.set(x, "di", value.asInstanceOf[js.Any])
    
    inline def setDiNull: Self = StObject.set(x, "di", null)
    
    inline def setDiUndefined: Self = StObject.set(x, "di", js.undefined)
    
    inline def setDiskAvail(value: ByteSize): Self = StObject.set(x, "diskAvail", value.asInstanceOf[js.Any])
    
    inline def setDiskAvailNull: Self = StObject.set(x, "diskAvail", null)
    
    inline def setDiskAvailUndefined: Self = StObject.set(x, "diskAvail", js.undefined)
    
    inline def setDiskDotavail(value: ByteSize): Self = StObject.set(x, "disk.avail", value.asInstanceOf[js.Any])
    
    inline def setDiskDotavailNull: Self = StObject.set(x, "disk.avail", null)
    
    inline def setDiskDotavailUndefined: Self = StObject.set(x, "disk.avail", js.undefined)
    
    inline def setDiskDotindices(value: ByteSize): Self = StObject.set(x, "disk.indices", value.asInstanceOf[js.Any])
    
    inline def setDiskDotindicesNull: Self = StObject.set(x, "disk.indices", null)
    
    inline def setDiskDotindicesUndefined: Self = StObject.set(x, "disk.indices", js.undefined)
    
    inline def setDiskDotpercent(value: Percentage): Self = StObject.set(x, "disk.percent", value.asInstanceOf[js.Any])
    
    inline def setDiskDotpercentNull: Self = StObject.set(x, "disk.percent", null)
    
    inline def setDiskDotpercentUndefined: Self = StObject.set(x, "disk.percent", js.undefined)
    
    inline def setDiskDottotal(value: ByteSize): Self = StObject.set(x, "disk.total", value.asInstanceOf[js.Any])
    
    inline def setDiskDottotalNull: Self = StObject.set(x, "disk.total", null)
    
    inline def setDiskDottotalUndefined: Self = StObject.set(x, "disk.total", js.undefined)
    
    inline def setDiskDotused(value: ByteSize): Self = StObject.set(x, "disk.used", value.asInstanceOf[js.Any])
    
    inline def setDiskDotusedNull: Self = StObject.set(x, "disk.used", null)
    
    inline def setDiskDotusedUndefined: Self = StObject.set(x, "disk.used", js.undefined)
    
    inline def setDiskIndices(value: ByteSize): Self = StObject.set(x, "diskIndices", value.asInstanceOf[js.Any])
    
    inline def setDiskIndicesNull: Self = StObject.set(x, "diskIndices", null)
    
    inline def setDiskIndicesUndefined: Self = StObject.set(x, "diskIndices", js.undefined)
    
    inline def setDiskPercent(value: Percentage): Self = StObject.set(x, "diskPercent", value.asInstanceOf[js.Any])
    
    inline def setDiskPercentNull: Self = StObject.set(x, "diskPercent", null)
    
    inline def setDiskPercentUndefined: Self = StObject.set(x, "diskPercent", js.undefined)
    
    inline def setDiskTotal(value: ByteSize): Self = StObject.set(x, "diskTotal", value.asInstanceOf[js.Any])
    
    inline def setDiskTotalNull: Self = StObject.set(x, "diskTotal", null)
    
    inline def setDiskTotalUndefined: Self = StObject.set(x, "diskTotal", js.undefined)
    
    inline def setDiskUsed(value: ByteSize): Self = StObject.set(x, "diskUsed", value.asInstanceOf[js.Any])
    
    inline def setDiskUsedNull: Self = StObject.set(x, "diskUsed", null)
    
    inline def setDiskUsedUndefined: Self = StObject.set(x, "diskUsed", js.undefined)
    
    inline def setDp(value: Percentage): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
    
    inline def setDpNull: Self = StObject.set(x, "dp", null)
    
    inline def setDpUndefined: Self = StObject.set(x, "dp", js.undefined)
    
    inline def setDt(value: ByteSize): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
    
    inline def setDtNull: Self = StObject.set(x, "dt", null)
    
    inline def setDtUndefined: Self = StObject.set(x, "dt", js.undefined)
    
    inline def setDu(value: ByteSize): Self = StObject.set(x, "du", value.asInstanceOf[js.Any])
    
    inline def setDuNull: Self = StObject.set(x, "du", null)
    
    inline def setDuUndefined: Self = StObject.set(x, "du", js.undefined)
    
    inline def setH(value: Host): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHNull: Self = StObject.set(x, "h", null)
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setIp(value: Ip): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpNull: Self = StObject.set(x, "ip", null)
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setShards(value: String): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
  }
}
