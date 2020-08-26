package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionConfiguration extends js.Object {
  var kmsKeyName: js.UndefOr[String] = js.native
}

object EncryptionConfiguration {
  @scala.inline
  def apply(): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  @scala.inline
  implicit class EncryptionConfigurationOps[Self <: EncryptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKmsKeyName(value: String): Self = this.set("kmsKeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyName: Self = this.set("kmsKeyName", js.undefined)
  }
  
}

