package typings
package ejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ejsMod {
  type AsyncTemplateFunction = js.Function1[/* data */ js.UndefOr[Data], stdLib.Promise[java.lang.String]]
  type RenderFileCallback[T] = js.Function2[/* err */ stdLib.Error, /* str */ js.UndefOr[java.lang.String], T]
  type TemplateFunction = js.Function1[/* data */ js.UndefOr[Data], java.lang.String]
}
