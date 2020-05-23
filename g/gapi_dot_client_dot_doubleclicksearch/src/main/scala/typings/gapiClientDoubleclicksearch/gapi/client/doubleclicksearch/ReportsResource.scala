package typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDoubleclicksearch.anon.Alt
import typings.gapiClientDoubleclicksearch.anon.Fields
import typings.gapiClientDoubleclicksearch.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Generates and returns a report immediately. */
  def generate(request: Alt): Request[Report]
  /** Polls for the status of a report request. */
  def get(request: Fields): Request[Report]
  /** Downloads a report file encoded in UTF-8. */
  def getFile(request: Key): Request[Unit]
  /** Inserts a report request into the reporting system. */
  def request(request: Alt): Request[Report]
}

object ReportsResource {
  @scala.inline
  def apply(
    generate: Alt => Request[Report],
    get: Fields => Request[Report],
    getFile: Key => Request[Unit],
    request: Alt => Request[Report]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), get = js.Any.fromFunction1(get), getFile = js.Any.fromFunction1(getFile), request = js.Any.fromFunction1(request))
    __obj.asInstanceOf[ReportsResource]
  }
}

