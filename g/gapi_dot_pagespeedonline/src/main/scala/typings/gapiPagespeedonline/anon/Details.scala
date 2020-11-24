package typings.gapiPagespeedonline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Details extends js.Object {
  
  /**
    * List of entries that provide additional details about a single URL. Optional.
    */
  var details: js.Array[Args] = js.native
  
  /**
    * A format string that gives information about the URL, and a list of arguments for that format string.
    */
  var result: Args = js.native
}
object Details {
  
  @scala.inline
  def apply(details: js.Array[Args], result: Args): Details = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
    
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
    def setDetailsVarargs(value: Args*): Self = this.set("details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[Args]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Args): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
