package typings.expect.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expect/build/utils", "partition")
@js.native
object partition extends js.Object {
  
  def apply[T](items: js.Array[T], predicate: js.Function1[/* arg */ T, Boolean]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
}
