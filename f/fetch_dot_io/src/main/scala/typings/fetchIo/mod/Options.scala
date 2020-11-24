package typings.fetchIo.mod

import typings.std.BodyInit
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends RequestInit {
  
  var afterJSON: js.UndefOr[js.Function1[/* body */ js.Any, Unit]] = js.native
  
  var afterResponse: js.UndefOr[js.Function1[/* res */ Response, Unit]] = js.native
  
  var beforeRequest: js.UndefOr[js.Function2[/* url */ TUrl, /* body */ BodyInit, Boolean | Unit]] = js.native
  
  var header: js.UndefOr[Header] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[Query] = js.native
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
    def setAfterJSON(value: /* body */ js.Any => Unit): Self = this.set("afterJSON", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterJSON: Self = this.set("afterJSON", js.undefined)
    
    @scala.inline
    def setAfterResponse(value: /* res */ Response => Unit): Self = this.set("afterResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterResponse: Self = this.set("afterResponse", js.undefined)
    
    @scala.inline
    def setBeforeRequest(value: (/* url */ TUrl, /* body */ BodyInit) => Boolean | Unit): Self = this.set("beforeRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeRequest: Self = this.set("beforeRequest", js.undefined)
    
    @scala.inline
    def setHeader(value: Header): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
}
