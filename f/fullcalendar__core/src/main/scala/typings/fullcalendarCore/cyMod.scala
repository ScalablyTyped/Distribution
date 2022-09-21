package typings.fullcalendarCore

import org.scalablytyped.runtime.Shortcut
import typings.fullcalendarCommon.mod.LocaleInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cyMod extends Shortcut {
  
  @JSImport("@fullcalendar/core/locales/cy", JSImport.Default)
  @js.native
  val default: LocaleInput = js.native
  
  type _To = LocaleInput
  
  /* This means you don't have to write `default`, but can instead just say `cyMod.foo` */
  override def _to: LocaleInput = default
}
