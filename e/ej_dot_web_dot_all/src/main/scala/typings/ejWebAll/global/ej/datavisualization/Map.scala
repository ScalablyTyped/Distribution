package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.Map")
@js.native
class Map protected ()
  extends typings.ejWebAll.ej.datavisualization.Map {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}

/* static members */
@JSGlobal("ej.datavisualization.Map")
@js.native
object Map extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.datavisualization.Map = js.native
  @js.native
  object BingMapType extends js.Object {
    /* 0 */ val Aerial: typings.ejWebAll.ej.datavisualization.Map.BingMapType.Aerial with Double = js.native
    /* 1 */ val Aerialwithlabel: typings.ejWebAll.ej.datavisualization.Map.BingMapType.Aerialwithlabel with Double = js.native
    /* 2 */ val Road: typings.ejWebAll.ej.datavisualization.Map.BingMapType.Road with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.BingMapType with Double] = js.native
  }
  
  @js.native
  object ColorPalette extends js.Object {
    /* 3 */ val Custompalette: typings.ejWebAll.ej.datavisualization.Map.ColorPalette.Custompalette with Double = js.native
    /* 0 */ val Palette1: typings.ejWebAll.ej.datavisualization.Map.ColorPalette.Palette1 with Double = js.native
    /* 1 */ val Palette2: typings.ejWebAll.ej.datavisualization.Map.ColorPalette.Palette2 with Double = js.native
    /* 2 */ val Palette3: typings.ejWebAll.ej.datavisualization.Map.ColorPalette.Palette3 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.ColorPalette with Double] = js.native
  }
  
  @js.native
  object DockPosition extends js.Object {
    /* 1 */ val Bottom: typings.ejWebAll.ej.datavisualization.Map.DockPosition.Bottom with Double = js.native
    /* 3 */ val Left: typings.ejWebAll.ej.datavisualization.Map.DockPosition.Left with Double = js.native
    /* 2 */ val Right: typings.ejWebAll.ej.datavisualization.Map.DockPosition.Right with Double = js.native
    /* 0 */ val Top: typings.ejWebAll.ej.datavisualization.Map.DockPosition.Top with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.DockPosition with Double] = js.native
  }
  
  @js.native
  object FontStyle extends js.Object {
    /* 1 */ val Italic: typings.ejWebAll.ej.datavisualization.Map.FontStyle.Italic with Double = js.native
    /* 0 */ val Normal: typings.ejWebAll.ej.datavisualization.Map.FontStyle.Normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.FontStyle with Double] = js.native
  }
  
  @js.native
  object FontWeight extends js.Object {
    /* 1 */ val Bold: typings.ejWebAll.ej.datavisualization.Map.FontWeight.Bold with Double = js.native
    /* 2 */ val Lighter: typings.ejWebAll.ej.datavisualization.Map.FontWeight.Lighter with Double = js.native
    /* 0 */ val Regular: typings.ejWebAll.ej.datavisualization.Map.FontWeight.Regular with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.FontWeight with Double] = js.native
  }
  
  @js.native
  object GeometryType extends js.Object {
    /* 0 */ val Geographic: typings.ejWebAll.ej.datavisualization.Map.GeometryType.Geographic with Double = js.native
    /* 1 */ val Normal: typings.ejWebAll.ej.datavisualization.Map.GeometryType.Normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.GeometryType with Double] = js.native
  }
  
  @js.native
  object LabelOrientation extends js.Object {
    /* 0 */ val Horizontal: typings.ejWebAll.ej.datavisualization.Map.LabelOrientation.Horizontal with Double = js.native
    /* 1 */ val Vertical: typings.ejWebAll.ej.datavisualization.Map.LabelOrientation.Vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.LabelOrientation with Double] = js.native
  }
  
  @js.native
  object LabelSize extends js.Object {
    /* 1 */ val Default: typings.ejWebAll.ej.datavisualization.Map.LabelSize.Default with Double = js.native
    /* 0 */ val Fixed: typings.ejWebAll.ej.datavisualization.Map.LabelSize.Fixed with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.LabelSize with Double] = js.native
  }
  
  @js.native
  object LayerType extends js.Object {
    /* 2 */ val Bing: typings.ejWebAll.ej.datavisualization.Map.LayerType.Bing with Double = js.native
    /* 0 */ val Geometry: typings.ejWebAll.ej.datavisualization.Map.LayerType.Geometry with Double = js.native
    /* 1 */ val Osm: typings.ejWebAll.ej.datavisualization.Map.LayerType.Osm with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.LayerType with Double] = js.native
  }
  
  @js.native
  object LegendIcons extends js.Object {
    /* 1 */ val Circle: typings.ejWebAll.ej.datavisualization.Map.LegendIcons.Circle with Double = js.native
    /* 0 */ val Rectangle: typings.ejWebAll.ej.datavisualization.Map.LegendIcons.Rectangle with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.LegendIcons with Double] = js.native
  }
  
  @js.native
  object LegendType extends js.Object {
    /* 1 */ val Bubbles: typings.ejWebAll.ej.datavisualization.Map.LegendType.Bubbles with Double = js.native
    /* 0 */ val Layers: typings.ejWebAll.ej.datavisualization.Map.LegendType.Layers with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.LegendType with Double] = js.native
  }
  
  @js.native
  object Mode extends js.Object {
    /* 0 */ val Default: typings.ejWebAll.ej.datavisualization.Map.Mode.Default with Double = js.native
    /* 1 */ val Interactive: typings.ejWebAll.ej.datavisualization.Map.Mode.Interactive with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.Mode with Double] = js.native
  }
  
  @js.native
  object Position extends js.Object {
    /* 8 */ val Bottomcenter: typings.ejWebAll.ej.datavisualization.Map.Position.Bottomcenter with Double = js.native
    /* 7 */ val Bottomleft: typings.ejWebAll.ej.datavisualization.Map.Position.Bottomleft with Double = js.native
    /* 9 */ val Bottomright: typings.ejWebAll.ej.datavisualization.Map.Position.Bottomright with Double = js.native
    /* 5 */ val Center: typings.ejWebAll.ej.datavisualization.Map.Position.Center with Double = js.native
    /* 4 */ val Centerleft: typings.ejWebAll.ej.datavisualization.Map.Position.Centerleft with Double = js.native
    /* 6 */ val Centerright: typings.ejWebAll.ej.datavisualization.Map.Position.Centerright with Double = js.native
    /* 0 */ val None: typings.ejWebAll.ej.datavisualization.Map.Position.None with Double = js.native
    /* 2 */ val Topcenter: typings.ejWebAll.ej.datavisualization.Map.Position.Topcenter with Double = js.native
    /* 1 */ val Topleft: typings.ejWebAll.ej.datavisualization.Map.Position.Topleft with Double = js.native
    /* 3 */ val Topright: typings.ejWebAll.ej.datavisualization.Map.Position.Topright with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.Position with Double] = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    /* 0 */ val Default: typings.ejWebAll.ej.datavisualization.Map.SelectionMode.Default with Double = js.native
    /* 1 */ val Multiple: typings.ejWebAll.ej.datavisualization.Map.SelectionMode.Multiple with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Map.SelectionMode with Double] = js.native
  }
  
}

