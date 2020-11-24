package typings.fabric.anon

import typings.fabric.fabricImplMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tr extends js.Object {
  
  var bl: Point = js.native
  
  var br: Point = js.native
  
  var tl: Point = js.native
  
  var tr: Point = js.native
}
object Tr {
  
  @scala.inline
  def apply(bl: Point, br: Point, tl: Point, tr: Point): Tr = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tr]
  }
  
  @scala.inline
  implicit class TrOps[Self <: Tr] (val x: Self) extends AnyVal {
    
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
    def setTl(value: Point): Self = this.set("tl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTr(value: Point): Self = this.set("tr", value.asInstanceOf[js.Any])
  }
}
