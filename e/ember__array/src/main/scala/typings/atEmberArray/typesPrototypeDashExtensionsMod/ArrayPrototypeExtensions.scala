package typings.atEmberArray.typesPrototypeDashExtensionsMod

import typings.atEmberArray.mutableMod.MutableArray
import typings.atEmberObject.dashPrivateCopyableMod.Copyable
import typings.atEmberObject.observableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayPrototypeExtensions[T]
  extends MutableArray[T]
     with Observable
     with Copyable

