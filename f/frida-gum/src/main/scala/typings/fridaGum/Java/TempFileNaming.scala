package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFileNaming extends js.Object {
  /**
    * File name prefix to use.
    *
    * For example: `frida`.
    */
  var prefix: String
  /**
    * File name suffix to use.
    *
    * For example: `dat`.
    */
  var suffix: String
}

object TempFileNaming {
  @scala.inline
  def apply(prefix: String, suffix: String): TempFileNaming = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TempFileNaming]
  }
}

