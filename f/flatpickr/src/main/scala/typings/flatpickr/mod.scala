package typings.flatpickr

import org.scalablytyped.runtime.TopLevel
import typings.flatpickr.instanceMod.FlatpickrFn
import typings.flatpickr.localeMod.key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatpickr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object default extends TopLevel[FlatpickrFn]
  
  @js.native
  object flatpickr extends js.Object {
    @js.native
    object Options extends js.Object {
      type DateLimit = typings.flatpickr.optionsMod.DateLimit[typings.flatpickr.optionsMod.DateOption]
      type DateOption = typings.flatpickr.optionsMod.DateOption
      type DateRangeLimit = typings.flatpickr.optionsMod.DateRangeLimit[typings.flatpickr.optionsMod.DateOption]
      type Hook = typings.flatpickr.optionsMod.Hook
      type HookKey = typings.flatpickr.optionsMod.HookKey
      type LocaleKey = key
      type Options = typings.flatpickr.optionsMod.Options
      type ParsedOptions = typings.flatpickr.optionsMod.ParsedOptions
      type Plugin = typings.flatpickr.optionsMod.Plugin[js.Object]
    }
    
    type CustomLocale = typings.flatpickr.localeMod.CustomLocale
    type Instance = typings.flatpickr.instanceMod.Instance
    type Locale = typings.flatpickr.localeMod.Locale
  }
  
}

