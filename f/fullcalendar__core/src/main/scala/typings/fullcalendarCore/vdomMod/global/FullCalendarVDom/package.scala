package typings.fullcalendarCore.vdomMod.global.FullCalendarVDom

import typings.fullcalendarCore.vdomMod.global.FullCalendarVDom.^
import typings.preact.mod.ComponentClass
import typings.preact.mod.FunctionComponent
import typings.preact.mod.RefCallback
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.ShadowRoot
import typings.std.Text
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Fragment: FunctionComponent[js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[FunctionComponent[js.Object]]

inline def createContext[T](defaultValue: T): typings.preact.mod.Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[typings.preact.mod.Context[T]]

inline def createRef[T](): typings.preact.mod.RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[typings.preact.mod.RefObject[T]]

inline def flushSync(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushSync")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def render(vnode: typings.preact.mod.ComponentChild, parent: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typings.preact.mod.ComponentChild, parent: DocumentFragment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typings.preact.mod.ComponentChild, parent: DocumentFragment, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typings.preact.mod.ComponentChild, parent: DocumentFragment, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typings.preact.mod.ComponentChild, parent: Document, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typings.preact.mod.ComponentChild, parent: Document, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typings.preact.mod.ComponentChild, parent: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typings.preact.mod.ComponentChild, parent: Element, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typings.preact.mod.ComponentChild, parent: Element, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typings.preact.mod.ComponentChild, parent: ShadowRoot): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typings.preact.mod.ComponentChild, parent: ShadowRoot, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typings.preact.mod.ComponentChild, parent: ShadowRoot, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unmountComponentAtNode(node: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]

type ComponentChild = js.UndefOr[
typings.preact.mod.VNode[Any] | js.Object | String | Double | js.BigInt | Boolean | Null]

type ComponentChildren = js.Array[typings.preact.mod.ComponentChild] | typings.preact.mod.ComponentChild

type ComponentType[P] = (ComponentClass[P, js.Object]) | FunctionComponent[P]

type Ref[T] = typings.preact.mod.RefObject[T] | RefCallback[T]

type VNode = typings.preact.mod.VNode[Any]

type VUIEvent = UIEvent
