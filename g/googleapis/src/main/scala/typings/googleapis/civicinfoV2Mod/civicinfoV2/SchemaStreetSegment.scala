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
  def apply(
    administrationRegionIds: js.Array[String] = null,
    beforeGeocodeId: String = null,
    catalistUniquePrecinctCode: String = null,
    city: String = null,
    cityCouncilDistrict: String = null,
    congressionalDistrict: String = null,
    contestIds: js.Array[String] = null,
    countyCouncilDistrict: String = null,
    countyFips: String = null,
    datasetId: String = null,
    earlyVoteSiteByIds: js.Array[String] = null,
    endHouseNumber: String = null,
    geocodedPoint: SchemaPointProto = null,
    geographicDivisionOcdIds: js.Array[String] = null,
    id: String = null,
    judicialDistrict: String = null,
    mailOnly: js.UndefOr[Boolean] = js.undefined,
    municipalDistrict: String = null,
    ncoaAddress: String = null,
    oddOrEvens: js.Array[String] = null,
    originalId: String = null,
    pollinglocationByIds: js.Array[String] = null,
    precinctName: String = null,
    precinctOcdId: String = null,
    provenances: js.Array[SchemaProvenance] = null,
    published: js.UndefOr[Boolean] = js.undefined,
    schoolDistrict: String = null,
    startHouseNumber: String = null,
    startLatE7: String = null,
    startLngE7: String = null,
    state: String = null,
    stateHouseDistrict: String = null,
    stateSenateDistrict: String = null,
    streetName: String = null,
    subAdministrativeAreaName: String = null,
    surrogateId: String = null,
    targetsmartUniquePrecinctCode: String = null,
    townshipDistrict: String = null,
    unitNumber: String = null,
    unitType: String = null,
    vanPrecinctCode: String = null,
    voterGeographicDivisionOcdIds: js.Array[String] = null,
    wardDistrict: String = null,
    wildcard: js.UndefOr[Boolean] = js.undefined,
    zip: String = null
  ): SchemaStreetSegment = {
    val __obj = js.Dynamic.literal()
    if (administrationRegionIds != null) __obj.updateDynamic("administrationRegionIds")(administrationRegionIds.asInstanceOf[js.Any])
    if (beforeGeocodeId != null) __obj.updateDynamic("beforeGeocodeId")(beforeGeocodeId.asInstanceOf[js.Any])
    if (catalistUniquePrecinctCode != null) __obj.updateDynamic("catalistUniquePrecinctCode")(catalistUniquePrecinctCode.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (cityCouncilDistrict != null) __obj.updateDynamic("cityCouncilDistrict")(cityCouncilDistrict.asInstanceOf[js.Any])
    if (congressionalDistrict != null) __obj.updateDynamic("congressionalDistrict")(congressionalDistrict.asInstanceOf[js.Any])
    if (contestIds != null) __obj.updateDynamic("contestIds")(contestIds.asInstanceOf[js.Any])
    if (countyCouncilDistrict != null) __obj.updateDynamic("countyCouncilDistrict")(countyCouncilDistrict.asInstanceOf[js.Any])
    if (countyFips != null) __obj.updateDynamic("countyFips")(countyFips.asInstanceOf[js.Any])
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (earlyVoteSiteByIds != null) __obj.updateDynamic("earlyVoteSiteByIds")(earlyVoteSiteByIds.asInstanceOf[js.Any])
    if (endHouseNumber != null) __obj.updateDynamic("endHouseNumber")(endHouseNumber.asInstanceOf[js.Any])
    if (geocodedPoint != null) __obj.updateDynamic("geocodedPoint")(geocodedPoint.asInstanceOf[js.Any])
    if (geographicDivisionOcdIds != null) __obj.updateDynamic("geographicDivisionOcdIds")(geographicDivisionOcdIds.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (judicialDistrict != null) __obj.updateDynamic("judicialDistrict")(judicialDistrict.asInstanceOf[js.Any])
    if (!js.isUndefined(mailOnly)) __obj.updateDynamic("mailOnly")(mailOnly.get.asInstanceOf[js.Any])
    if (municipalDistrict != null) __obj.updateDynamic("municipalDistrict")(municipalDistrict.asInstanceOf[js.Any])
    if (ncoaAddress != null) __obj.updateDynamic("ncoaAddress")(ncoaAddress.asInstanceOf[js.Any])
    if (oddOrEvens != null) __obj.updateDynamic("oddOrEvens")(oddOrEvens.asInstanceOf[js.Any])
    if (originalId != null) __obj.updateDynamic("originalId")(originalId.asInstanceOf[js.Any])
    if (pollinglocationByIds != null) __obj.updateDynamic("pollinglocationByIds")(pollinglocationByIds.asInstanceOf[js.Any])
    if (precinctName != null) __obj.updateDynamic("precinctName")(precinctName.asInstanceOf[js.Any])
    if (precinctOcdId != null) __obj.updateDynamic("precinctOcdId")(precinctOcdId.asInstanceOf[js.Any])
    if (provenances != null) __obj.updateDynamic("provenances")(provenances.asInstanceOf[js.Any])
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published.get.asInstanceOf[js.Any])
    if (schoolDistrict != null) __obj.updateDynamic("schoolDistrict")(schoolDistrict.asInstanceOf[js.Any])
    if (startHouseNumber != null) __obj.updateDynamic("startHouseNumber")(startHouseNumber.asInstanceOf[js.Any])
    if (startLatE7 != null) __obj.updateDynamic("startLatE7")(startLatE7.asInstanceOf[js.Any])
    if (startLngE7 != null) __obj.updateDynamic("startLngE7")(startLngE7.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (stateHouseDistrict != null) __obj.updateDynamic("stateHouseDistrict")(stateHouseDistrict.asInstanceOf[js.Any])
    if (stateSenateDistrict != null) __obj.updateDynamic("stateSenateDistrict")(stateSenateDistrict.asInstanceOf[js.Any])
    if (streetName != null) __obj.updateDynamic("streetName")(streetName.asInstanceOf[js.Any])
    if (subAdministrativeAreaName != null) __obj.updateDynamic("subAdministrativeAreaName")(subAdministrativeAreaName.asInstanceOf[js.Any])
    if (surrogateId != null) __obj.updateDynamic("surrogateId")(surrogateId.asInstanceOf[js.Any])
    if (targetsmartUniquePrecinctCode != null) __obj.updateDynamic("targetsmartUniquePrecinctCode")(targetsmartUniquePrecinctCode.asInstanceOf[js.Any])
    if (townshipDistrict != null) __obj.updateDynamic("townshipDistrict")(townshipDistrict.asInstanceOf[js.Any])
    if (unitNumber != null) __obj.updateDynamic("unitNumber")(unitNumber.asInstanceOf[js.Any])
    if (unitType != null) __obj.updateDynamic("unitType")(unitType.asInstanceOf[js.Any])
    if (vanPrecinctCode != null) __obj.updateDynamic("vanPrecinctCode")(vanPrecinctCode.asInstanceOf[js.Any])
    if (voterGeographicDivisionOcdIds != null) __obj.updateDynamic("voterGeographicDivisionOcdIds")(voterGeographicDivisionOcdIds.asInstanceOf[js.Any])
    if (wardDistrict != null) __obj.updateDynamic("wardDistrict")(wardDistrict.asInstanceOf[js.Any])
    if (!js.isUndefined(wildcard)) __obj.updateDynamic("wildcard")(wildcard.get.asInstanceOf[js.Any])
    if (zip != null) __obj.updateDynamic("zip")(zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStreetSegment]
  }
}

