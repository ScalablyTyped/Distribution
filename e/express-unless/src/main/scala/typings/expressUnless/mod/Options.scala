package typings.expressUnless.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var custom: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Boolean]] = js.native
  
  var ext: js.UndefOr[String | js.Array[String]] = js.native
  
  var method: js.UndefOr[String | js.Array[String]] = js.native
  
  var path: js.UndefOr[pathFilter | js.Array[pathFilter]] = js.native
  
  var useOriginalUrl: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCustom(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Boolean): Self = this.set("custom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setExtVarargs(value: String*): Self = this.set("ext", js.Array(value :_*))
    
    @scala.inline
    def setExt(value: String | js.Array[String]): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    
    @scala.inline
    def setMethodVarargs(value: String*): Self = this.set("method", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String | js.Array[String]): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: pathFilter*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: pathFilter | js.Array[pathFilter]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setUseOriginalUrl(value: Boolean): Self = this.set("useOriginalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseOriginalUrl: Self = this.set("useOriginalUrl", js.undefined)
  }
}
