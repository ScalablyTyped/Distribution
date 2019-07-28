package typings.gapiDotClientDotDoubleclicksearch.gapiNs.clientNs.doubleclicksearchNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDoubleclicksearch.Anon_Alt
import typings.gapiDotClientDotDoubleclicksearch.Anon_AltFields
import typings.gapiDotClientDotDoubleclicksearch.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Generates and returns a report immediately. */
  def generate(request: Anon_Alt): Request[Report]
  /** Polls for the status of a report request. */
  def get(request: Anon_AltFields): Request[Report]
  /** Downloads a report file encoded in UTF-8. */
  def getFile(request: Anon_AltFieldsKey): Request[Unit]
  /** Inserts a report request into the reporting system. */
  def request(request: Anon_Alt): Request[Report]
}

object ReportsResource {
  @scala.inline
  def apply(
    generate: Anon_Alt => Request[Report],
    get: Anon_AltFields => Request[Report],
    getFile: Anon_AltFieldsKey => Request[Unit],
    request: Anon_Alt => Request[Report]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), get = js.Any.fromFunction1(get), getFile = js.Any.fromFunction1(getFile), request = js.Any.fromFunction1(request))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

