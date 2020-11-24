package typings.globalize.globalizeMod

import typings.globalize.globalizeStrings.cardinal
import typings.globalize.globalizeStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluralGeneratorOptions extends js.Object {
  
  /**
    * cardinal (default), or ordinal.
    */
  var `type`: js.UndefOr[cardinal | ordinal] = js.native
}
object PluralGeneratorOptions {
  
  @scala.inline
  def apply(): PluralGeneratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluralGeneratorOptions]
  }
  
  @scala.inline
  implicit class PluralGeneratorOptionsOps[Self <: PluralGeneratorOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: cardinal | ordinal): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
