package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicensePost[T] extends Generic {
  
  var acknowledge: js.UndefOr[Boolean] = js.native
  
  var body: js.UndefOr[T] = js.native
}
object LicensePost {
  
  @scala.inline
  def apply[T](): LicensePost[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicensePost[T]]
  }
  
  @scala.inline
  implicit class LicensePostOps[Self <: LicensePost[_], T] (val x: Self with LicensePost[T]) extends AnyVal {
    
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
    def setAcknowledge(value: Boolean): Self = this.set("acknowledge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcknowledge: Self = this.set("acknowledge", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
}
