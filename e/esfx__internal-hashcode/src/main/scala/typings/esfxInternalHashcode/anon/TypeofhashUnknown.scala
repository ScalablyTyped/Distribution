package typings.esfxInternalHashcode.anon

import typings.std.Partial
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofhashUnknown extends js.Object {
  def getState(): BigIntSeed
  @JSName("setState")
  def setState_getState(
    state: Partial[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof hashUnknown['getState'] */ js.Any
      ]
    ]
  ): Unit
}

object TypeofhashUnknown {
  @scala.inline
  def apply(
    getState: () => BigIntSeed,
    setState: Partial[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof hashUnknown['getState'] */ js.Any
      ]
    ] => Unit
  ): TypeofhashUnknown = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[TypeofhashUnknown]
  }
}

