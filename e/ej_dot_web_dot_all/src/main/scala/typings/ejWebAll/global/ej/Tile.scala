package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Tile")
@js.native
class Tile protected ()
  extends typings.ejWebAll.ej.Tile {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Tile {
  
  @JSGlobal("ej.Tile")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Tile.BadgePosition")
  @js.native
  object BadgePosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tile.BadgePosition with Double] = js.native
    
    /* 1 */ val Bottomright: typings.ejWebAll.ej.Tile.BadgePosition.Bottomright with Double = js.native
    
    /* 0 */ val Topright: typings.ejWebAll.ej.Tile.BadgePosition.Topright with Double = js.native
  }
  
  @JSGlobal("ej.Tile.CaptionAlignment")
  @js.native
  object CaptionAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tile.CaptionAlignment with Double] = js.native
    
    /* 3 */ val Center: typings.ejWebAll.ej.Tile.CaptionAlignment.Center with Double = js.native
    
    /* 1 */ val Left: typings.ejWebAll.ej.Tile.CaptionAlignment.Left with Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.Tile.CaptionAlignment.Normal with Double = js.native
    
    /* 2 */ val Right: typings.ejWebAll.ej.Tile.CaptionAlignment.Right with Double = js.native
  }
  
  @JSGlobal("ej.Tile.CaptionPosition")
  @js.native
  object CaptionPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tile.CaptionPosition with Double] = js.native
    
    /* 1 */ val Innerbottom: typings.ejWebAll.ej.Tile.CaptionPosition.Innerbottom with Double = js.native
    
    /* 0 */ val Innertop: typings.ejWebAll.ej.Tile.CaptionPosition.Innertop with Double = js.native
    
    /* 2 */ val Outer: typings.ejWebAll.ej.Tile.CaptionPosition.Outer with Double = js.native
  }
  
  @JSGlobal("ej.Tile.ImagePosition")
  @js.native
  object ImagePosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tile.ImagePosition with Double] = js.native
    
    /* 2 */ val BottomCenter: typings.ejWebAll.ej.Tile.ImagePosition.BottomCenter with Double = js.native
    
    /* 8 */ val BottomLeft: typings.ejWebAll.ej.Tile.ImagePosition.BottomLeft with Double = js.native
    
    /* 7 */ val BottomRight: typings.ejWebAll.ej.Tile.ImagePosition.BottomRight with Double = js.native
    
    /* 0 */ val Center: typings.ejWebAll.ej.Tile.ImagePosition.Center with Double = js.native
    
    /* 9 */ val Fill: typings.ejWebAll.ej.Tile.ImagePosition.Fill with Double = js.native
    
    /* 4 */ val LeftCenter: typings.ejWebAll.ej.Tile.ImagePosition.LeftCenter with Double = js.native
    
    /* 3 */ val RightCenter: typings.ejWebAll.ej.Tile.ImagePosition.RightCenter with Double = js.native
    
    /* 1 */ val TopCenter: typings.ejWebAll.ej.Tile.ImagePosition.TopCenter with Double = js.native
    
    /* 5 */ val TopLeft: typings.ejWebAll.ej.Tile.ImagePosition.TopLeft with Double = js.native
    
    /* 6 */ val TopRight: typings.ejWebAll.ej.Tile.ImagePosition.TopRight with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tile.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Tile.TileSize")
  @js.native
  object TileSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tile.TileSize with Double] = js.native
    
    /* 2 */ val Large: typings.ejWebAll.ej.Tile.TileSize.Large with Double = js.native
    
    /* 0 */ val Medium: typings.ejWebAll.ej.Tile.TileSize.Medium with Double = js.native
    
    /* 1 */ val Small: typings.ejWebAll.ej.Tile.TileSize.Small with Double = js.native
    
    /* 3 */ val Wide: typings.ejWebAll.ej.Tile.TileSize.Wide with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tile.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Tile = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.Tile): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Tile.liveTileType")
  @js.native
  object liveTileType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tile.liveTileType with Double] = js.native
    
    /* 2 */ val Carousel: typings.ejWebAll.ej.Tile.liveTileType.Carousel with Double = js.native
    
    /* 0 */ val Flip: typings.ejWebAll.ej.Tile.liveTileType.Flip with Double = js.native
    
    /* 1 */ val Slide: typings.ejWebAll.ej.Tile.liveTileType.Slide with Double = js.native
  }
}
