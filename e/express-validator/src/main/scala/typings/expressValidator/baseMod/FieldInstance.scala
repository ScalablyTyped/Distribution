package typings.expressValidator.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldInstance extends js.Object {
  var location: Location = js.native
  var originalPath: String = js.native
  var originalValue: js.Any = js.native
  var path: String = js.native
  var value: js.Any = js.native
}

object FieldInstance {
  @scala.inline
  def apply(location: Location, originalPath: String, originalValue: js.Any, path: String, value: js.Any): FieldInstance = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], originalPath = originalPath.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInstance]
  }
  @scala.inline
  implicit class FieldInstanceOps[Self <: FieldInstance] (val x: Self) extends AnyVal {
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
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalPath(value: String): Self = this.set("originalPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalValue(value: js.Any): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

