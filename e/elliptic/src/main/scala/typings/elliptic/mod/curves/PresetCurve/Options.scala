package typings.elliptic.mod.curves.PresetCurve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var a: String = js.native
  
  var b: String = js.native
  
  var basis: js.UndefOr[js.Any] = js.native
  
   // ?
  var beta: js.UndefOr[String] = js.native
  
  var g: js.Any = js.native
  
  var gRed: Boolean = js.native
  
  var hash: js.Any = js.native
  
  var lambda: js.UndefOr[String] = js.native
  
  var n: String = js.native
  
  var p: String = js.native
  
  var prime: String | Null = js.native
  
  var `type`: String = js.native
}
object Options {
  
  @scala.inline
  def apply(a: String, b: String, g: js.Any, gRed: Boolean, hash: js.Any, n: String, p: String, `type`: String): Options = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], gRed = gRed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setA(value: String): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: String): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: js.Any): Self = this.set("g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGRed(value: Boolean): Self = this.set("gRed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: js.Any): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: String): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasis(value: js.Any): Self = this.set("basis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasis: Self = this.set("basis", js.undefined)
    
    @scala.inline
    def setBeta(value: String): Self = this.set("beta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeta: Self = this.set("beta", js.undefined)
    
    @scala.inline
    def setLambda(value: String): Self = this.set("lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambda: Self = this.set("lambda", js.undefined)
    
    @scala.inline
    def setPrime(value: String): Self = this.set("prime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimeNull: Self = this.set("prime", null)
  }
}
