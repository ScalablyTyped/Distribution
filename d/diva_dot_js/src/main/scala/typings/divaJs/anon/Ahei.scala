package typings.divaJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ahei extends js.Object {
  
  var a_hei: Double = js.native
  
  var a_wid: Double = js.native
  
  var max_h: Double = js.native
  
  var max_ratio: Double = js.native
  
  var max_w: Double = js.native
  
  var min_ratio: Double = js.native
  
  var t_hei: Double = js.native
  
  var t_wid: Double = js.native
}
object Ahei {
  
  @scala.inline
  def apply(
    a_hei: Double,
    a_wid: Double,
    max_h: Double,
    max_ratio: Double,
    max_w: Double,
    min_ratio: Double,
    t_hei: Double,
    t_wid: Double
  ): Ahei = {
    val __obj = js.Dynamic.literal(a_hei = a_hei.asInstanceOf[js.Any], a_wid = a_wid.asInstanceOf[js.Any], max_h = max_h.asInstanceOf[js.Any], max_ratio = max_ratio.asInstanceOf[js.Any], max_w = max_w.asInstanceOf[js.Any], min_ratio = min_ratio.asInstanceOf[js.Any], t_hei = t_hei.asInstanceOf[js.Any], t_wid = t_wid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ahei]
  }
  
  @scala.inline
  implicit class AheiOps[Self <: Ahei] (val x: Self) extends AnyVal {
    
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
    def setA_hei(value: Double): Self = this.set("a_hei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA_wid(value: Double): Self = this.set("a_wid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_h(value: Double): Self = this.set("max_h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_ratio(value: Double): Self = this.set("max_ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_w(value: Double): Self = this.set("max_w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_ratio(value: Double): Self = this.set("min_ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT_hei(value: Double): Self = this.set("t_hei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT_wid(value: Double): Self = this.set("t_wid", value.asInstanceOf[js.Any])
  }
}
