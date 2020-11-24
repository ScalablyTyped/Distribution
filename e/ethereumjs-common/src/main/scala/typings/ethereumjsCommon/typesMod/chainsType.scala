package typings.ethereumjsCommon.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait chainsType
  extends /* key */ StringDictionary[js.Any] {
  
  var names: StringDictionary[String] = js.native
}
object chainsType {
  
  @scala.inline
  def apply(names: StringDictionary[String]): chainsType = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[chainsType]
  }
  
  @scala.inline
  implicit class chainsTypeOps[Self <: chainsType] (val x: Self) extends AnyVal {
    
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
    def setNames(value: StringDictionary[String]): Self = this.set("names", value.asInstanceOf[js.Any])
  }
}
