package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subset of attachment information served via the
  * `beaconinfo.getforobserved` method, used when your users encounter your
  * beacons.
  */
@js.native
trait Schema$AttachmentInfo extends js.Object {
  /**
    * An opaque data container for client-provided data.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The distance away from the beacon at which this attachment should be
    * delivered to a mobile app.  Setting this to a value greater than zero
    * indicates that the app should behave as if the beacon is &quot;seen&quot;
    * when the mobile device is less than this distance away from the beacon.
    * Different attachments on the same beacon can have different max
    * distances.  Note that even though this value is expressed with fractional
    * meter precision, real-world behavior is likley to be much less precise
    * than one meter, due to the nature of current Bluetooth radio technology.
    * Optional. When not set or zero, the attachment should be delivered at the
    * beacon&#39;s outer limit of detection.
    */
  var maxDistanceMeters: js.UndefOr[Double] = js.native
  /**
    * Specifies what kind of attachment this is. Tells a client how to
    * interpret the `data` field. Format is
    * &lt;var&gt;namespace/type&lt;/var&gt;, for example
    * &lt;code&gt;scrupulous-wombat-12345/welcome-message&lt;/code&gt;
    */
  var namespacedType: js.UndefOr[String] = js.native
}

object Schema$AttachmentInfo {
  @scala.inline
  def apply(data: String = null, maxDistanceMeters: Int | Double = null, namespacedType: String = null): Schema$AttachmentInfo = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (maxDistanceMeters != null) __obj.updateDynamic("maxDistanceMeters")(maxDistanceMeters.asInstanceOf[js.Any])
    if (namespacedType != null) __obj.updateDynamic("namespacedType")(namespacedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AttachmentInfo]
  }
}

