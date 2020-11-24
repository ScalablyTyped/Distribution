package typings.elasticElasticsearch.helpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkHelper[T]
  extends js.Promise[T] {
  
  def abort(): BulkHelper[T] = js.native
}
