package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceElectionsVoterinfoquery
  extends StObject
     with StandardParameters {
  
  /**
    * The registered address of the voter to look up.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the election to look up. A list of election IDs can be obtained at https://www.googleapis.com/civicinfo/{version\}/elections. If no election ID is specified in the query and there is more than one election with data for the given voter, the additional elections are provided in the otherElections response field.
    */
  var electionId: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, only data from official state sources will be returned.
    */
  var officialOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, the query will return the success code and include any partial information when it is unable to determine a matching address or unable to determine the election for electionId=0 queries.
    */
  var returnAllAvailableData: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceElectionsVoterinfoquery {
  
  inline def apply(): ParamsResourceElectionsVoterinfoquery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceElectionsVoterinfoquery]
  }
  
  extension [Self <: ParamsResourceElectionsVoterinfoquery](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setElectionId(value: String): Self = StObject.set(x, "electionId", value.asInstanceOf[js.Any])
    
    inline def setElectionIdUndefined: Self = StObject.set(x, "electionId", js.undefined)
    
    inline def setOfficialOnly(value: Boolean): Self = StObject.set(x, "officialOnly", value.asInstanceOf[js.Any])
    
    inline def setOfficialOnlyUndefined: Self = StObject.set(x, "officialOnly", js.undefined)
    
    inline def setReturnAllAvailableData(value: Boolean): Self = StObject.set(x, "returnAllAvailableData", value.asInstanceOf[js.Any])
    
    inline def setReturnAllAvailableDataUndefined: Self = StObject.set(x, "returnAllAvailableData", js.undefined)
  }
}
