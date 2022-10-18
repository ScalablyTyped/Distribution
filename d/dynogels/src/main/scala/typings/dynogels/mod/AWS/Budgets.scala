package typings.dynogels.mod.AWS

import typings.awsSdk.clientsBudgetsMod.Budget
import typings.awsSdk.clientsBudgetsMod.ClientConfiguration
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynogels", "AWS.Budgets")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class Budgets ()
  extends StObject
     with Array[Budget] {
  def this(options: ClientConfiguration) = this()
}
