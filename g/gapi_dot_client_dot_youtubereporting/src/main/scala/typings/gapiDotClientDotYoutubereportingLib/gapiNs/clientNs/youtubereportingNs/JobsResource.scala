package typings
package gapiDotClientDotYoutubereportingLib.gapiNs.clientNs.youtubereportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  var reports: ReportsResource
  /** Creates a job and returns it. */
  def create(request: gapiDotClientDotYoutubereportingLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Job]
  /** Deletes a job. */
  def delete(request: gapiDotClientDotYoutubereportingLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a job. */
  def get(request: gapiDotClientDotYoutubereportingLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Job]
  /** Lists jobs. */
  def list(request: gapiDotClientDotYoutubereportingLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[ListJobsResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotYoutubereportingLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Job]
    ],
    delete: js.Function1[
      gapiDotClientDotYoutubereportingLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotYoutubereportingLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[Job]
    ],
    list: js.Function1[
      gapiDotClientDotYoutubereportingLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListJobsResponse]
    ],
    reports: ReportsResource
  ): JobsResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, list = list, reports = reports)
  
    __obj.asInstanceOf[JobsResource]
  }
}

