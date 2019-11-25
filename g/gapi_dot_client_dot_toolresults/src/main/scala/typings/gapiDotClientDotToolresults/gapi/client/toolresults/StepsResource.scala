package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotToolresults.Anon_AltExecutionIdFields
import typings.gapiDotClientDotToolresults.Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPageSize
import typings.gapiDotClientDotToolresults.Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotToolresults.Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrintProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsResource extends js.Object {
  var perfMetricsSummary: PerfMetricsSummaryResource
  var perfSampleSeries: PerfSampleSeriesResource
  var thumbnails: ThumbnailsResource
  /**
    * Creates a Step.
    *
    * The returned Step will have the id set.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * step is too large (more than 10Mib) - NOT_FOUND - if the containing Execution does not exist
    */
  def create(request: Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrint): Request[Step]
  /**
    * Gets a Step.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Step does not
    * exist
    */
  def get(request: Anon_AltExecutionIdFields): Request[Step]
  /**
    * Retrieves a PerfMetricsSummary.
    *
    * May return any of the following error code(s): - NOT_FOUND - The specified PerfMetricsSummary does not exist
    */
  def getPerfMetricsSummary(request: Anon_AltExecutionIdFields): Request[PerfMetricsSummary]
  /**
    * Lists Steps for a given Execution.
    *
    * The steps are sorted by creation_time in descending order. The step_id key will be used to order the steps with the same creation_time.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if an
    * argument in the request happens to be invalid; e.g. if an attempt is made to list the children of a nonexistent Step - NOT_FOUND - if the containing
    * Execution does not exist
    */
  def list(request: Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPageSize): Request[ListStepsResponse]
  /**
    * Updates an existing Step with the supplied partial entity.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * requested state transition is illegal (e.g try to upload a duplicate xml file), if the updated step is too large (more than 10Mib) - NOT_FOUND - if the
    * containing Execution does not exist
    */
  def patch(request: Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrintProjectId): Request[Step]
  /**
    * Publish xml files to an existing Step.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * requested state transition is illegal, e.g try to upload a duplicate xml file or a file too large. - NOT_FOUND - if the containing Execution does not
    * exist
    */
  def publishXunitXmlFiles(request: Anon_AltExecutionIdFields): Request[Step]
}

object StepsResource {
  @scala.inline
  def apply(
    create: Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrint => Request[Step],
    get: Anon_AltExecutionIdFields => Request[Step],
    getPerfMetricsSummary: Anon_AltExecutionIdFields => Request[PerfMetricsSummary],
    list: Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPageSize => Request[ListStepsResponse],
    patch: Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrintProjectId => Request[Step],
    perfMetricsSummary: PerfMetricsSummaryResource,
    perfSampleSeries: PerfSampleSeriesResource,
    publishXunitXmlFiles: Anon_AltExecutionIdFields => Request[Step],
    thumbnails: ThumbnailsResource
  ): StepsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), getPerfMetricsSummary = js.Any.fromFunction1(getPerfMetricsSummary), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), perfMetricsSummary = perfMetricsSummary.asInstanceOf[js.Any], perfSampleSeries = perfSampleSeries.asInstanceOf[js.Any], publishXunitXmlFiles = js.Any.fromFunction1(publishXunitXmlFiles), thumbnails = thumbnails.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StepsResource]
  }
}

