package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkAddressReservation extends StObject {
  
  /**
    * The last address of this reservation block, inclusive. I.e., for cases when reservations are only single addresses, end_address and start_address will be the same. Must be specified as a single IPv4 address, e.g. 10.1.2.2.
    */
  var endAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A note about this reservation, intended for human consumption.
    */
  var note: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The first address of this reservation block. Must be specified as a single IPv4 address, e.g. 10.1.2.2.
    */
  var startAddress: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkAddressReservation {
  
  inline def apply(): SchemaNetworkAddressReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkAddressReservation]
  }
  
  extension [Self <: SchemaNetworkAddressReservation](x: Self) {
    
    inline def setEndAddress(value: String): Self = StObject.set(x, "endAddress", value.asInstanceOf[js.Any])
    
    inline def setEndAddressNull: Self = StObject.set(x, "endAddress", null)
    
    inline def setEndAddressUndefined: Self = StObject.set(x, "endAddress", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteNull: Self = StObject.set(x, "note", null)
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setStartAddress(value: String): Self = StObject.set(x, "startAddress", value.asInstanceOf[js.Any])
    
    inline def setStartAddressNull: Self = StObject.set(x, "startAddress", null)
    
    inline def setStartAddressUndefined: Self = StObject.set(x, "startAddress", js.undefined)
  }
}
