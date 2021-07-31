package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListHeaderProps> */
trait PartialListHeaderProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
}
object PartialListHeaderProps {
  
  @scala.inline
  def apply(): PartialListHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListHeaderProps]
  }
  
  @scala.inline
  implicit class PartialListHeaderPropsMutableBuilder[Self <: PartialListHeaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
