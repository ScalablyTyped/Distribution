package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UrlChannel extends js.Object {
  /** Unique identifier of this URL channel. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adexchangeseller#urlChannel. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** URL Pattern of this URL channel. Does not include "http://" or "https://". Example: www.example.com/home */
  var urlPattern: js.UndefOr[java.lang.String] = js.undefined
}

