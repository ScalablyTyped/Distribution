package typings.escpos.anon

import typings.escpos.escposNumbers.`16`
import typings.escpos.escposStrings.InformationseparatorthreeLeftparenthesiskEndoftextNull1C
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DEFAULT extends js.Object {
  
  var CMD: InformationseparatorthreeLeftparenthesiskEndoftextNull1C = js.native
  
  var DEFAULT: typings.escpos.escposNumbers.`3` = js.native
  
  var MAX: `16` = js.native
  
  var MIN: typings.escpos.escposNumbers.`1` = js.native
}
object DEFAULT {
  
  @scala.inline
  def apply(
    CMD: InformationseparatorthreeLeftparenthesiskEndoftextNull1C,
    DEFAULT: typings.escpos.escposNumbers.`3`,
    MAX: `16`,
    MIN: typings.escpos.escposNumbers.`1`
  ): DEFAULT = {
    val __obj = js.Dynamic.literal(CMD = CMD.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULT]
  }
  
  @scala.inline
  implicit class DEFAULTOps[Self <: DEFAULT] (val x: Self) extends AnyVal {
    
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
    def setCMD(value: InformationseparatorthreeLeftparenthesiskEndoftextNull1C): Self = this.set("CMD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDEFAULT(value: typings.escpos.escposNumbers.`3`): Self = this.set("DEFAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAX(value: `16`): Self = this.set("MAX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIN(value: typings.escpos.escposNumbers.`1`): Self = this.set("MIN", value.asInstanceOf[js.Any])
  }
}
