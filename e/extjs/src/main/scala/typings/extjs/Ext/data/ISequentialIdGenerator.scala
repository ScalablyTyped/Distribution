package typings.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISequentialIdGenerator extends IIdGenerator {
  /** [Config Option] (String) */
  var prefix: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var seed: js.UndefOr[Double] = js.native
}

object ISequentialIdGenerator {
  @scala.inline
  def apply(): ISequentialIdGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISequentialIdGenerator]
  }
  @scala.inline
  implicit class ISequentialIdGeneratorOps[Self <: ISequentialIdGenerator] (val x: Self) extends AnyVal {
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
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
  
}

