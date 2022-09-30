package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleGax.mod.fallback.IamProtos.google.iam.v1.logging.AuditData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofloggingAuditData extends StObject {
  
  /** Represents an AuditData. */
  var AuditData: Instantiable0[typings.googleGax.mod.fallback.IamProtos.google.iam.v1.logging.AuditData] & TypeofAuditData
}
object TypeofloggingAuditData {
  
  inline def apply(AuditData: Instantiable0[AuditData] & TypeofAuditData): TypeofloggingAuditData = {
    val __obj = js.Dynamic.literal(AuditData = AuditData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofloggingAuditData]
  }
  
  extension [Self <: TypeofloggingAuditData](x: Self) {
    
    inline def setAuditData(value: Instantiable0[AuditData] & TypeofAuditData): Self = StObject.set(x, "AuditData", value.asInstanceOf[js.Any])
  }
}
