package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.requestParamsMod.IndicesAddBlock
import typings.elasticElasticsearch.requestParamsMod.IndicesAnalyze
import typings.elasticElasticsearch.requestParamsMod.IndicesClearCache
import typings.elasticElasticsearch.requestParamsMod.IndicesClone
import typings.elasticElasticsearch.requestParamsMod.IndicesClose
import typings.elasticElasticsearch.requestParamsMod.IndicesCreate
import typings.elasticElasticsearch.requestParamsMod.IndicesCreateDataStream
import typings.elasticElasticsearch.requestParamsMod.IndicesDataStreamsStats
import typings.elasticElasticsearch.requestParamsMod.IndicesDelete
import typings.elasticElasticsearch.requestParamsMod.IndicesDeleteAlias
import typings.elasticElasticsearch.requestParamsMod.IndicesDeleteDataStream
import typings.elasticElasticsearch.requestParamsMod.IndicesDeleteIndexTemplate
import typings.elasticElasticsearch.requestParamsMod.IndicesDeleteTemplate
import typings.elasticElasticsearch.requestParamsMod.IndicesExists
import typings.elasticElasticsearch.requestParamsMod.IndicesExistsAlias
import typings.elasticElasticsearch.requestParamsMod.IndicesExistsIndexTemplate
import typings.elasticElasticsearch.requestParamsMod.IndicesExistsTemplate
import typings.elasticElasticsearch.requestParamsMod.IndicesExistsType
import typings.elasticElasticsearch.requestParamsMod.IndicesFlush
import typings.elasticElasticsearch.requestParamsMod.IndicesFlushSynced
import typings.elasticElasticsearch.requestParamsMod.IndicesForcemerge
import typings.elasticElasticsearch.requestParamsMod.IndicesFreeze
import typings.elasticElasticsearch.requestParamsMod.IndicesGet
import typings.elasticElasticsearch.requestParamsMod.IndicesGetAlias
import typings.elasticElasticsearch.requestParamsMod.IndicesGetDataStream
import typings.elasticElasticsearch.requestParamsMod.IndicesGetFieldMapping
import typings.elasticElasticsearch.requestParamsMod.IndicesGetIndexTemplate
import typings.elasticElasticsearch.requestParamsMod.IndicesGetMapping
import typings.elasticElasticsearch.requestParamsMod.IndicesGetSettings
import typings.elasticElasticsearch.requestParamsMod.IndicesGetTemplate
import typings.elasticElasticsearch.requestParamsMod.IndicesGetUpgrade
import typings.elasticElasticsearch.requestParamsMod.IndicesOpen
import typings.elasticElasticsearch.requestParamsMod.IndicesPutAlias
import typings.elasticElasticsearch.requestParamsMod.IndicesPutIndexTemplate
import typings.elasticElasticsearch.requestParamsMod.IndicesPutMapping
import typings.elasticElasticsearch.requestParamsMod.IndicesPutSettings
import typings.elasticElasticsearch.requestParamsMod.IndicesPutTemplate
import typings.elasticElasticsearch.requestParamsMod.IndicesRecovery
import typings.elasticElasticsearch.requestParamsMod.IndicesRefresh
import typings.elasticElasticsearch.requestParamsMod.IndicesReloadSearchAnalyzers
import typings.elasticElasticsearch.requestParamsMod.IndicesResolveIndex
import typings.elasticElasticsearch.requestParamsMod.IndicesRollover
import typings.elasticElasticsearch.requestParamsMod.IndicesSegments
import typings.elasticElasticsearch.requestParamsMod.IndicesShardStores
import typings.elasticElasticsearch.requestParamsMod.IndicesShrink
import typings.elasticElasticsearch.requestParamsMod.IndicesSimulateIndexTemplate
import typings.elasticElasticsearch.requestParamsMod.IndicesSimulateTemplate
import typings.elasticElasticsearch.requestParamsMod.IndicesSplit
import typings.elasticElasticsearch.requestParamsMod.IndicesStats
import typings.elasticElasticsearch.requestParamsMod.IndicesUnfreeze
import typings.elasticElasticsearch.requestParamsMod.IndicesUpdateAliases
import typings.elasticElasticsearch.requestParamsMod.IndicesUpgrade
import typings.elasticElasticsearch.requestParamsMod.IndicesValidateQuery
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddBlock_ extends StObject {
  
  def addBlock[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def addBlock[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def addBlock[TResponse, TContext](params: IndicesAddBlock): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def addBlock[TResponse, TContext](params: IndicesAddBlock, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def analyze[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def analyze[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def analyze[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesAnalyze[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def analyze[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesAnalyze[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def clearCache[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCache[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCache[TResponse, TContext](params: IndicesClearCache): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCache[TResponse, TContext](params: IndicesClearCache, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesClone[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesClone[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def close[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def close[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def close[TResponse, TContext](params: IndicesClose): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def close[TResponse, TContext](params: IndicesClose, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesCreate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesCreate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def createDataStream[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createDataStream[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createDataStream[TResponse, TContext](params: IndicesCreateDataStream): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createDataStream[TResponse, TContext](params: IndicesCreateDataStream, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def dataStreamsStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def dataStreamsStats[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def dataStreamsStats[TResponse, TContext](params: IndicesDataStreamsStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def dataStreamsStats[TResponse, TContext](params: IndicesDataStreamsStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def delete[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: IndicesDelete): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: IndicesDelete, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteAlias[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAlias[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAlias[TResponse, TContext](params: IndicesDeleteAlias): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAlias[TResponse, TContext](params: IndicesDeleteAlias, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteDataStream[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDataStream[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDataStream[TResponse, TContext](params: IndicesDeleteDataStream): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDataStream[TResponse, TContext](params: IndicesDeleteDataStream, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteIndexTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteIndexTemplate[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteIndexTemplate[TResponse, TContext](params: IndicesDeleteIndexTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteIndexTemplate[TResponse, TContext](params: IndicesDeleteIndexTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTemplate[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTemplate[TResponse, TContext](params: IndicesDeleteTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTemplate[TResponse, TContext](params: IndicesDeleteTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def exists[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists[TResponse, TContext](params: IndicesExists): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists[TResponse, TContext](params: IndicesExists, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def existsAlias[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsAlias[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsAlias[TResponse, TContext](params: IndicesExistsAlias): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsAlias[TResponse, TContext](params: IndicesExistsAlias, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def existsIndexTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsIndexTemplate[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsIndexTemplate[TResponse, TContext](params: IndicesExistsIndexTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsIndexTemplate[TResponse, TContext](params: IndicesExistsIndexTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def existsTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsTemplate[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsTemplate[TResponse, TContext](params: IndicesExistsTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsTemplate[TResponse, TContext](params: IndicesExistsTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def existsType[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsType[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsType[TResponse, TContext](params: IndicesExistsType): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsType[TResponse, TContext](params: IndicesExistsType, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def flush[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flush[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flush[TResponse, TContext](params: IndicesFlush): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flush[TResponse, TContext](params: IndicesFlush, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def flushSynced[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flushSynced[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flushSynced[TResponse, TContext](params: IndicesFlushSynced): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flushSynced[TResponse, TContext](params: IndicesFlushSynced, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def forcemerge[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forcemerge[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forcemerge[TResponse, TContext](params: IndicesForcemerge): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forcemerge[TResponse, TContext](params: IndicesForcemerge, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def freeze[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def freeze[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def freeze[TResponse, TContext](params: IndicesFreeze): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def freeze[TResponse, TContext](params: IndicesFreeze, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def get[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: IndicesGet): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: IndicesGet, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getAlias[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAlias[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAlias[TResponse, TContext](params: IndicesGetAlias): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAlias[TResponse, TContext](params: IndicesGetAlias, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getDataStream[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDataStream[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDataStream[TResponse, TContext](params: IndicesGetDataStream): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDataStream[TResponse, TContext](params: IndicesGetDataStream, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getFieldMapping[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getFieldMapping[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getFieldMapping[TResponse, TContext](params: IndicesGetFieldMapping): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getFieldMapping[TResponse, TContext](params: IndicesGetFieldMapping, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getIndexTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getIndexTemplate[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getIndexTemplate[TResponse, TContext](params: IndicesGetIndexTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getIndexTemplate[TResponse, TContext](params: IndicesGetIndexTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getMapping[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getMapping[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getMapping[TResponse, TContext](params: IndicesGetMapping): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getMapping[TResponse, TContext](params: IndicesGetMapping, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getSettings[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](params: IndicesGetSettings): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](params: IndicesGetSettings, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTemplate[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTemplate[TResponse, TContext](params: IndicesGetTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTemplate[TResponse, TContext](params: IndicesGetTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getUpgrade[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUpgrade[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUpgrade[TResponse, TContext](params: IndicesGetUpgrade): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUpgrade[TResponse, TContext](params: IndicesGetUpgrade, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def open[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def open[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def open[TResponse, TContext](params: IndicesOpen): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def open[TResponse, TContext](params: IndicesOpen, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putAlias[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAlias[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAlias[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesPutAlias[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAlias[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesPutAlias[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putIndexTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putIndexTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putIndexTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesPutIndexTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putIndexTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesPutIndexTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesPutMapping[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesPutMapping[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesPutSettings[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesPutSettings[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesPutTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesPutTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def recovery[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def recovery[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def recovery[TResponse, TContext](params: IndicesRecovery): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def recovery[TResponse, TContext](params: IndicesRecovery, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def refresh[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def refresh[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def refresh[TResponse, TContext](params: IndicesRefresh): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def refresh[TResponse, TContext](params: IndicesRefresh, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def reloadSearchAnalyzers[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reloadSearchAnalyzers[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reloadSearchAnalyzers[TResponse, TContext](params: IndicesReloadSearchAnalyzers): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reloadSearchAnalyzers[TResponse, TContext](params: IndicesReloadSearchAnalyzers, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def resolveIndex[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resolveIndex[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resolveIndex[TResponse, TContext](params: IndicesResolveIndex): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resolveIndex[TResponse, TContext](params: IndicesResolveIndex, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def rollover[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollover[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollover[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesRollover[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollover[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesRollover[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def segments[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def segments[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def segments[TResponse, TContext](params: IndicesSegments): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def segments[TResponse, TContext](params: IndicesSegments, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def shardStores[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def shardStores[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def shardStores[TResponse, TContext](params: IndicesShardStores): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def shardStores[TResponse, TContext](params: IndicesShardStores, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def shrink[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def shrink[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def shrink[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesShrink[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def shrink[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesShrink[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def simulateIndexTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulateIndexTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulateIndexTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesSimulateIndexTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulateIndexTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesSimulateIndexTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def simulateTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulateTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulateTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesSimulateTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulateTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesSimulateTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def split[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def split[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def split[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesSplit[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def split[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesSplit[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: IndicesStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: IndicesStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def unfreeze[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfreeze[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfreeze[TResponse, TContext](params: IndicesUnfreeze): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfreeze[TResponse, TContext](params: IndicesUnfreeze, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def updateAliases[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateAliases[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateAliases[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesUpdateAliases[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateAliases[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesUpdateAliases[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def upgrade[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def upgrade[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def upgrade[TResponse, TContext](params: IndicesUpgrade): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def upgrade[TResponse, TContext](params: IndicesUpgrade, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def validateQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validateQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validateQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesValidateQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validateQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: IndicesValidateQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
