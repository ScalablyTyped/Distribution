package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaElection extends StObject {
  
  /**
    * Day of the election in YYYY-MM-DD format.
    */
  var electionDay: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID of this election.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A displayable name for the election.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The political division of the election. Represented as an OCD Division ID. Voters within these political jurisdictions are covered by this election. This is typically a state such as ocd-division/country:us/state:ca or for the midterms or general election the entire US (i.e. ocd-division/country:us).
    */
  var ocdDivisionId: js.UndefOr[String | Null] = js.undefined
  
  var shapeLookupBehavior: js.UndefOr[String | Null] = js.undefined
}
object SchemaElection {
  
  inline def apply(): SchemaElection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaElection]
  }
  
  extension [Self <: SchemaElection](x: Self) {
    
    inline def setElectionDay(value: String): Self = StObject.set(x, "electionDay", value.asInstanceOf[js.Any])
    
    inline def setElectionDayNull: Self = StObject.set(x, "electionDay", null)
    
    inline def setElectionDayUndefined: Self = StObject.set(x, "electionDay", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOcdDivisionId(value: String): Self = StObject.set(x, "ocdDivisionId", value.asInstanceOf[js.Any])
    
    inline def setOcdDivisionIdNull: Self = StObject.set(x, "ocdDivisionId", null)
    
    inline def setOcdDivisionIdUndefined: Self = StObject.set(x, "ocdDivisionId", js.undefined)
    
    inline def setShapeLookupBehavior(value: String): Self = StObject.set(x, "shapeLookupBehavior", value.asInstanceOf[js.Any])
    
    inline def setShapeLookupBehaviorNull: Self = StObject.set(x, "shapeLookupBehavior", null)
    
    inline def setShapeLookupBehaviorUndefined: Self = StObject.set(x, "shapeLookupBehavior", js.undefined)
  }
}
