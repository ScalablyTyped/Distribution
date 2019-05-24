package typings
package eggDashMultipartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggFile extends js.Object {
  var encoding: java.lang.String
  var field: java.lang.String
  var filename: java.lang.String
  var filepath: java.lang.String
  var mime: java.lang.String
}

object EggFile {
  @scala.inline
  def apply(
    encoding: java.lang.String,
    field: java.lang.String,
    filename: java.lang.String,
    filepath: java.lang.String,
    mime: java.lang.String
  ): EggFile = {
    val __obj = js.Dynamic.literal(encoding = encoding, field = field, filename = filename, filepath = filepath, mime = mime)
  
    __obj.asInstanceOf[EggFile]
  }
}

