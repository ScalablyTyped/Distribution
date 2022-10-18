package typings.elasticElasticsearch.libHelpersMod

import typings.elasticElasticsearch.libApiTypesMod.MsearchMultisearchBody
import typings.elasticElasticsearch.libApiTypesMod.MsearchMultisearchHeader
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MsearchHelper
  extends StObject
     with Promise[Unit] {
  
  def search[TDocument](header: MsearchMultisearchHeader, body: MsearchMultisearchBody): js.Promise[MsearchHelperResponse[TDocument]] = js.native
  
  def stop(): Unit = js.native
  def stop(error: js.Error): Unit = js.native
}
