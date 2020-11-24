package typings.fastq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type done[R] = js.Function2[/* err */ typings.std.Error | scala.Null, /* result */ js.UndefOr[R], scala.Unit]
  
  type errorHandler[T] = js.Function2[/* err */ typings.std.Error, /* task */ T, scala.Unit]
  
  type worker[C, T, R] = js.ThisFunction2[/* this */ C, /* task */ T, /* cb */ typings.fastq.mod.done[R], scala.Unit]
}
