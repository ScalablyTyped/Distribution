package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DNS resource record.
  */
trait SchemaResourceRecord extends StObject {
  
  /**
    * Relative name of the object affected by this record. Only applicable for
    * CNAME records. Example: &#39;www&#39;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Data for this record. Values vary by record type, as defined in RFC 1035
    * (section 5) and RFC 1034 (section 3.6.1).
    */
  var rrdata: js.UndefOr[String] = js.undefined
  
  /**
    * Resource record type. Example: AAAA.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaResourceRecord {
  
  inline def apply(): SchemaResourceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceRecord]
  }
  
  extension [Self <: SchemaResourceRecord](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRrdata(value: String): Self = StObject.set(x, "rrdata", value.asInstanceOf[js.Any])
    
    inline def setRrdataUndefined: Self = StObject.set(x, "rrdata", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
