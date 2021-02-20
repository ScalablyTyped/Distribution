package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListTextProps> */
@js.native
trait PartialListTextProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var noWrap: js.UndefOr[Boolean] = js.native
  
  var secondary: js.UndefOr[Boolean] = js.native
}
object PartialListTextProps {
  
  @scala.inline
  def apply(): PartialListTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListTextProps]
  }
  
  @scala.inline
  implicit class PartialListTextPropsMutableBuilder[Self <: PartialListTextProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    @scala.inline
    def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
