package typings.eggMultipart.mod

import typings.eggMultipart.AnonAutoFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggAppConfig extends js.Object {
  var multipart: AnonAutoFields
}

object EggAppConfig {
  @scala.inline
  def apply(multipart: AnonAutoFields): EggAppConfig = {
    val __obj = js.Dynamic.literal(multipart = multipart.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppConfig]
  }
}

