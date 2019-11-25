package typings.eggDashMultipart.eggMod

import typings.eggDashMultipart.EggFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * Files Object Array
    */
  var files: js.Array[EggFile]
}

object Request {
  @scala.inline
  def apply(files: js.Array[EggFile]): Request = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

