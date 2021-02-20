package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the geographic scope of a contest.
  */
@js.native
trait SchemaElectoralDistrict extends StObject {
  
  /**
    * An identifier for this district, relative to its scope. For example, the
    * 34th State Senate district would have id &quot;34&quot; and a scope of
    * stateUpper.
    */
  var id: js.UndefOr[String] = js.native
  
  var kgForeignKey: js.UndefOr[String] = js.native
  
  /**
    * The name of the district.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The geographic scope of this district. If unspecified the district&#39;s
    * geography is not known. One of: national, statewide, congressional,
    * stateUpper, stateLower, countywide, judicial, schoolBoard, cityWide,
    * township, countyCouncil, cityCouncil, ward, special
    */
  var scope: js.UndefOr[String] = js.native
}
object SchemaElectoralDistrict {
  
  @scala.inline
  def apply(): SchemaElectoralDistrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaElectoralDistrict]
  }
  
  @scala.inline
  implicit class SchemaElectoralDistrictMutableBuilder[Self <: SchemaElectoralDistrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKgForeignKey(value: String): Self = StObject.set(x, "kgForeignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKgForeignKeyUndefined: Self = StObject.set(x, "kgForeignKey", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
