package typings.formatjsIntlDisplaynames.anon

import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.`best fit`
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@formatjs/intl-displaynames.@formatjs/intl-displaynames/lib.DisplayNamesOptions, 'localeMatcher'> */
@js.native
trait PickDisplayNamesOptionslo extends js.Object {
  
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.native
}
object PickDisplayNamesOptionslo {
  
  @scala.inline
  def apply(): PickDisplayNamesOptionslo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDisplayNamesOptionslo]
  }
  
  @scala.inline
  implicit class PickDisplayNamesOptionsloOps[Self <: PickDisplayNamesOptionslo] (val x: Self) extends AnyVal {
    
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
    def setLocaleMatcher(value: lookup | (`best fit`)): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
  }
}
