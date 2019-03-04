package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlOutput extends js.Object {
  def addMetaTag(name: java.lang.String, content: java.lang.String): HtmlOutput
  def append(addedContent: java.lang.String): HtmlOutput
  def appendUntrusted(addedContent: java.lang.String): HtmlOutput
  def asTemplate(): HtmlTemplate
  def clear(): HtmlOutput
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getContent(): java.lang.String
  def getFaviconUrl(): java.lang.String
  def getHeight(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getMetaTags(): js.Array[HtmlOutputMetaTag]
  def getTitle(): java.lang.String
  def getWidth(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def setContent(content: java.lang.String): HtmlOutput
  def setFaviconUrl(iconUrl: java.lang.String): HtmlOutput
  def setHeight(height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): HtmlOutput
  def setSandboxMode(mode: SandboxMode): HtmlOutput
  def setTitle(title: java.lang.String): HtmlOutput
  def setWidth(width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): HtmlOutput
  def setXFrameOptionsMode(mode: XFrameOptionsMode): HtmlOutput
}

object HtmlOutput {
  @scala.inline
  def apply(
    addMetaTag: js.Function2[java.lang.String, java.lang.String, HtmlOutput],
    append: js.Function1[java.lang.String, HtmlOutput],
    appendUntrusted: js.Function1[java.lang.String, HtmlOutput],
    asTemplate: js.Function0[HtmlTemplate],
    clear: js.Function0[HtmlOutput],
    getAs: js.Function1[java.lang.String, googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getBlob: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getContent: js.Function0[java.lang.String],
    getFaviconUrl: js.Function0[java.lang.String],
    getHeight: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getMetaTags: js.Function0[js.Array[HtmlOutputMetaTag]],
    getTitle: js.Function0[java.lang.String],
    getWidth: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    setContent: js.Function1[java.lang.String, HtmlOutput],
    setFaviconUrl: js.Function1[java.lang.String, HtmlOutput],
    setHeight: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, HtmlOutput],
    setSandboxMode: js.Function1[SandboxMode, HtmlOutput],
    setTitle: js.Function1[java.lang.String, HtmlOutput],
    setWidth: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, HtmlOutput],
    setXFrameOptionsMode: js.Function1[XFrameOptionsMode, HtmlOutput]
  ): HtmlOutput = {
    val __obj = js.Dynamic.literal(addMetaTag = addMetaTag, append = append, appendUntrusted = appendUntrusted, asTemplate = asTemplate, clear = clear, getAs = getAs, getBlob = getBlob, getContent = getContent, getFaviconUrl = getFaviconUrl, getHeight = getHeight, getMetaTags = getMetaTags, getTitle = getTitle, getWidth = getWidth, setContent = setContent, setFaviconUrl = setFaviconUrl, setHeight = setHeight, setSandboxMode = setSandboxMode, setTitle = setTitle, setWidth = setWidth, setXFrameOptionsMode = setXFrameOptionsMode)
  
    __obj.asInstanceOf[HtmlOutput]
  }
}

