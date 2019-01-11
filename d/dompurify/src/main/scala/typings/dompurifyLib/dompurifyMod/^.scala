package typings
package dompurifyLib.dompurifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dompurify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var isSupported: scala.Boolean = js.native
  var removed: js.Array[js.Any] = js.native
  var version: java.lang.String = js.native
  def addHook(
    hook: dompurifyLib.HookName,
    cb: js.Function3[
      /* currentNode */ stdLib.Element, 
      /* data */ dompurifyLib.HookEvent, 
      /* config */ dompurifyLib.dompurifyMod.Config, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addHook")
  def addHook_uponSanitizeAttribute(
    hook: dompurifyLib.dompurifyLibStrings.uponSanitizeAttribute,
    cb: js.Function3[
      /* currentNode */ stdLib.Element, 
      /* data */ dompurifyLib.dompurifyMod.SanitizeAttributeHookEvent, 
      /* config */ dompurifyLib.dompurifyMod.Config, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addHook")
  def addHook_uponSanitizeElement(
    hook: dompurifyLib.dompurifyLibStrings.uponSanitizeElement,
    cb: js.Function3[
      /* currentNode */ stdLib.Element, 
      /* data */ dompurifyLib.dompurifyMod.SanitizeElementHookEvent, 
      /* config */ dompurifyLib.dompurifyMod.Config, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def clearConfig(): scala.Unit = js.native
  def isValidAttribute(tag: java.lang.String, attr: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def removeAllHooks(): scala.Unit = js.native
  def removeHook(entryPoint: dompurifyLib.HookName): scala.Unit = js.native
  def removeHooks(entryPoint: dompurifyLib.HookName): scala.Unit = js.native
  def sanitize(source: java.lang.String): java.lang.String = js.native
  def sanitize(source: java.lang.String, config: dompurifyLib.dompurifyMod.Config): java.lang.String | stdLib.HTMLElement | stdLib.DocumentFragment = js.native
  def sanitize(source: stdLib.Node): java.lang.String = js.native
  def sanitize(source: stdLib.Node, config: dompurifyLib.dompurifyMod.Config): java.lang.String | stdLib.HTMLElement | stdLib.DocumentFragment = js.native
  @JSName("sanitize")
  def sanitize_DocumentFragment(
    source: java.lang.String,
    config: dompurifyLib.dompurifyMod.Config with dompurifyLib.Anon_RETURNDOMFRAGMENT
  ): stdLib.DocumentFragment = js.native
  @JSName("sanitize")
  def sanitize_DocumentFragment(
    source: stdLib.Node,
    config: dompurifyLib.dompurifyMod.Config with dompurifyLib.Anon_RETURNDOMFRAGMENT
  ): stdLib.DocumentFragment = js.native
  @JSName("sanitize")
  def sanitize_HTMLElement(
    source: java.lang.String,
    config: dompurifyLib.dompurifyMod.Config with dompurifyLib.Anon_RETURNDOM
  ): stdLib.HTMLElement = js.native
  @JSName("sanitize")
  def sanitize_HTMLElement(source: stdLib.Node, config: dompurifyLib.dompurifyMod.Config with dompurifyLib.Anon_RETURNDOM): stdLib.HTMLElement = js.native
  @JSName("sanitize")
  def sanitize_String(source: java.lang.String, config: dompurifyLib.dompurifyMod.Config with dompurifyLib.Anon_False): java.lang.String = js.native
  @JSName("sanitize")
  def sanitize_String(source: stdLib.Node, config: dompurifyLib.dompurifyMod.Config with dompurifyLib.Anon_False): java.lang.String = js.native
  def setConfig(cfg: dompurifyLib.dompurifyMod.Config): scala.Unit = js.native
}

