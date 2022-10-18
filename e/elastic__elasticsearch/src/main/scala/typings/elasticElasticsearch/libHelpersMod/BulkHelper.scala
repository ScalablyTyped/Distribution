package typings.elasticElasticsearch.libHelpersMod

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkHelper[T]
  extends StObject
     with Promise[BulkStats] {
  
  def abort(): BulkHelper[T] = js.native
  
  val stats: BulkStats = js.native
}
