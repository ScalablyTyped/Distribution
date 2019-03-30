package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionConfiguration extends js.Object {
  var kmsKeyName: js.UndefOr[java.lang.String] = js.undefined
}

object EncryptionConfiguration {
  @scala.inline
  def apply(kmsKeyName: java.lang.String = null): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName)
    __obj.asInstanceOf[EncryptionConfiguration]
  }
}

