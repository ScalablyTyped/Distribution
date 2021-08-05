package typings.fundamentalReact

import typings.fundamentalReact.anon.PartialLayoutGridProps
import typings.fundamentalReact.anon.WeakValidationMapLayoutGr
import typings.fundamentalReact.fundamentalReactNumbers.`1`
import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import typings.react.mod.HTMLAttributes
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.react.mod.ValidationMap
import typings.std.HTMLAnchorElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutGridMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/LayoutGrid/LayoutGrid.LayoutGridProps> & {  displayName :'LayoutGridProps'} */
  object default {
    
    inline def apply(props: PropsWithChildren[LayoutGridProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: PropsWithChildren[LayoutGridProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react/lib/LayoutGrid/LayoutGrid", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/LayoutGrid/LayoutGrid", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/LayoutGrid/LayoutGrid", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialLayoutGridProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialLayoutGridProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/LayoutGrid/LayoutGrid", "default.displayName")
    @js.native
    def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.LayoutGridProps | String] = js.native
    inline def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.LayoutGridProps | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/LayoutGrid/LayoutGrid", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapLayoutGr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapLayoutGr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait LayoutGridProps
    extends StObject
       with HTMLAttributes[HTMLAnchorElement] {
    
    var colSpan: js.UndefOr[js.Any] = js.undefined
    
    var cols: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var nogap: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  }
  object LayoutGridProps {
    
    inline def apply(): LayoutGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutGridProps]
    }
    
    extension [Self <: LayoutGridProps](x: Self) {
      
      inline def setColSpan(value: js.Any): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setCols(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setNogap(value: Boolean): Self = StObject.set(x, "nogap", value.asInstanceOf[js.Any])
      
      inline def setNogapUndefined: Self = StObject.set(x, "nogap", js.undefined)
      
      inline def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
