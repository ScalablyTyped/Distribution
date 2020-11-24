package typings.ethersprojectHdnode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mnemonic extends js.Object {
  
  val locale: String = js.native
  
  val path: String = js.native
  
  val phrase: String = js.native
}
object Mnemonic {
  
  @scala.inline
  def apply(locale: String, path: String, phrase: String): Mnemonic = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], phrase = phrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mnemonic]
  }
  
  @scala.inline
  implicit class MnemonicOps[Self <: Mnemonic] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhrase(value: String): Self = this.set("phrase", value.asInstanceOf[js.Any])
  }
}
