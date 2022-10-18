package typings.fpTs.mod

import typings.fpTs.libIOMod.IO_
import typings.fpTs.libOrdMod.Ord_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object date {
  
  @JSImport("fp-ts", "date.Eq")
  @js.native
  val Eq: typings.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts", "date.Ord")
  @js.native
  val Ord: Ord_[js.Date] = js.native
  
  @JSImport("fp-ts", "date.create")
  @js.native
  val create: IO_[js.Date] = js.native
  
  @JSImport("fp-ts", "date.eqDate")
  @js.native
  val eqDate: typings.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts", "date.eqMonth")
  @js.native
  val eqMonth: typings.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts", "date.eqYear")
  @js.native
  val eqYear: typings.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts", "date.now")
  @js.native
  val now: IO_[Double] = js.native
}
