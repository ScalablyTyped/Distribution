package typings.fpTs

import typings.fpTs.libIOMod.IO_
import typings.fpTs.libOrdMod.Ord_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateMod {
  
  @JSImport("fp-ts/lib/Date", "Eq")
  @js.native
  val Eq: typings.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "Ord")
  @js.native
  val Ord: Ord_[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "create")
  @js.native
  val create: IO_[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "eqDate")
  @js.native
  val eqDate: typings.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "eqMonth")
  @js.native
  val eqMonth: typings.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "eqYear")
  @js.native
  val eqYear: typings.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "now")
  @js.native
  val now: IO_[Double] = js.native
}
