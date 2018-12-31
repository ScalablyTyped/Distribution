package typings
package firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A set of data types. Missing data types are interpreted as `false`. */
trait DataTypeSet extends js.Object {
  /**
    * The browser's cache. Note: when removing data, this clears the _entire_ cache: it is not limited to the
    * range you specify.
    */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /** The browser's cookies. */
  var cookies: js.UndefOr[scala.Boolean] = js.undefined
  /** The browser's download list. */
  var downloads: js.UndefOr[scala.Boolean] = js.undefined
  /** The browser's stored form data. */
  var formData: js.UndefOr[scala.Boolean] = js.undefined
  /** The browser's history. */
  var history: js.UndefOr[scala.Boolean] = js.undefined
  /** Websites' IndexedDB data. */
  var indexedDB: js.UndefOr[scala.Boolean] = js.undefined
  /** Websites' local storage data. */
  var localStorage: js.UndefOr[scala.Boolean] = js.undefined
  /** Stored passwords. */
  var passwords: js.UndefOr[scala.Boolean] = js.undefined
  /** Plugins' data. */
  var pluginData: js.UndefOr[scala.Boolean] = js.undefined
  /** Server-bound certificates. */
  var serverBoundCertificates: js.UndefOr[scala.Boolean] = js.undefined
  /** Service Workers. */
  var serviceWorkers: js.UndefOr[scala.Boolean] = js.undefined
}

