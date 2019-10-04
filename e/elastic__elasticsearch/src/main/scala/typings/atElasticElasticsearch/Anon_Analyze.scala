package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesAnalyze
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesClearCache
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesClone
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesClose
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesCreate
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesDelete
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesDeleteAlias
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesDeleteTemplate
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesExists
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesExistsAlias
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesExistsTemplate
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesExistsType
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesFlush
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesFlushSynced
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesForcemerge
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesFreeze
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesGet
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesGetAlias
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesGetFieldMapping
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesGetMapping
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesGetSettings
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesGetTemplate
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesGetUpgrade
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesOpen
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesPutAlias
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesPutMapping
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesPutSettings
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesPutTemplate
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesRecovery
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesRefresh
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesReloadSearchAnalyzers
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesRollover
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesSegments
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesShardStores
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesShrink
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesSplit
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesStats
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesUnfreeze
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesUpdateAliases
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesUpgrade
import typings.atElasticElasticsearch.apiRequestParamsMod.IndicesValidateQuery
import typings.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typings.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import typings.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Analyze extends js.Object {
  @JSName("analyze")
  var analyze_Original: ApiMethod[IndicesAnalyze[_], _] = js.native
  @JSName("clearCache")
  var clearCache_Original: ApiMethod[IndicesClearCache, _] = js.native
  @JSName("clear_cache")
  var clear_cache_Original: ApiMethod[IndicesClearCache, _] = js.native
  @JSName("clone")
  var clone_Original: ApiMethod[IndicesClone[_], _] = js.native
  @JSName("close")
  var close_Original: ApiMethod[IndicesClose, _] = js.native
  @JSName("create")
  var create_Original: ApiMethod[IndicesCreate[_], _] = js.native
  @JSName("deleteAlias")
  var deleteAlias_Original: ApiMethod[IndicesDeleteAlias, _] = js.native
  @JSName("deleteTemplate")
  var deleteTemplate_Original: ApiMethod[IndicesDeleteTemplate, _] = js.native
  @JSName("delete")
  var delete_Original: ApiMethod[IndicesDelete, _] = js.native
  @JSName("delete_alias")
  var delete_alias_Original: ApiMethod[IndicesDeleteAlias, _] = js.native
  @JSName("delete_template")
  var delete_template_Original: ApiMethod[IndicesDeleteTemplate, _] = js.native
  @JSName("existsAlias")
  var existsAlias_Original: ApiMethod[IndicesExistsAlias, _] = js.native
  @JSName("existsTemplate")
  var existsTemplate_Original: ApiMethod[IndicesExistsTemplate, _] = js.native
  @JSName("existsType")
  var existsType_Original: ApiMethod[IndicesExistsType, _] = js.native
  @JSName("exists")
  var exists_Original: ApiMethod[IndicesExists, _] = js.native
  @JSName("exists_alias")
  var exists_alias_Original: ApiMethod[IndicesExistsAlias, _] = js.native
  @JSName("exists_template")
  var exists_template_Original: ApiMethod[IndicesExistsTemplate, _] = js.native
  @JSName("exists_type")
  var exists_type_Original: ApiMethod[IndicesExistsType, _] = js.native
  @JSName("flushSynced")
  var flushSynced_Original: ApiMethod[IndicesFlushSynced, _] = js.native
  @JSName("flush")
  var flush_Original: ApiMethod[IndicesFlush, _] = js.native
  @JSName("flush_synced")
  var flush_synced_Original: ApiMethod[IndicesFlushSynced, _] = js.native
  @JSName("forcemerge")
  var forcemerge_Original: ApiMethod[IndicesForcemerge, _] = js.native
  @JSName("freeze")
  var freeze_Original: ApiMethod[IndicesFreeze, _] = js.native
  @JSName("getAlias")
  var getAlias_Original: ApiMethod[IndicesGetAlias, _] = js.native
  @JSName("getFieldMapping")
  var getFieldMapping_Original: ApiMethod[IndicesGetFieldMapping, _] = js.native
  @JSName("getMapping")
  var getMapping_Original: ApiMethod[IndicesGetMapping, _] = js.native
  @JSName("getSettings")
  var getSettings_Original: ApiMethod[IndicesGetSettings, _] = js.native
  @JSName("getTemplate")
  var getTemplate_Original: ApiMethod[IndicesGetTemplate, _] = js.native
  @JSName("getUpgrade")
  var getUpgrade_Original: ApiMethod[IndicesGetUpgrade, _] = js.native
  @JSName("get")
  var get_Original: ApiMethod[IndicesGet, _] = js.native
  @JSName("get_alias")
  var get_alias_Original: ApiMethod[IndicesGetAlias, _] = js.native
  @JSName("get_field_mapping")
  var get_field_mapping_Original: ApiMethod[IndicesGetFieldMapping, _] = js.native
  @JSName("get_mapping")
  var get_mapping_Original: ApiMethod[IndicesGetMapping, _] = js.native
  @JSName("get_settings")
  var get_settings_Original: ApiMethod[IndicesGetSettings, _] = js.native
  @JSName("get_template")
  var get_template_Original: ApiMethod[IndicesGetTemplate, _] = js.native
  @JSName("get_upgrade")
  var get_upgrade_Original: ApiMethod[IndicesGetUpgrade, _] = js.native
  @JSName("open")
  var open_Original: ApiMethod[IndicesOpen, _] = js.native
  @JSName("putAlias")
  var putAlias_Original: ApiMethod[IndicesPutAlias[_], _] = js.native
  @JSName("putMapping")
  var putMapping_Original: ApiMethod[IndicesPutMapping[_], _] = js.native
  @JSName("putSettings")
  var putSettings_Original: ApiMethod[IndicesPutSettings[_], _] = js.native
  @JSName("putTemplate")
  var putTemplate_Original: ApiMethod[IndicesPutTemplate[_], _] = js.native
  @JSName("put_alias")
  var put_alias_Original: ApiMethod[IndicesPutAlias[_], _] = js.native
  @JSName("put_mapping")
  var put_mapping_Original: ApiMethod[IndicesPutMapping[_], _] = js.native
  @JSName("put_settings")
  var put_settings_Original: ApiMethod[IndicesPutSettings[_], _] = js.native
  @JSName("put_template")
  var put_template_Original: ApiMethod[IndicesPutTemplate[_], _] = js.native
  @JSName("recovery")
  var recovery_Original: ApiMethod[IndicesRecovery, _] = js.native
  @JSName("refresh")
  var refresh_Original: ApiMethod[IndicesRefresh, _] = js.native
  @JSName("reloadSearchAnalyzers")
  var reloadSearchAnalyzers_Original: ApiMethod[IndicesReloadSearchAnalyzers, _] = js.native
  @JSName("reload_search_analyzers")
  var reload_search_analyzers_Original: ApiMethod[IndicesReloadSearchAnalyzers, _] = js.native
  @JSName("rollover")
  var rollover_Original: ApiMethod[IndicesRollover[_], _] = js.native
  @JSName("segments")
  var segments_Original: ApiMethod[IndicesSegments, _] = js.native
  @JSName("shardStores")
  var shardStores_Original: ApiMethod[IndicesShardStores, _] = js.native
  @JSName("shard_stores")
  var shard_stores_Original: ApiMethod[IndicesShardStores, _] = js.native
  @JSName("shrink")
  var shrink_Original: ApiMethod[IndicesShrink[_], _] = js.native
  @JSName("split")
  var split_Original: ApiMethod[IndicesSplit[_], _] = js.native
  @JSName("stats")
  var stats_Original: ApiMethod[IndicesStats, _] = js.native
  @JSName("unfreeze")
  var unfreeze_Original: ApiMethod[IndicesUnfreeze, _] = js.native
  @JSName("updateAliases")
  var updateAliases_Original: ApiMethod[IndicesUpdateAliases[_], _] = js.native
  @JSName("update_aliases")
  var update_aliases_Original: ApiMethod[IndicesUpdateAliases[_], _] = js.native
  @JSName("upgrade")
  var upgrade_Original: ApiMethod[IndicesUpgrade, _] = js.native
  @JSName("validateQuery")
  var validateQuery_Original: ApiMethod[IndicesValidateQuery[_], _] = js.native
  @JSName("validate_query")
  var validate_query_Original: ApiMethod[IndicesValidateQuery[_], _] = js.native
  // Promise API
  def analyze(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def analyze(callback: callbackFn[_]): TransportRequestCallback = js.native
  def analyze(params: IndicesAnalyze[_]): js.Promise[ApiResponse[_, _]] = js.native
  def analyze(params: IndicesAnalyze[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def analyze(params: IndicesAnalyze[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def analyze(params: IndicesAnalyze[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def clearCache(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def clearCache(callback: callbackFn[_]): TransportRequestCallback = js.native
  def clearCache(params: IndicesClearCache): js.Promise[ApiResponse[_, _]] = js.native
  def clearCache(params: IndicesClearCache, callback: callbackFn[_]): TransportRequestCallback = js.native
  def clearCache(params: IndicesClearCache, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def clearCache(params: IndicesClearCache, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def clear_cache(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def clear_cache(callback: callbackFn[_]): TransportRequestCallback = js.native
  def clear_cache(params: IndicesClearCache): js.Promise[ApiResponse[_, _]] = js.native
  def clear_cache(params: IndicesClearCache, callback: callbackFn[_]): TransportRequestCallback = js.native
  def clear_cache(params: IndicesClearCache, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def clear_cache(params: IndicesClearCache, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Callback API
  def clone(callback: callbackFn[_]): TransportRequestCallback = js.native
  def clone(params: IndicesClone[_]): js.Promise[ApiResponse[_, _]] = js.native
  def clone(params: IndicesClone[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def clone(params: IndicesClone[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def clone(params: IndicesClone[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def close(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def close(callback: callbackFn[_]): TransportRequestCallback = js.native
  def close(params: IndicesClose): js.Promise[ApiResponse[_, _]] = js.native
  def close(params: IndicesClose, callback: callbackFn[_]): TransportRequestCallback = js.native
  def close(params: IndicesClose, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def close(params: IndicesClose, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def create(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def create(callback: callbackFn[_]): TransportRequestCallback = js.native
  def create(params: IndicesCreate[_]): js.Promise[ApiResponse[_, _]] = js.native
  def create(params: IndicesCreate[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def create(params: IndicesCreate[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def create(params: IndicesCreate[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete(params: IndicesDelete): js.Promise[ApiResponse[_, _]] = js.native
  def delete(params: IndicesDelete, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete(params: IndicesDelete, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete(params: IndicesDelete, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteAlias(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteAlias(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteAlias(params: IndicesDeleteAlias): js.Promise[ApiResponse[_, _]] = js.native
  def deleteAlias(params: IndicesDeleteAlias, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteAlias(params: IndicesDeleteAlias, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteAlias(params: IndicesDeleteAlias, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteTemplate(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteTemplate(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteTemplate(params: IndicesDeleteTemplate): js.Promise[ApiResponse[_, _]] = js.native
  def deleteTemplate(params: IndicesDeleteTemplate, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteTemplate(params: IndicesDeleteTemplate, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteTemplate(params: IndicesDeleteTemplate, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_alias(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_alias(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_alias(params: IndicesDeleteAlias): js.Promise[ApiResponse[_, _]] = js.native
  def delete_alias(params: IndicesDeleteAlias, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_alias(params: IndicesDeleteAlias, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_alias(params: IndicesDeleteAlias, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_template(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_template(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_template(params: IndicesDeleteTemplate): js.Promise[ApiResponse[_, _]] = js.native
  def delete_template(params: IndicesDeleteTemplate, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_template(params: IndicesDeleteTemplate, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_template(params: IndicesDeleteTemplate, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def exists(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def exists(callback: callbackFn[_]): TransportRequestCallback = js.native
  def exists(params: IndicesExists): js.Promise[ApiResponse[_, _]] = js.native
  def exists(params: IndicesExists, callback: callbackFn[_]): TransportRequestCallback = js.native
  def exists(params: IndicesExists, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def exists(params: IndicesExists, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def existsAlias(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def existsAlias(callback: callbackFn[_]): TransportRequestCallback = js.native
  def existsAlias(params: IndicesExistsAlias): js.Promise[ApiResponse[_, _]] = js.native
  def existsAlias(params: IndicesExistsAlias, callback: callbackFn[_]): TransportRequestCallback = js.native
  def existsAlias(params: IndicesExistsAlias, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def existsAlias(params: IndicesExistsAlias, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def existsTemplate(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def existsTemplate(callback: callbackFn[_]): TransportRequestCallback = js.native
  def existsTemplate(params: IndicesExistsTemplate): js.Promise[ApiResponse[_, _]] = js.native
  def existsTemplate(params: IndicesExistsTemplate, callback: callbackFn[_]): TransportRequestCallback = js.native
  def existsTemplate(params: IndicesExistsTemplate, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def existsTemplate(params: IndicesExistsTemplate, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def existsType(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def existsType(callback: callbackFn[_]): TransportRequestCallback = js.native
  def existsType(params: IndicesExistsType): js.Promise[ApiResponse[_, _]] = js.native
  def existsType(params: IndicesExistsType, callback: callbackFn[_]): TransportRequestCallback = js.native
  def existsType(params: IndicesExistsType, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def existsType(params: IndicesExistsType, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def exists_alias(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def exists_alias(callback: callbackFn[_]): TransportRequestCallback = js.native
  def exists_alias(params: IndicesExistsAlias): js.Promise[ApiResponse[_, _]] = js.native
  def exists_alias(params: IndicesExistsAlias, callback: callbackFn[_]): TransportRequestCallback = js.native
  def exists_alias(params: IndicesExistsAlias, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def exists_alias(params: IndicesExistsAlias, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def exists_template(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def exists_template(callback: callbackFn[_]): TransportRequestCallback = js.native
  def exists_template(params: IndicesExistsTemplate): js.Promise[ApiResponse[_, _]] = js.native
  def exists_template(params: IndicesExistsTemplate, callback: callbackFn[_]): TransportRequestCallback = js.native
  def exists_template(params: IndicesExistsTemplate, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def exists_template(params: IndicesExistsTemplate, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def exists_type(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def exists_type(callback: callbackFn[_]): TransportRequestCallback = js.native
  def exists_type(params: IndicesExistsType): js.Promise[ApiResponse[_, _]] = js.native
  def exists_type(params: IndicesExistsType, callback: callbackFn[_]): TransportRequestCallback = js.native
  def exists_type(params: IndicesExistsType, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def exists_type(params: IndicesExistsType, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def flush(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def flush(callback: callbackFn[_]): TransportRequestCallback = js.native
  def flush(params: IndicesFlush): js.Promise[ApiResponse[_, _]] = js.native
  def flush(params: IndicesFlush, callback: callbackFn[_]): TransportRequestCallback = js.native
  def flush(params: IndicesFlush, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def flush(params: IndicesFlush, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def flushSynced(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def flushSynced(callback: callbackFn[_]): TransportRequestCallback = js.native
  def flushSynced(params: IndicesFlushSynced): js.Promise[ApiResponse[_, _]] = js.native
  def flushSynced(params: IndicesFlushSynced, callback: callbackFn[_]): TransportRequestCallback = js.native
  def flushSynced(params: IndicesFlushSynced, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def flushSynced(params: IndicesFlushSynced, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def flush_synced(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def flush_synced(callback: callbackFn[_]): TransportRequestCallback = js.native
  def flush_synced(params: IndicesFlushSynced): js.Promise[ApiResponse[_, _]] = js.native
  def flush_synced(params: IndicesFlushSynced, callback: callbackFn[_]): TransportRequestCallback = js.native
  def flush_synced(params: IndicesFlushSynced, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def flush_synced(params: IndicesFlushSynced, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def forcemerge(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def forcemerge(callback: callbackFn[_]): TransportRequestCallback = js.native
  def forcemerge(params: IndicesForcemerge): js.Promise[ApiResponse[_, _]] = js.native
  def forcemerge(params: IndicesForcemerge, callback: callbackFn[_]): TransportRequestCallback = js.native
  def forcemerge(params: IndicesForcemerge, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def forcemerge(params: IndicesForcemerge, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def freeze(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def freeze(callback: callbackFn[_]): TransportRequestCallback = js.native
  def freeze(params: IndicesFreeze): js.Promise[ApiResponse[_, _]] = js.native
  def freeze(params: IndicesFreeze, callback: callbackFn[_]): TransportRequestCallback = js.native
  def freeze(params: IndicesFreeze, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def freeze(params: IndicesFreeze, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get(params: IndicesGet): js.Promise[ApiResponse[_, _]] = js.native
  def get(params: IndicesGet, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get(params: IndicesGet, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get(params: IndicesGet, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getAlias(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getAlias(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getAlias(params: IndicesGetAlias): js.Promise[ApiResponse[_, _]] = js.native
  def getAlias(params: IndicesGetAlias, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getAlias(params: IndicesGetAlias, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getAlias(params: IndicesGetAlias, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getFieldMapping(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getFieldMapping(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getFieldMapping(params: IndicesGetFieldMapping): js.Promise[ApiResponse[_, _]] = js.native
  def getFieldMapping(params: IndicesGetFieldMapping, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getFieldMapping(params: IndicesGetFieldMapping, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getFieldMapping(params: IndicesGetFieldMapping, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getMapping(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getMapping(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getMapping(params: IndicesGetMapping): js.Promise[ApiResponse[_, _]] = js.native
  def getMapping(params: IndicesGetMapping, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getMapping(params: IndicesGetMapping, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getMapping(params: IndicesGetMapping, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getSettings(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getSettings(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getSettings(params: IndicesGetSettings): js.Promise[ApiResponse[_, _]] = js.native
  def getSettings(params: IndicesGetSettings, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getSettings(params: IndicesGetSettings, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getSettings(params: IndicesGetSettings, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getTemplate(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getTemplate(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getTemplate(params: IndicesGetTemplate): js.Promise[ApiResponse[_, _]] = js.native
  def getTemplate(params: IndicesGetTemplate, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getTemplate(params: IndicesGetTemplate, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getTemplate(params: IndicesGetTemplate, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getUpgrade(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getUpgrade(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getUpgrade(params: IndicesGetUpgrade): js.Promise[ApiResponse[_, _]] = js.native
  def getUpgrade(params: IndicesGetUpgrade, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getUpgrade(params: IndicesGetUpgrade, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getUpgrade(params: IndicesGetUpgrade, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_alias(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_alias(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_alias(params: IndicesGetAlias): js.Promise[ApiResponse[_, _]] = js.native
  def get_alias(params: IndicesGetAlias, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_alias(params: IndicesGetAlias, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_alias(params: IndicesGetAlias, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_field_mapping(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_field_mapping(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_field_mapping(params: IndicesGetFieldMapping): js.Promise[ApiResponse[_, _]] = js.native
  def get_field_mapping(params: IndicesGetFieldMapping, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_field_mapping(params: IndicesGetFieldMapping, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_field_mapping(params: IndicesGetFieldMapping, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_mapping(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_mapping(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_mapping(params: IndicesGetMapping): js.Promise[ApiResponse[_, _]] = js.native
  def get_mapping(params: IndicesGetMapping, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_mapping(params: IndicesGetMapping, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_mapping(params: IndicesGetMapping, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_settings(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_settings(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_settings(params: IndicesGetSettings): js.Promise[ApiResponse[_, _]] = js.native
  def get_settings(params: IndicesGetSettings, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_settings(params: IndicesGetSettings, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_settings(params: IndicesGetSettings, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_template(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_template(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_template(params: IndicesGetTemplate): js.Promise[ApiResponse[_, _]] = js.native
  def get_template(params: IndicesGetTemplate, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_template(params: IndicesGetTemplate, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_template(params: IndicesGetTemplate, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_upgrade(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_upgrade(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_upgrade(params: IndicesGetUpgrade): js.Promise[ApiResponse[_, _]] = js.native
  def get_upgrade(params: IndicesGetUpgrade, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_upgrade(params: IndicesGetUpgrade, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_upgrade(params: IndicesGetUpgrade, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def open(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def open(callback: callbackFn[_]): TransportRequestCallback = js.native
  def open(params: IndicesOpen): js.Promise[ApiResponse[_, _]] = js.native
  def open(params: IndicesOpen, callback: callbackFn[_]): TransportRequestCallback = js.native
  def open(params: IndicesOpen, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def open(params: IndicesOpen, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putAlias(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putAlias(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putAlias(params: IndicesPutAlias[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putAlias(params: IndicesPutAlias[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putAlias(params: IndicesPutAlias[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putAlias(params: IndicesPutAlias[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putMapping(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putMapping(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putMapping(params: IndicesPutMapping[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putMapping(params: IndicesPutMapping[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putMapping(params: IndicesPutMapping[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putMapping(params: IndicesPutMapping[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putSettings(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putSettings(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putSettings(params: IndicesPutSettings[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putSettings(params: IndicesPutSettings[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putSettings(params: IndicesPutSettings[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putSettings(params: IndicesPutSettings[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putTemplate(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putTemplate(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putTemplate(params: IndicesPutTemplate[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putTemplate(params: IndicesPutTemplate[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putTemplate(params: IndicesPutTemplate[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putTemplate(params: IndicesPutTemplate[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_alias(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_alias(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_alias(params: IndicesPutAlias[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_alias(params: IndicesPutAlias[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_alias(params: IndicesPutAlias[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_alias(params: IndicesPutAlias[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_mapping(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_mapping(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_mapping(params: IndicesPutMapping[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_mapping(params: IndicesPutMapping[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_mapping(params: IndicesPutMapping[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_mapping(params: IndicesPutMapping[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_settings(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_settings(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_settings(params: IndicesPutSettings[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_settings(params: IndicesPutSettings[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_settings(params: IndicesPutSettings[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_settings(params: IndicesPutSettings[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_template(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_template(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_template(params: IndicesPutTemplate[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_template(params: IndicesPutTemplate[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_template(params: IndicesPutTemplate[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_template(params: IndicesPutTemplate[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def recovery(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def recovery(callback: callbackFn[_]): TransportRequestCallback = js.native
  def recovery(params: IndicesRecovery): js.Promise[ApiResponse[_, _]] = js.native
  def recovery(params: IndicesRecovery, callback: callbackFn[_]): TransportRequestCallback = js.native
  def recovery(params: IndicesRecovery, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def recovery(params: IndicesRecovery, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def refresh(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def refresh(callback: callbackFn[_]): TransportRequestCallback = js.native
  def refresh(params: IndicesRefresh): js.Promise[ApiResponse[_, _]] = js.native
  def refresh(params: IndicesRefresh, callback: callbackFn[_]): TransportRequestCallback = js.native
  def refresh(params: IndicesRefresh, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def refresh(params: IndicesRefresh, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def reloadSearchAnalyzers(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def reloadSearchAnalyzers(callback: callbackFn[_]): TransportRequestCallback = js.native
  def reloadSearchAnalyzers(params: IndicesReloadSearchAnalyzers): js.Promise[ApiResponse[_, _]] = js.native
  def reloadSearchAnalyzers(params: IndicesReloadSearchAnalyzers, callback: callbackFn[_]): TransportRequestCallback = js.native
  def reloadSearchAnalyzers(params: IndicesReloadSearchAnalyzers, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def reloadSearchAnalyzers(params: IndicesReloadSearchAnalyzers, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def reload_search_analyzers(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def reload_search_analyzers(callback: callbackFn[_]): TransportRequestCallback = js.native
  def reload_search_analyzers(params: IndicesReloadSearchAnalyzers): js.Promise[ApiResponse[_, _]] = js.native
  def reload_search_analyzers(params: IndicesReloadSearchAnalyzers, callback: callbackFn[_]): TransportRequestCallback = js.native
  def reload_search_analyzers(params: IndicesReloadSearchAnalyzers, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def reload_search_analyzers(params: IndicesReloadSearchAnalyzers, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def rollover(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def rollover(callback: callbackFn[_]): TransportRequestCallback = js.native
  def rollover(params: IndicesRollover[_]): js.Promise[ApiResponse[_, _]] = js.native
  def rollover(params: IndicesRollover[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def rollover(params: IndicesRollover[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def rollover(params: IndicesRollover[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def segments(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def segments(callback: callbackFn[_]): TransportRequestCallback = js.native
  def segments(params: IndicesSegments): js.Promise[ApiResponse[_, _]] = js.native
  def segments(params: IndicesSegments, callback: callbackFn[_]): TransportRequestCallback = js.native
  def segments(params: IndicesSegments, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def segments(params: IndicesSegments, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def shardStores(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def shardStores(callback: callbackFn[_]): TransportRequestCallback = js.native
  def shardStores(params: IndicesShardStores): js.Promise[ApiResponse[_, _]] = js.native
  def shardStores(params: IndicesShardStores, callback: callbackFn[_]): TransportRequestCallback = js.native
  def shardStores(params: IndicesShardStores, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def shardStores(params: IndicesShardStores, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def shard_stores(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def shard_stores(callback: callbackFn[_]): TransportRequestCallback = js.native
  def shard_stores(params: IndicesShardStores): js.Promise[ApiResponse[_, _]] = js.native
  def shard_stores(params: IndicesShardStores, callback: callbackFn[_]): TransportRequestCallback = js.native
  def shard_stores(params: IndicesShardStores, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def shard_stores(params: IndicesShardStores, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def shrink(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def shrink(callback: callbackFn[_]): TransportRequestCallback = js.native
  def shrink(params: IndicesShrink[_]): js.Promise[ApiResponse[_, _]] = js.native
  def shrink(params: IndicesShrink[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def shrink(params: IndicesShrink[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def shrink(params: IndicesShrink[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def split(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def split(callback: callbackFn[_]): TransportRequestCallback = js.native
  def split(params: IndicesSplit[_]): js.Promise[ApiResponse[_, _]] = js.native
  def split(params: IndicesSplit[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def split(params: IndicesSplit[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def split(params: IndicesSplit[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stats(params: IndicesStats): js.Promise[ApiResponse[_, _]] = js.native
  def stats(params: IndicesStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stats(params: IndicesStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stats(params: IndicesStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def unfreeze(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def unfreeze(callback: callbackFn[_]): TransportRequestCallback = js.native
  def unfreeze(params: IndicesUnfreeze): js.Promise[ApiResponse[_, _]] = js.native
  def unfreeze(params: IndicesUnfreeze, callback: callbackFn[_]): TransportRequestCallback = js.native
  def unfreeze(params: IndicesUnfreeze, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def unfreeze(params: IndicesUnfreeze, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def updateAliases(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def updateAliases(callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateAliases(params: IndicesUpdateAliases[_]): js.Promise[ApiResponse[_, _]] = js.native
  def updateAliases(params: IndicesUpdateAliases[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateAliases(params: IndicesUpdateAliases[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def updateAliases(params: IndicesUpdateAliases[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def update_aliases(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def update_aliases(callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_aliases(params: IndicesUpdateAliases[_]): js.Promise[ApiResponse[_, _]] = js.native
  def update_aliases(params: IndicesUpdateAliases[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_aliases(params: IndicesUpdateAliases[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def update_aliases(params: IndicesUpdateAliases[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def upgrade(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def upgrade(callback: callbackFn[_]): TransportRequestCallback = js.native
  def upgrade(params: IndicesUpgrade): js.Promise[ApiResponse[_, _]] = js.native
  def upgrade(params: IndicesUpgrade, callback: callbackFn[_]): TransportRequestCallback = js.native
  def upgrade(params: IndicesUpgrade, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def upgrade(params: IndicesUpgrade, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def validateQuery(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def validateQuery(callback: callbackFn[_]): TransportRequestCallback = js.native
  def validateQuery(params: IndicesValidateQuery[_]): js.Promise[ApiResponse[_, _]] = js.native
  def validateQuery(params: IndicesValidateQuery[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def validateQuery(params: IndicesValidateQuery[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def validateQuery(params: IndicesValidateQuery[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def validate_query(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def validate_query(callback: callbackFn[_]): TransportRequestCallback = js.native
  def validate_query(params: IndicesValidateQuery[_]): js.Promise[ApiResponse[_, _]] = js.native
  def validate_query(params: IndicesValidateQuery[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def validate_query(params: IndicesValidateQuery[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def validate_query(params: IndicesValidateQuery[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

