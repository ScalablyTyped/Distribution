package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Tile")
@js.native
open class Tile protected ()
  extends StObject
     with typings.ejWebAll.ej.Tile {
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
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tile.BadgePosition & Double] = js.native
    
    /* 1 */ val Bottomright: typings.ejWebAll.ej.Tile.BadgePosition.Bottomright & Double = js.native
    
    /* 0 */ val Topright: typings.ejWebAll.ej.Tile.BadgePosition.Topright & Double = js.native
  }
  
  @JSGlobal("ej.Tile.CaptionAlignment")
  @js.native
  object CaptionAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tile.CaptionAlignment & Double] = js.native
    
    /* 3 */ val Center: typings.ejWebAll.ej.Tile.CaptionAlignment.Center & Double = js.native
    
    /* 1 */ val Left: typings.ejWebAll.ej.Tile.CaptionAlignment.Left & Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.Tile.CaptionAlignment.Normal & Double = js.native
    
    /* 2 */ val Right: typings.ejWebAll.ej.Tile.CaptionAlignment.Right & Double = js.native
  }
  
  @JSGlobal("ej.Tile.CaptionPosition")
  @js.native
  object CaptionPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tile.CaptionPosition & Double] = js.native
    
    /* 1 */ val Innerbottom: typings.ejWebAll.ej.Tile.CaptionPosition.Innerbottom & Double = js.native
    
    /* 0 */ val Innertop: typings.ejWebAll.ej.Tile.CaptionPosition.Innertop & Double = js.native
    
    /* 2 */ val Outer: typings.ejWebAll.ej.Tile.CaptionPosition.Outer & Double = js.native
  }
  
  @JSGlobal("ej.Tile.ImagePosition")
  @js.native
  object ImagePosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tile.ImagePosition & Double] = js.native
    
    /* 2 */ val BottomCenter: typings.ejWebAll.ej.Tile.ImagePosition.BottomCenter & Double = js.native
    
    /* 8 */ val BottomLeft: typings.ejWebAll.ej.Tile.ImagePosition.BottomLeft & Double = js.native
    
    /* 7 */ val BottomRight: typings.ejWebAll.ej.Tile.ImagePosition.BottomRight & Double = js.native
    
    /* 0 */ val Center: typings.ejWebAll.ej.Tile.ImagePosition.Center & Double = js.native
    
    /* 9 */ val Fill: typings.ejWebAll.ej.Tile.ImagePosition.Fill & Double = js.native
    
    /* 4 */ val LeftCenter: typings.ejWebAll.ej.Tile.ImagePosition.LeftCenter & Double = js.native
    
    /* 3 */ val RightCenter: typings.ejWebAll.ej.Tile.ImagePosition.RightCenter & Double = js.native
    
    /* 1 */ val TopCenter: typings.ejWebAll.ej.Tile.ImagePosition.TopCenter & Double = js.native
    
    /* 5 */ val TopLeft: typings.ejWebAll.ej.Tile.ImagePosition.TopLeft & Double = js.native
    
    /* 6 */ val TopRight: typings.ejWebAll.ej.Tile.ImagePosition.TopRight & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tile.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Tile.TileSize")
  @js.native
  object TileSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tile.TileSize & Double] = js.native
    
    /* 2 */ val Large: typings.ejWebAll.ej.Tile.TileSize.Large & Double = js.native
    
    /* 0 */ val Medium: typings.ejWebAll.ej.Tile.TileSize.Medium & Double = js.native
    
    /* 1 */ val Small: typings.ejWebAll.ej.Tile.TileSize.Small & Double = js.native
    
    /* 3 */ val Wide: typings.ejWebAll.ej.Tile.TileSize.Wide & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tile.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Tile = js.native
  inline def fn_=(x: typings.ejWebAll.ej.Tile): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Tile.liveTileType")
  @js.native
  object liveTileType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tile.liveTileType & Double] = js.native
    
    /* 2 */ val Carousel: typings.ejWebAll.ej.Tile.liveTileType.Carousel & Double = js.native
    
    /* 0 */ val Flip: typings.ejWebAll.ej.Tile.liveTileType.Flip & Double = js.native
    
    /* 1 */ val Slide: typings.ejWebAll.ej.Tile.liveTileType.Slide & Double = js.native
  }
}
