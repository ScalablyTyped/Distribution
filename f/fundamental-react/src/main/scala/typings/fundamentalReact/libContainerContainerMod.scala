package typings.fundamentalReact

import typings.fundamentalReact.anon.PartialContainerProps
import typings.fundamentalReact.anon.WeakValidationMapContaine
import typings.fundamentalReact.fundamentalReactStrings.Container
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContainerContainerMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Container/Container.ContainerProps> & {  displayName :'Container'} */
  object default {
    
    inline def apply(props: ContainerProps): ReactNode = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
    inline def apply(props: ContainerProps, context: Any): ReactNode = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
    
    @JSImport("fundamental-react/lib/Container/Container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Container/Container", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Container/Container", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialContainerProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialContainerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Container/Container", "default.displayName")
    @js.native
    def displayName: js.UndefOr[Container | String] = js.native
    inline def displayName_=(x: js.UndefOr[Container | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Container/Container", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapContaine] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapContaine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait ContainerProps extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Set to true to remove the margins between the panels */
    var noGap: js.UndefOr[Boolean] = js.undefined
  }
  object ContainerProps {
    
    inline def apply(): ContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setNoGap(value: Boolean): Self = StObject.set(x, "noGap", value.asInstanceOf[js.Any])
      
      inline def setNoGapUndefined: Self = StObject.set(x, "noGap", js.undefined)
    }
  }
}
