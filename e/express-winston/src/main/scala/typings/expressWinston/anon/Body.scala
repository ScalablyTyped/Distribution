package typings.expressWinston.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends js.Object {
  
  var body: js.Array[String] = js.native
  
  var req: js.Array[String] = js.native
  
  var res: js.Array[String] = js.native
}
object Body {
  
  @scala.inline
  def apply(body: js.Array[String], req: js.Array[String], res: js.Array[String]): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
    
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
    def setBodyVarargs(value: String*): Self = this.set("body", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: js.Array[String]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqVarargs(value: String*): Self = this.set("req", js.Array(value :_*))
    
    @scala.inline
    def setReq(value: js.Array[String]): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResVarargs(value: String*): Self = this.set("res", js.Array(value :_*))
    
    @scala.inline
    def setRes(value: js.Array[String]): Self = this.set("res", value.asInstanceOf[js.Any])
  }
}
