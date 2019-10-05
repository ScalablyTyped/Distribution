package typings.googleDashAppsDashScript.GoogleAppsScript.HTML

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlOutput extends js.Object {
  def addMetaTag(name: String, content: String): HtmlOutput
  def append(addedContent: String): HtmlOutput
  def appendUntrusted(addedContent: String): HtmlOutput
  def asTemplate(): HtmlTemplate
  def clear(): HtmlOutput
  def getAs(contentType: String): Blob
  def getBlob(): Blob
  def getContent(): String
  def getFaviconUrl(): String
  def getHeight(): Integer
  def getMetaTags(): js.Array[HtmlOutputMetaTag]
  def getTitle(): String
  def getWidth(): Integer
  def setContent(content: String): HtmlOutput
  def setFaviconUrl(iconUrl: String): HtmlOutput
  def setHeight(height: Integer): HtmlOutput
  def setSandboxMode(mode: SandboxMode): HtmlOutput
  def setTitle(title: String): HtmlOutput
  def setWidth(width: Integer): HtmlOutput
  def setXFrameOptionsMode(mode: XFrameOptionsMode): HtmlOutput
}

object HtmlOutput {
  @scala.inline
  def apply(
    addMetaTag: (String, String) => HtmlOutput,
    append: String => HtmlOutput,
    appendUntrusted: String => HtmlOutput,
    asTemplate: () => HtmlTemplate,
    clear: () => HtmlOutput,
    getAs: String => Blob,
    getBlob: () => Blob,
    getContent: () => String,
    getFaviconUrl: () => String,
    getHeight: () => Integer,
    getMetaTags: () => js.Array[HtmlOutputMetaTag],
    getTitle: () => String,
    getWidth: () => Integer,
    setContent: String => HtmlOutput,
    setFaviconUrl: String => HtmlOutput,
    setHeight: Integer => HtmlOutput,
    setSandboxMode: SandboxMode => HtmlOutput,
    setTitle: String => HtmlOutput,
    setWidth: Integer => HtmlOutput,
    setXFrameOptionsMode: XFrameOptionsMode => HtmlOutput
  ): HtmlOutput = {
    val __obj = js.Dynamic.literal(addMetaTag = js.Any.fromFunction2(addMetaTag), append = js.Any.fromFunction1(append), appendUntrusted = js.Any.fromFunction1(appendUntrusted), asTemplate = js.Any.fromFunction0(asTemplate), clear = js.Any.fromFunction0(clear), getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getContent = js.Any.fromFunction0(getContent), getFaviconUrl = js.Any.fromFunction0(getFaviconUrl), getHeight = js.Any.fromFunction0(getHeight), getMetaTags = js.Any.fromFunction0(getMetaTags), getTitle = js.Any.fromFunction0(getTitle), getWidth = js.Any.fromFunction0(getWidth), setContent = js.Any.fromFunction1(setContent), setFaviconUrl = js.Any.fromFunction1(setFaviconUrl), setHeight = js.Any.fromFunction1(setHeight), setSandboxMode = js.Any.fromFunction1(setSandboxMode), setTitle = js.Any.fromFunction1(setTitle), setWidth = js.Any.fromFunction1(setWidth), setXFrameOptionsMode = js.Any.fromFunction1(setXFrameOptionsMode))
  
    __obj.asInstanceOf[HtmlOutput]
  }
}

