package typings.getpass

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object getpassMod {
  type Callback = js.Function2[/* error */ Error | Null, /* password */ String, Unit]
}
