package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateShortDynamicLinkResponse extends js.Object {
  /** Preivew link to show the link flow chart. */
  var previewLink: js.UndefOr[java.lang.String] = js.undefined
  /** Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz */
  var shortLink: js.UndefOr[java.lang.String] = js.undefined
  /** Information about potential warnings on link creation. */
  var warning: js.UndefOr[js.Array[DynamicLinkWarning]] = js.undefined
}

