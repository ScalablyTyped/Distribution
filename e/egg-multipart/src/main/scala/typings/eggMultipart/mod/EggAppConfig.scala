package typings.eggMultipart.mod

import typings.eggMultipart.anon.AutoFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggAppConfig extends js.Object {
  var multipart: AutoFields
}

object EggAppConfig {
  @scala.inline
  def apply(multipart: AutoFields): EggAppConfig = {
    val __obj = js.Dynamic.literal(multipart = multipart.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppConfig]
  }
}

