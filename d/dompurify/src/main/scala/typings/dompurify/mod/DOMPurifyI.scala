package typings.dompurify.mod

import typings.dompurify.AnonFalse
import typings.dompurify.AnonRETURNDOM
import typings.dompurify.AnonRETURNDOMFRAGMENT
import typings.dompurify.AnonRETURNTRUSTEDTYPE
import typings.dompurify.dompurifyStrings.uponSanitizeAttribute
import typings.dompurify.dompurifyStrings.uponSanitizeElement
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import typings.trustedTypes.mod._Global_.TrustedHTML
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
  def sanitize(source: String, config: Config with AnonFalse): String = js.native
  def sanitize(source: Node): String = js.native
  def sanitize(source: Node, config: Config with AnonFalse): String = js.native
  @JSName("sanitize")
  def sanitize_DocumentFragment(source: String, config: Config with AnonRETURNDOMFRAGMENT): DocumentFragment = js.native
  @JSName("sanitize")
  def sanitize_DocumentFragment(source: Node, config: Config with AnonRETURNDOMFRAGMENT): DocumentFragment = js.native
  @JSName("sanitize")
  def sanitize_HTMLElement(source: String, config: Config with AnonRETURNDOM): HTMLElement = js.native
  @JSName("sanitize")
  def sanitize_HTMLElement(source: Node, config: Config with AnonRETURNDOM): HTMLElement = js.native
  @JSName("sanitize")
  def sanitize_TrustedHTML(source: String, config: Config with AnonRETURNTRUSTEDTYPE): TrustedHTML = js.native
  @JSName("sanitize")
  def sanitize_TrustedHTML(source: Node, config: Config with AnonRETURNTRUSTEDTYPE): TrustedHTML = js.native
  @JSName("sanitize")
  def sanitize_Union(source: String, config: Config): String | HTMLElement | DocumentFragment = js.native
  @JSName("sanitize")
  def sanitize_Union(source: Node, config: Config): String | HTMLElement | DocumentFragment = js.native
  def setConfig(cfg: Config): Unit = js.native
}

