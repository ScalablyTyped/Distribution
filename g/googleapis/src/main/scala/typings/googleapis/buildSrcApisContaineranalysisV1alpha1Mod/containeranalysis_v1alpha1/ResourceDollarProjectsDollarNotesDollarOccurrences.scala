package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/containeranalysis/v1alpha1", "containeranalysis_v1alpha1.Resource$Projects$Notes$Occurrences")
@js.native
class ResourceDollarProjectsDollarNotesDollarOccurrences protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * containeranalysis.projects.notes.occurrences.list
    * @desc Lists `Occurrences` referencing the specified `Note`. Use this
    * method to get all occurrences referencing your `Note` across all your
    * customer projects.
    * @alias containeranalysis.projects.notes.occurrences.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {string} params.name The name field will contain the note name for example:   "provider/{provider_id}/notes/{note_id}"
    * @param {integer=} params.pageSize Number of notes to return in the list.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListNoteOccurrencesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListNoteOccurrencesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarNotesDollarOccurrencesDollarList): GaxiosPromise[Schema$ListNoteOccurrencesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarOccurrencesDollarList,
    callback: BodyResponseCallback[Schema$ListNoteOccurrencesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarOccurrencesDollarList,
    options: BodyResponseCallback[Schema$ListNoteOccurrencesResponse],
    callback: BodyResponseCallback[Schema$ListNoteOccurrencesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarOccurrencesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListNoteOccurrencesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarOccurrencesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListNoteOccurrencesResponse]
  ): Unit = js.native
}

