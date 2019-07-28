package typings.fastq

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fastqMod {
  type done = js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  type worker[T] = js.ThisFunction2[/* this */ T, /* arg */ js.Any, /* cb */ js.Function0[Unit], Unit]
}
