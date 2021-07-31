package typings.glReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearCopyProps extends StObject {
  
  var children: js.UndefOr[js.Any] = js.undefined
}
object LinearCopyProps {
  
  @scala.inline
  def apply(): LinearCopyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearCopyProps]
  }
  
  @scala.inline
  implicit class LinearCopyPropsMutableBuilder[Self <: LinearCopyProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
