package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.dateTimeMod.Formats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Full extends js.Object {
  
  var full: Formats = js.native
  
  var long: Formats = js.native
  
  var medium: Formats = js.native
  
  var short: Formats = js.native
}
object Full {
  
  @scala.inline
  def apply(full: Formats, long: Formats, medium: Formats, short: Formats): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
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
    def setFull(value: Formats): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLong(value: Formats): Self = this.set("long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: Formats): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: Formats): Self = this.set("short", value.asInstanceOf[js.Any])
  }
}
