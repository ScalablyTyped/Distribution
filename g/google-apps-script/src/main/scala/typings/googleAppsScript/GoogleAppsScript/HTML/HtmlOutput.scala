package typings.googleAppsScript.GoogleAppsScript.HTML

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An HtmlOutput object that can be served from a script. Due to security considerations,
  * scripts cannot directly return HTML to a browser. Instead, they must sanitize it so that it
  * cannot perform malicious actions. You can return sanitized HTML like this:
  *
  *     function doGet() {
  *       return HtmlService.createHtmlOutput('<b>Hello, world!</b>');
  *     }
  *
  * HtmlOutput
  * iframe
  * sandboxing
  * guide to restrictions in HTML service
  */
@js.native
trait HtmlOutput extends js.Object {
  def addMetaTag(name: String, content: String): HtmlOutput = js.native
  def append(addedContent: String): HtmlOutput = js.native
  def appendUntrusted(addedContent: String): HtmlOutput = js.native
  def asTemplate(): HtmlTemplate = js.native
  def clear(): HtmlOutput = js.native
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getContent(): String = js.native
  def getFaviconUrl(): String = js.native
  def getHeight(): Integer = js.native
  def getMetaTags(): js.Array[HtmlOutputMetaTag] = js.native
  def getTitle(): String = js.native
  def getWidth(): Integer = js.native
  def setContent(content: String): HtmlOutput = js.native
  def setFaviconUrl(iconUrl: String): HtmlOutput = js.native
  def setHeight(height: Integer): HtmlOutput = js.native
  def setSandboxMode(mode: SandboxMode): HtmlOutput = js.native
  def setTitle(title: String): HtmlOutput = js.native
  def setWidth(width: Integer): HtmlOutput = js.native
  def setXFrameOptionsMode(mode: XFrameOptionsMode): HtmlOutput = js.native
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
  @scala.inline
  implicit class HtmlOutputOps[Self <: HtmlOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddMetaTag(value: (String, String) => HtmlOutput): Self = this.set("addMetaTag", js.Any.fromFunction2(value))
    @scala.inline
    def setAppend(value: String => HtmlOutput): Self = this.set("append", js.Any.fromFunction1(value))
    @scala.inline
    def setAppendUntrusted(value: String => HtmlOutput): Self = this.set("appendUntrusted", js.Any.fromFunction1(value))
    @scala.inline
    def setAsTemplate(value: () => HtmlTemplate): Self = this.set("asTemplate", js.Any.fromFunction0(value))
    @scala.inline
    def setClear(value: () => HtmlOutput): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAs(value: String => Blob): Self = this.set("getAs", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBlob(value: () => Blob): Self = this.set("getBlob", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContent(value: () => String): Self = this.set("getContent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFaviconUrl(value: () => String): Self = this.set("getFaviconUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHeight(value: () => Integer): Self = this.set("getHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMetaTags(value: () => js.Array[HtmlOutputMetaTag]): Self = this.set("getMetaTags", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWidth(value: () => Integer): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setSetContent(value: String => HtmlOutput): Self = this.set("setContent", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFaviconUrl(value: String => HtmlOutput): Self = this.set("setFaviconUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHeight(value: Integer => HtmlOutput): Self = this.set("setHeight", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSandboxMode(value: SandboxMode => HtmlOutput): Self = this.set("setSandboxMode", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitle(value: String => HtmlOutput): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetWidth(value: Integer => HtmlOutput): Self = this.set("setWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setSetXFrameOptionsMode(value: XFrameOptionsMode => HtmlOutput): Self = this.set("setXFrameOptionsMode", js.Any.fromFunction1(value))
  }
  
}

