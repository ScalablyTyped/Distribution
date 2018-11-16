package typings
package fastDashGlobLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outManagersOptionsMod {
  type IPartialOptions[T] = stdLib.Partial[IOptions[T]]
  type TransformFunction[T] = js.Function1[/* entry */ fastDashGlobLib.outTypesEntriesMod.EntryItem, T]
}
