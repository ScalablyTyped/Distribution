package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IndexDocumentParams[T] extends GenericParams {
  @JSName("body")
  var body_IndexDocumentParams: T
  var id: js.UndefOr[java.lang.String] = js.undefined
  var index: java.lang.String
  var opType: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.index | elasticsearchLib.elasticsearchLibStrings.create
  ] = js.undefined
  var parent: js.UndefOr[java.lang.String] = js.undefined
  var pipeline: js.UndefOr[java.lang.String] = js.undefined
  var refresh: js.UndefOr[Refresh] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var timestamp: js.UndefOr[stdLib.Date | scala.Double] = js.undefined
  var ttl: js.UndefOr[TimeSpan] = js.undefined
  var `type`: java.lang.String
  var version: js.UndefOr[scala.Double] = js.undefined
  var versionType: js.UndefOr[VersionType] = js.undefined
  var waitForActiveShards: js.UndefOr[java.lang.String] = js.undefined
}

