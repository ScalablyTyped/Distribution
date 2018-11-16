package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateDocumentParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.undefined
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  var fields: js.UndefOr[NameList] = js.undefined
  var id: java.lang.String
  var index: java.lang.String
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[java.lang.String] = js.undefined
  var refresh: js.UndefOr[Refresh] = js.undefined
  var retryOnConflict: js.UndefOr[scala.Double] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var timestamp: js.UndefOr[stdLib.Date | scala.Double] = js.undefined
  var ttl: js.UndefOr[TimeSpan] = js.undefined
  var `type`: java.lang.String
  var version: js.UndefOr[scala.Double] = js.undefined
  var versionType: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.internal | elasticsearchLib.elasticsearchLibStrings.force
  ] = js.undefined
  var waitForActiveShards: js.UndefOr[java.lang.String] = js.undefined
}

