package typings.elliptic.mod.curve.short

import typings.elliptic.mod.BNInput
import typings.elliptic.mod.curve.base.BaseCurveOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortConf extends BaseCurveOptions {
  
  var a: BNInput = js.native
  
  var b: BNInput = js.native
  
  var beta: js.UndefOr[BNInput] = js.native
  
  var lambda: js.UndefOr[BNInput] = js.native
}
object ShortConf {
  
  @scala.inline
  def apply(
    a: BNInput,
    b: BNInput,
    p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any)
  ): ShortConf = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortConf]
  }
  
  @scala.inline
  implicit class ShortConfOps[Self <: ShortConf] (val x: Self) extends AnyVal {
    
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
    def setBVarargs(value: Double*): Self = this.set("b", js.Array(value :_*))
    
    @scala.inline
    def setB(value: BNInput): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetaVarargs(value: Double*): Self = this.set("beta", js.Array(value :_*))
    
    @scala.inline
    def setBeta(value: BNInput): Self = this.set("beta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeta: Self = this.set("beta", js.undefined)
    
    @scala.inline
    def setLambdaVarargs(value: Double*): Self = this.set("lambda", js.Array(value :_*))
    
    @scala.inline
    def setLambda(value: BNInput): Self = this.set("lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambda: Self = this.set("lambda", js.undefined)
  }
}
