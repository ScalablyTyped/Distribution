package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initializer is information about an initializer that has not yet completed.
  */
@js.native
trait Schema$Initializer extends js.Object {
  /**
    * name of the process that is responsible for initializing this object.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$Initializer {
  @scala.inline
  def apply(name: String = null): Schema$Initializer = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Initializer]
  }
}

