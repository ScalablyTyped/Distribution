package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PollingLocation extends js.Object {
  /** The address of the location. */
  var address: js.UndefOr[SimpleAddressType] = js.undefined
  /** The last date that this early vote site or drop off location may be used. This field is not populated for polling locations. */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /**
               * An ID for this object. IDs may change in future requests and should not be cached. Access to this field requires special access that can be requested
               * from the Request more link on the Quotas page.
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the early vote site or drop off location. This field is not populated for polling locations. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Notes about this location (e.g. accessibility ramp or entrance to use). */
  var notes: js.UndefOr[java.lang.String] = js.undefined
  /** A description of when this location is open. */
  var pollingHours: js.UndefOr[java.lang.String] = js.undefined
  /** A list of sources for this location. If multiple sources are listed the data has been aggregated from those sources. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  /** The first date that this early vote site or drop off location may be used. This field is not populated for polling locations. */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
  /** The services provided by this early vote site or drop off location. This field is not populated for polling locations. */
  var voterServices: js.UndefOr[java.lang.String] = js.undefined
}

