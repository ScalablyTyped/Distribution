package typings.fluentuiTheme.anon

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiTheme.themeMod.ColorTokenSet
import typings.fluentuiTheme.themeMod.TokenSetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey extends /* key */ StringDictionary[TokenSetType] {
  
  var body: ColorTokenSet with TokenSetType = js.native
  
  var brand: ColorTokenSet with TokenSetType = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(body: ColorTokenSet with TokenSetType, brand: ColorTokenSet with TokenSetType): Dictkey = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    
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
    def setBody(value: ColorTokenSet with TokenSetType): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrand(value: ColorTokenSet with TokenSetType): Self = this.set("brand", value.asInstanceOf[js.Any])
  }
}
