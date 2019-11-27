package typings.ember.emberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Ember {
  import typings.ember.emberMod.EmberArray

  type Array[T] = EmberArray[T]
  type ArrayPrototypeExtensions[T] = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EmberArrayProtoExtensions<T> */ js.Any
  type Enumerable[T] = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EmberEnumerable<T> */ js.Any
  type MutableArray[T] = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EmberMutableArray<T> */ js.Any
  type MutableEnumerable[T] = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EmberMutableEnumerable<T> */ js.Any
  type NativeArray[T] = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EmberNativeArray<T> */ js.Any
}
