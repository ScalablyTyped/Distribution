package typings.fastDashCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcFormatterFormatterRowFormatterMod {
  import typings.std.Error

  type RowFormatterCallback = js.Function2[/* error */ Error | Null, /* data */ js.UndefOr[js.Array[String]], Unit]
}
