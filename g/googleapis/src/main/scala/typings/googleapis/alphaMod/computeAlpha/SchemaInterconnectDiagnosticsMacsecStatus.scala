package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectDiagnosticsMacsecStatus extends StObject {
  
  /**
    * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is operational.
    */
  var ckn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether or not MACsec is operational on this link.
    */
  var operational: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaInterconnectDiagnosticsMacsecStatus {
  
  inline def apply(): SchemaInterconnectDiagnosticsMacsecStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsMacsecStatus]
  }
  
  extension [Self <: SchemaInterconnectDiagnosticsMacsecStatus](x: Self) {
    
    inline def setCkn(value: String): Self = StObject.set(x, "ckn", value.asInstanceOf[js.Any])
    
    inline def setCknNull: Self = StObject.set(x, "ckn", null)
    
    inline def setCknUndefined: Self = StObject.set(x, "ckn", js.undefined)
    
    inline def setOperational(value: Boolean): Self = StObject.set(x, "operational", value.asInstanceOf[js.Any])
    
    inline def setOperationalNull: Self = StObject.set(x, "operational", null)
    
    inline def setOperationalUndefined: Self = StObject.set(x, "operational", js.undefined)
  }
}
