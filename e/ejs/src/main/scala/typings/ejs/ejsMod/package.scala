package typings.ejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ejsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type AsyncTemplateFunction = js.Function1[/* data */ js.UndefOr[Data], js.Promise[String]]
  type Data = StringDictionary[js.Any]
  type RenderFileCallback[T] = js.Function2[/* err */ Error, /* str */ js.UndefOr[String], T]
  type TemplateFunction = js.Function1[/* data */ js.UndefOr[Data], String]
}
