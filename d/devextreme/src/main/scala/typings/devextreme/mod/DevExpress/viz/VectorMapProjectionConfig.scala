package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorMapProjectionConfig extends js.Object {
  /** @name VectorMapProjectionConfig.aspectRatio */
  var aspectRatio: js.UndefOr[Double] = js.native
  /** @name VectorMapProjectionConfig.from */
  var from: js.UndefOr[js.Function1[/* coordinates */ js.Array[Double], js.Array[Double]]] = js.native
  /** @name VectorMapProjectionConfig.to */
  var to: js.UndefOr[js.Function1[/* coordinates */ js.Array[Double], js.Array[Double]]] = js.native
}

object VectorMapProjectionConfig {
  @scala.inline
  def apply(): VectorMapProjectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorMapProjectionConfig]
  }
  @scala.inline
  implicit class VectorMapProjectionConfigOps[Self <: VectorMapProjectionConfig] (val x: Self) extends AnyVal {
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
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setFrom(value: /* coordinates */ js.Array[Double] => js.Array[Double]): Self = this.set("from", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setTo(value: /* coordinates */ js.Array[Double] => js.Array[Double]): Self = this.set("to", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

