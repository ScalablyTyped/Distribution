package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempFileNaming extends js.Object {
  /**
    * File name prefix to use.
    *
    * For example: `frida`.
    */
  var prefix: String = js.native
  /**
    * File name suffix to use.
    *
    * For example: `dat`.
    */
  var suffix: String = js.native
}

object TempFileNaming {
  @scala.inline
  def apply(prefix: String, suffix: String): TempFileNaming = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFileNaming]
  }
  @scala.inline
  implicit class TempFileNamingOps[Self <: TempFileNaming] (val x: Self) extends AnyVal {
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
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
  }
  
}

