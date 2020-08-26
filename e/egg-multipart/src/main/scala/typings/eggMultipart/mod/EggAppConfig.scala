package typings.eggMultipart.mod

import typings.eggMultipart.anon.AutoFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EggAppConfig extends js.Object {
  var multipart: AutoFields = js.native
}

object EggAppConfig {
  @scala.inline
  def apply(multipart: AutoFields): EggAppConfig = {
    val __obj = js.Dynamic.literal(multipart = multipart.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppConfig]
  }
  @scala.inline
  implicit class EggAppConfigOps[Self <: EggAppConfig] (val x: Self) extends AnyVal {
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
    def setMultipart(value: AutoFields): Self = this.set("multipart", value.asInstanceOf[js.Any])
  }
  
}

