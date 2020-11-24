package typings.getUri.httpMod

import typings.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpReadableProps extends js.Object {
  
  var date: js.UndefOr[Double] = js.native
  
  var parsed: js.UndefOr[UrlWithStringQuery] = js.native
  
  var redirects: js.UndefOr[js.Array[HttpReadable]] = js.native
}
object HttpReadableProps {
  
  @scala.inline
  def apply(): HttpReadableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpReadableProps]
  }
  
  @scala.inline
  implicit class HttpReadablePropsOps[Self <: HttpReadableProps] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setParsed(value: UrlWithStringQuery): Self = this.set("parsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParsed: Self = this.set("parsed", js.undefined)
    
    @scala.inline
    def setRedirectsVarargs(value: HttpReadable*): Self = this.set("redirects", js.Array(value :_*))
    
    @scala.inline
    def setRedirects(value: js.Array[HttpReadable]): Self = this.set("redirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirects: Self = this.set("redirects", js.undefined)
  }
}
