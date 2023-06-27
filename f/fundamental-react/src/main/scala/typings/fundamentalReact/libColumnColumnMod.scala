package typings.fundamentalReact

import typings.fundamentalReact.anon.PartialColumnProps
import typings.fundamentalReact.anon.RecordScreenSizenumber
import typings.fundamentalReact.anon.WeakValidationMapColumnPr
import typings.fundamentalReact.fundamentalReactStrings.Column
import typings.fundamentalReact.fundamentalReactStrings.after
import typings.fundamentalReact.fundamentalReactStrings.before
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColumnColumnMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Column/Column.ColumnProps> & {  displayName :'Column'} */
  object default {
    
    inline def apply(props: ColumnProps): ReactNode = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
    inline def apply(props: ColumnProps, context: Any): ReactNode = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
    
    @JSImport("fundamental-react/lib/Column/Column", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Column/Column", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Column/Column", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialColumnProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialColumnProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Column/Column", "default.displayName")
    @js.native
    def displayName: js.UndefOr[Column | String] = js.native
    inline def displayName_=(x: js.UndefOr[Column | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Column/Column", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapColumnPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapColumnPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait ColumnProps extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Set to true to have the column automatically occupy the remaining space in the row */
    var full: js.UndefOr[Boolean] = js.undefined
    
    /** How many cells out of 12 should the column be offset by on each screen size. Defaults to none. */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** Are the offsets to be applied before or after the column? default: "before" */
    var offsetPosition: js.UndefOr[before | after] = js.undefined
    
    /** How many cells out of 12 should the column occupy on each screen size. Defaults to 12. */
    var span: js.UndefOr[Double] = js.undefined
  }
  object ColumnProps {
    
    inline def apply(): ColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetPosition(value: before | after): Self = StObject.set(x, "offsetPosition", value.asInstanceOf[js.Any])
      
      inline def setOffsetPositionUndefined: Self = StObject.set(x, "offsetPosition", js.undefined)
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    }
  }
  
  type ColumnSpanOption = Double | RecordScreenSizenumber
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.smallScreen
    - typings.fundamentalReact.fundamentalReactStrings.mediumScreen
    - typings.fundamentalReact.fundamentalReactStrings.largeScreen
    - typings.fundamentalReact.fundamentalReactStrings.xLargeScreen
  */
  trait ScreenSize extends StObject
  object ScreenSize {
    
    inline def largeScreen: typings.fundamentalReact.fundamentalReactStrings.largeScreen = "largeScreen".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.largeScreen]
    
    inline def mediumScreen: typings.fundamentalReact.fundamentalReactStrings.mediumScreen = "mediumScreen".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.mediumScreen]
    
    inline def smallScreen: typings.fundamentalReact.fundamentalReactStrings.smallScreen = "smallScreen".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.smallScreen]
    
    inline def xLargeScreen: typings.fundamentalReact.fundamentalReactStrings.xLargeScreen = "xLargeScreen".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.xLargeScreen]
  }
}
