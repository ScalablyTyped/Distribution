package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.requestParamsMod.DanglingIndicesDeleteDanglingIndex
import typings.elasticElasticsearch.requestParamsMod.DanglingIndicesImportDanglingIndex
import typings.elasticElasticsearch.requestParamsMod.DanglingIndicesListDanglingIndices
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDanglingIndex_ extends StObject {
  
  def deleteDanglingIndex[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDanglingIndex[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDanglingIndex[TResponse, TContext](params: DanglingIndicesDeleteDanglingIndex): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDanglingIndex[TResponse, TContext](params: DanglingIndicesDeleteDanglingIndex, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def importDanglingIndex[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def importDanglingIndex[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def importDanglingIndex[TResponse, TContext](params: DanglingIndicesImportDanglingIndex): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def importDanglingIndex[TResponse, TContext](params: DanglingIndicesImportDanglingIndex, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def listDanglingIndices[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def listDanglingIndices[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def listDanglingIndices[TResponse, TContext](params: DanglingIndicesListDanglingIndices): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def listDanglingIndices[TResponse, TContext](params: DanglingIndicesListDanglingIndices, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
