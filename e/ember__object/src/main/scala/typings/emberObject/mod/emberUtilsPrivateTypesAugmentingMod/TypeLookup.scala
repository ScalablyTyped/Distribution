package typings.emberObject.mod.emberUtilsPrivateTypesAugmentingMod

import org.scalablytyped.runtime.Instantiable0
import typings.emberObject.mod.EmberObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeLookup extends js.Object {
  var `class`: Instantiable0[EmberObject]
  var instance: EmberObject
}

object TypeLookup {
  @scala.inline
  def apply(`class`: Instantiable0[EmberObject], instance: EmberObject): TypeLookup = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeLookup]
  }
}

