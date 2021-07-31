package typings.fpTs.mod

import typings.fpTs.eqMod.Eq
import typings.fpTs.iOMod.IO_
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object date {
  
  @JSImport("fp-ts", "date.create")
  @js.native
  val create: IO_[Date] = js.native
  
  @JSImport("fp-ts", "date.eqDate")
  @js.native
  val eqDate: Eq[Date] = js.native
  
  @JSImport("fp-ts", "date.eqMonth")
  @js.native
  val eqMonth: Eq[Date] = js.native
  
  @JSImport("fp-ts", "date.eqYear")
  @js.native
  val eqYear: Eq[Date] = js.native
  
  @JSImport("fp-ts", "date.now")
  @js.native
  val now: IO_[Double] = js.native
}
