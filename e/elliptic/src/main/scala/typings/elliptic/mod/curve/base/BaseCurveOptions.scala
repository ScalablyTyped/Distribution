package typings.elliptic.mod.curve.base

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseCurveOptions extends js.Object {
  
  var g: js.UndefOr[BasePoint] = js.native
  
  var gRed: js.UndefOr[js.Any] = js.native
  
  var n: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Buffer
  ] = js.native
  
  var p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) = js.native
  
  var prime: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | String
  ] = js.native
}
object BaseCurveOptions {
  
  @scala.inline
  def apply(
    p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any)
  ): BaseCurveOptions = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCurveOptions]
  }
  
  @scala.inline
  implicit class BaseCurveOptionsOps[Self <: BaseCurveOptions] (val x: Self) extends AnyVal {
    
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
    def setPVarargs(value: Double*): Self = this.set("p", js.Array(value :_*))
    
    @scala.inline
    def setP(
      value: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any)
    ): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: BasePoint): Self = this.set("g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteG: Self = this.set("g", js.undefined)
    
    @scala.inline
    def setGRed(value: js.Any): Self = this.set("gRed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGRed: Self = this.set("gRed", js.undefined)
    
    @scala.inline
    def setN(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Buffer
    ): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    
    @scala.inline
    def setPrime(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | String
    ): Self = this.set("prime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrime: Self = this.set("prime", js.undefined)
  }
}
