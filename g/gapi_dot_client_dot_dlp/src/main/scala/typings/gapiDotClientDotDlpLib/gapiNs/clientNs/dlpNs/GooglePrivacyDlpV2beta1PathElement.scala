package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1PathElement extends js.Object {
  /**
    * The auto-allocated ID of the entity.
    * Never equal to zero. Values less than zero are discouraged and may not
    * be supported in the future.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The kind of the entity.
    * A kind matching regex `__.&#42;__` is reserved/read-only.
    * A kind must not contain more than 1500 bytes when UTF-8 encoded.
    * Cannot be `""`.
    */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the entity.
    * A name matching regex `__.&#42;__` is reserved/read-only.
    * A name must not be more than 1500 bytes when UTF-8 encoded.
    * Cannot be `""`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

