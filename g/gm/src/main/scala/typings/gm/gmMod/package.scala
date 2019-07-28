package typings.gm

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gmMod {
  type CompareCallback = js.Function4[/* err */ Error, /* isEqual */ Boolean, /* equality */ Double, /* raw */ Double, js.Any]
  type GetterCallback[T] = js.Function2[/* err */ Error, /* value */ T, js.Any]
  type WriteCallback = js.Function4[/* err */ Error, /* stdout */ String, /* stderr */ String, /* cmd */ String, js.Any]
}
