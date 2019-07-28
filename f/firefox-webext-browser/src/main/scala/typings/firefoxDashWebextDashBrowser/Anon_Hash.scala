package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs.HttpURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  /** A hash of the XPI file, using sha256 or stronger. */
  var hash: js.UndefOr[String] = js.undefined
  /** URL pointing to the XPI file on addons.mozilla.org or similar. */
  var url: HttpURL
}

object Anon_Hash {
  @scala.inline
  def apply(url: HttpURL, hash: String = null): Anon_Hash = {
    val __obj = js.Dynamic.literal(url = url)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    __obj.asInstanceOf[Anon_Hash]
  }
}

