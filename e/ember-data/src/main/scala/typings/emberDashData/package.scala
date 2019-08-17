package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emberDashData {
  import typings.std.Exclude

  /**
    The keys from the actual Model class, removing all the keys which come from
    the base class.
    */
  type ModelKeys[Model /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DS.Model */ js.Any */] = Exclude[String, String]
}
