package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreetSegment extends StObject {
  
  var administrationRegionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var beforeGeocodeId: js.UndefOr[String] = js.undefined
  
  var catalistUniquePrecinctCode: js.UndefOr[String] = js.undefined
  
  var city: js.UndefOr[String] = js.undefined
  
  var cityCouncilDistrict: js.UndefOr[String] = js.undefined
  
  var congressionalDistrict: js.UndefOr[String] = js.undefined
  
  var contestIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var countyCouncilDistrict: js.UndefOr[String] = js.undefined
  
  var countyFips: js.UndefOr[String] = js.undefined
  
  var datasetId: js.UndefOr[String] = js.undefined
  
  var earlyVoteSiteByIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var endHouseNumber: js.UndefOr[String] = js.undefined
  
  var geocodedPoint: js.UndefOr[SchemaPointProto] = js.undefined
  
  var geographicDivisionOcdIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var judicialDistrict: js.UndefOr[String] = js.undefined
  
  var mailOnly: js.UndefOr[Boolean] = js.undefined
  
  var municipalDistrict: js.UndefOr[String] = js.undefined
  
  var ncoaAddress: js.UndefOr[String] = js.undefined
  
  var oddOrEvens: js.UndefOr[js.Array[String]] = js.undefined
  
  var originalId: js.UndefOr[String] = js.undefined
  
  var pollinglocationByIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var precinctName: js.UndefOr[String] = js.undefined
  
  var precinctOcdId: js.UndefOr[String] = js.undefined
  
  var provenances: js.UndefOr[js.Array[SchemaProvenance]] = js.undefined
  
  var published: js.UndefOr[Boolean] = js.undefined
  
  var schoolDistrict: js.UndefOr[String] = js.undefined
  
  var startHouseNumber: js.UndefOr[String] = js.undefined
  
  var startLatE7: js.UndefOr[String] = js.undefined
  
  var startLngE7: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
  
  var stateHouseDistrict: js.UndefOr[String] = js.undefined
  
  var stateSenateDistrict: js.UndefOr[String] = js.undefined
  
  var streetName: js.UndefOr[String] = js.undefined
  
  var subAdministrativeAreaName: js.UndefOr[String] = js.undefined
  
  var surrogateId: js.UndefOr[String] = js.undefined
  
  var targetsmartUniquePrecinctCode: js.UndefOr[String] = js.undefined
  
  var townshipDistrict: js.UndefOr[String] = js.undefined
  
  var unitNumber: js.UndefOr[String] = js.undefined
  
  var unitType: js.UndefOr[String] = js.undefined
  
  var vanPrecinctCode: js.UndefOr[String] = js.undefined
  
  var voterGeographicDivisionOcdIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var wardDistrict: js.UndefOr[String] = js.undefined
  
  var wildcard: js.UndefOr[Boolean] = js.undefined
  
  var zip: js.UndefOr[String] = js.undefined
}
object SchemaStreetSegment {
  
