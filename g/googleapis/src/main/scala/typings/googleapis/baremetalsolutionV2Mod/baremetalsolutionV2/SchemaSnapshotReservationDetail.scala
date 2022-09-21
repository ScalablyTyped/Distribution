package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSnapshotReservationDetail extends StObject {
  
  /**
    * The space on this storage volume reserved for snapshots, shown in GiB.
    */
  var reservedSpaceGib: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Percent of the total Volume size reserved for snapshot copies. Enabling snapshots requires reserving 20% or more of the storage volume space for snapshots. Maximum reserved space for snapshots is 40%. Setting this field will effectively set snapshot_enabled to true.
    */
  var reservedSpacePercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The amount, in GiB, of available space in this storage volume's reserved snapshot space.
    */
  var reservedSpaceRemainingGib: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The percent of snapshot space on this storage volume actually being used by the snapshot copies. This value might be higher than 100% if the snapshot copies have overflowed into the data portion of the storage volume.
    */
  var reservedSpaceUsedPercent: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSnapshotReservationDetail {
  
  inline def apply(): SchemaSnapshotReservationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshotReservationDetail]
  }
  
  extension [Self <: SchemaSnapshotReservationDetail](x: Self) {
    
    inline def setReservedSpaceGib(value: String): Self = StObject.set(x, "reservedSpaceGib", value.asInstanceOf[js.Any])
    
    inline def setReservedSpaceGibNull: Self = StObject.set(x, "reservedSpaceGib", null)
    
    inline def setReservedSpaceGibUndefined: Self = StObject.set(x, "reservedSpaceGib", js.undefined)
    
    inline def setReservedSpacePercent(value: Double): Self = StObject.set(x, "reservedSpacePercent", value.asInstanceOf[js.Any])
    
    inline def setReservedSpacePercentNull: Self = StObject.set(x, "reservedSpacePercent", null)
    
    inline def setReservedSpacePercentUndefined: Self = StObject.set(x, "reservedSpacePercent", js.undefined)
    
    inline def setReservedSpaceRemainingGib(value: String): Self = StObject.set(x, "reservedSpaceRemainingGib", value.asInstanceOf[js.Any])
    
    inline def setReservedSpaceRemainingGibNull: Self = StObject.set(x, "reservedSpaceRemainingGib", null)
    
    inline def setReservedSpaceRemainingGibUndefined: Self = StObject.set(x, "reservedSpaceRemainingGib", js.undefined)
    
    inline def setReservedSpaceUsedPercent(value: Double): Self = StObject.set(x, "reservedSpaceUsedPercent", value.asInstanceOf[js.Any])
    
    inline def setReservedSpaceUsedPercentNull: Self = StObject.set(x, "reservedSpaceUsedPercent", null)
    
    inline def setReservedSpaceUsedPercentUndefined: Self = StObject.set(x, "reservedSpaceUsedPercent", js.undefined)
  }
}
