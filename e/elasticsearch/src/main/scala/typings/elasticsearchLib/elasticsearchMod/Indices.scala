package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticsearch", "Indices")
@js.native
class Indices () extends js.Object {
  def analyze(params: IndicesAnalyzeParams): stdLib.Promise[_] = js.native
  def analyze(
    params: IndicesAnalyzeParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def clearCache(params: IndicesClearCacheParams): stdLib.Promise[_] = js.native
  def clearCache(
    params: IndicesClearCacheParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def close(params: IndicesCloseParams): stdLib.Promise[_] = js.native
  def close(
    params: IndicesCloseParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def create(params: IndicesCreateParams): stdLib.Promise[_] = js.native
  def create(
    params: IndicesCreateParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def delete(params: IndicesDeleteParams): stdLib.Promise[_] = js.native
  def delete(
    params: IndicesDeleteParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def deleteAlias(params: IndicesDeleteAliasParams): stdLib.Promise[_] = js.native
  def deleteAlias(
    params: IndicesDeleteAliasParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def deleteTemplate(params: IndicesDeleteTemplateParams): stdLib.Promise[_] = js.native
  def deleteTemplate(
    params: IndicesDeleteTemplateParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def exists(params: IndicesExistsParams): stdLib.Promise[scala.Boolean] = js.native
  def exists(
    params: IndicesExistsParams,
    callback: js.Function3[/* error */ js.Any, /* response */ scala.Boolean, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def existsAlias(params: IndicesExistsAliasParams): stdLib.Promise[scala.Boolean] = js.native
  def existsAlias(
    params: IndicesExistsAliasParams,
    callback: js.Function3[/* error */ js.Any, /* response */ scala.Boolean, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def existsTemplate(params: IndicesExistsTemplateParams): stdLib.Promise[scala.Boolean] = js.native
  def existsTemplate(
    params: IndicesExistsTemplateParams,
    callback: js.Function3[/* error */ js.Any, /* response */ scala.Boolean, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def existsType(params: IndicesExistsTypeParams): stdLib.Promise[scala.Boolean] = js.native
  def existsType(
    params: IndicesExistsTypeParams,
    callback: js.Function3[/* error */ js.Any, /* response */ scala.Boolean, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def flush(params: IndicesFlushParams): stdLib.Promise[_] = js.native
  def flush(
    params: IndicesFlushParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def flushSynced(params: IndicesFlushSyncedParams): stdLib.Promise[_] = js.native
  def flushSynced(
    params: IndicesFlushSyncedParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def forcemerge(params: IndicesForcemergeParams): stdLib.Promise[_] = js.native
  def forcemerge(
    params: IndicesForcemergeParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def get(params: IndicesGetParams): stdLib.Promise[_] = js.native
  def get(
    params: IndicesGetParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getAlias(params: IndicesGetAliasParams): stdLib.Promise[_] = js.native
  def getAlias(
    params: IndicesGetAliasParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getFieldMapping(params: IndicesGetFieldMappingParams): stdLib.Promise[_] = js.native
  def getFieldMapping(
    params: IndicesGetFieldMappingParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getMapping(params: IndicesGetMappingParams): stdLib.Promise[_] = js.native
  def getMapping(
    params: IndicesGetMappingParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getSettings(params: IndicesGetSettingsParams): stdLib.Promise[_] = js.native
  def getSettings(
    params: IndicesGetSettingsParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getTemplate(params: IndicesGetTemplateParams): stdLib.Promise[_] = js.native
  def getTemplate(
    params: IndicesGetTemplateParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getUpgrade(params: IndicesGetUpgradeParams): stdLib.Promise[_] = js.native
  def getUpgrade(
    params: IndicesGetUpgradeParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def open(params: IndicesOpenParams): stdLib.Promise[_] = js.native
  def open(
    params: IndicesOpenParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def putAlias(params: IndicesPutAliasParams): stdLib.Promise[_] = js.native
  def putAlias(
    params: IndicesPutAliasParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def putMapping(params: IndicesPutMappingParams): stdLib.Promise[_] = js.native
  def putMapping(
    params: IndicesPutMappingParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def putSettings(params: IndicesPutSettingsParams): stdLib.Promise[_] = js.native
  def putSettings(
    params: IndicesPutSettingsParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def putTemplate(params: IndicesPutTemplateParams): stdLib.Promise[_] = js.native
  def putTemplate(
    params: IndicesPutTemplateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def recovery(params: IndicesRecoveryParams): stdLib.Promise[_] = js.native
  def recovery(
    params: IndicesRecoveryParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def refresh(params: IndicesRefreshParams): stdLib.Promise[_] = js.native
  def refresh(
    params: IndicesRefreshParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def rollover(params: IndicesRolloverParams): stdLib.Promise[IndicesRolloverResponse] = js.native
  def rollover(
    params: IndicesRolloverParams,
    callback: js.Function2[/* error */ js.Any, /* response */ IndicesRolloverResponse, scala.Unit]
  ): scala.Unit = js.native
  def segments(params: IndicesSegmentsParams): stdLib.Promise[_] = js.native
  def segments(
    params: IndicesSegmentsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def shardStores(params: IndicesShardStoresParams): stdLib.Promise[_] = js.native
  def shardStores(
    params: IndicesShardStoresParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def shrink(params: IndicesShrinkParams): stdLib.Promise[_] = js.native
  def shrink(
    params: IndicesShrinkParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def stats(params: IndicesStatsParams): stdLib.Promise[_] = js.native
  def stats(
    params: IndicesStatsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def updateAliases(params: IndicesUpdateAliasesParams): stdLib.Promise[_] = js.native
  def updateAliases(
    params: IndicesUpdateAliasesParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def upgrade(params: IndicesUpgradeParams): stdLib.Promise[_] = js.native
  def upgrade(
    params: IndicesUpgradeParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def validateQuery(params: IndicesValidateQueryParams): stdLib.Promise[_] = js.native
  def validateQuery(
    params: IndicesValidateQueryParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

