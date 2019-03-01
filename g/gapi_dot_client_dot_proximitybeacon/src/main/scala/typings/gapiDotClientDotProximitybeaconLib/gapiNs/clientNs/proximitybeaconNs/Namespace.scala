package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Namespace extends js.Object {
  /**
    * Resource name of this namespace. Namespaces names have the format:
    * <code>namespaces/<var>namespace</var></code>.
    */
  var namespaceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies what clients may receive attachments under this namespace
    * via `beaconinfo.getforobserved`.
    */
  var servingVisibility: js.UndefOr[java.lang.String] = js.undefined
}

object Namespace {
  @scala.inline
  def apply(namespaceName: java.lang.String = null, servingVisibility: java.lang.String = null): Namespace = {
    val __obj = js.Dynamic.literal()
    if (namespaceName != null) __obj.updateDynamic("namespaceName")(namespaceName)
    if (servingVisibility != null) __obj.updateDynamic("servingVisibility")(servingVisibility)
    __obj.asInstanceOf[Namespace]
  }
}

