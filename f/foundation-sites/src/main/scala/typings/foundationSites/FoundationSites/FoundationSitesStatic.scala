package typings.foundationSites.FoundationSites

import typings.foundationSites.anon.Instantiable
import typings.foundationSites.anon.InstantiableAccordion
import typings.foundationSites.anon.InstantiableAccordionMenu
import typings.foundationSites.anon.InstantiableDrilldown
import typings.foundationSites.anon.InstantiableDropdown
import typings.foundationSites.anon.InstantiableDropdownMenu
import typings.foundationSites.anon.InstantiableEqualizer
import typings.foundationSites.anon.InstantiableInterchange
import typings.foundationSites.anon.InstantiableMagellan
import typings.foundationSites.anon.InstantiableOffCanvas
import typings.foundationSites.anon.InstantiableOrbit
import typings.foundationSites.anon.InstantiableReveal
import typings.foundationSites.anon.InstantiableSlider
import typings.foundationSites.anon.InstantiableSticky
import typings.foundationSites.anon.InstantiableTabs
import typings.foundationSites.anon.InstantiableToggler
import typings.foundationSites.anon.InstantiableTooltip
import typings.foundationSites.anon.Throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoundationSitesStatic extends js.Object {
  
  var Abide: Instantiable = js.native
  
  var Accordion: InstantiableAccordion = js.native
  
  var AccordionMenu: InstantiableAccordionMenu = js.native
  
  // utils
  var Box: typings.foundationSites.FoundationSites.Box = js.native
  
  var Drilldown: InstantiableDrilldown = js.native
  
  var Dropdown: InstantiableDropdown = js.native
  
  var DropdownMenu: InstantiableDropdownMenu = js.native
  
  var Equalizer: InstantiableEqualizer = js.native
  
  def GetYoDigits(length: Double): String = js.native
  def GetYoDigits(length: Double, namespace: String): String = js.native
  
  var Interchange: InstantiableInterchange = js.native
  
  var Keyboard: typings.foundationSites.FoundationSites.Keyboard = js.native
  
  var Magellan: InstantiableMagellan = js.native
  
  var MediaQuery: typings.foundationSites.FoundationSites.MediaQuery = js.native
  
  var Motion: typings.foundationSites.FoundationSites.Motion = js.native
  
  var Move: typings.foundationSites.FoundationSites.Move = js.native
  
  var Nest: typings.foundationSites.FoundationSites.Nest = js.native
  
  var OffCanvas: InstantiableOffCanvas = js.native
  
  var Orbit: InstantiableOrbit = js.native
  
  var Reveal: InstantiableReveal = js.native
  
  var Slider: InstantiableSlider = js.native
  
  var Sticky: InstantiableSticky = js.native
  
  var Tabs: InstantiableTabs = js.native
  
  var Timer: typings.foundationSites.FoundationSites.Timer = js.native
  
  var Toggler: InstantiableToggler = js.native
  
  var Tooltip: InstantiableTooltip = js.native
  
  var Touch: typings.foundationSites.FoundationSites.Touch = js.native
  
  var Triggers: typings.foundationSites.FoundationSites.Triggers = js.native
  
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
  
  var util: Throttle = js.native
  
  var version: String = js.native
}
