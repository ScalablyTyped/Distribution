package typings.devextreme.mod.default.viz

import typings.devextreme.anon.BackgroundColor
import typings.devextreme.anon.BaseColorSet
import typings.devextreme.anon.FileName
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
  /** @name viz.currentPalette() */
  def currentPalette(): String = js.native
  /** @name viz.currentPalette(paletteName) */
  def currentPalette(paletteName: String): Unit = js.native
  /** @name viz.currentTheme() */
  def currentTheme(): String = js.native
  /** @name viz.currentTheme(platform, colorScheme) */
  def currentTheme(platform: String, colorScheme: String): Unit = js.native
  /** @name viz.currentTheme(theme) */
  def currentTheme(theme: String): Unit = js.native
  /** @name viz.exportFromMarkup(markup, options) */
  def exportFromMarkup(markup: String, options: BackgroundColor): Unit = js.native
  /** @name viz.exportWidgets(widgetInstances) */
  def exportWidgets(widgetInstances: js.Array[js.Array[DOMComponent]]): Unit = js.native
  /** @name viz.exportWidgets(widgetInstances, options) */
  def exportWidgets(widgetInstances: js.Array[js.Array[DOMComponent]], options: FileName): Unit = js.native
  /** @name viz.generateColors(palette, count, options) */
  def generateColors(
    palette: Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office | js.Array[String],
    count: Double,
    options: BaseColorSet
  ): js.Array[String] = js.native
  /** @name viz.getMarkup(widgetInstances) */
  def getMarkup(widgetInstances: js.Array[DOMComponent]): String = js.native
  /** @name viz.getPalette(paletteName) */
  def getPalette(paletteName: String): js.Any = js.native
  /** @name viz.getTheme(theme) */
  def getTheme(theme: String): js.Any = js.native
  /** @name viz.refreshPaths() */
  def refreshPaths(): Unit = js.native
  /** @name viz.refreshTheme() */
  def refreshTheme(): Unit = js.native
  /** @name viz.registerPalette(paletteName, palette) */
  def registerPalette(paletteName: String, palette: js.Any): Unit = js.native
  /** @name viz.registerTheme(customTheme, baseTheme) */
  def registerTheme(customTheme: js.Any, baseTheme: String): Unit = js.native
}

