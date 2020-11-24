package typings.fluentuiTheme.themeMod

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiTheme.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tokens extends /* key */ StringDictionary[TokenSetType] {
  
  var color: Dictkey = js.native
}
object Tokens {
  
  @scala.inline
  def apply(color: Dictkey): Tokens = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokens]
  }
  
  @scala.inline
  implicit class TokensOps[Self <: Tokens] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Dictkey): Self = this.set("color", value.asInstanceOf[js.Any])
  }
}
