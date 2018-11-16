package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.undefined
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  var id: java.lang.String
  var index: java.lang.String
  var parent: js.UndefOr[java.lang.String] = js.undefined
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var realtime: js.UndefOr[scala.Boolean] = js.undefined
  var refresh: js.UndefOr[scala.Boolean] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var storedFields: js.UndefOr[NameList] = js.undefined
  var `type`: java.lang.String
  var version: js.UndefOr[scala.Double] = js.undefined
  var versionType: js.UndefOr[VersionType] = js.undefined
}

