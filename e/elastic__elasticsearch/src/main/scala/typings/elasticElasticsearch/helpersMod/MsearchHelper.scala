package typings.elasticElasticsearch.helpersMod

import org.scalablytyped.runtime.TopLevel
import typings.elasticElasticsearch.anon.OmitSearchRequestBodyReco
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MsearchHelper
  extends js.Promise[Unit] {
  
  def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: String): js.Promise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: String, callback: callbackFn[TResponse, TContext]): Unit = js.native
  def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: Buffer): js.Promise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: Buffer, callback: callbackFn[TResponse, TContext]): Unit = js.native
  def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: Readable): js.Promise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: Readable, callback: callbackFn[TResponse, TContext]): Unit = js.native
  def search[TResponse, TRequestBody /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.elasticElasticsearch.elasticElasticsearchStrings.MsearchHelper with TopLevel[js.Any] */, TContext](header: OmitSearchRequestBodyReco, body: TRequestBody): js.Promise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TRequestBody /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.elasticElasticsearch.elasticElasticsearchStrings.MsearchHelper with TopLevel[js.Any] */, TContext](header: OmitSearchRequestBodyReco, body: TRequestBody, callback: callbackFn[TResponse, TContext]): Unit = js.native
  
  def stop(): Unit = js.native
  def stop(error: Error): Unit = js.native
}
