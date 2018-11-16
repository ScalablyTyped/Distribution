package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Filter extends js.Object {
  /**
       * Retrieves cookies whose domains match or are subdomains of domains.
       */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Filters cookies by name.
       */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Retrieves cookies whose path matches path.
       */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Filters cookies by their Secure property.
       */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Filters out session or persistent cookies.
       */
  var session: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Retrieves cookies which are associated with url. Empty implies retrieving
       * cookies of all urls.
       */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

