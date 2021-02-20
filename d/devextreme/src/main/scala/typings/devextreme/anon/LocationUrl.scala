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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationUrl extends StObject {
  
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
  implicit class LocationUrlMutableBuilder[Self <: LocationUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(
      value: center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop
    ): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
