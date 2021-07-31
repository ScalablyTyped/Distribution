package typings.glaze

import org.scalablytyped.runtime.Shortcut
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStylingTreatMod extends Shortcut {
  
  @JSImport("glaze/dist-types/useStyling.treat", JSImport.Default)
  @js.native
  val default: Record[String, String] = js.native
  
  type _To = Record[String, String]
  
  /* This means you don't have to write `default`, but can instead just say `useStylingTreatMod.foo` */
  override def _to: Record[String, String] = default
}
