package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityEventsTransactionEventMod {
  
  @JSImport("epcis2.js/entity/events/TransactionEvent", JSImport.Default)
  @js.native
  open class default () extends TransactionEvent
  
  @js.native
  trait TransactionEvent
    extends typings.epcis2Js.entityEventsEventMod.default {
    
    var `type`: String = js.native
  }
}
