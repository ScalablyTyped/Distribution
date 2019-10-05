package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionConfiguration extends js.Object {
  var kmsKeyName: js.UndefOr[String] = js.undefined
}

object EncryptionConfiguration {
  @scala.inline
  def apply(kmsKeyName: String = null): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName)
    __obj.asInstanceOf[EncryptionConfiguration]
  }
}

