package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStreetSegment extends js.Object {
  var administrationRegionIds: js.UndefOr[js.Array[String]] = js.native
  var beforeGeocodeId: js.UndefOr[String] = js.native
  var catalistUniquePrecinctCode: js.UndefOr[String] = js.native
  var city: js.UndefOr[String] = js.native
  var cityCouncilDistrict: js.UndefOr[String] = js.native
  var congressionalDistrict: js.UndefOr[String] = js.native
  var contestIds: js.UndefOr[js.Array[String]] = js.native
  var countyCouncilDistrict: js.UndefOr[String] = js.native
  var countyFips: js.UndefOr[String] = js.native
  var datasetId: js.UndefOr[String] = js.native
  var earlyVoteSiteByIds: js.UndefOr[js.Array[String]] = js.native
  var endHouseNumber: js.UndefOr[String] = js.native
  var geocodedPoint: js.UndefOr[SchemaPointProto] = js.native
  var geographicDivisionOcdIds: js.UndefOr[js.Array[String]] = js.native
  var id: js.UndefOr[String] = js.native
  var judicialDistrict: js.UndefOr[String] = js.native
  var mailOnly: js.UndefOr[Boolean] = js.native
  var municipalDistrict: js.UndefOr[String] = js.native
  var ncoaAddress: js.UndefOr[String] = js.native
  var oddOrEvens: js.UndefOr[js.Array[String]] = js.native
  var originalId: js.UndefOr[String] = js.native
  var pollinglocationByIds: js.UndefOr[js.Array[String]] = js.native
  var precinctName: js.UndefOr[String] = js.native
  var precinctOcdId: js.UndefOr[String] = js.native
  var provenances: js.UndefOr[js.Array[SchemaProvenance]] = js.native
  var published: js.UndefOr[Boolean] = js.native
  var schoolDistrict: js.UndefOr[String] = js.native
  var startHouseNumber: js.UndefOr[String] = js.native
  var startLatE7: js.UndefOr[String] = js.native
  var startLngE7: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var stateHouseDistrict: js.UndefOr[String] = js.native
  var stateSenateDistrict: js.UndefOr[String] = js.native
  var streetName: js.UndefOr[String] = js.native
  var subAdministrativeAreaName: js.UndefOr[String] = js.native
  var surrogateId: js.UndefOr[String] = js.native
  var targetsmartUniquePrecinctCode: js.UndefOr[String] = js.native
  var townshipDistrict: js.UndefOr[String] = js.native
  var unitNumber: js.UndefOr[String] = js.native
  var unitType: js.UndefOr[String] = js.native
  var vanPrecinctCode: js.UndefOr[String] = js.native
  var voterGeographicDivisionOcdIds: js.UndefOr[js.Array[String]] = js.native
  var wardDistrict: js.UndefOr[String] = js.native
  var wildcard: js.UndefOr[Boolean] = js.native
  var zip: js.UndefOr[String] = js.native
}

