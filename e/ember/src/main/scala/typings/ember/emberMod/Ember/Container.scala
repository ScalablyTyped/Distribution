package typings.ember.emberMod.Ember

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A container used to instantiate and cache objects.
  */
@JSImport("ember", "Ember.Container")
@js.native
class Container () extends js.Object {
  /**
    * Given a fullName, return the corresponding factory. The consumer of the factory
    * is responsible for the destruction of any factory instances, as there is no
    * way for the container to ensure instances are destroyed when it itself is
    * destroyed.
    */
  def factoryFor(fullName: String): js.Any = js.native
  def factoryFor(fullName: String, options: js.Object): js.Any = js.native
}

