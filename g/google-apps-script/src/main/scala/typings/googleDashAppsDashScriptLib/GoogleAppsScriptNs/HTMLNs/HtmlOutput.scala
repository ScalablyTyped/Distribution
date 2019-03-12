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
    addMetaTag: (java.lang.String, java.lang.String) => HtmlOutput,
    append: java.lang.String => HtmlOutput,
    appendUntrusted: java.lang.String => HtmlOutput,
    asTemplate: () => HtmlTemplate,
    clear: () => HtmlOutput,
    getAs: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob,
    getBlob: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob,
    getContent: () => java.lang.String,
    getFaviconUrl: () => java.lang.String,
    getHeight: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getMetaTags: () => js.Array[HtmlOutputMetaTag],
    getTitle: () => java.lang.String,
    getWidth: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    setContent: java.lang.String => HtmlOutput,
    setFaviconUrl: java.lang.String => HtmlOutput,
    setHeight: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => HtmlOutput,
    setSandboxMode: SandboxMode => HtmlOutput,
    setTitle: java.lang.String => HtmlOutput,
    setWidth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => HtmlOutput,
    setXFrameOptionsMode: XFrameOptionsMode => HtmlOutput
  ): HtmlOutput = {
    val __obj = js.Dynamic.literal(addMetaTag = js.Any.fromFunction2(addMetaTag), append = js.Any.fromFunction1(append), appendUntrusted = js.Any.fromFunction1(appendUntrusted), asTemplate = js.Any.fromFunction0(asTemplate), clear = js.Any.fromFunction0(clear), getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getContent = js.Any.fromFunction0(getContent), getFaviconUrl = js.Any.fromFunction0(getFaviconUrl), getHeight = js.Any.fromFunction0(getHeight), getMetaTags = js.Any.fromFunction0(getMetaTags), getTitle = js.Any.fromFunction0(getTitle), getWidth = js.Any.fromFunction0(getWidth), setContent = js.Any.fromFunction1(setContent), setFaviconUrl = js.Any.fromFunction1(setFaviconUrl), setHeight = js.Any.fromFunction1(setHeight), setSandboxMode = js.Any.fromFunction1(setSandboxMode), setTitle = js.Any.fromFunction1(setTitle), setWidth = js.Any.fromFunction1(setWidth), setXFrameOptionsMode = js.Any.fromFunction1(setXFrameOptionsMode))
  
    __obj.asInstanceOf[HtmlOutput]
  }
}

