package typings
package firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* browsingData types */
/** Options that determine exactly what data will be removed. */
trait RemovalOptions extends js.Object {
  /** Only remove data associated with these hostnames (only applies to cookies and localStorage). */
  var hostnames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An object whose properties specify which origin types ought to be cleared. If this object isn't specified,
    * it defaults to clearing only "unprotected" origins. Please ensure that you _really_ want to remove
    * application data before adding 'protectedWeb' or 'extensions'.
    */
  var originTypes: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_ProtectedWeb] = js.undefined
  /**
    * Remove data accumulated on or after this date, represented in milliseconds since the epoch (accessible via
    * the `getTime` method of the JavaScript `Date` object). If absent, defaults to 0 (which would remove all
    * browsing data).
    */
  var since: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.Date] = js.undefined
}

