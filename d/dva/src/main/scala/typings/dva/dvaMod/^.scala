package typings.dva.dvaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dva", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(): js.Function = js.native
  def connect(mapStateToProps: js.Function): js.Function = js.native
  def connect(mapStateToProps: js.Function, mapDispatchToProps: js.Function): js.Function = js.native
  def connect(mapStateToProps: js.Function, mapDispatchToProps: js.Function, mergeProps: js.Function): js.Function = js.native
  def connect(
    mapStateToProps: js.Function,
    mapDispatchToProps: js.Function,
    mergeProps: js.Function,
    options: js.Object
  ): js.Function = js.native
  def default(): DvaInstance = js.native
  def default(opts: DvaOption): DvaInstance = js.native
}

