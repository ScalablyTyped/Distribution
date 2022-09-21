package typings.fullcalendarCore

import org.scalablytyped.runtime.Shortcut
import typings.fullcalendarCommon.mod.LocaleInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localesAllMod extends Shortcut {
  
  @JSImport("@fullcalendar/core/locales-all", JSImport.Default)
  @js.native
  val default: js.Array[LocaleInput] = js.native
  
  type _To = js.Array[LocaleInput]
  
  /* This means you don't have to write `default`, but can instead just say `localesAllMod.foo` */
  override def _to: js.Array[LocaleInput] = default
}
