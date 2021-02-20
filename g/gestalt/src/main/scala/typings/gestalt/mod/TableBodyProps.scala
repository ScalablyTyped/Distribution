package typings.gestalt.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableBodyProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.native
}
object TableBodyProps {
  
  @scala.inline
  def apply(): TableBodyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBodyProps]
  }
  
  @scala.inline
  implicit class TableBodyPropsMutableBuilder[Self <: TableBodyProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
