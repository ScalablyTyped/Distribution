package typings.emojione.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fname extends js.Object {
  
  var fname: String = js.native
  
  var isCanonical: Boolean = js.native
  
  var uc: String = js.native
  
  var unicode: js.Array[String] = js.native
}
object Fname {
  
  @scala.inline
  def apply(fname: String, isCanonical: Boolean, uc: String, unicode: js.Array[String]): Fname = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], isCanonical = isCanonical.asInstanceOf[js.Any], uc = uc.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fname]
  }
  
  @scala.inline
  implicit class FnameOps[Self <: Fname] (val x: Self) extends AnyVal {
    
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
    def setFname(value: String): Self = this.set("fname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCanonical(value: Boolean): Self = this.set("isCanonical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUc(value: String): Self = this.set("uc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeVarargs(value: String*): Self = this.set("unicode", js.Array(value :_*))
    
    @scala.inline
    def setUnicode(value: js.Array[String]): Self = this.set("unicode", value.asInstanceOf[js.Any])
  }
}
