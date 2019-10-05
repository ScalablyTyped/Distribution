package typings.flatpickr

import org.scalablytyped.runtime.TopLevel
import typings.flatpickr.distTypesInstanceMod.FlatpickrFn
import typings.flatpickr.distTypesLocaleMod.key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatpickr", JSImport.Namespace)
@js.native
object flatpickrMod extends js.Object {
  @js.native
  object default extends TopLevel[FlatpickrFn]
  
  @js.native
  object flatpickr extends js.Object {
    @js.native
    object Options extends js.Object {
      type DateLimit = typings.flatpickr.distTypesOptionsMod.DateLimit[typings.flatpickr.distTypesOptionsMod.DateOption]
      type DateOption = typings.flatpickr.distTypesOptionsMod.DateOption
      type DateRangeLimit = typings.flatpickr.distTypesOptionsMod.DateRangeLimit[typings.flatpickr.distTypesOptionsMod.DateOption]
      type Hook = typings.flatpickr.distTypesOptionsMod.Hook
      type HookKey = typings.flatpickr.distTypesOptionsMod.HookKey
      type LocaleKey = key
      type Options = typings.flatpickr.distTypesOptionsMod.Options
      type ParsedOptions = typings.flatpickr.distTypesOptionsMod.ParsedOptions
      type Plugin = typings.flatpickr.distTypesOptionsMod.Plugin[js.Object]
    }
    
    type CustomLocale = typings.flatpickr.distTypesLocaleMod.CustomLocale
    type Instance = typings.flatpickr.distTypesInstanceMod.Instance
    type Locale = typings.flatpickr.distTypesLocaleMod.Locale
  }
  
}

