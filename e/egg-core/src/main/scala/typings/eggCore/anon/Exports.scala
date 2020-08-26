package typings.eggCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exports extends js.Object {
  var exports: js.Any = js.native
  var fullpath: String = js.native
  var properties: js.Array[String] = js.native
}

object Exports {
  @scala.inline
  def apply(exports: js.Any, fullpath: String, properties: js.Array[String]): Exports = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], fullpath = fullpath.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exports]
  }
  @scala.inline
  implicit class ExportsOps[Self <: Exports] (val x: Self) extends AnyVal {
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
    def setExports(value: js.Any): Self = this.set("exports", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullpath(value: String): Self = this.set("fullpath", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

