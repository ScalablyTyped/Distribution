package typings.globby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extensions extends js.Object {
  var extensions: js.Array[String]
  var files: js.Array[String]
}

object Anon_Extensions {
  @scala.inline
  def apply(extensions: js.Array[String], files: js.Array[String]): Anon_Extensions = {
    val __obj = js.Dynamic.literal(extensions = extensions, files = files)
  
    __obj.asInstanceOf[Anon_Extensions]
  }
}

