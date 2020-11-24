package typings.getopts.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedOptions
  extends /* key */ StringDictionary[js.Any] {
  
  @JSName("_")
  var _underscore: js.Array[String] = js.native
}
object ParsedOptions {
  
  @scala.inline
  def apply(_underscore: js.Array[String]): ParsedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedOptions]
  }
  
  @scala.inline
  implicit class ParsedOptionsOps[Self <: ParsedOptions] (val x: Self) extends AnyVal {
    
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
    def set_underscoreVarargs(value: String*): Self = this.set("_", js.Array(value :_*))
    
    @scala.inline
    def set_underscore(value: js.Array[String]): Self = this.set("_", value.asInstanceOf[js.Any])
  }
}
