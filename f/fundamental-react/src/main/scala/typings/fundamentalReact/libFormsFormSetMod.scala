package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormsFormSetMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Forms/FormSet", JSImport.Default)
  @js.native
  val default: FunctionComponent[FormSetProps] = js.native
  
  trait FormSetProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
  }
  object FormSetProps {
    
    inline def apply(): FormSetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormSetProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormSetProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    }
  }
  
  type _To = FunctionComponent[FormSetProps]
  
  /* This means you don't have to write `default`, but can instead just say `libFormsFormSetMod.foo` */
  override def _to: FunctionComponent[FormSetProps] = default
}
