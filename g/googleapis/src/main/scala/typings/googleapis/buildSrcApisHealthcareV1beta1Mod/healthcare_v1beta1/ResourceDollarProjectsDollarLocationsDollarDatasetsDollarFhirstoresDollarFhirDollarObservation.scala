package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Fhirstores$Fhir$Observation")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarObservation protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.Observation.get$lastn
    * @desc Get N most recent observations for patient, grouped by code that
    * match given query parameters.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.Observation.get$lastn
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Name of the FHIR store to retrieve resources from.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  @JSName("get$lastn")
  def get$lastn(): GaxiosPromise[Schema$HttpBody] = js.native
  @JSName("get$lastn")
  def get$lastn(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  @JSName("get$lastn")
  def get$lastn(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarObservationDollarGetDollarlastn
  ): GaxiosPromise[Schema$HttpBody] = js.native
  @JSName("get$lastn")
  def get$lastn(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarObservationDollarGetDollarlastn,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  @JSName("get$lastn")
  def get$lastn(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarObservationDollarGetDollarlastn,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  @JSName("get$lastn")
  def get$lastn(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarObservationDollarGetDollarlastn,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  @JSName("get$lastn")
  def get$lastn(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarObservationDollarGetDollarlastn,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
}

