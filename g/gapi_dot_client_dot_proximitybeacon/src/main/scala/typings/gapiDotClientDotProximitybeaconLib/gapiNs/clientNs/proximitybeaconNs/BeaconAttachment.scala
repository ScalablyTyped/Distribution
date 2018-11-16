package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BeaconAttachment extends js.Object {
  /**
               * Resource name of this attachment. Attachment names have the format:
               * <code>beacons/<var>beacon_id</var>/attachments/<var>attachment_id</var></code>.
               * Leave this empty on creation.
               */
  var attachmentName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The UTC time when this attachment was created, in milliseconds since the
               * UNIX epoch.
               */
  var creationTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /**
               * An opaque data container for client-provided data. Must be
               * [base64](http://tools.ietf.org/html/rfc4648#section-4) encoded in HTTP
               * requests, and will be so encoded (with padding) in responses.
               * Required.
               */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The distance away from the beacon at which this attachment should be
               * delivered to a mobile app.
               *
               * Setting this to a value greater than zero indicates that the app should
               * behave as if the beacon is "seen" when the mobile device is less than this
               * distance away from the beacon.
               *
               * Different attachments on the same beacon can have different max distances.
               *
               * Note that even though this value is expressed with fractional meter
               * precision, real-world behavior is likley to be much less precise than one
               * meter, due to the nature of current Bluetooth radio technology.
               *
               * Optional. When not set or zero, the attachment should be delivered at the
               * beacon's outer limit of detection.
               *
               * Negative values are invalid and return an error.
               */
  var maxDistanceMeters: js.UndefOr[scala.Double] = js.undefined
  /**
               * Specifies what kind of attachment this is. Tells a client how to
               * interpret the `data` field. Format is <var>namespace/type</var>. Namespace
               * provides type separation between clients. Type describes the type of
               * `data`, for use by the client when parsing the `data` field.
               * Required.
               */
  var namespacedType: js.UndefOr[java.lang.String] = js.undefined
}

