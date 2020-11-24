package typings.featherRouteMatcher.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Match[T] extends js.Object {
  
  var page: T = js.native
  
  var params: StringDictionary[String] | Null = js.native
  
  var url: String = js.native
}
object Match {
  
  @scala.inline
  def apply[T](page: T, url: String): Match[T] = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match[T]]
  }
  
  @scala.inline
  implicit class MatchOps[Self <: Match[_], T] (val x: Self with Match[T]) extends AnyVal {
    
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
    def setPage(value: T): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: StringDictionary[String]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsNull: Self = this.set("params", null)
  }
}
