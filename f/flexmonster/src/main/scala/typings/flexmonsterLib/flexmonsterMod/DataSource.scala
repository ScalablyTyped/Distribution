package typings
package flexmonsterLib.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  var browseForFile: js.UndefOr[scala.Boolean] = js.undefined
  var catalog: js.UndefOr[java.lang.String] = js.undefined
  var cube: js.UndefOr[java.lang.String] = js.undefined
  var customData: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var dataSourceInfo: js.UndefOr[java.lang.String] = js.undefined
  var dataSourceType: js.UndefOr[java.lang.String] = js.undefined
  var effectiveUserName: js.UndefOr[java.lang.String] = js.undefined
  var fieldSeparator: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var hash: js.UndefOr[java.lang.String] = js.undefined
  // elasticsearch
  var host: js.UndefOr[java.lang.String | js.Array[java.lang.String] | js.Object] = js.undefined
  var ignoreQuotedLineBreaks: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  var localeIdentifier: js.UndefOr[java.lang.String] = js.undefined
  var mapping: js.UndefOr[js.Object] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var proxyUrl: js.UndefOr[java.lang.String] = js.undefined
  var recordsetDelimiter: js.UndefOr[java.lang.String] = js.undefined
  var requestHeader: js.UndefOr[js.Object] = js.undefined
  var roles: js.UndefOr[java.lang.String] = js.undefined
  var subquery: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var thousandSeparator: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    browseForFile: js.UndefOr[scala.Boolean] = js.undefined,
    catalog: java.lang.String = null,
    cube: java.lang.String = null,
    customData: java.lang.String = null,
    data: js.Array[js.Object] = null,
    dataSourceInfo: java.lang.String = null,
    dataSourceType: java.lang.String = null,
    effectiveUserName: java.lang.String = null,
    fieldSeparator: java.lang.String = null,
    filename: java.lang.String = null,
    hash: java.lang.String = null,
    host: java.lang.String | js.Array[java.lang.String] | js.Object = null,
    ignoreQuotedLineBreaks: js.UndefOr[scala.Boolean] = js.undefined,
    index: java.lang.String = null,
    localeIdentifier: java.lang.String = null,
    mapping: js.Object = null,
    password: java.lang.String = null,
    proxyUrl: java.lang.String = null,
    recordsetDelimiter: java.lang.String = null,
    requestHeader: js.Object = null,
    roles: java.lang.String = null,
    subquery: java.lang.String | js.Object = null,
    thousandSeparator: java.lang.String = null,
    username: java.lang.String = null
  ): DataSource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (!js.isUndefined(browseForFile)) __obj.updateDynamic("browseForFile")(browseForFile)
    if (catalog != null) __obj.updateDynamic("catalog")(catalog)
    if (cube != null) __obj.updateDynamic("cube")(cube)
    if (customData != null) __obj.updateDynamic("customData")(customData)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataSourceInfo != null) __obj.updateDynamic("dataSourceInfo")(dataSourceInfo)
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (effectiveUserName != null) __obj.updateDynamic("effectiveUserName")(effectiveUserName)
    if (fieldSeparator != null) __obj.updateDynamic("fieldSeparator")(fieldSeparator)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreQuotedLineBreaks)) __obj.updateDynamic("ignoreQuotedLineBreaks")(ignoreQuotedLineBreaks)
    if (index != null) __obj.updateDynamic("index")(index)
    if (localeIdentifier != null) __obj.updateDynamic("localeIdentifier")(localeIdentifier)
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    if (password != null) __obj.updateDynamic("password")(password)
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl)
    if (recordsetDelimiter != null) __obj.updateDynamic("recordsetDelimiter")(recordsetDelimiter)
    if (requestHeader != null) __obj.updateDynamic("requestHeader")(requestHeader)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    if (subquery != null) __obj.updateDynamic("subquery")(subquery.asInstanceOf[js.Any])
    if (thousandSeparator != null) __obj.updateDynamic("thousandSeparator")(thousandSeparator)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[DataSource]
  }
}

