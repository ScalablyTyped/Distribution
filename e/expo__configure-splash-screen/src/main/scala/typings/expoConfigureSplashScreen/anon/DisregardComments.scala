package typings.expoConfigureSplashScreen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisregardComments extends js.Object {
  
  var disregardComments: js.UndefOr[Boolean] = js.native
}
object DisregardComments {
  
  @scala.inline
  def apply(): DisregardComments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisregardComments]
  }
  
  @scala.inline
  implicit class DisregardCommentsOps[Self <: DisregardComments] (val x: Self) extends AnyVal {
    
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
    def setDisregardComments(value: Boolean): Self = this.set("disregardComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisregardComments: Self = this.set("disregardComments", js.undefined)
  }
}
