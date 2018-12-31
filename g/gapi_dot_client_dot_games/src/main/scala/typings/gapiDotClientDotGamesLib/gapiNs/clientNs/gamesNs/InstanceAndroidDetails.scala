package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceAndroidDetails extends js.Object {
  /** Flag indicating whether the anti-piracy check is enabled. */
  var enablePiracyCheck: js.UndefOr[scala.Boolean] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#instanceAndroidDetails. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Android package name which maps to Google Play URL. */
  var packageName: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates that this instance is the default for new installations. */
  var preferred: js.UndefOr[scala.Boolean] = js.undefined
}

