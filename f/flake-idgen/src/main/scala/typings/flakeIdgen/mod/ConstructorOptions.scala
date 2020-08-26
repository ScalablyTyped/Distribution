package typings.flakeIdgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorOptions extends js.Object {
  var datacenter: js.UndefOr[Double] = js.native
  var epoch: js.UndefOr[Double] = js.native
  var id: js.UndefOr[Double] = js.native
  var seqMask: js.UndefOr[Double] = js.native
  var worker: js.UndefOr[Double] = js.native
}

object ConstructorOptions {
  @scala.inline
  def apply(): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptions]
  }
  @scala.inline
  implicit class ConstructorOptionsOps[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
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
    def setDatacenter(value: Double): Self = this.set("datacenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatacenter: Self = this.set("datacenter", js.undefined)
    @scala.inline
    def setEpoch(value: Double): Self = this.set("epoch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpoch: Self = this.set("epoch", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setSeqMask(value: Double): Self = this.set("seqMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeqMask: Self = this.set("seqMask", js.undefined)
    @scala.inline
    def setWorker(value: Double): Self = this.set("worker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorker: Self = this.set("worker", js.undefined)
  }
  
}

