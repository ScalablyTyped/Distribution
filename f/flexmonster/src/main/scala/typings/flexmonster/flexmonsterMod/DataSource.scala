package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  var binary: js.UndefOr[Boolean] = js.undefined
  var browseForFile: js.UndefOr[Boolean] = js.undefined
  var catalog: js.UndefOr[String] = js.undefined
  var cube: js.UndefOr[String] = js.undefined
  var customData: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var dataSourceInfo: js.UndefOr[String] = js.undefined
  var dataSourceType: js.UndefOr[String] = js.undefined
  var effectiveUserName: js.UndefOr[String] = js.undefined
  var fieldSeparator: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  // elasticsearch
  var host: js.UndefOr[String | js.Array[String] | js.Object] = js.undefined
  var ignoreQuotedLineBreaks: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var localeIdentifier: js.UndefOr[String] = js.undefined
  var mapping: js.UndefOr[js.Object] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var proxyUrl: js.UndefOr[String] = js.undefined
  var recordsetDelimiter: js.UndefOr[String] = js.undefined
  var requestHeaders: js.UndefOr[js.Object] = js.undefined
  var roles: js.UndefOr[String] = js.undefined
  var subquery: js.UndefOr[String | js.Object] = js.undefined
  var thousandSeparator: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(
    binary: js.UndefOr[Boolean] = js.undefined,
    browseForFile: js.UndefOr[Boolean] = js.undefined,
    catalog: String = null,
    cube: String = null,
    customData: String = null,
    data: js.Array[js.Object] = null,
    dataSourceInfo: String = null,
    dataSourceType: String = null,
    effectiveUserName: String = null,
    fieldSeparator: String = null,
    filename: String = null,
    hash: String = null,
    host: String | js.Array[String] | js.Object = null,
    ignoreQuotedLineBreaks: js.UndefOr[Boolean] = js.undefined,
    index: String = null,
    localeIdentifier: String = null,
    mapping: js.Object = null,
    password: String = null,
    proxyUrl: String = null,
    recordsetDelimiter: String = null,
    requestHeaders: js.Object = null,
    roles: String = null,
    subquery: String | js.Object = null,
    thousandSeparator: String = null,
    `type`: String = null,
    username: String = null
  ): DataSource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (!js.isUndefined(browseForFile)) __obj.updateDynamic("browseForFile")(browseForFile.asInstanceOf[js.Any])
    if (catalog != null) __obj.updateDynamic("catalog")(catalog.asInstanceOf[js.Any])
    if (cube != null) __obj.updateDynamic("cube")(cube.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataSourceInfo != null) __obj.updateDynamic("dataSourceInfo")(dataSourceInfo.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType.asInstanceOf[js.Any])
    if (effectiveUserName != null) __obj.updateDynamic("effectiveUserName")(effectiveUserName.asInstanceOf[js.Any])
    if (fieldSeparator != null) __obj.updateDynamic("fieldSeparator")(fieldSeparator.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreQuotedLineBreaks)) __obj.updateDynamic("ignoreQuotedLineBreaks")(ignoreQuotedLineBreaks.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (localeIdentifier != null) __obj.updateDynamic("localeIdentifier")(localeIdentifier.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    if (recordsetDelimiter != null) __obj.updateDynamic("recordsetDelimiter")(recordsetDelimiter.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (subquery != null) __obj.updateDynamic("subquery")(subquery.asInstanceOf[js.Any])
    if (thousandSeparator != null) __obj.updateDynamic("thousandSeparator")(thousandSeparator.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

