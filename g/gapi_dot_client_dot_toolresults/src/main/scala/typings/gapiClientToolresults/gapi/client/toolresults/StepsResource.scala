package typings.gapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request
import typings.gapiClientToolresults.anon.Fields
import typings.gapiClientToolresults.anon.PageSize
import typings.gapiClientToolresults.anon.PrettyPrint
import typings.gapiClientToolresults.anon.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepsResource extends js.Object {
  var perfMetricsSummary: PerfMetricsSummaryResource = js.native
  var perfSampleSeries: PerfSampleSeriesResource = js.native
  var thumbnails: ThumbnailsResource = js.native
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
  def create(request: PrettyPrint): Request[Step] = js.native
  /**
    * Gets a Step.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Step does not
    * exist
    */
  def get(request: Fields): Request[Step] = js.native
  /**
    * Retrieves a PerfMetricsSummary.
    *
    * May return any of the following error code(s): - NOT_FOUND - The specified PerfMetricsSummary does not exist
    */
  def getPerfMetricsSummary(request: Fields): Request[PerfMetricsSummary] = js.native
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
  def list(request: PageSize): Request[ListStepsResponse] = js.native
  /**
    * Updates an existing Step with the supplied partial entity.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * requested state transition is illegal (e.g try to upload a duplicate xml file), if the updated step is too large (more than 10Mib) - NOT_FOUND - if the
    * containing Execution does not exist
    */
  def patch(request: ProjectId): Request[Step] = js.native
  /**
    * Publish xml files to an existing Step.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * requested state transition is illegal, e.g try to upload a duplicate xml file or a file too large. - NOT_FOUND - if the containing Execution does not
    * exist
    */
  def publishXunitXmlFiles(request: Fields): Request[Step] = js.native
}

object StepsResource {
  @scala.inline
  def apply(
    create: PrettyPrint => Request[Step],
    get: Fields => Request[Step],
    getPerfMetricsSummary: Fields => Request[PerfMetricsSummary],
    list: PageSize => Request[ListStepsResponse],
    patch: ProjectId => Request[Step],
    perfMetricsSummary: PerfMetricsSummaryResource,
    perfSampleSeries: PerfSampleSeriesResource,
    publishXunitXmlFiles: Fields => Request[Step],
    thumbnails: ThumbnailsResource
  ): StepsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), getPerfMetricsSummary = js.Any.fromFunction1(getPerfMetricsSummary), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), perfMetricsSummary = perfMetricsSummary.asInstanceOf[js.Any], perfSampleSeries = perfSampleSeries.asInstanceOf[js.Any], publishXunitXmlFiles = js.Any.fromFunction1(publishXunitXmlFiles), thumbnails = thumbnails.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsResource]
  }
  @scala.inline
  implicit class StepsResourceOps[Self <: StepsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: PrettyPrint => Request[Step]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[Step]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPerfMetricsSummary(value: Fields => Request[PerfMetricsSummary]): Self = this.set("getPerfMetricsSummary", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PageSize => Request[ListStepsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: ProjectId => Request[Step]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setPerfMetricsSummary(value: PerfMetricsSummaryResource): Self = this.set("perfMetricsSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerfSampleSeries(value: PerfSampleSeriesResource): Self = this.set("perfSampleSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublishXunitXmlFiles(value: Fields => Request[Step]): Self = this.set("publishXunitXmlFiles", js.Any.fromFunction1(value))
    @scala.inline
    def setThumbnails(value: ThumbnailsResource): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
  }
  
}

