package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyRangeLocation extends js.Object {
  /**
    * The name of the data disk where data for this range is stored.
    * This name is local to the Google Cloud Platform project and uniquely
    * identifies the disk within that project, for example
    * "myproject-1014-104817-4c2-harness-0-disk-1".
    */
  var dataDisk: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The physical location of this range assignment to be used for
    * streaming computation cross-worker message delivery.
    */
  var deliveryEndpoint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * DEPRECATED. The location of the persistent state for this range, as a
    * persistent directory in the worker local filesystem.
    */
  var deprecatedPersistentDirectory: js.UndefOr[java.lang.String] = js.undefined
  /** The end (exclusive) of the key range. */
  var end: js.UndefOr[java.lang.String] = js.undefined
  /** The start (inclusive) of the key range. */
  var start: js.UndefOr[java.lang.String] = js.undefined
}

