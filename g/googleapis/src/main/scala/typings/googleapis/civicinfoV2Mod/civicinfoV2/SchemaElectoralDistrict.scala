package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the geographic scope of a contest.
  */
trait SchemaElectoralDistrict extends StObject {
  
  /**
    * An identifier for this district, relative to its scope. For example, the
    * 34th State Senate district would have id &quot;34&quot; and a scope of
    * stateUpper.
    */
  var id: js.UndefOr[String] = js.undefined
  
  var kgForeignKey: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the district.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The geographic scope of this district. If unspecified the district&#39;s
    * geography is not known. One of: national, statewide, congressional,
    * stateUpper, stateLower, countywide, judicial, schoolBoard, cityWide,
    * township, countyCouncil, cityCouncil, ward, special
    */
  var scope: js.UndefOr[String] = js.undefined
}
object SchemaElectoralDistrict {
  
  inline def apply(): SchemaElectoralDistrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaElectoralDistrict]
  }
  
  extension [Self <: SchemaElectoralDistrict](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKgForeignKey(value: String): Self = StObject.set(x, "kgForeignKey", value.asInstanceOf[js.Any])
    
    inline def setKgForeignKeyUndefined: Self = StObject.set(x, "kgForeignKey", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
