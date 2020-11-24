package typings.devextreme.anon

import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.centerBottom
import typings.devextreme.devextremeStrings.centerTop
import typings.devextreme.devextremeStrings.full
import typings.devextreme.devextremeStrings.leftBottom
import typings.devextreme.devextremeStrings.leftCenter
import typings.devextreme.devextremeStrings.leftTop
import typings.devextreme.devextremeStrings.rightBottom
import typings.devextreme.devextremeStrings.rightCenter
import typings.devextreme.devextremeStrings.rightTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationUrl extends js.Object {
  
  var location: js.UndefOr[
    center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop
  ] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object LocationUrl {
  
  @scala.inline
  def apply(): LocationUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationUrl]
  }
  
  @scala.inline
  implicit class LocationUrlOps[Self <: LocationUrl] (val x: Self) extends AnyVal {
    
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
    def setLocation(
      value: center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop
    ): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
