package typings.eggDashMultipart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggFile extends js.Object {
  var encoding: String
  var field: String
  var filename: String
  var filepath: String
  var mime: String
}

object EggFile {
  @scala.inline
  def apply(encoding: String, field: String, filename: String, filepath: String, mime: String): EggFile = {
    val __obj = js.Dynamic.literal(encoding = encoding, field = field, filename = filename, filepath = filepath, mime = mime)
  
    __obj.asInstanceOf[EggFile]
  }
}

