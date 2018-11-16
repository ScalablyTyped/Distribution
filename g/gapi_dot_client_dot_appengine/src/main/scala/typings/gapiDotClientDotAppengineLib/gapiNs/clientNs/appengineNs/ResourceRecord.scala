package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResourceRecord extends js.Object {
  /** Relative name of the object affected by this record. Only applicable for CNAME records. Example: 'www'. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Data for this record. Values vary by record type, as defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1). */
  var rrdata: js.UndefOr[java.lang.String] = js.undefined
  /** Resource record type. Example: AAAA. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

