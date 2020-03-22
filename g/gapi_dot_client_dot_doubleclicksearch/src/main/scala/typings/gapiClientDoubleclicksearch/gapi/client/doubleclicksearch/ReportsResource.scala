package typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDoubleclicksearch.AnonAlt
import typings.gapiClientDoubleclicksearch.AnonFields
import typings.gapiClientDoubleclicksearch.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Generates and returns a report immediately. */
  def generate(request: AnonAlt): Request_[Report]
  /** Polls for the status of a report request. */
  def get(request: AnonFields): Request_[Report]
  /** Downloads a report file encoded in UTF-8. */
  def getFile(request: AnonKey): Request_[Unit]
  /** Inserts a report request into the reporting system. */
  def request(request: AnonAlt): Request_[Report]
}

object ReportsResource {
  @scala.inline
  def apply(
    generate: AnonAlt => Request_[Report],
    get: AnonFields => Request_[Report],
    getFile: AnonKey => Request_[Unit],
    request: AnonAlt => Request_[Report]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), get = js.Any.fromFunction1(get), getFile = js.Any.fromFunction1(getFile), request = js.Any.fromFunction1(request))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

