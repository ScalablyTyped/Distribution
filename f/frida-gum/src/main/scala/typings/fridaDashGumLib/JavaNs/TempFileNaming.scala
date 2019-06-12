package typings
package fridaDashGumLib.JavaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFileNaming extends js.Object {
  /**
    * File name prefix to use.
    *
    * For example: `frida`.
    */
  var prefix: java.lang.String
  /**
    * File name suffix to use.
    *
    * For example: `dat`.
    */
  var suffix: java.lang.String
}

object TempFileNaming {
  @scala.inline
  def apply(prefix: java.lang.String, suffix: java.lang.String): TempFileNaming = {
    val __obj = js.Dynamic.literal(prefix = prefix, suffix = suffix)
  
    __obj.asInstanceOf[TempFileNaming]
  }
}

