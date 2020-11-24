package typings.featherlight.Featherlight

import typings.featherlight.JQuery
import typings.jquery.JQueryPromise
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentFilter extends js.Object {
  
  var process: js.UndefOr[js.Function1[/* data */ JQuery | String, JQuery | JQueryPromise[JQuery]]] = js.native
  
  var regex: js.UndefOr[RegExp] = js.native
  
  var test: js.UndefOr[js.Function1[/* data */ JQuery | String, Boolean]] = js.native
}
object ContentFilter {
  
  @scala.inline
  def apply(): ContentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentFilter]
  }
  
  @scala.inline
  implicit class ContentFilterOps[Self <: ContentFilter] (val x: Self) extends AnyVal {
    
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
    def setProcess(value: /* data */ JQuery | String => JQuery | JQueryPromise[JQuery]): Self = this.set("process", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
    
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    
    @scala.inline
    def setTest(value: /* data */ JQuery | String => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
