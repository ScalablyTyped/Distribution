package typings.fpTs

import typings.fpTs.eqMod.Eq
import typings.fpTs.iOMod.IO_
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("fp-ts/lib/Date", "create")
  @js.native
  val create: IO_[Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "eqDate")
  @js.native
  val eqDate: Eq[Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "eqMonth")
  @js.native
  val eqMonth: Eq[Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "eqYear")
  @js.native
  val eqYear: Eq[Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "now")
  @js.native
  val now: IO_[Double] = js.native
}
