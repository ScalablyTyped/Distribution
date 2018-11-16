package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BulkIndexDocumentsParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.undefined
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  var fields: js.UndefOr[NameList] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  var pipeline: js.UndefOr[java.lang.String] = js.undefined
  var refresh: js.UndefOr[Refresh] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var waitForActiveShards: js.UndefOr[java.lang.String] = js.undefined
}

