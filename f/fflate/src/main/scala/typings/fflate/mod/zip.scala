package typings.fflate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fflate", "zip")
@js.native
object zip extends js.Object {
  
  def apply(data: AsyncZippable, cb: FlateCallback): AsyncTerminable = js.native
  def apply(data: AsyncZippable, opts: AsyncZipOptions, cb: FlateCallback): AsyncTerminable = js.native
}
