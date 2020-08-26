package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectClassNamesFromSubtreeResponse extends js.Object {
  /**
    * Class name list.
    */
  var classNames: js.Array[String] = js.native
}

object CollectClassNamesFromSubtreeResponse {
  @scala.inline
  def apply(classNames: js.Array[String]): CollectClassNamesFromSubtreeResponse = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectClassNamesFromSubtreeResponse]
  }
  @scala.inline
  implicit class CollectClassNamesFromSubtreeResponseOps[Self <: CollectClassNamesFromSubtreeResponse] (val x: Self) extends AnyVal {
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
    def setClassNamesVarargs(value: String*): Self = this.set("classNames", js.Array(value :_*))
    @scala.inline
    def setClassNames(value: js.Array[String]): Self = this.set("classNames", value.asInstanceOf[js.Any])
  }
  
}