  inline def apply(): SchemaStreetSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreetSegment]
  }
  
  extension [Self <: SchemaStreetSegment](x: Self) {
    
    inline def setAdministrationRegionIds(value: js.Array[String]): Self = StObject.set(x, "administrationRegionIds", value.asInstanceOf[js.Any])
    
    inline def setAdministrationRegionIdsUndefined: Self = StObject.set(x, "administrationRegionIds", js.undefined)
    
    inline def setAdministrationRegionIdsVarargs(value: String*): Self = StObject.set(x, "administrationRegionIds", js.Array(value :_*))
    
    inline def setBeforeGeocodeId(value: String): Self = StObject.set(x, "beforeGeocodeId", value.asInstanceOf[js.Any])
    
    inline def setBeforeGeocodeIdUndefined: Self = StObject.set(x, "beforeGeocodeId", js.undefined)
    
    inline def setCatalistUniquePrecinctCode(value: String): Self = StObject.set(x, "catalistUniquePrecinctCode", value.asInstanceOf[js.Any])
    
    inline def setCatalistUniquePrecinctCodeUndefined: Self = StObject.set(x, "catalistUniquePrecinctCode", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityCouncilDistrict(value: String): Self = StObject.set(x, "cityCouncilDistrict", value.asInstanceOf[js.Any])
    
    inline def setCityCouncilDistrictUndefined: Self = StObject.set(x, "cityCouncilDistrict", js.undefined)
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCongressionalDistrict(value: String): Self = StObject.set(x, "congressionalDistrict", value.asInstanceOf[js.Any])
    
    inline def setCongressionalDistrictUndefined: Self = StObject.set(x, "congressionalDistrict", js.undefined)
    
    inline def setContestIds(value: js.Array[String]): Self = StObject.set(x, "contestIds", value.asInstanceOf[js.Any])
    
    inline def setContestIdsUndefined: Self = StObject.set(x, "contestIds", js.undefined)
    
    inline def setContestIdsVarargs(value: String*): Self = StObject.set(x, "contestIds", js.Array(value :_*))
    
    inline def setCountyCouncilDistrict(value: String): Self = StObject.set(x, "countyCouncilDistrict", value.asInstanceOf[js.Any])
    
    inline def setCountyCouncilDistrictUndefined: Self = StObject.set(x, "countyCouncilDistrict", js.undefined)
    
    inline def setCountyFips(value: String): Self = StObject.set(x, "countyFips", value.asInstanceOf[js.Any])
    
    inline def setCountyFipsUndefined: Self = StObject.set(x, "countyFips", js.undefined)
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setEarlyVoteSiteByIds(value: js.Array[String]): Self = StObject.set(x, "earlyVoteSiteByIds", value.asInstanceOf[js.Any])
    
    inline def setEarlyVoteSiteByIdsUndefined: Self = StObject.set(x, "earlyVoteSiteByIds", js.undefined)
    
    inline def setEarlyVoteSiteByIdsVarargs(value: String*): Self = StObject.set(x, "earlyVoteSiteByIds", js.Array(value :_*))
    
    inline def setEndHouseNumber(value: String): Self = StObject.set(x, "endHouseNumber", value.asInstanceOf[js.Any])
    
    inline def setEndHouseNumberUndefined: Self = StObject.set(x, "endHouseNumber", js.undefined)
    
    inline def setGeocodedPoint(value: SchemaPointProto): Self = StObject.set(x, "geocodedPoint", value.asInstanceOf[js.Any])
    
    inline def setGeocodedPointUndefined: Self = StObject.set(x, "geocodedPoint", js.undefined)
    
    inline def setGeographicDivisionOcdIds(value: js.Array[String]): Self = StObject.set(x, "geographicDivisionOcdIds", value.asInstanceOf[js.Any])
    
    inline def setGeographicDivisionOcdIdsUndefined: Self = StObject.set(x, "geographicDivisionOcdIds", js.undefined)
    
    inline def setGeographicDivisionOcdIdsVarargs(value: String*): Self = StObject.set(x, "geographicDivisionOcdIds", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setJudicialDistrict(value: String): Self = StObject.set(x, "judicialDistrict", value.asInstanceOf[js.Any])
    
    inline def setJudicialDistrictUndefined: Self = StObject.set(x, "judicialDistrict", js.undefined)
    
    inline def setMailOnly(value: Boolean): Self = StObject.set(x, "mailOnly", value.asInstanceOf[js.Any])
    
    inline def setMailOnlyUndefined: Self = StObject.set(x, "mailOnly", js.undefined)
    
    inline def setMunicipalDistrict(value: String): Self = StObject.set(x, "municipalDistrict", value.asInstanceOf[js.Any])
    
    inline def setMunicipalDistrictUndefined: Self = StObject.set(x, "municipalDistrict", js.undefined)
    
    inline def setNcoaAddress(value: String): Self = StObject.set(x, "ncoaAddress", value.asInstanceOf[js.Any])
    
    inline def setNcoaAddressUndefined: Self = StObject.set(x, "ncoaAddress", js.undefined)
    
    inline def setOddOrEvens(value: js.Array[String]): Self = StObject.set(x, "oddOrEvens", value.asInstanceOf[js.Any])
    
    inline def setOddOrEvensUndefined: Self = StObject.set(x, "oddOrEvens", js.undefined)
    
    inline def setOddOrEvensVarargs(value: String*): Self = StObject.set(x, "oddOrEvens", js.Array(value :_*))
    
    inline def setOriginalId(value: String): Self = StObject.set(x, "originalId", value.asInstanceOf[js.Any])
    
    inline def setOriginalIdUndefined: Self = StObject.set(x, "originalId", js.undefined)
    
    inline def setPollinglocationByIds(value: js.Array[String]): Self = StObject.set(x, "pollinglocationByIds", value.asInstanceOf[js.Any])
    
    inline def setPollinglocationByIdsUndefined: Self = StObject.set(x, "pollinglocationByIds", js.undefined)
    
    inline def setPollinglocationByIdsVarargs(value: String*): Self = StObject.set(x, "pollinglocationByIds", js.Array(value :_*))
    
    inline def setPrecinctName(value: String): Self = StObject.set(x, "precinctName", value.asInstanceOf[js.Any])
    
    inline def setPrecinctNameUndefined: Self = StObject.set(x, "precinctName", js.undefined)
    
    inline def setPrecinctOcdId(value: String): Self = StObject.set(x, "precinctOcdId", value.asInstanceOf[js.Any])
    
    inline def setPrecinctOcdIdUndefined: Self = StObject.set(x, "precinctOcdId", js.undefined)
    
    inline def setProvenances(value: js.Array[SchemaProvenance]): Self = StObject.set(x, "provenances", value.asInstanceOf[js.Any])
    
    inline def setProvenancesUndefined: Self = StObject.set(x, "provenances", js.undefined)
    
    inline def setProvenancesVarargs(value: SchemaProvenance*): Self = StObject.set(x, "provenances", js.Array(value :_*))
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setSchoolDistrict(value: String): Self = StObject.set(x, "schoolDistrict", value.asInstanceOf[js.Any])
    
    inline def setSchoolDistrictUndefined: Self = StObject.set(x, "schoolDistrict", js.undefined)
    
    inline def setStartHouseNumber(value: String): Self = StObject.set(x, "startHouseNumber", value.asInstanceOf[js.Any])
    
    inline def setStartHouseNumberUndefined: Self = StObject.set(x, "startHouseNumber", js.undefined)
    
    inline def setStartLatE7(value: String): Self = StObject.set(x, "startLatE7", value.asInstanceOf[js.Any])
    
    inline def setStartLatE7Undefined: Self = StObject.set(x, "startLatE7", js.undefined)
    
    inline def setStartLngE7(value: String): Self = StObject.set(x, "startLngE7", value.asInstanceOf[js.Any])
    
    inline def setStartLngE7Undefined: Self = StObject.set(x, "startLngE7", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateHouseDistrict(value: String): Self = StObject.set(x, "stateHouseDistrict", value.asInstanceOf[js.Any])
    
    inline def setStateHouseDistrictUndefined: Self = StObject.set(x, "stateHouseDistrict", js.undefined)
    
    inline def setStateSenateDistrict(value: String): Self = StObject.set(x, "stateSenateDistrict", value.asInstanceOf[js.Any])
    
    inline def setStateSenateDistrictUndefined: Self = StObject.set(x, "stateSenateDistrict", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStreetName(value: String): Self = StObject.set(x, "streetName", value.asInstanceOf[js.Any])
    
    inline def setStreetNameUndefined: Self = StObject.set(x, "streetName", js.undefined)
    
    inline def setSubAdministrativeAreaName(value: String): Self = StObject.set(x, "subAdministrativeAreaName", value.asInstanceOf[js.Any])
    
    inline def setSubAdministrativeAreaNameUndefined: Self = StObject.set(x, "subAdministrativeAreaName", js.undefined)
    
    inline def setSurrogateId(value: String): Self = StObject.set(x, "surrogateId", value.asInstanceOf[js.Any])
    
    inline def setSurrogateIdUndefined: Self = StObject.set(x, "surrogateId", js.undefined)
    
    inline def setTargetsmartUniquePrecinctCode(value: String): Self = StObject.set(x, "targetsmartUniquePrecinctCode", value.asInstanceOf[js.Any])
    
    inline def setTargetsmartUniquePrecinctCodeUndefined: Self = StObject.set(x, "targetsmartUniquePrecinctCode", js.undefined)
    
    inline def setTownshipDistrict(value: String): Self = StObject.set(x, "townshipDistrict", value.asInstanceOf[js.Any])
    
    inline def setTownshipDistrictUndefined: Self = StObject.set(x, "townshipDistrict", js.undefined)
    
    inline def setUnitNumber(value: String): Self = StObject.set(x, "unitNumber", value.asInstanceOf[js.Any])
    
    inline def setUnitNumberUndefined: Self = StObject.set(x, "unitNumber", js.undefined)
    
    inline def setUnitType(value: String): Self = StObject.set(x, "unitType", value.asInstanceOf[js.Any])
    
    inline def setUnitTypeUndefined: Self = StObject.set(x, "unitType", js.undefined)
    
    inline def setVanPrecinctCode(value: String): Self = StObject.set(x, "vanPrecinctCode", value.asInstanceOf[js.Any])
    
    inline def setVanPrecinctCodeUndefined: Self = StObject.set(x, "vanPrecinctCode", js.undefined)
    
    inline def setVoterGeographicDivisionOcdIds(value: js.Array[String]): Self = StObject.set(x, "voterGeographicDivisionOcdIds", value.asInstanceOf[js.Any])
    
    inline def setVoterGeographicDivisionOcdIdsUndefined: Self = StObject.set(x, "voterGeographicDivisionOcdIds", js.undefined)
    
    inline def setVoterGeographicDivisionOcdIdsVarargs(value: String*): Self = StObject.set(x, "voterGeographicDivisionOcdIds", js.Array(value :_*))
    
    inline def setWardDistrict(value: String): Self = StObject.set(x, "wardDistrict", value.asInstanceOf[js.Any])
    
    inline def setWardDistrictUndefined: Self = StObject.set(x, "wardDistrict", js.undefined)
    
    inline def setWildcard(value: Boolean): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
    
    inline def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
    
    inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
  }
}
