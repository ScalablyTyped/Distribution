package typings
package enzymeLib.enzymeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme", "ShallowWrapper")
@js.native
class ShallowWrapper[P, S, C] protected () extends CommonWrapper[P, S, C] {
  def this(nodes: js.Array[reactLib.reactMod.Global.JSXNs.Element]) = this()
  def this(nodes: reactLib.reactMod.Global.JSXNs.Element) = this()
  def this(nodes: js.Array[reactLib.reactMod.Global.JSXNs.Element], root: ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]]) = this()
  def this(nodes: reactLib.reactMod.Global.JSXNs.Element, root: ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]]) = this()
  def this(nodes: js.Array[reactLib.reactMod.Global.JSXNs.Element], root: ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]], options: ShallowRendererProps) = this()
  def this(nodes: reactLib.reactMod.Global.JSXNs.Element, root: ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]], options: ShallowRendererProps) = this()
  /**
       * Returns a new wrapper with child at the specified index.
       */
  def childAt(index: scala.Double): ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  @JSName("childAt")
  def childAt_P2S2[P2, S2](index: scala.Double): ShallowWrapper[P2, S2, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def children(): ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def children(props: EnzymePropSelector): ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def children(selector: java.lang.String): ShallowWrapper[HTMLAttributes, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  /**
       * Returns a new wrapper with all of the children of the node(s) in the current wrapper. Optionally, a selector
       * can be provided and it will filter the children by this selector.
       */
  def children[P2](component: ComponentClass[P2]): ShallowWrapper[P2, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def children[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def closest(props: EnzymePropSelector): ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def closest(selector: java.lang.String): ShallowWrapper[HTMLAttributes, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  /**
       * Returns a wrapper of the first element that matches the selector by traversing up through the current node's
       * ancestors in the tree, starting with itself.
       *
       * Note: can only be called on a wrapper of a single node.
       */
  def closest[P2](component: ComponentClass[P2]): ShallowWrapper[P2, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def closest[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  /**
       * Shallow render the one non-DOM child of the current wrapper, and return a wrapper around the result.
       * NOTE: can only be called on wrapper of a single non-DOM component element node.
       */
  def dive[P2, S2](): ShallowWrapper[P2, S2, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  /**
       * Shallow render the one non-DOM child of the current wrapper, and return a wrapper around the result.
       * NOTE: can only be called on wrapper of a single non-DOM component element node.
       */
  def dive[P2, S2](options: ShallowRendererProps): ShallowWrapper[P2, S2, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def filter(props: EnzymePropSelector): ShallowWrapper[P, S, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def filter(props: java.lang.String): ShallowWrapper[P, S, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  /**
       * Removes nodes in the current wrapper that do not match the provided selector.
       * @param selector The selector to match.
       */
  def filter[P2](component: ComponentClass[P2]): ShallowWrapper[P2, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def filter[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def find(props: EnzymePropSelector): ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def find(selector: java.lang.String): ShallowWrapper[HTMLAttributes, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  /**
       * Find every node in the render tree that matches the provided selector.
       * @param selector The selector to match.
       */
  def find[P2](component: ComponentClass[P2]): ShallowWrapper[P2, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def find[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  /**
       * Finds every node in the render tree that returns true for the provided predicate function.
       */
  def findWhere(
    predicate: js.Function1[
      /* wrapper */ ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]], 
      scala.Boolean
    ]
  ): ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  /**
       * Strips out all the not host-nodes from the list of nodes
       *
       * This method is useful if you want to check for the presence of host nodes
       * (actually rendered HTML elements) ignoring the React nodes.
       */
  def hostNodes(): ShallowWrapper[HTMLAttributes, js.Object, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  /**
       * Returns a wrapper with the direct parent of the node in the current wrapper.
       */
  def parent(): ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def parents(): ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def parents(props: EnzymePropSelector): ShallowWrapper[_, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def parents(selector: java.lang.String): ShallowWrapper[HTMLAttributes, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  /**
       * Returns a wrapper around all of the parents/ancestors of the wrapper. Does not include the node in the
       * current wrapper. Optionally, a selector can be provided and it will filter the parents by this selector.
       *
       * Note: can only be called on a wrapper of a single node.
       */
  def parents[P2](component: ComponentClass[P2]): ShallowWrapper[P2, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def parents[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def shallow(): ShallowWrapper[P, S, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def shallow(options: ShallowRendererProps): ShallowWrapper[P, S, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def unmount(): this.type = js.native
}

