package typings.fastq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type done = js.Function2[/* err */ typings.std.Error, /* result */ js.Any, scala.Unit]
  type worker[T] = js.ThisFunction2[/* this */ T, /* arg */ js.Any, /* cb */ js.Function0[scala.Unit], scala.Unit]
}
