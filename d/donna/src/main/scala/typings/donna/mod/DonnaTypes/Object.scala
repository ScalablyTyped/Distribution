package typings.donna.mod.DonnaTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  var bindingType: String = js.native
  var classProperties: js.UndefOr[js.Array[_]] = js.native
  var doc: js.UndefOr[String] = js.native
  var name: String = js.native
  var paramNames: js.UndefOr[js.Array[String]] = js.native
  var prototypeProperties: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var range: js.Array[js.Array[Double]] = js.native
  var `type`: String = js.native
}

object Object {
  @scala.inline
  def apply(bindingType: String, name: String, range: js.Array[js.Array[Double]], `type`: String): Object = {
    val __obj = js.Dynamic.literal(bindingType = bindingType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  implicit class ObjectOps[Self <: Object] (val x: Self) extends AnyVal {
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
    def setBindingType(value: String): Self = this.set("bindingType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeVarargs(value: js.Array[Double]*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: js.Array[js.Array[Double]]): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassPropertiesVarargs(value: js.Any*): Self = this.set("classProperties", js.Array(value :_*))
    @scala.inline
    def setClassProperties(value: js.Array[_]): Self = this.set("classProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassProperties: Self = this.set("classProperties", js.undefined)
    @scala.inline
    def setDoc(value: String): Self = this.set("doc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoc: Self = this.set("doc", js.undefined)
    @scala.inline
    def setParamNamesVarargs(value: String*): Self = this.set("paramNames", js.Array(value :_*))
    @scala.inline
    def setParamNames(value: js.Array[String]): Self = this.set("paramNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamNames: Self = this.set("paramNames", js.undefined)
    @scala.inline
    def setPrototypePropertiesVarargs(value: js.Array[Double]*): Self = this.set("prototypeProperties", js.Array(value :_*))
    @scala.inline
    def setPrototypeProperties(value: js.Array[js.Array[Double]]): Self = this.set("prototypeProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrototypeProperties: Self = this.set("prototypeProperties", js.undefined)
  }
  
}

