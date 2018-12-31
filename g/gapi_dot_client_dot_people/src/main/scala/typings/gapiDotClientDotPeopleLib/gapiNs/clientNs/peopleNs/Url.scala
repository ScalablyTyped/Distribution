package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  /**
    * The read-only type of the URL translated and formatted in the viewer's
    * account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the URL. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The type of the URL. The type can be custom or predefined.
    * Possible values include, but are not limited to, the following:
    *
    * &#42; `home`
    * &#42; `work`
    * &#42; `blog`
    * &#42; `profile`
    * &#42; `homePage`
    * &#42; `ftp`
    * &#42; `reservations`
    * &#42; `appInstallPage`: website for a Google+ application.
    * &#42; `other`
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The URL. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

