package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaQuery extends js.Object {
  /**
    * Whether the media query condition is satisfied.
    */
  var active: Boolean = js.native
  /**
    * Array of media query expressions.
    */
  var expressions: js.Array[MediaQueryExpression] = js.native
}

object MediaQuery {
  @scala.inline
  def apply(active: Boolean, expressions: js.Array[MediaQueryExpression]): MediaQuery = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQuery]
  }
  @scala.inline
  implicit class MediaQueryOps[Self <: MediaQuery] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpressionsVarargs(value: MediaQueryExpression*): Self = this.set("expressions", js.Array(value :_*))
    @scala.inline
    def setExpressions(value: js.Array[MediaQueryExpression]): Self = this.set("expressions", value.asInstanceOf[js.Any])
  }
  
}

