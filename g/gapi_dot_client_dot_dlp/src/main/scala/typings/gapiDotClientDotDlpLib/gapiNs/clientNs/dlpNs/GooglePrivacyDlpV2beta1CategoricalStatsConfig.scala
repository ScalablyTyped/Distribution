package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CategoricalStatsConfig extends js.Object {
  /**
    * Field to compute categorical stats on. All column types are
    * supported except for arrays and structs. However, it may be more
    * informative to use NumericalStats when the field type is supported,
    * depending on the data.
    */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.undefined
}

