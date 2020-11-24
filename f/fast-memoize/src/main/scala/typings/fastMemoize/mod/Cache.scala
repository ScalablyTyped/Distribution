package typings.fastMemoize.mod

import typings.fastMemoize.anon.Get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache[K, V] extends js.Object {
  
  def create(): Get[K, V] = js.native
  @JSName("create")
  var create_Original: CacheCreateFunc[K, V] = js.native
}
