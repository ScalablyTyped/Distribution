package typings.googleCloudStorage.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cors extends js.Object {
  
  var maxAgeSeconds: js.UndefOr[Double] = js.native
  
  var method: js.UndefOr[js.Array[String]] = js.native
  
  var origin: js.UndefOr[js.Array[String]] = js.native
  
  var responseHeader: js.UndefOr[js.Array[String]] = js.native
}
object Cors {
  
  @scala.inline
  def apply(): Cors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cors]
  }
  
  @scala.inline
  implicit class CorsOps[Self <: Cors] (val x: Self) extends AnyVal {
    
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
    def setMaxAgeSeconds(value: Double): Self = this.set("maxAgeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAgeSeconds: Self = this.set("maxAgeSeconds", js.undefined)
    
    @scala.inline
    def setMethodVarargs(value: String*): Self = this.set("method", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: js.Array[String]): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOriginVarargs(value: String*): Self = this.set("origin", js.Array(value :_*))
    
    @scala.inline
    def setOrigin(value: js.Array[String]): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setResponseHeaderVarargs(value: String*): Self = this.set("responseHeader", js.Array(value :_*))
    
    @scala.inline
    def setResponseHeader(value: js.Array[String]): Self = this.set("responseHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseHeader: Self = this.set("responseHeader", js.undefined)
  }
}
