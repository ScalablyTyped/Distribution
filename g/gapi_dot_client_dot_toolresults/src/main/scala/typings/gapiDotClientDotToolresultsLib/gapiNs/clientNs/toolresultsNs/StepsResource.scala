package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

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
  def create(request: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Step]
  /**
    * Gets a Step.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Step does not
    * exist
    */
  def get(request: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Step]
  /**
    * Retrieves a PerfMetricsSummary.
    *
    * May return any of the following error code(s): - NOT_FOUND - The specified PerfMetricsSummary does not exist
    */
  def getPerfMetricsSummary(request: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFields): gapiDotClientLib.gapiNs.clientNs.Request[PerfMetricsSummary]
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
  def list(request: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPageSize): gapiDotClientLib.gapiNs.clientNs.Request[ListStepsResponse]
  /**
    * Updates an existing Step with the supplied partial entity.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * requested state transition is illegal (e.g try to upload a duplicate xml file), if the updated step is too large (more than 10Mib) - NOT_FOUND - if the
    * containing Execution does not exist
    */
  def patch(
    request: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrintProjectId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Step]
  /**
    * Publish xml files to an existing Step.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * requested state transition is illegal, e.g try to upload a duplicate xml file or a file too large. - NOT_FOUND - if the containing Execution does not
    * exist
    */
  def publishXunitXmlFiles(request: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Step]
}

object StepsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Step],
    get: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Step],
    getPerfMetricsSummary: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFields => gapiDotClientLib.gapiNs.clientNs.Request[PerfMetricsSummary],
    list: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPageSize => gapiDotClientLib.gapiNs.clientNs.Request[ListStepsResponse],
    patch: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrintProjectId => gapiDotClientLib.gapiNs.clientNs.Request[Step],
    perfMetricsSummary: PerfMetricsSummaryResource,
    perfSampleSeries: PerfSampleSeriesResource,
    publishXunitXmlFiles: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Step],
    thumbnails: ThumbnailsResource
  ): StepsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), getPerfMetricsSummary = js.Any.fromFunction1(getPerfMetricsSummary), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), perfMetricsSummary = perfMetricsSummary, perfSampleSeries = perfSampleSeries, publishXunitXmlFiles = js.Any.fromFunction1(publishXunitXmlFiles), thumbnails = thumbnails)
  
    __obj.asInstanceOf[StepsResource]
  }
}

