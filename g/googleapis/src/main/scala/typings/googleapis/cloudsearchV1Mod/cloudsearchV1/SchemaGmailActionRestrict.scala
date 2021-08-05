package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gmail Action restricts (i.e. read/replied/snoozed).
  */
trait SchemaGmailActionRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaGmailActionRestrict {
  
  inline def apply(): SchemaGmailActionRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmailActionRestrict]
  }
  
  extension [Self <: SchemaGmailActionRestrict](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
