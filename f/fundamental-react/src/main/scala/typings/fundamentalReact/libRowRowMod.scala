package typings.fundamentalReact

import typings.fundamentalReact.anon.PartialRowProps
import typings.fundamentalReact.anon.WeakValidationMapRowProps
import typings.fundamentalReact.fundamentalReactStrings.Row
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRowRowMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Row/Row.RowProps> & {  displayName :'Row'} */
  object default {
    
    inline def apply(props: RowProps): ReactNode = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
    inline def apply(props: RowProps, context: Any): ReactNode = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
    
    @JSImport("fundamental-react/lib/Row/Row", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Row/Row", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Row/Row", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialRowProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialRowProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Row/Row", "default.displayName")
    @js.native
    def displayName: js.UndefOr[Row | String] = js.native
    inline def displayName_=(x: js.UndefOr[Row | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Row/Row", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapRowProps] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapRowProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait RowProps extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
  }
  object RowProps {
    
    inline def apply(): RowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
