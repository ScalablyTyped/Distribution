package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Hl7v2stores$Messages")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.messages.create
    * @desc Creates a message and sends a notification to the Cloud Pub/Sub
    * topic. If configured, the MLLP adapter listens to messages created by
    * this method and sends those back to the hospital. A successful response
    * indicates the message has been persisted to storage and a Cloud Pub/Sub
    * notification has been sent. Sending to the hospital by the MLLP adapter
    * happens asynchronously.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.messages.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the dataset this message belongs to.
    * @param {().CreateMessageRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Message] = js.native
  def create(callback: BodyResponseCallback[Schema$Message]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarCreate
  ): GaxiosPromise[Schema$Message] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarCreate,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarCreate,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Message] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.messages.delete
    * @desc Deletes an HL7v2 message.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.messages.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the HL7v2 message to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarDelete
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.messages.get
    * @desc Gets an HL7v2 message.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.messages.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the HL7v2 message to retrieve.
    * @param {string=} params.view Specifies which parts of the Message resource should be returned in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Message] = js.native
  def get(callback: BodyResponseCallback[Schema$Message]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarGet
  ): GaxiosPromise[Schema$Message] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarGet,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarGet,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Message] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.messages.ingest
    * @desc Ingests a new HL7v2 message from the hospital and sends a
    * notification to the Cloud Pub/Sub topic. Return is an HL7v2 ACK message
    * if the message was successfully stored. Otherwise an error is returned.
    * If an identical HL7v2 message is created twice only one resource is
    * created on the server and no error is reported.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.messages.ingest
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the HL7v2 store this message belongs to.
    * @param {().IngestMessageRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def ingest(): GaxiosPromise[Schema$IngestMessageResponse] = js.native
  def ingest(callback: BodyResponseCallback[Schema$IngestMessageResponse]): Unit = js.native
  def ingest(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarIngest
  ): GaxiosPromise[Schema$IngestMessageResponse] = js.native
  def ingest(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarIngest,
    callback: BodyResponseCallback[Schema$IngestMessageResponse]
  ): Unit = js.native
  def ingest(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarIngest,
    options: BodyResponseCallback[Schema$IngestMessageResponse],
    callback: BodyResponseCallback[Schema$IngestMessageResponse]
  ): Unit = js.native
  def ingest(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarIngest,
    options: MethodOptions
  ): GaxiosPromise[Schema$IngestMessageResponse] = js.native
  def ingest(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarIngest,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$IngestMessageResponse]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.messages.list
    * @desc Lists all the messages in the given HL7v2 store with support for
    * filtering.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.messages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Restricts messages returned to those matching a filter. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings Fields/functions available for filtering are: - message_type, from the MSH-9 segment, e.g. 'NOT message_type = "ADT"' - send_date or sendDate, the YYYY-MM-DD date the message was sent in the   dataset's time_zone, from the MSH-7 segment; e.g.   'send_date < "2017-01-02"' - send_time, the timestamp of when the message was sent, using the RFC3339   time format for comparisons, from the MSH-7 segment; e.g. 'send_time <   "2017-01-02T00:00:00-05:00"' - send_facility, the hospital/trust that the message came from, from the   MSH-4 segment, e.g. 'send_facility = "RAL"' - HL7RegExp(expr), which does regular expression matching of expr against   the HL7 message payload using re2 (http://code.google.com/p/re2/)   syntax; e.g. 'HL7RegExp("^.*\|.*\|CERNER")' - PatientId(value, type), which matches if the message lists a patient   having an ID of the given value and type in the PID-2, PID-3, or PID-4   segments; e.g. 'PatientId("123456", "MRN")' - HasLabel(x), a boolean returning true if the message has a label with   key x (having any value) set using the labels map in Message; e.g.   'HasLabel("priority")' - Label(x), a string value of the label with key x as set using the labels   map in Message, e.g. 'Label("priority") = "high"' Negation on the patient ID function and the label function are not supported, e.g. invalid queries: 'NOT PatientId("123456", "MRN")', 'NOT HasLabel("tag1")', 'NOT Label("tag2") = "val2"'. Conjunction of multiple patient ID functions is not supported, e.g. an invalid query: 'PatientId("123456", "MRN") AND PatientId("456789", "MRN")'. Conjunction of multiple label functions is also not supported, e.g. an invalid query: 'HasLabel("tag1") AND Label("tag2") = "val2"'. Conjunction of one patient ID function, one label function and other fields is supported, e.g. a valid query: 'PatientId("123456", "MRN") AND HasLabel("tag1") AND message_type = "ADT"'.
    * @param {string=} params.orderBy Orders messages returned by the specified order_by clause. Syntax: https://cloud.google.com/apis/design/design_patterns#sorting_order Fields available for ordering are: - send_time
    * @param {integer=} params.pageSize Limit on the number of messages to return in a single response. If zero the default page size of 100 is used.
    * @param {string=} params.pageToken The next_page_token value returned from the previous List request, if any.
    * @param {string} params.parent Name of the HL7v2 store to retrieve messages from.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListMessagesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListMessagesResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarList
  ): GaxiosPromise[Schema$ListMessagesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarList,
    callback: BodyResponseCallback[Schema$ListMessagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarList,
    options: BodyResponseCallback[Schema$ListMessagesResponse],
    callback: BodyResponseCallback[Schema$ListMessagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListMessagesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListMessagesResponse]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.messages.patch
    * @desc Update the message.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.messages.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
    * @param {string=} params.updateMask The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask Only the `labels` field is allowed to be updated. The labels in the request will be merged with the existing set of labels. Existing labels with the same keys will be updated.
    * @param {().Message} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Message] = js.native
  def patch(callback: BodyResponseCallback[Schema$Message]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarPatch
  ): GaxiosPromise[Schema$Message] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarPatch,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarPatch,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Message] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessagesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
}

