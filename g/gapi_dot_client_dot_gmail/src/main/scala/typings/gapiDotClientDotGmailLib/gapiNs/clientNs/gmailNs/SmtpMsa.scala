package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SmtpMsa extends js.Object {
  /** The hostname of the SMTP service. Required. */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The password that will be used for authentication with the SMTP service. This is a write-only field that can be specified in requests to create or
               * update SendAs settings; it is never populated in responses.
               */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** The port of the SMTP service. Required. */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** The protocol that will be used to secure communication with the SMTP service. Required. */
  var securityMode: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The username that will be used for authentication with the SMTP service. This is a write-only field that can be specified in requests to create or
               * update SendAs settings; it is never populated in responses.
               */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

