package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomchannelsResource extends js.Object {
  /** Get the specified custom channel from the specified ad client. */
  def get(request: gapiDotClientDotAdexchangesellerLib.Anon_PrettyPrintAdClientId): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel]
  /** List all custom channels in the specified ad client for this Ad Exchange account. */
  def list(request: gapiDotClientDotAdexchangesellerLib.Anon_MaxResultsPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannels]
}

