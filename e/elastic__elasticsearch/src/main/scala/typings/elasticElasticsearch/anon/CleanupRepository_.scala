package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.requestParamsMod.SnapshotCleanupRepository
import typings.elasticElasticsearch.requestParamsMod.SnapshotClone
import typings.elasticElasticsearch.requestParamsMod.SnapshotCreate
import typings.elasticElasticsearch.requestParamsMod.SnapshotCreateRepository
import typings.elasticElasticsearch.requestParamsMod.SnapshotDelete
import typings.elasticElasticsearch.requestParamsMod.SnapshotDeleteRepository
import typings.elasticElasticsearch.requestParamsMod.SnapshotGet
import typings.elasticElasticsearch.requestParamsMod.SnapshotGetRepository
import typings.elasticElasticsearch.requestParamsMod.SnapshotRestore
import typings.elasticElasticsearch.requestParamsMod.SnapshotStatus
import typings.elasticElasticsearch.requestParamsMod.SnapshotVerifyRepository
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CleanupRepository_ extends StObject {
  
  def cleanupRepository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanupRepository[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanupRepository[TResponse, TContext](params: SnapshotCleanupRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanupRepository[TResponse, TContext](params: SnapshotCleanupRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SnapshotClone[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SnapshotClone[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SnapshotCreate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SnapshotCreate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SnapshotCreateRepository[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SnapshotCreateRepository[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def delete[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: SnapshotDelete): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: SnapshotDelete, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteRepository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRepository[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRepository[TResponse, TContext](params: SnapshotDeleteRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRepository[TResponse, TContext](params: SnapshotDeleteRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def get[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: SnapshotGet): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: SnapshotGet, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getRepository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRepository[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRepository[TResponse, TContext](params: SnapshotGetRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRepository[TResponse, TContext](params: SnapshotGetRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SnapshotRestore[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SnapshotRestore[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def status[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def status[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def status[TResponse, TContext](params: SnapshotStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def status[TResponse, TContext](params: SnapshotStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def verifyRepository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verifyRepository[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verifyRepository[TResponse, TContext](params: SnapshotVerifyRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verifyRepository[TResponse, TContext](params: SnapshotVerifyRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
