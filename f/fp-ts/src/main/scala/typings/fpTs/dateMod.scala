package typings.fpTs

import typings.fpTs.iOMod.IO_
import typings.fpTs.ordMod.Ord_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("fp-ts/lib/Date", "Eq")
  @js.native
  val Eq: typings.fpTs.eqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "Ord")
  @js.native
  val Ord: Ord_[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "create")
  @js.native
  val create: IO_[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "eqDate")
  @js.native
  val eqDate: typings.fpTs.eqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "eqMonth")
  @js.native
  val eqMonth: typings.fpTs.eqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "eqYear")
  @js.native
  val eqYear: typings.fpTs.eqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "now")
  @js.native
  val now: IO_[Double] = js.native
}
