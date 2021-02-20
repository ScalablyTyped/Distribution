package typings.glReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NearestCopyProps extends StObject {
  
  var children: js.UndefOr[js.Any] = js.native
}
object NearestCopyProps {
  
  @scala.inline
  def apply(): NearestCopyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NearestCopyProps]
  }
  
  @scala.inline
  implicit class NearestCopyPropsMutableBuilder[Self <: NearestCopyProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
