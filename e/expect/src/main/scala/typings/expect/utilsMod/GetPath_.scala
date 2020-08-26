package typings.expect.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPath_ extends js.Object {
  var hasEndProp: js.UndefOr[Boolean] = js.native
  var lastTraversedObject: js.Any = js.native
  var traversedPath: js.Array[String] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object GetPath_ {
  @scala.inline
  def apply(lastTraversedObject: js.Any, traversedPath: js.Array[String]): GetPath_ = {
    val __obj = js.Dynamic.literal(lastTraversedObject = lastTraversedObject.asInstanceOf[js.Any], traversedPath = traversedPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPath_]
  }
  @scala.inline
  implicit class GetPath_Ops[Self <: GetPath_] (val x: Self) extends AnyVal {
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
    def setLastTraversedObject(value: js.Any): Self = this.set("lastTraversedObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraversedPathVarargs(value: String*): Self = this.set("traversedPath", js.Array(value :_*))
    @scala.inline
    def setTraversedPath(value: js.Array[String]): Self = this.set("traversedPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasEndProp(value: Boolean): Self = this.set("hasEndProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasEndProp: Self = this.set("hasEndProp", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

