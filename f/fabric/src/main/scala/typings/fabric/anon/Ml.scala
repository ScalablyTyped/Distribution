package typings.fabric.anon

import typings.fabric.fabricImplMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ml extends js.Object {
  
  var bl: Point = js.native
  
  var br: Point = js.native
  
  var mb: Point = js.native
  
  var ml: Point = js.native
  
  var mr: Point = js.native
  
  var mt: Point = js.native
  
  var mtr: Point = js.native
  
  var tl: Point = js.native
  
  var tr: Point = js.native
}
object Ml {
  
  @scala.inline
  def apply(bl: Point, br: Point, mb: Point, ml: Point, mr: Point, mt: Point, mtr: Point, tl: Point, tr: Point): Ml = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], mb = mb.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any], mr = mr.asInstanceOf[js.Any], mt = mt.asInstanceOf[js.Any], mtr = mtr.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ml]
  }
  
  @scala.inline
  implicit class MlOps[Self <: Ml] (val x: Self) extends AnyVal {
    
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
    def setBl(value: Point): Self = this.set("bl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBr(value: Point): Self = this.set("br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMb(value: Point): Self = this.set("mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMl(value: Point): Self = this.set("ml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMr(value: Point): Self = this.set("mr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMt(value: Point): Self = this.set("mt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtr(value: Point): Self = this.set("mtr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTl(value: Point): Self = this.set("tl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTr(value: Point): Self = this.set("tr", value.asInstanceOf[js.Any])
  }
}
