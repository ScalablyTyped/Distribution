package typings.emberDebug.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Until extends js.Object {
  
  /**
    * A unique id for this deprecation. The id can be used by Ember debugging
    * tools to change the behavior (raise, log or silence) for that specific
    * deprecation. The id should be namespaced by dots, e.g.
    * `"view.helper.select"`.
    */
  var id: String = js.native
  
  /**
    * The version of Ember when this deprecation warning will be removed.
    */
  var until: String = js.native
  
  /**
    * An optional url to the transition guide on the emberjs.com website.
    */
  var url: js.UndefOr[String] = js.native
}
object Until {
  
  @scala.inline
  def apply(id: String, until: String): Until = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
    __obj.asInstanceOf[Until]
  }
  
  @scala.inline
  implicit class UntilOps[Self <: Until] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntil(value: String): Self = this.set("until", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
