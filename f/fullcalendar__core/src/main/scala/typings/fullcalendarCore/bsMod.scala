package typings.fullcalendarCore

import org.scalablytyped.runtime.Shortcut
import typings.fullcalendarCommon.mod.LocaleInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bsMod extends Shortcut {
  
  @JSImport("@fullcalendar/core/locales/bs", JSImport.Default)
  @js.native
  val default: LocaleInput = js.native
  
  type _To = LocaleInput
  
  /* This means you don't have to write `default`, but can instead just say `bsMod.foo` */
  override def _to: LocaleInput = default
}
