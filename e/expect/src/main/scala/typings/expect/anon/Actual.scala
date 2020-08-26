package typings.expect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actual extends js.Object {
  var actual: String = js.native
  var error: String = js.native
  var expected: String | Double = js.native
}

object Actual {
  @scala.inline
  def apply(actual: String, error: String, expected: String | Double): Actual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actual]
  }
  @scala.inline
  implicit class ActualOps[Self <: Actual] (val x: Self) extends AnyVal {
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
    def setActual(value: String): Self = this.set("actual", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpected(value: String | Double): Self = this.set("expected", value.asInstanceOf[js.Any])
  }
  
}

