package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.FCTileContentPropsdisplay
import typings.fundamentalReact.anon.FCTileFooterPropsdisplayN
import typings.fundamentalReact.anon.FCTileHeaderPropsdisplayN
import typings.fundamentalReact.anon.PartialTileProps
import typings.fundamentalReact.anon.WeakValidationMapTileProp
import typings.fundamentalReact.fundamentalReactStrings.Tile
import typings.fundamentalReact.fundamentalReactStrings.s
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileMod {
  
  /* Inlined react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> & {  displayName :'Tile',   Content :react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileContentProps> & {  displayName :'Tile.Content'},   Footer :react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileFooterProps> & {  displayName :'Tile.Footer'},   Header :react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileHeaderProps> & {  displayName :'Tile.Header'}} */
  object default {
    
    @JSImport("fundamental-react/lib/Tile/Tile", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[TileProps]): ReactElement | Null = js.native
    @JSImport("fundamental-react/lib/Tile/Tile", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[TileProps], context: js.Any): ReactElement | Null = js.native
    @JSImport("fundamental-react/lib/Tile/Tile", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.Content")
    @js.native
    def Content: FCTileContentPropsdisplay = js.native
    @scala.inline
    def Content_=(x: FCTileContentPropsdisplay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.Footer")
    @js.native
    def Footer: FCTileFooterPropsdisplayN = js.native
    @scala.inline
    def Footer_=(x: FCTileFooterPropsdisplayN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.Header")
    @js.native
    def Header: FCTileHeaderPropsdisplayN = js.native
    @scala.inline
    def Header_=(x: FCTileHeaderPropsdisplayN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTileProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialTileProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String | Tile] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String | Tile]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tile/Tile", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTileProp] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapTileProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TileContentProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var twoColumns: js.UndefOr[Boolean] = js.native
  }
  object TileContentProps {
    
    @scala.inline
    def apply(): TileContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileContentProps]
    }
    
    @scala.inline
    implicit class TileContentPropsMutableBuilder[Self <: TileContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTwoColumns(value: Boolean): Self = StObject.set(x, "twoColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoColumnsUndefined: Self = StObject.set(x, "twoColumns", js.undefined)
    }
  }
  
  @js.native
  trait TileFooterProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
  }
  object TileFooterProps {
    
    @scala.inline
    def apply(): TileFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileFooterProps]
    }
    
    @scala.inline
    implicit class TileFooterPropsMutableBuilder[Self <: TileFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  @js.native
  trait TileHeaderProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var subtitle: js.UndefOr[String] = js.native
  }
  object TileHeaderProps {
    
    @scala.inline
    def apply(): TileHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileHeaderProps]
    }
    
    @scala.inline
    implicit class TileHeaderPropsMutableBuilder[Self <: TileHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    }
  }
  
  @js.native
  trait TileProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var isDouble: js.UndefOr[Boolean] = js.native
    
    var onClick: js.UndefOr[
        js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
      ] = js.native
    
    var size: js.UndefOr[s] = js.native
  }
  object TileProps {
    
    @scala.inline
    def apply(): TileProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileProps]
    }
    
    @scala.inline
    implicit class TilePropsMutableBuilder[Self <: TileProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIsDouble(value: Boolean): Self = StObject.set(x, "isDouble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDoubleUndefined: Self = StObject.set(x, "isDouble", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSize(value: s): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
