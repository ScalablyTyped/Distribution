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

