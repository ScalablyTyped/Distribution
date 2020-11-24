package typings.gapiUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject extends js.Object {
  
  /**
    * Number of clicks for this top entry, e.g. for this particular country or browser.
    */
  var count: String = js.native
  
  /**
    * Label assigned to this top entry, e.g. "US" or "Chrome".
    */
  var id: String = js.native
}
object GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject {
  
  @scala.inline
  def apply(count: String, id: String): GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]
  }
  
  @scala.inline
  implicit class GoogleApiUrlShortenerUrlResourceAnalyticsArrayObjectOps[Self <: GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject] (val x: Self) extends AnyVal {
    
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
