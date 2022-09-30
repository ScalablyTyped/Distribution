package typings.googleCloudTasks.mod

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseLike[T]
  extends StObject
     with Promise[T] {
  
  /**
    * Cancel the ongoing promise
    */
  def cancel(): Unit = js.native
}
