package typings
package gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Generates and returns a report immediately. */
  def generate(request: gapiDotClientDotDoubleclicksearchLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Report]
  /** Polls for the status of a report request. */
  def get(request: gapiDotClientDotDoubleclicksearchLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Report]
  /** Downloads a report file encoded in UTF-8. */
  def getFile(request: gapiDotClientDotDoubleclicksearchLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Inserts a report request into the reporting system. */
  def request(request: gapiDotClientDotDoubleclicksearchLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Report]
}

object ReportsResource {
  @scala.inline
  def apply(
    generate: js.Function1[
      gapiDotClientDotDoubleclicksearchLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Report]
    ],
    get: js.Function1[
      gapiDotClientDotDoubleclicksearchLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Report]
    ],
    getFile: js.Function1[
      gapiDotClientDotDoubleclicksearchLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    request: js.Function1[
      gapiDotClientDotDoubleclicksearchLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Report]
    ]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(generate = generate, get = get, getFile = getFile, request = request)
  
    __obj.asInstanceOf[ReportsResource]
  }
}

