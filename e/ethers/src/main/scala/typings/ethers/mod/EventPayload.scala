package typings.ethers.mod

import typings.ethers.typesUtilsEventsMod.EventEmitterable
import typings.ethers.typesUtilsEventsMod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "EventPayload")
@js.native
open class EventPayload[T] protected ()
  extends typings.ethers.typesEthersMod.EventPayload[T] {
  /**
    *  Create a new **EventPayload** for %%emitter%% with
    *  the %%listener%% and for %%filter%%.
    */
  def this(emitter: EventEmitterable[T], listener: Null, filter: T) = this()
  def this(emitter: EventEmitterable[T], listener: Listener, filter: T) = this()
}
