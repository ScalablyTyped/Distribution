package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.FCTileContentPropsdisplay
import typings.fundamentalReact.anon.FCTileFooterPropsdisplayN
import typings.fundamentalReact.anon.FCTileHeaderPropsdisplayN
import typings.fundamentalReact.anon.PartialTileProps
import typings.fundamentalReact.anon.WeakValidationMapTileProp
import typings.fundamentalReact.fundamentalReactStrings.Tile
import typings.fundamentalReact.fundamentalReactStrings.s
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTileTileMod {
  
  /* Inlined react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> & {  displayName :'Tile',   Content :react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileContentProps> & {  displayName :'Tile.Content'},   Footer :react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileFooterProps> & {  displayName :'Tile.Footer'},   Header :react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileHeaderProps> & {  displayName :'Tile.Header'}} */
  object default {
    
    inline def apply(props: TileProps): ReactNode = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
    inline def apply(props: TileProps, context: Any): ReactNode = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
    
    @JSImport("fundamental-react/lib/Tile/Tile", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.Content")
    @js.native
    def Content: FCTileContentPropsdisplay = js.native
    inline def Content_=(x: FCTileContentPropsdisplay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.Footer")
    @js.native
    def Footer: FCTileFooterPropsdisplayN = js.native
    inline def Footer_=(x: FCTileFooterPropsdisplayN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.Header")
    @js.native
    def Header: FCTileHeaderPropsdisplayN = js.native
    inline def Header_=(x: FCTileHeaderPropsdisplayN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTileProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialTileProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String | Tile] = js.native
    inline def displayName_=(x: js.UndefOr[String | Tile]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTileProp] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapTileProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait TileContentProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var twoColumns: js.UndefOr[Boolean] = js.undefined
  }
  object TileContentProps {
    
    inline def apply(): TileContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileContentProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTwoColumns(value: Boolean): Self = StObject.set(x, "twoColumns", value.asInstanceOf[js.Any])
      
      inline def setTwoColumnsUndefined: Self = StObject.set(x, "twoColumns", js.undefined)
    }
  }
  
  trait TileFooterProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object TileFooterProps {
    
    inline def apply(): TileFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileFooterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileFooterProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  trait TileHeaderProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
  }
  object TileHeaderProps {
    
    inline def apply(): TileHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    }
  }
  
  trait TileProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var isDouble: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
      ] = js.undefined
    
    var size: js.UndefOr[s] = js.undefined
  }
  object TileProps {
    
    inline def apply(): TileProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsDouble(value: Boolean): Self = StObject.set(x, "isDouble", value.asInstanceOf[js.Any])
      
      inline def setIsDoubleUndefined: Self = StObject.set(x, "isDouble", js.undefined)
      
      inline def setOnClick(value: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSize(value: s): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
