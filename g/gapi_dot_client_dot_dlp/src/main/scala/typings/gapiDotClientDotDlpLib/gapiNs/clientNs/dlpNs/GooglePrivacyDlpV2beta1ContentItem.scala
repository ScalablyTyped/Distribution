package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GooglePrivacyDlpV2beta1ContentItem extends js.Object {
  /** Content data to inspect or redact. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Structured content for inspection. */
  var table: js.UndefOr[GooglePrivacyDlpV2beta1Table] = js.undefined
  /**
               * Type of the content, as defined in Content-Type HTTP header.
               * Supported types are: all "text" types, octet streams, PNG images,
               * JPEG images.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** String data to inspect or redact. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

