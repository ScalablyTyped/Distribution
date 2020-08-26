package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Categorical extends js.Object {
  /** Description of the categorical values of this feature. */
  var categorical: js.UndefOr[Values] = js.native
  /** The feature index. */
  var index: js.UndefOr[String] = js.native
  /** Description of the numeric values of this feature. */
  var numeric: js.UndefOr[Mean] = js.native
  /** Description of multiple-word text values of this feature. */
  var text: js.UndefOr[`0`] = js.native
}

object Categorical {
  @scala.inline
  def apply(): Categorical = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Categorical]
  }
  @scala.inline
  implicit class CategoricalOps[Self <: Categorical] (val x: Self) extends AnyVal {
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
    def setCategorical(value: Values): Self = this.set("categorical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategorical: Self = this.set("categorical", js.undefined)
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setNumeric(value: Mean): Self = this.set("numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    @scala.inline
    def setText(value: `0`): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

