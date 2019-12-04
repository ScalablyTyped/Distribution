package typings.atEmberArray

import typings.atEmberArray.mutableMod.MutableArray
import typings.atEmberObject.dashPrivateCopyableMod.Copyable
import typings.atEmberObject.observableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/array/types/prototype-extensions", JSImport.Namespace)
@js.native
object typesPrototypeDashExtensionsMod extends js.Object {
  @js.native
  trait ArrayPrototypeExtensions[T]
    extends MutableArray[T]
       with Observable
       with Copyable
  
}

