package typings.fullcalendar

import typings.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Promise", JSImport.Namespace)
@js.native
object promiseMod extends js.Object {
  @js.native
  object default extends js.Object {
    def construct(executor: js.Any): JQueryPromise[js.Object] = js.native
    def reject(): JQueryPromise[js.Object] = js.native
    def resolve(`val`: js.Any): JQueryPromise[js.Object] = js.native
  }
  
}

