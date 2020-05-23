package typings.dompurify.mod

import typings.dompurify.anon.ConfigRETURNDOMFRAGMENTfa
import typings.dompurify.anon.ConfigRETURNDOMFRAGMENTtr
import typings.dompurify.anon.ConfigRETURNDOMtrue
import typings.dompurify.anon.ConfigRETURNTRUSTEDTYPEtr
import typings.dompurify.dompurifyStrings.uponSanitizeAttribute
import typings.dompurify.dompurifyStrings.uponSanitizeElement
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import typings.trustedTypes.mod.global.TrustedHTML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMPurifyI extends js.Object {
  var isSupported: Boolean = js.native
  var removed: js.Array[_] = js.native
  var version: String = js.native
  def addHook(
    hook: HookName,
    cb: js.Function3[/* currentNode */ Element, /* data */ HookEvent, /* config */ Config, Unit]
  ): Unit = js.native
  @JSName("addHook")
  def addHook_uponSanitizeAttribute(
    hook: uponSanitizeAttribute,
    cb: js.Function3[
      /* currentNode */ Element, 
      /* data */ SanitizeAttributeHookEvent, 
      /* config */ Config, 
      Unit
    ]
  ): Unit = js.native
  @JSName("addHook")
  def addHook_uponSanitizeElement(
    hook: uponSanitizeElement,
    cb: js.Function3[
      /* currentNode */ Element, 
      /* data */ SanitizeElementHookEvent, 
      /* config */ Config, 
      Unit
    ]
  ): Unit = js.native
  def clearConfig(): Unit = js.native
  def isValidAttribute(tag: String, attr: String, value: String): Boolean = js.native
  def removeAllHooks(): Unit = js.native
  def removeHook(entryPoint: HookName): Unit = js.native
  def removeHooks(entryPoint: HookName): Unit = js.native
  def sanitize(source: String): String = js.native
  def sanitize(source: String, config: ConfigRETURNDOMFRAGMENTfa): String = js.native
  def sanitize(source: String, config: ConfigRETURNDOMFRAGMENTtr): DocumentFragment = js.native
  def sanitize(source: String, config: ConfigRETURNDOMtrue): HTMLElement = js.native
  def sanitize(source: String, config: ConfigRETURNTRUSTEDTYPEtr): TrustedHTML = js.native
  def sanitize(source: String, config: Config): String | HTMLElement | DocumentFragment = js.native
  def sanitize(source: Node): String = js.native
  def sanitize(source: Node, config: ConfigRETURNDOMFRAGMENTfa): String = js.native
  def sanitize(source: Node, config: ConfigRETURNDOMFRAGMENTtr): DocumentFragment = js.native
  def sanitize(source: Node, config: ConfigRETURNDOMtrue): HTMLElement = js.native
  def sanitize(source: Node, config: ConfigRETURNTRUSTEDTYPEtr): TrustedHTML = js.native
  def sanitize(source: Node, config: Config): String | HTMLElement | DocumentFragment = js.native
  def setConfig(cfg: Config): Unit = js.native
}

