package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomChannel extends js.Object {
  /** Code of this custom channel, not necessarily unique across ad clients. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier of this custom channel. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adexchangeseller#customChannel. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this custom channel. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The targeting information of this custom channel, if activated. */
  var targetingInfo: js.UndefOr[gapiDotClientDotAdexchangesellerLib.Anon_AdsAppearOn] = js.undefined
}