object SchemaStreetSegment {
  @scala.inline
  def apply(): SchemaStreetSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreetSegment]
  }
  @scala.inline
  implicit class SchemaStreetSegmentOps[Self <: SchemaStreetSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdministrationRegionIdsVarargs(value: String*): Self = this.set("administrationRegionIds", js.Array(value :_*))
    @scala.inline
    def setAdministrationRegionIds(value: js.Array[String]): Self = this.set("administrationRegionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdministrationRegionIds: Self = this.set("administrationRegionIds", js.undefined)
    @scala.inline
    def setBeforeGeocodeId(value: String): Self = this.set("beforeGeocodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeGeocodeId: Self = this.set("beforeGeocodeId", js.undefined)
    @scala.inline
    def setCatalistUniquePrecinctCode(value: String): Self = this.set("catalistUniquePrecinctCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalistUniquePrecinctCode: Self = this.set("catalistUniquePrecinctCode", js.undefined)
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCityCouncilDistrict(value: String): Self = this.set("cityCouncilDistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCityCouncilDistrict: Self = this.set("cityCouncilDistrict", js.undefined)
    @scala.inline
    def setCongressionalDistrict(value: String): Self = this.set("congressionalDistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCongressionalDistrict: Self = this.set("congressionalDistrict", js.undefined)
    @scala.inline
    def setContestIdsVarargs(value: String*): Self = this.set("contestIds", js.Array(value :_*))
    @scala.inline
    def setContestIds(value: js.Array[String]): Self = this.set("contestIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContestIds: Self = this.set("contestIds", js.undefined)
    @scala.inline
    def setCountyCouncilDistrict(value: String): Self = this.set("countyCouncilDistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountyCouncilDistrict: Self = this.set("countyCouncilDistrict", js.undefined)
    @scala.inline
    def setCountyFips(value: String): Self = this.set("countyFips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountyFips: Self = this.set("countyFips", js.undefined)
    @scala.inline
    def setDatasetId(value: String): Self = this.set("datasetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetId: Self = this.set("datasetId", js.undefined)
    @scala.inline
    def setEarlyVoteSiteByIdsVarargs(value: String*): Self = this.set("earlyVoteSiteByIds", js.Array(value :_*))
    @scala.inline
    def setEarlyVoteSiteByIds(value: js.Array[String]): Self = this.set("earlyVoteSiteByIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEarlyVoteSiteByIds: Self = this.set("earlyVoteSiteByIds", js.undefined)
    @scala.inline
    def setEndHouseNumber(value: String): Self = this.set("endHouseNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndHouseNumber: Self = this.set("endHouseNumber", js.undefined)
    @scala.inline
    def setGeocodedPoint(value: SchemaPointProto): Self = this.set("geocodedPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeocodedPoint: Self = this.set("geocodedPoint", js.undefined)
    @scala.inline
    def setGeographicDivisionOcdIdsVarargs(value: String*): Self = this.set("geographicDivisionOcdIds", js.Array(value :_*))
    @scala.inline
    def setGeographicDivisionOcdIds(value: js.Array[String]): Self = this.set("geographicDivisionOcdIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeographicDivisionOcdIds: Self = this.set("geographicDivisionOcdIds", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setJudicialDistrict(value: String): Self = this.set("judicialDistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJudicialDistrict: Self = this.set("judicialDistrict", js.undefined)
    @scala.inline
    def setMailOnly(value: Boolean): Self = this.set("mailOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailOnly: Self = this.set("mailOnly", js.undefined)
    @scala.inline
    def setMunicipalDistrict(value: String): Self = this.set("municipalDistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMunicipalDistrict: Self = this.set("municipalDistrict", js.undefined)
    @scala.inline
    def setNcoaAddress(value: String): Self = this.set("ncoaAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNcoaAddress: Self = this.set("ncoaAddress", js.undefined)
    @scala.inline
    def setOddOrEvensVarargs(value: String*): Self = this.set("oddOrEvens", js.Array(value :_*))
    @scala.inline
    def setOddOrEvens(value: js.Array[String]): Self = this.set("oddOrEvens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOddOrEvens: Self = this.set("oddOrEvens", js.undefined)
    @scala.inline
    def setOriginalId(value: String): Self = this.set("originalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalId: Self = this.set("originalId", js.undefined)
    @scala.inline
    def setPollinglocationByIdsVarargs(value: String*): Self = this.set("pollinglocationByIds", js.Array(value :_*))
    @scala.inline
    def setPollinglocationByIds(value: js.Array[String]): Self = this.set("pollinglocationByIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollinglocationByIds: Self = this.set("pollinglocationByIds", js.undefined)
    @scala.inline
    def setPrecinctName(value: String): Self = this.set("precinctName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecinctName: Self = this.set("precinctName", js.undefined)
    @scala.inline
    def setPrecinctOcdId(value: String): Self = this.set("precinctOcdId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecinctOcdId: Self = this.set("precinctOcdId", js.undefined)
    @scala.inline
    def setProvenancesVarargs(value: SchemaProvenance*): Self = this.set("provenances", js.Array(value :_*))
    @scala.inline
    def setProvenances(value: js.Array[SchemaProvenance]): Self = this.set("provenances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvenances: Self = this.set("provenances", js.undefined)
    @scala.inline
    def setPublished(value: Boolean): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    @scala.inline
    def setSchoolDistrict(value: String): Self = this.set("schoolDistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchoolDistrict: Self = this.set("schoolDistrict", js.undefined)
    @scala.inline
    def setStartHouseNumber(value: String): Self = this.set("startHouseNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartHouseNumber: Self = this.set("startHouseNumber", js.undefined)
    @scala.inline
    def setStartLatE7(value: String): Self = this.set("startLatE7", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartLatE7: Self = this.set("startLatE7", js.undefined)
    @scala.inline
    def setStartLngE7(value: String): Self = this.set("startLngE7", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartLngE7: Self = this.set("startLngE7", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStateHouseDistrict(value: String): Self = this.set("stateHouseDistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateHouseDistrict: Self = this.set("stateHouseDistrict", js.undefined)
    @scala.inline
    def setStateSenateDistrict(value: String): Self = this.set("stateSenateDistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateSenateDistrict: Self = this.set("stateSenateDistrict", js.undefined)
    @scala.inline
    def setStreetName(value: String): Self = this.set("streetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetName: Self = this.set("streetName", js.undefined)
    @scala.inline
    def setSubAdministrativeAreaName(value: String): Self = this.set("subAdministrativeAreaName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubAdministrativeAreaName: Self = this.set("subAdministrativeAreaName", js.undefined)
    @scala.inline
    def setSurrogateId(value: String): Self = this.set("surrogateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurrogateId: Self = this.set("surrogateId", js.undefined)
    @scala.inline
    def setTargetsmartUniquePrecinctCode(value: String): Self = this.set("targetsmartUniquePrecinctCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetsmartUniquePrecinctCode: Self = this.set("targetsmartUniquePrecinctCode", js.undefined)
    @scala.inline
    def setTownshipDistrict(value: String): Self = this.set("townshipDistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTownshipDistrict: Self = this.set("townshipDistrict", js.undefined)
    @scala.inline
    def setUnitNumber(value: String): Self = this.set("unitNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitNumber: Self = this.set("unitNumber", js.undefined)
    @scala.inline
    def setUnitType(value: String): Self = this.set("unitType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitType: Self = this.set("unitType", js.undefined)
    @scala.inline
    def setVanPrecinctCode(value: String): Self = this.set("vanPrecinctCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVanPrecinctCode: Self = this.set("vanPrecinctCode", js.undefined)
    @scala.inline
    def setVoterGeographicDivisionOcdIdsVarargs(value: String*): Self = this.set("voterGeographicDivisionOcdIds", js.Array(value :_*))
    @scala.inline
    def setVoterGeographicDivisionOcdIds(value: js.Array[String]): Self = this.set("voterGeographicDivisionOcdIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoterGeographicDivisionOcdIds: Self = this.set("voterGeographicDivisionOcdIds", js.undefined)
    @scala.inline
    def setWardDistrict(value: String): Self = this.set("wardDistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWardDistrict: Self = this.set("wardDistrict", js.undefined)
    @scala.inline
    def setWildcard(value: Boolean): Self = this.set("wildcard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWildcard: Self = this.set("wildcard", js.undefined)
    @scala.inline
    def setZip(value: String): Self = this.set("zip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZip: Self = this.set("zip", js.undefined)
  }
  
}

