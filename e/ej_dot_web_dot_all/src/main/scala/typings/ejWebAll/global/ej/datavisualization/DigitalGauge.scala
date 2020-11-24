package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.DigitalGauge")
@js.native
class DigitalGauge protected ()
  extends typings.ejWebAll.ej.datavisualization.DigitalGauge {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}
/* static members */
@JSGlobal("ej.datavisualization.DigitalGauge")
@js.native
object DigitalGauge extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.datavisualization.DigitalGauge = js.native
  
  @js.native
  object CharacterType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType with Double] = js.native
    
    /* 3 */ val EightCrossEightDotMatrix: typings.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.EightCrossEightDotMatrix with Double = js.native
    
    /* 4 */ val EightCrossEightSquareMatrix: typings.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.EightCrossEightSquareMatrix with Double = js.native
    
    /* 1 */ val FourteenSegment: typings.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.FourteenSegment with Double = js.native
    
    /* 0 */ val SevenSegment: typings.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.SevenSegment with Double = js.native
    
    /* 2 */ val SixteenSegment: typings.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.SixteenSegment with Double = js.native
  }
  
  @js.native
  object ExportingMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.DigitalGauge.ExportingMode with Double] = js.native
    
    /* 1 */ val ClientSide: typings.ejWebAll.ej.datavisualization.DigitalGauge.ExportingMode.ClientSide with Double = js.native
    
    /* 0 */ val ServerSide: typings.ejWebAll.ej.datavisualization.DigitalGauge.ExportingMode.ServerSide with Double = js.native
  }
  
  @js.native
  object ExportingType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.DigitalGauge.ExportingType with Double] = js.native
    
    /* 1 */ val JPG: typings.ejWebAll.ej.datavisualization.DigitalGauge.ExportingType.JPG with Double = js.native
    
    /* 0 */ val PNG: typings.ejWebAll.ej.datavisualization.DigitalGauge.ExportingType.PNG with Double = js.native
  }
  
  @js.native
  object FontStyle extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle with Double] = js.native
    
    /* 1 */ val Bold: typings.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Bold with Double = js.native
    
    /* 2 */ val Italic: typings.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Italic with Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Normal with Double = js.native
    
    /* 4 */ val Strikeout: typings.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Strikeout with Double = js.native
    
    /* 3 */ val Underline: typings.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Underline with Double = js.native
  }
}
