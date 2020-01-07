package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Fhirstores$Fhir$Patient")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarPatient protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.Patient.get$everything
    * @desc Gets all the resources in the patient compartment.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.Patient.get$everything
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.end The response includes records prior to the end date. If no end date is provided, all records subsequent to the start date are in scope.
    * @param {string} params.name Name of the patient for which the information is required.
    * @param {string=} params.start The response includes records subsequent to the start date. If no start date is provided, all records prior to the end date are in scope.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  @JSName("get$everything")
  def get$everything(): GaxiosPromise[Schema$HttpBody] = js.native
  @JSName("get$everything")
  def get$everything(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  @JSName("get$everything")
  def get$everything(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarPatientDollarGetDollareverything
  ): GaxiosPromise[Schema$HttpBody] = js.native
  @JSName("get$everything")
  def get$everything(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarPatientDollarGetDollareverything,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  @JSName("get$everything")
  def get$everything(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarPatientDollarGetDollareverything,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  @JSName("get$everything")
  def get$everything(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarPatientDollarGetDollareverything,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  @JSName("get$everything")
  def get$everything(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarPatientDollarGetDollareverything,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
}

