package typings.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/WorkSet", JSImport.Namespace)
@js.native
object workSetMod extends js.Object {
  @js.native
  class WorkSet[T] protected () extends js.Object {
    def this(workDomain: js.Array[T], workNumber: Double, workDivision: Double) = this()
    var workBegin: js.Any = js.native
    var workDivision: js.Any = js.native
    var workDomain: js.Any = js.native
    var workEnd: js.Any = js.native
    var workNumber: js.Any = js.native
    var workSize: js.Any = js.native
    def forEach(callback: js.Function2[/* workDomainItem */ T, /* index */ Double, Unit]): Unit = js.native
  }
  
}

