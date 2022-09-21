package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBfdStatusPacketCounts extends StObject {
  
  /**
    * Number of packets received since the beginning of the current BFD session.
    */
  var numRx: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of packets received that were rejected because of errors since the beginning of the current BFD session.
    */
  var numRxRejected: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of packets received that were successfully processed since the beginning of the current BFD session.
    */
  var numRxSuccessful: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of packets transmitted since the beginning of the current BFD session.
    */
  var numTx: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBfdStatusPacketCounts {
  
  inline def apply(): SchemaBfdStatusPacketCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBfdStatusPacketCounts]
  }
  
  extension [Self <: SchemaBfdStatusPacketCounts](x: Self) {
    
    inline def setNumRx(value: Double): Self = StObject.set(x, "numRx", value.asInstanceOf[js.Any])
    
    inline def setNumRxNull: Self = StObject.set(x, "numRx", null)
    
    inline def setNumRxRejected(value: Double): Self = StObject.set(x, "numRxRejected", value.asInstanceOf[js.Any])
    
    inline def setNumRxRejectedNull: Self = StObject.set(x, "numRxRejected", null)
    
    inline def setNumRxRejectedUndefined: Self = StObject.set(x, "numRxRejected", js.undefined)
    
    inline def setNumRxSuccessful(value: Double): Self = StObject.set(x, "numRxSuccessful", value.asInstanceOf[js.Any])
    
    inline def setNumRxSuccessfulNull: Self = StObject.set(x, "numRxSuccessful", null)
    
    inline def setNumRxSuccessfulUndefined: Self = StObject.set(x, "numRxSuccessful", js.undefined)
    
    inline def setNumRxUndefined: Self = StObject.set(x, "numRx", js.undefined)
    
    inline def setNumTx(value: Double): Self = StObject.set(x, "numTx", value.asInstanceOf[js.Any])
    
    inline def setNumTxNull: Self = StObject.set(x, "numTx", null)
    
    inline def setNumTxUndefined: Self = StObject.set(x, "numTx", js.undefined)
  }
}
