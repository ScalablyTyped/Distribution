package typings.gapiDotClientDotDataflow.gapi.client.dataflow

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
  var dataDisk: js.UndefOr[String] = js.undefined
  /**
    * The physical location of this range assignment to be used for
    * streaming computation cross-worker message delivery.
    */
  var deliveryEndpoint: js.UndefOr[String] = js.undefined
  /**
    * DEPRECATED. The location of the persistent state for this range, as a
    * persistent directory in the worker local filesystem.
    */
  var deprecatedPersistentDirectory: js.UndefOr[String] = js.undefined
  /** The end (exclusive) of the key range. */
  var end: js.UndefOr[String] = js.undefined
  /** The start (inclusive) of the key range. */
  var start: js.UndefOr[String] = js.undefined
}

object KeyRangeLocation {
  @scala.inline
  def apply(
    dataDisk: String = null,
    deliveryEndpoint: String = null,
    deprecatedPersistentDirectory: String = null,
    end: String = null,
    start: String = null
  ): KeyRangeLocation = {
    val __obj = js.Dynamic.literal()
    if (dataDisk != null) __obj.updateDynamic("dataDisk")(dataDisk.asInstanceOf[js.Any])
    if (deliveryEndpoint != null) __obj.updateDynamic("deliveryEndpoint")(deliveryEndpoint.asInstanceOf[js.Any])
    if (deprecatedPersistentDirectory != null) __obj.updateDynamic("deprecatedPersistentDirectory")(deprecatedPersistentDirectory.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyRangeLocation]
  }
}

