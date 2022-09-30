package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleGax.mod.IamProtos.google.iam.v1.logging.AuditData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoflogging extends StObject {
  
  /** Represents an AuditData. */
  var AuditData: Instantiable0[typings.googleGax.mod.IamProtos.google.iam.v1.logging.AuditData] & TypeofAuditData
}
object Typeoflogging {
  
  inline def apply(AuditData: Instantiable0[AuditData] & TypeofAuditData): Typeoflogging = {
    val __obj = js.Dynamic.literal(AuditData = AuditData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoflogging]
  }
  
  extension [Self <: Typeoflogging](x: Self) {
    
    inline def setAuditData(value: Instantiable0[AuditData] & TypeofAuditData): Self = StObject.set(x, "AuditData", value.asInstanceOf[js.Any])
  }
}
