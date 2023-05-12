package typings.fullcalendar

import typings.fullcalendarCore.internalCommonMod.CalendarOptions
import typings.fullcalendarCore.internalCommonMod.DateInput
import typings.fullcalendarCore.internalCommonMod.LocaleInput
import typings.fullcalendarCore.internalCommonMod.PluginDef
import typings.fullcalendarCore.internalCommonMod.PluginDefInput
import typings.fullcalendarCore.mod.FormatDateOptions
import typings.fullcalendarCore.mod.FormatRangeOptions
import typings.fullcalendarInteraction.mod.ExternalDraggableSettings
import typings.fullcalendarInteraction.mod.ExtraListenerRefiners
import typings.fullcalendarInteraction.mod.ExtraOptionRefiners
import typings.fullcalendarInteraction.mod.ThirdPartyDraggableSettings
import typings.std.EventTarget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fullcalendar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fullcalendar", "Calendar")
  @js.native
  open class Calendar protected ()
    extends typings.fullcalendarCore.mod.Calendar {
    def this(el: HTMLElement) = this()
    def this(el: HTMLElement, optionOverrides: CalendarOptions) = this()
  }
  
  @JSImport("fullcalendar", "Draggable")
  @js.native
  open class Draggable protected ()
    extends typings.fullcalendarInteraction.mod.Draggable {
    def this(el: HTMLElement) = this()
    def this(el: HTMLElement, settings: ExternalDraggableSettings) = this()
  }
  
  @JSImport("fullcalendar", "ThirdPartyDraggable")
  @js.native
  open class ThirdPartyDraggable ()
    extends typings.fullcalendarInteraction.mod.ThirdPartyDraggable {
    def this(containerOrSettings: ThirdPartyDraggableSettings) = this()
    def this(containerOrSettings: EventTarget) = this()
    def this(containerOrSettings: Unit, settings: ThirdPartyDraggableSettings) = this()
    def this(containerOrSettings: ThirdPartyDraggableSettings, settings: ThirdPartyDraggableSettings) = this()
    def this(containerOrSettings: EventTarget, settings: ThirdPartyDraggableSettings) = this()
  }
  
  inline def createPlugin(input: PluginDefInput): PluginDef = ^.asInstanceOf[js.Dynamic].applyDynamic("createPlugin")(input.asInstanceOf[js.Any]).asInstanceOf[PluginDef]
  
  inline def formatDate(dateInput: DateInput): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(dateInput.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDate(dateInput: DateInput, options: FormatDateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(dateInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatRange(startInput: DateInput, endInput: DateInput, options: FormatRangeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRange")(startInput.asInstanceOf[js.Any], endInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("fullcalendar", "globalLocales")
  @js.native
  val globalLocales: js.Array[LocaleInput] = js.native
  
  @JSImport("fullcalendar", "globalPlugins")
  @js.native
  val globalPlugins: js.Array[PluginDef] = js.native
  
  @JSImport("fullcalendar", "version")
  @js.native
  val version: String = js.native
  
  /* augmented module */
  object fullcalendarCoreInternalAugmentingMod {
    
    type BaseOptionRefiners = ExtraOptionRefiners
    
    type CalendarListenerRefiners = ExtraListenerRefiners
  }
}
