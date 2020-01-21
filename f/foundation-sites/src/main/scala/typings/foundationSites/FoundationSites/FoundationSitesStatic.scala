package typings.foundationSites.FoundationSites

import typings.foundationSites.AnonArgs
import typings.foundationSites.AnonDefaults
import typings.foundationSites.AnonElement
import typings.foundationSites.AnonElementOptions
import typings.foundationSites.AnonElementOptionsDrilldown
import typings.foundationSites.AnonElementOptionsDropdown
import typings.foundationSites.AnonElementOptionsDropdownMenu
import typings.foundationSites.AnonElementOptionsEqualizer
import typings.foundationSites.AnonElementOptionsIInterchangeOptions
import typings.foundationSites.AnonElementOptionsIMagellanOptions
import typings.foundationSites.AnonElementOptionsIOffCanvasOptions
import typings.foundationSites.AnonElementOptionsIOrbitOptions
import typings.foundationSites.AnonElementOptionsIRevealOptions
import typings.foundationSites.AnonElementOptionsISliderOptions
import typings.foundationSites.AnonElementOptionsIStickyOptions
import typings.foundationSites.AnonElementOptionsITabsOptions
import typings.foundationSites.AnonElementOptionsITogglerOptions
import typings.foundationSites.AnonElementOptionsITooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoundationSitesStatic extends js.Object {
  var Abide: AnonDefaults = js.native
  var Accordion: AnonElement = js.native
  var AccordionMenu: AnonElementOptions = js.native
  // utils
  var Box: typings.foundationSites.FoundationSites.Box = js.native
  var Drilldown: AnonElementOptionsDrilldown = js.native
  var Dropdown: AnonElementOptionsDropdown = js.native
  var DropdownMenu: AnonElementOptionsDropdownMenu = js.native
  var Equalizer: AnonElementOptionsEqualizer = js.native
  var Interchange: AnonElementOptionsIInterchangeOptions = js.native
  var Keyboard: typings.foundationSites.FoundationSites.Keyboard = js.native
  var Magellan: AnonElementOptionsIMagellanOptions = js.native
  var MediaQuery: typings.foundationSites.FoundationSites.MediaQuery = js.native
  var Motion: typings.foundationSites.FoundationSites.Motion = js.native
  var Move: typings.foundationSites.FoundationSites.Move = js.native
  var Nest: typings.foundationSites.FoundationSites.Nest = js.native
  var OffCanvas: AnonElementOptionsIOffCanvasOptions = js.native
  var Orbit: AnonElementOptionsIOrbitOptions = js.native
  var Reveal: AnonElementOptionsIRevealOptions = js.native
  var Slider: AnonElementOptionsISliderOptions = js.native
  var Sticky: AnonElementOptionsIStickyOptions = js.native
  var Tabs: AnonElementOptionsITabsOptions = js.native
  var Timer: typings.foundationSites.FoundationSites.Timer = js.native
  var Toggler: AnonElementOptionsITogglerOptions = js.native
  var Tooltip: AnonElementOptionsITooltipOptions = js.native
  var Touch: typings.foundationSites.FoundationSites.Touch = js.native
  var Triggers: typings.foundationSites.FoundationSites.Triggers = js.native
  var util: AnonArgs = js.native
  var version: String = js.native
  def GetYoDigits(length: Double): String = js.native
  def GetYoDigits(length: Double, namespace: String): String = js.native
  def getFnName(fn: String): String = js.native
  def plugin(plugin: js.Object, name: String): Unit = js.native
  def reInit(plugins: js.Array[_]): Unit = js.native
  def reflow(elem: js.Object): Unit = js.native
  def reflow(elem: js.Object, plugins: String): Unit = js.native
  def reflow(elem: js.Object, plugins: js.Array[String]): Unit = js.native
  def registerPlugin(plugin: js.Object): Unit = js.native
  def rtl(): Boolean = js.native
  def transitionend(): String = js.native
  def unregisterPlugin(plugin: js.Object): Unit = js.native
}

