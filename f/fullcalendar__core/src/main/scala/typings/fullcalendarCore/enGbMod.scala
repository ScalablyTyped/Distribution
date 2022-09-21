package typings.fullcalendarCore

import org.scalablytyped.runtime.Shortcut
import typings.fullcalendarCommon.mod.LocaleInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enGbMod extends Shortcut {
  
  @JSImport("@fullcalendar/core/locales/en-gb", JSImport.Default)
  @js.native
  val default: LocaleInput = js.native
  
  type _To = LocaleInput
  
  /* This means you don't have to write `default`, but can instead just say `enGbMod.foo` */
  override def _to: LocaleInput = default
}
