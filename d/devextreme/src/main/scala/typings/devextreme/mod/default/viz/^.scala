package typings.devextreme.mod.default.viz

import typings.devextreme.AnonBackgroundColor
import typings.devextreme.AnonBaseColorSet
import typings.devextreme.AnonFileName
import typings.devextreme.devextremeStrings.Bright
import typings.devextreme.devextremeStrings.Carmine
import typings.devextreme.devextremeStrings.Default
import typings.devextreme.devextremeStrings.Material
import typings.devextreme.devextremeStrings.Ocean
import typings.devextreme.devextremeStrings.Office
import typings.devextreme.devextremeStrings.Pastel
import typings.devextreme.devextremeStrings.Soft
import typings.devextreme.devextremeStrings.Vintage
import typings.devextreme.devextremeStrings.Violet
import typings.devextreme.devextremeStrings.`Dark Moon`
import typings.devextreme.devextremeStrings.`Dark Violet`
import typings.devextreme.devextremeStrings.`Green Mist`
import typings.devextreme.devextremeStrings.`Harmony Light`
import typings.devextreme.devextremeStrings.`Soft Blue`
import typings.devextreme.devextremeStrings.`Soft Pastel`
import typings.devextreme.mod.DevExpress.DOMComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "viz")
@js.native
object ^ extends js.Object {
  /** Gets the current palette's name. */
  def currentPalette(): String = js.native
  /** Changes the current palette for all data visualization widgets on the page. */
  def currentPalette(paletteName: String): Unit = js.native
  /** Gets the current theme's name. */
  def currentTheme(): String = js.native
  /** Changes the current theme for all data visualization widgets on the page. The color scheme is defined separately. */
  def currentTheme(platform: String, colorScheme: String): Unit = js.native
  /** Changes the current theme for all data visualization widgets on the page. */
  def currentTheme(theme: String): Unit = js.native
  /** Allows you to export widgets using their SVG markup. */
  def exportFromMarkup(markup: String, options: AnonBackgroundColor): Unit = js.native
  /** Exports one or several widgets to PNG. */
  def exportWidgets(widgetInstances: js.Array[js.Array[DOMComponent]]): Unit = js.native
  /** Exports one or several widgets. */
  def exportWidgets(widgetInstances: js.Array[js.Array[DOMComponent]], options: AnonFileName): Unit = js.native
  /** Returns a subset of palette colors. */
  def generateColors(
    palette: Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office | js.Array[String],
    count: Double,
    options: AnonBaseColorSet
  ): js.Array[String] = js.native
  /** Gets the SVG markup of specific widgets for their subsequent export. */
  def getMarkup(widgetInstances: js.Array[DOMComponent]): String = js.native
  /** Gets the color sets of a predefined or registered palette. */
  def getPalette(paletteName: String): js.Any = js.native
  /** Gets a predefined or registered theme's settings. */
  def getTheme(theme: String): js.Any = js.native
  /** The method to be called every time the active entry in the browser history is modified without reloading the current page. */
  def refreshPaths(): Unit = js.native
  /** Refreshes the current theme and palette in all data visualization widgets on the page. */
  def refreshTheme(): Unit = js.native
  /** Registers a new palette. */
  def registerPalette(paletteName: String, palette: js.Any): Unit = js.native
  /** Registers a new theme based on the existing one. */
  def registerTheme(customTheme: js.Any, baseTheme: String): Unit = js.native
}

