package typings.fastify.anon

import typings.fastify.fastifyStrings.buffer
import typings.fastify.fastifyStrings.string
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseAs[parseAs /* <: String | Buffer */] extends js.Object {
  
  var bodyLimit: js.UndefOr[Double] = js.native
  
  var parseAs: string | buffer = js.native
}
object ParseAs {
  
  @scala.inline
  def apply[parseAs /* <: String | Buffer */](parseAs: string | buffer): ParseAs[parseAs] = {
    val __obj = js.Dynamic.literal(parseAs = parseAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseAs[parseAs]]
  }
  
  @scala.inline
  implicit class ParseAsOps[Self <: ParseAs[_], parseAs /* <: String | Buffer */] (val x: Self with ParseAs[parseAs]) extends AnyVal {
    
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
    def setParseAs(value: string | buffer): Self = this.set("parseAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyLimit(value: Double): Self = this.set("bodyLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyLimit: Self = this.set("bodyLimit", js.undefined)
  }
}
