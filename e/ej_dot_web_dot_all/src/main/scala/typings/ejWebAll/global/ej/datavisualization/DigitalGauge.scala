package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.DigitalGauge")
@js.native
class DigitalGauge protected ()
  extends StObject
     with typings.ejWebAll.ej.datavisualization.DigitalGauge {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}
object DigitalGauge {
  
  @JSGlobal("ej.datavisualization.DigitalGauge")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.datavisualization.DigitalGauge.CharacterType")
  @js.native
  object CharacterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType & Double] = js.native
    
    /* 3 */ val EightCrossEightDotMatrix: typings.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.EightCrossEightDotMatrix & Double = js.native
    
    /* 4 */ val EightCrossEightSquareMatrix: typings.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.EightCrossEightSquareMatrix & Double = js.native
    
    /* 1 */ val FourteenSegment: typings.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.FourteenSegment & Double = js.native
    
    /* 0 */ val SevenSegment: typings.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.SevenSegment & Double = js.native
    
    /* 2 */ val SixteenSegment: typings.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.SixteenSegment & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.DigitalGauge.ExportingMode")
  @js.native
  object ExportingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.DigitalGauge.ExportingMode & Double] = js.native
    
    /* 1 */ val ClientSide: typings.ejWebAll.ej.datavisualization.DigitalGauge.ExportingMode.ClientSide & Double = js.native
    
    /* 0 */ val ServerSide: typings.ejWebAll.ej.datavisualization.DigitalGauge.ExportingMode.ServerSide & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.DigitalGauge.ExportingType")
  @js.native
  object ExportingType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.DigitalGauge.ExportingType & Double] = js.native
    
    /* 1 */ val JPG: typings.ejWebAll.ej.datavisualization.DigitalGauge.ExportingType.JPG & Double = js.native
    
    /* 0 */ val PNG: typings.ejWebAll.ej.datavisualization.DigitalGauge.ExportingType.PNG & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.DigitalGauge.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle & Double] = js.native
    
    /* 1 */ val Bold: typings.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Bold & Double = js.native
    
    /* 2 */ val Italic: typings.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Italic & Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Normal & Double = js.native
    
    /* 4 */ val Strikeout: typings.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Strikeout & Double = js.native
    
    /* 3 */ val Underline: typings.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Underline & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.DigitalGauge.Locale")
  @js.native
  def Locale: js.Any = js.native
  inline def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.datavisualization.DigitalGauge.fn")
  @js.native
  def fn: typings.ejWebAll.ej.datavisualization.DigitalGauge = js.native
  inline def fn_=(x: typings.ejWebAll.ej.datavisualization.DigitalGauge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
