package typings.glaze.anon

import typings.glaze.glazeNumbers.`9999`
import typings.glaze.glazeStrings.Dot125rem
import typings.glaze.glazeStrings.Dot25rem
import typings.glaze.glazeStrings.Dot5rem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Full extends js.Object {
  
  val full: `9999` = js.native
  
  val lg: Dot5rem = js.native
  
  val md: Dot25rem = js.native
  
  val sm: Dot125rem = js.native
}
object Full {
  
  @scala.inline
  def apply(full: `9999`, lg: Dot5rem, md: Dot25rem, sm: Dot125rem): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  
  @scala.inline
  implicit class FullOps[Self <: Full] (val x: Self) extends AnyVal {
    
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
    def setFull(value: `9999`): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLg(value: Dot5rem): Self = this.set("lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd(value: Dot25rem): Self = this.set("md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSm(value: Dot125rem): Self = this.set("sm", value.asInstanceOf[js.Any])
  }
}
