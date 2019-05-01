package typings
package electronDashSettingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electronDashSettingsMod {
  // tslint:disable-line no-empty-interface
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - JsonArray
    - JsonObject
  */
  type JsonValue = _JsonValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  type SettingsHandler = js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, js.Any]
}
