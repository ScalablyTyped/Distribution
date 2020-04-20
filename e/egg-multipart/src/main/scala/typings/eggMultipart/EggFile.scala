package typings.eggMultipart

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
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggFile]
  }
}

