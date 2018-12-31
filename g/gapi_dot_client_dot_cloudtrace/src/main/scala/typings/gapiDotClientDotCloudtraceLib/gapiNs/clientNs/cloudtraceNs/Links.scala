package typings
package gapiDotClientDotCloudtraceLib.gapiNs.clientNs.cloudtraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Links extends js.Object {
  /**
    * The number of dropped links after the maximum size was enforced. If
    * this value is 0, then no links were dropped.
    */
  var droppedLinksCount: js.UndefOr[scala.Double] = js.undefined
  /** A collection of links. */
  var link: js.UndefOr[js.Array[Link]] = js.undefined
}

