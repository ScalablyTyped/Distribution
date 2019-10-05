package typings.ember.emberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Ember {
  import typings.ember.emberMod.EmberArray

  type Array[T] = EmberArray[T]
  type ArrayPrototypeExtensions[T] = typings.atEmberArray.typesPrototypeDashExtensionsMod.ArrayPrototypeExtensions[T]
  type Enumerable[T] = typings.atEmberArray.dashPrivateEnumerableMod.Enumerable[T]
  type MutableArray[T] = typings.atEmberArray.mutableMod.MutableArray[T]
  type MutableEnumerable[T] = typings.atEmberArray.dashPrivateMutableDashEnumerableMod.MutableEnumerable[T]
  type NativeArray[T] = typings.atEmberArray.dashPrivateNativeDashArrayMod.NativeArray[T]
}
