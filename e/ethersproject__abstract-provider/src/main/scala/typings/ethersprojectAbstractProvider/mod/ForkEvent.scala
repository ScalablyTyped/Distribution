package typings.ethersprojectAbstractProvider.mod

import typings.ethersprojectProperties.mod.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abstract-provider", "ForkEvent")
@js.native
abstract class ForkEvent ()
  extends Description[js.Any]
     with _EventType {
  
  val _isForkEvent: js.UndefOr[Boolean] = js.native
  
  val expiry: Double = js.native
}
/* static members */
@JSImport("@ethersproject/abstract-provider", "ForkEvent")
@js.native
object ForkEvent extends js.Object {
  
  def isForkEvent(value: js.Any): /* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.ForkEvent */ Boolean = js.native
}
