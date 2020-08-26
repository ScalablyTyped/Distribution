package typings.elliptic.mod.curve.edwards

import typings.elliptic.mod.BNInput
import typings.elliptic.mod.curve.base.BaseCurveOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdwardsConf extends BaseCurveOptions {
  var a: BNInput = js.native
  var c: BNInput = js.native
  var d: BNInput = js.native
}

object EdwardsConf {
  @scala.inline
  def apply(
    a: BNInput,
    c: BNInput,
    d: BNInput,
    p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any)
  ): EdwardsConf = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdwardsConf]
  }
  @scala.inline
  implicit class EdwardsConfOps[Self <: EdwardsConf] (val x: Self) extends AnyVal {
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
    def setAVarargs(value: Double*): Self = this.set("a", js.Array(value :_*))
    @scala.inline
    def setA(value: BNInput): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setCVarargs(value: Double*): Self = this.set("c", js.Array(value :_*))
    @scala.inline
    def setC(value: BNInput): Self = this.set("c", value.asInstanceOf[js.Any])
    @scala.inline
    def setDVarargs(value: Double*): Self = this.set("d", js.Array(value :_*))
    @scala.inline
    def setD(value: BNInput): Self = this.set("d", value.asInstanceOf[js.Any])
  }
  
}

