package typings.flux.fluxStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents the most basic functionality for a FluxStore. Do not
  * extend this store directly; instead extend FluxReduceStore when creating a
  * new store.
  */
@JSImport("flux/lib/FluxStore", JSImport.Namespace)
@js.native
abstract class ^[TPayload] protected () extends FluxStore[TPayload] {
  /**
    * Constructs and registers an instance of this store with the given dispatcher.
    */
  def this(dispatcher: typings.flux.dispatcherMod.^[TPayload]) = this()
}
