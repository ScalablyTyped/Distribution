package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticsearch", "Indices")
@js.native
class Indices () extends StObject {
  
  def analyze(params: IndicesAnalyzeParams): js.Promise[js.Any] = js.native
  def analyze(
    params: IndicesAnalyzeParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def clearCache(params: IndicesClearCacheParams): js.Promise[js.Any] = js.native
  def clearCache(
    params: IndicesClearCacheParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def close(params: IndicesCloseParams): js.Promise[js.Any] = js.native
  def close(
    params: IndicesCloseParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def create(params: IndicesCreateParams): js.Promise[js.Any] = js.native
  def create(
    params: IndicesCreateParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def delete(params: IndicesDeleteParams): js.Promise[js.Any] = js.native
  def delete(
    params: IndicesDeleteParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def deleteAlias(params: IndicesDeleteAliasParams): js.Promise[js.Any] = js.native
  def deleteAlias(
    params: IndicesDeleteAliasParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def deleteTemplate(params: IndicesDeleteTemplateParams): js.Promise[js.Any] = js.native
  def deleteTemplate(
    params: IndicesDeleteTemplateParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def exists(params: IndicesExistsParams): js.Promise[Boolean] = js.native
  def exists(
    params: IndicesExistsParams,
    callback: js.Function3[/* error */ js.Any, /* response */ Boolean, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def existsAlias(params: IndicesExistsAliasParams): js.Promise[Boolean] = js.native
  def existsAlias(
    params: IndicesExistsAliasParams,
    callback: js.Function3[/* error */ js.Any, /* response */ Boolean, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def existsTemplate(params: IndicesExistsTemplateParams): js.Promise[Boolean] = js.native
  def existsTemplate(
    params: IndicesExistsTemplateParams,
    callback: js.Function3[/* error */ js.Any, /* response */ Boolean, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def existsType(params: IndicesExistsTypeParams): js.Promise[Boolean] = js.native
  def existsType(
    params: IndicesExistsTypeParams,
    callback: js.Function3[/* error */ js.Any, /* response */ Boolean, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def flush(params: IndicesFlushParams): js.Promise[js.Any] = js.native
  def flush(
    params: IndicesFlushParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def flushSynced(params: IndicesFlushSyncedParams): js.Promise[js.Any] = js.native
  def flushSynced(
    params: IndicesFlushSyncedParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def forcemerge(params: IndicesForcemergeParams): js.Promise[js.Any] = js.native
  def forcemerge(
    params: IndicesForcemergeParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def get(params: IndicesGetParams): js.Promise[js.Any] = js.native
  def get(
    params: IndicesGetParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def getAlias(params: IndicesGetAliasParams): js.Promise[js.Any] = js.native
  def getAlias(
    params: IndicesGetAliasParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def getFieldMapping(params: IndicesGetFieldMappingParams): js.Promise[js.Any] = js.native
  def getFieldMapping(
    params: IndicesGetFieldMappingParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def getMapping(params: IndicesGetMappingParams): js.Promise[js.Any] = js.native
  def getMapping(
    params: IndicesGetMappingParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def getSettings(params: IndicesGetSettingsParams): js.Promise[js.Any] = js.native
  def getSettings(
    params: IndicesGetSettingsParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def getTemplate(params: IndicesGetTemplateParams): js.Promise[js.Any] = js.native
  def getTemplate(
    params: IndicesGetTemplateParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def getUpgrade(params: IndicesGetUpgradeParams): js.Promise[js.Any] = js.native
  def getUpgrade(
    params: IndicesGetUpgradeParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def open(params: IndicesOpenParams): js.Promise[js.Any] = js.native
  def open(
    params: IndicesOpenParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def putAlias(params: IndicesPutAliasParams): js.Promise[js.Any] = js.native
  def putAlias(
    params: IndicesPutAliasParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def putMapping(params: IndicesPutMappingParams): js.Promise[js.Any] = js.native
  def putMapping(
    params: IndicesPutMappingParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def putSettings(params: IndicesPutSettingsParams): js.Promise[js.Any] = js.native
  def putSettings(
    params: IndicesPutSettingsParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def putTemplate(params: IndicesPutTemplateParams): js.Promise[js.Any] = js.native
  def putTemplate(
    params: IndicesPutTemplateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def recovery(params: IndicesRecoveryParams): js.Promise[js.Any] = js.native
  def recovery(
    params: IndicesRecoveryParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def refresh(params: IndicesRefreshParams): js.Promise[js.Any] = js.native
  def refresh(
    params: IndicesRefreshParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def rollover(params: IndicesRolloverParams): js.Promise[IndicesRolloverResponse] = js.native
  def rollover(
    params: IndicesRolloverParams,
    callback: js.Function2[/* error */ js.Any, /* response */ IndicesRolloverResponse, Unit]
  ): Unit = js.native
  
  def segments(params: IndicesSegmentsParams): js.Promise[js.Any] = js.native
  def segments(
    params: IndicesSegmentsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def shardStores(params: IndicesShardStoresParams): js.Promise[js.Any] = js.native
  def shardStores(
    params: IndicesShardStoresParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def shrink(params: IndicesShrinkParams): js.Promise[js.Any] = js.native
  def shrink(
    params: IndicesShrinkParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def stats(params: IndicesStatsParams): js.Promise[js.Any] = js.native
  def stats(
    params: IndicesStatsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def updateAliases(params: IndicesUpdateAliasesParams): js.Promise[js.Any] = js.native
  def updateAliases(
    params: IndicesUpdateAliasesParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def upgrade(params: IndicesUpgradeParams): js.Promise[js.Any] = js.native
  def upgrade(
    params: IndicesUpgradeParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def validateQuery(params: IndicesValidateQueryParams): js.Promise[js.Any] = js.native
  def validateQuery(
    params: IndicesValidateQueryParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
}
