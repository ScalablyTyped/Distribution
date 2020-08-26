package typings.googleMapReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapTypeStyle extends js.Object {
  var elementType: js.UndefOr[String] = js.native
  var featureType: js.UndefOr[String] = js.native
  var stylers: js.Array[_] = js.native
}

object MapTypeStyle {
  @scala.inline
  def apply(stylers: js.Array[_]): MapTypeStyle = {
    val __obj = js.Dynamic.literal(stylers = stylers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeStyle]
  }
  @scala.inline
  implicit class MapTypeStyleOps[Self <: MapTypeStyle] (val x: Self) extends AnyVal {
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
    def setStylersVarargs(value: js.Any*): Self = this.set("stylers", js.Array(value :_*))
    @scala.inline
    def setStylers(value: js.Array[_]): Self = this.set("stylers", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementType(value: String): Self = this.set("elementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementType: Self = this.set("elementType", js.undefined)
    @scala.inline
    def setFeatureType(value: String): Self = this.set("featureType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureType: Self = this.set("featureType", js.undefined)
  }
  
}

