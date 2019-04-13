package typings
package fluxLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the basic building block of a Flux application. All of your stores
  * should extend this class.
  */
@JSImport("flux/utils", "ReduceStore")
@js.native
abstract class ReduceStore[TState, TPayload] ()
  extends fluxLib.libFluxReduceStoreMod.^[TState, TPayload]

