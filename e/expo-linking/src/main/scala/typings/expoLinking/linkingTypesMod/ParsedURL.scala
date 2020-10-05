package typings.expoLinking.linkingTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedURL extends js.Object {
  var hostname: String | Null = js.native
  var path: String | Null = js.native
  var queryParams: QueryParams | Null = js.native
  var scheme: String | Null = js.native
}

object ParsedURL {
  @scala.inline
  def apply(): ParsedURL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsedURL]
  }
  @scala.inline
  implicit class ParsedURLOps[Self <: ParsedURL] (val x: Self) extends AnyVal {
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
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostnameNull: Self = this.set("hostname", null)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathNull: Self = this.set("path", null)
    @scala.inline
    def setQueryParams(value: QueryParams): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryParamsNull: Self = this.set("queryParams", null)
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemeNull: Self = this.set("scheme", null)
  }
  
}

