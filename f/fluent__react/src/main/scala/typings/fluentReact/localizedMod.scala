package typings.fluentReact

import typings.fluentBundle.bundleMod.FluentVariable
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localizedMod {
  
  @JSImport("@fluent/react/esm/localized", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: LocalizedProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Localized(props: LocalizedProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Localized")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait LocalizedProps extends StObject {
    
    var attrs: js.UndefOr[Record[String, Boolean]] = js.undefined
    
    var children: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.undefined
    
    var elems: js.UndefOr[Record[String, ReactElement]] = js.undefined
    
    var id: String
    
    var vars: js.UndefOr[Record[String, FluentVariable]] = js.undefined
  }
  object LocalizedProps {
    
    inline def apply(id: String): LocalizedProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizedProps]
    }
    
    extension [Self <: LocalizedProps](x: Self) {
      
      inline def setAttrs(value: Record[String, Boolean]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setChildren(value: ReactNode | js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setElems(value: Record[String, ReactElement]): Self = StObject.set(x, "elems", value.asInstanceOf[js.Any])
      
      inline def setElemsUndefined: Self = StObject.set(x, "elems", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVars(value: Record[String, FluentVariable]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      
      inline def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
    }
  }
}
