package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppVersion extends js.Object {
  /** The track that this app was published in. For example if track is "alpha", this is an alpha version of the app. */
  var track: js.UndefOr[String] = js.undefined
  /** Unique increasing identifier for the app version. */
  var versionCode: js.UndefOr[Double] = js.undefined
  /**
    * The string used in the Play store by the app developer to identify the version. The string is not necessarily unique or localized (for example, the
    * string could be "1.4").
    */
  var versionString: js.UndefOr[String] = js.undefined
}

object AppVersion {
  @scala.inline
  def apply(track: String = null, versionCode: Int | Double = null, versionString: String = null): AppVersion = {
    val __obj = js.Dynamic.literal()
    if (track != null) __obj.updateDynamic("track")(track)
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode.asInstanceOf[js.Any])
    if (versionString != null) __obj.updateDynamic("versionString")(versionString)
    __obj.asInstanceOf[AppVersion]
  }
}

