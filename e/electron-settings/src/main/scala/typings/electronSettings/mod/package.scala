package typings.electronSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // tslint:disable-line no-empty-interface
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - typings.electronSettings.mod.JsonArray
    - typings.electronSettings.mod.JsonObject
  */
  type JsonValue = typings.electronSettings.mod._JsonValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  type SettingsHandler = js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, js.Any]
}
