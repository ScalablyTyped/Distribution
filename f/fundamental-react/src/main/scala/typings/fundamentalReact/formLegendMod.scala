package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLegendMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Forms/FormLegend", JSImport.Default)
  @js.native
  val default: FunctionComponent[FormLegendProps] = js.native
  
  trait FormLegendProps
    extends StObject
       with /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
  }
  object FormLegendProps {
    
    inline def apply(): FormLegendProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormLegendProps]
    }
    
    extension [Self <: FormLegendProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    }
  }
  
  type _To = FunctionComponent[FormLegendProps]
  
  /* This means you don't have to write `default`, but can instead just say `formLegendMod.foo` */
  override def _to: FunctionComponent[FormLegendProps] = default
}
