package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electronDashSettingsLib {
  // tslint:disable-line no-empty-interface
  type JsonValue = java.lang.String | scala.Double | scala.Boolean | scala.Null | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JsonArray */ js.Any)
  type SettingsHandler = js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, js.Any]
}
