package typings.gapiDotClientDotProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Namespace extends js.Object {
  /**
    * Resource name of this namespace. Namespaces names have the format:
    * <code>namespaces/<var>namespace</var></code>.
    */
  var namespaceName: js.UndefOr[String] = js.undefined
  /**
    * Specifies what clients may receive attachments under this namespace
    * via `beaconinfo.getforobserved`.
    */
  var servingVisibility: js.UndefOr[String] = js.undefined
}

object Namespace {
  @scala.inline
  def apply(namespaceName: String = null, servingVisibility: String = null): Namespace = {
    val __obj = js.Dynamic.literal()
    if (namespaceName != null) __obj.updateDynamic("namespaceName")(namespaceName.asInstanceOf[js.Any])
    if (servingVisibility != null) __obj.updateDynamic("servingVisibility")(servingVisibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
}

