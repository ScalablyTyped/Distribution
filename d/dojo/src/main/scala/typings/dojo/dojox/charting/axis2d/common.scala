package typings.dojo.dojox.charting.axis2d

import typings.dojo.dojo._base.Color
import typings.dojo.dojox.charting.Chart
import typings.dojo.dojox.gfx.Text
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/axis2d/common.html
  *
  *
  */
trait common extends js.Object {
  /**
    *
    */
  var createText: js.Object
}

@JSGlobal("dojox.charting.axis2d.common")
@js.native
object common extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/axis2d/common.createText.html
    *
    *
    */
  @js.native
  trait createText extends js.Object {
    /**
      * Use dojox.gfx to create any text.
      *
      * @param chart The chart to create the text into.
      * @param creator The graphics surface to use for creating the text.
      * @param x Where to create the text along the x axis (CSS left).
      * @param y Where to create the text along the y axis (CSS top).
      * @param align How to align the text.  Can be "left", "right", "center".
      * @param text The text to render.
      * @param font The font definition, a la CSS "font".
      * @param fontColor The color of the resultant text.
      */
    def gfx(
      chart: Chart,
      creator: js.Object,
      x: Double,
      y: Double,
      align: String,
      text: String,
      font: String,
      fontColor: String
    ): Text = js.native
    /**
      * Use dojox.gfx to create any text.
      *
      * @param chart The chart to create the text into.
      * @param creator The graphics surface to use for creating the text.
      * @param x Where to create the text along the x axis (CSS left).
      * @param y Where to create the text along the y axis (CSS top).
      * @param align How to align the text.  Can be "left", "right", "center".
      * @param text The text to render.
      * @param font The font definition, a la CSS "font".
      * @param fontColor The color of the resultant text.
      */
    def gfx(
      chart: Chart,
      creator: js.Object,
      x: Double,
      y: Double,
      align: String,
      text: String,
      font: String,
      fontColor: Color
    ): Text = js.native
    /**
      * Use the HTML DOM to create any text.
      *
      * @param chart The chart to create the text into.
      * @param creator The graphics surface to use for creating the text.
      * @param x Where to create the text along the x axis (CSS left).
      * @param y Where to create the text along the y axis (CSS top).
      * @param align How to align the text.  Can be "left", "right", "center".
      * @param text The text to render.
      * @param font The font definition, a la CSS "font".
      * @param fontColor The color of the resultant text.
      * @param labelWidth               OptionalThe maximum width of the resultant DOM node.
      */
    def html(
      chart: Chart,
      creator: js.Object,
      x: Double,
      y: Double,
      align: String,
      text: String,
      font: String,
      fontColor: String,
      labelWidth: Double
    ): HTMLElement = js.native
    /**
      * Use the HTML DOM to create any text.
      *
      * @param chart The chart to create the text into.
      * @param creator The graphics surface to use for creating the text.
      * @param x Where to create the text along the x axis (CSS left).
      * @param y Where to create the text along the y axis (CSS top).
      * @param align How to align the text.  Can be "left", "right", "center".
      * @param text The text to render.
      * @param font The font definition, a la CSS "font".
      * @param fontColor The color of the resultant text.
      * @param labelWidth               OptionalThe maximum width of the resultant DOM node.
      */
    def html(
      chart: Chart,
      creator: js.Object,
      x: Double,
      y: Double,
      align: String,
      text: String,
      font: String,
      fontColor: Color,
      labelWidth: Double
    ): HTMLElement = js.native
  }
  
}

