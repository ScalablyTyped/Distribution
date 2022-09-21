package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdministrationRegion extends StObject {
  
  /**
    * The election administration body for this area.
    */
  var electionAdministrationBody: js.UndefOr[SchemaAdministrativeBody] = js.undefined
  
  /**
    * The city or county that provides election information for this voter. This object can have the same elements as state.
    */
  var local_jurisdiction: js.UndefOr[SchemaAdministrationRegion] = js.undefined
  
  /**
    * The name of the jurisdiction.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of sources for this area. If multiple sources are listed the data has been aggregated from those sources.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.undefined
}
object SchemaAdministrationRegion {
  
  inline def apply(): SchemaAdministrationRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministrationRegion]
  }
  
  extension [Self <: SchemaAdministrationRegion](x: Self) {
    
    inline def setElectionAdministrationBody(value: SchemaAdministrativeBody): Self = StObject.set(x, "electionAdministrationBody", value.asInstanceOf[js.Any])
    
    inline def setElectionAdministrationBodyUndefined: Self = StObject.set(x, "electionAdministrationBody", js.undefined)
    
    inline def setLocal_jurisdiction(value: SchemaAdministrationRegion): Self = StObject.set(x, "local_jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setLocal_jurisdictionUndefined: Self = StObject.set(x, "local_jurisdiction", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSources(value: js.Array[SchemaSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: SchemaSource*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
