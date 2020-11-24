package typings.fortawesomeFontawesomeCommonTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconLookup extends js.Object {
  
  // IconName is defined in the code that will be generated at build time and bundled with this file.
  var iconName: IconName = js.native
  
  var prefix: IconPrefix = js.native
}
object IconLookup {
  
  @scala.inline
  implicit class IconLookupOps[Self <: IconLookup] (val x: Self) extends AnyVal {
    
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
    def setIconName(value: IconName): Self = this.set("iconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: IconPrefix): Self = this.set("prefix", value.asInstanceOf[js.Any])
  }
}
