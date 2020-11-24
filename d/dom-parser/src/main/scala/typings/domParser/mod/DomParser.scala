package typings.domParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomParser extends js.Object {
  
  def parseFromString(html: String): Dom = js.native
}
object DomParser {
  
  @scala.inline
  def apply(parseFromString: String => Dom): DomParser = {
    val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction1(parseFromString))
    __obj.asInstanceOf[DomParser]
  }
  
  @scala.inline
  implicit class DomParserOps[Self <: DomParser] (val x: Self) extends AnyVal {
    
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
    def setParseFromString(value: String => Dom): Self = this.set("parseFromString", js.Any.fromFunction1(value))
  }
}
