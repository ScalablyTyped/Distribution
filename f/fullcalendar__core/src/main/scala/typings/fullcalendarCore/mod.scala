package typings.fullcalendarCore

import typings.fullcalendarCore.internalCommonMod.C_
import typings.fullcalendarCore.internalCommonMod.CalendarOptions
import typings.fullcalendarCore.internalCommonMod.DateInput
import typings.fullcalendarCore.internalCommonMod.LocaleInput
import typings.fullcalendarCore.internalCommonMod.NativeFormatterOptions
import typings.fullcalendarCore.internalCommonMod.PluginDef
import typings.fullcalendarCore.internalCommonMod.PluginDefInput
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fullcalendar/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fullcalendar/core", "Calendar")
  @js.native
  open class Calendar protected () extends C_ {
    def this(el: HTMLElement) = this()
    def this(el: HTMLElement, optionOverrides: CalendarOptions) = this()
    
    def batchRendering(func: Any): Unit = js.native
    
    /* private */ var currentClassNames: Any = js.native
    
    /* private */ var currentData: Any = js.native
    
    /* private */ var customContentRenderId: Any = js.native
    
    def destroy(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var handleAction: Any = js.native
    
    /* private */ var handleData: Any = js.native
    
    /* private */ var handleRenderRequest: Any = js.native
    
    /* private */ var isRendered: Any = js.native
    
    /* private */ var isRendering: Any = js.native
    
    def pauseRendering(): Unit = js.native
    
    def render(): Unit = js.native
    
    /* private */ var renderRunner: Any = js.native
    
    def resetOptions(optionOverrides: Any): Unit = js.native
    def resetOptions(optionOverrides: Any, changedOptionNames: js.Array[String]): Unit = js.native
    
    def resumeRendering(): Unit = js.native
    
    /* private */ var setClassNames: Any = js.native
    
    /* private */ var setHeight: Any = js.native
  }
  
  inline def createPlugin(input: PluginDefInput): PluginDef = ^.asInstanceOf[js.Dynamic].applyDynamic("createPlugin")(input.asInstanceOf[js.Any]).asInstanceOf[PluginDef]
  
  inline def formatDate(dateInput: DateInput): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(dateInput.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDate(dateInput: DateInput, options: FormatDateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(dateInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatRange(startInput: DateInput, endInput: DateInput, options: FormatRangeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRange")(startInput.asInstanceOf[js.Any], endInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@fullcalendar/core", "globalLocales")
  @js.native
  val globalLocales: js.Array[LocaleInput] = js.native
  
  @JSImport("@fullcalendar/core", "globalPlugins")
  @js.native
  val globalPlugins: js.Array[PluginDef] = js.native
  
  @JSImport("@fullcalendar/core", "version")
  @js.native
  val version: String = js.native
  
  trait FormatDateOptions
    extends StObject
       with NativeFormatterOptions {
    
    var locale: js.UndefOr[String] = js.undefined
  }
  object FormatDateOptions {
    
    inline def apply(): FormatDateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatDateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatDateOptions] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
  
  trait FormatRangeOptions
    extends StObject
       with FormatDateOptions {
    
    var isEndExclusive: js.UndefOr[Boolean] = js.undefined
  }
  object FormatRangeOptions {
    
    inline def apply(): FormatRangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatRangeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatRangeOptions] (val x: Self) extends AnyVal {
      
      inline def setIsEndExclusive(value: Boolean): Self = StObject.set(x, "isEndExclusive", value.asInstanceOf[js.Any])
      
      inline def setIsEndExclusiveUndefined: Self = StObject.set(x, "isEndExclusive", js.undefined)
    }
  }
}
