package typings.atEmberArray.proxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ArrayProxy wraps any other object that implements Ember.Array and/or Ember.MutableArray,
  * forwarding all requests. This makes it very useful for a number of binding use cases or other cases
  * where being able to swap out the underlying array is useful.
  */
@JSImport("@ember/array/proxy", JSImport.Default)
@js.native
class default[T] () extends ArrayProxy[T]

