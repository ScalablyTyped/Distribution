package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.requestParamsMod.XpackInfo
import typings.elasticElasticsearch.requestParamsMod.XpackUsage
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Info extends StObject {
  
  def info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: XpackInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: XpackInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def usage[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def usage[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def usage[TResponse, TContext](params: XpackUsage): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def usage[TResponse, TContext](params: XpackUsage, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
