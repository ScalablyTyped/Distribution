package typings.enzyme.enzymeMod

import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme", "ReactWrapper")
@js.native
class ReactWrapper[P, S, C] protected () extends CommonWrapper[P, S, C] {
  def this(nodes: js.Array[Element]) = this()
  def this(nodes: Element) = this()
  def this(nodes: js.Array[Element], root: ReactWrapper[_, _, Component[js.Object, js.Object, _]]) = this()
  def this(nodes: Element, root: ReactWrapper[_, _, Component[js.Object, js.Object, _]]) = this()
  def this(
    nodes: js.Array[Element],
    root: ReactWrapper[_, _, Component[js.Object, js.Object, _]],
    options: MountRendererProps
  ) = this()
  def this(
    nodes: Element,
    root: ReactWrapper[_, _, Component[js.Object, js.Object, _]],
    options: MountRendererProps
  ) = this()
  /**
    * Returns a new wrapper with child at the specified index.
    */
  def childAt(index: Double): ReactWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
  @JSName("childAt")
  def childAt_P2S2[P2, S2](index: Double): ReactWrapper[P2, S2, Component[js.Object, js.Object, _]] = js.native
  def children(): ReactWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
  def children(props: EnzymePropSelector): ReactWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
  def children(selector: String): ReactWrapper[HTMLAttributes, _, Component[js.Object, js.Object, _]] = js.native
  def children[P2](component: ComponentType[P2]): ReactWrapper[P2, _, Component[js.Object, js.Object, _]] = js.native
  /**
    * Returns a new wrapper with all of the children of the node(s) in the current wrapper. Optionally, a selector
    * can be provided and it will filter the children by this selector.
    */
  def children[P2](statelessComponent: StatelessComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, _]] = js.native
  def closest(props: EnzymePropSelector): ReactWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
  def closest(selector: String): ReactWrapper[HTMLAttributes, _, Component[js.Object, js.Object, _]] = js.native
  def closest[P2](component: ComponentType[P2]): ReactWrapper[P2, _, Component[js.Object, js.Object, _]] = js.native
  /**
    * Returns a wrapper of the first element that matches the selector by traversing up through the current node's
    * ancestors in the tree, starting with itself.
    *
    * Note: can only be called on a wrapper of a single node.
    */
  def closest[P2](statelessComponent: StatelessComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, _]] = js.native
  /**
    * Detaches the react tree from the DOM. Runs ReactDOM.unmountComponentAtNode() under the hood.
    *
    * This method will most commonly be used as a "cleanup" method if you decide to use the attachTo option in mount(node, options).
    *
    * The method is intentionally not "fluent" (in that it doesn't return this) because you should not be doing anything with this wrapper after this method is called.
    *
    * Using the attachTo is not generally recommended unless it is absolutely necessary to test something.
    * It is your responsibility to clean up after yourself at the end of the test if you do decide to use it, though.
    */
  def detach(): Unit = js.native
  def filter(props: String): ReactWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  def filter(props: EnzymePropSelector): ReactWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  def filter[P2](component: ComponentType[P2]): ReactWrapper[P2, _, Component[js.Object, js.Object, _]] = js.native
  /**
    * Removes nodes in the current wrapper that do not match the provided selector.
    * @param selector The selector to match.
    */
  def filter[P2](statelessComponent: StatelessComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, _]] = js.native
  def find(props: EnzymePropSelector): ReactWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
  def find(selector: String): ReactWrapper[HTMLAttributes, _, Component[js.Object, js.Object, _]] = js.native
  def find[P2](component: ComponentType[P2]): ReactWrapper[P2, _, Component[js.Object, js.Object, _]] = js.native
  /**
    * Find every node in the render tree that matches the provided selector.
    * @param selector The selector to match.
    */
  def find[P2](statelessComponent: StatelessComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, _]] = js.native
  /**
    * Finds every node in the render tree that returns true for the provided predicate function.
    */
  def findWhere(
    predicate: js.Function1[/* wrapper */ ReactWrapper[_, _, Component[js.Object, js.Object, _]], Boolean]
  ): ReactWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
  @JSName("find")
  def find_props[C2 /* <: Component[js.Object, js.Object, _] */](
    componentClass: ComponentClass[
      /* import warning: importer.ImportType#apply Failed type conversion: C2['props'] */ js.Any
    ]
  ): ReactWrapper[
    /* import warning: importer.ImportType#apply Failed type conversion: C2['props'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: C2['state'] */ js.Any, 
    C2
  ] = js.native
  /**
    * If a wrappingComponent was passed in options,
    * this methods returns a ReactWrapper around the rendered wrappingComponent.
    * This ReactWrapper can be used to update the wrappingComponent's props and state
    */
  def getWrappingComponent(): ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]] = js.native
  /**
    * Strips out all the not host-nodes from the list of nodes
    *
    * This method is useful if you want to check for the presence of host nodes
    * (actually rendered HTML elements) ignoring the React nodes.
    */
  def hostNodes(): ReactWrapper[HTMLAttributes, js.Object, Component[js.Object, js.Object, _]] = js.native
  def mount(): this.type = js.native
  /**
    * Returns a wrapper with the direct parent of the node in the current wrapper.
    */
  def parent(): ReactWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
  def parents(): ReactWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
  def parents(props: EnzymePropSelector): ReactWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
  def parents(selector: String): ReactWrapper[HTMLAttributes, _, Component[js.Object, js.Object, _]] = js.native
  def parents[P2](component: ComponentType[P2]): ReactWrapper[P2, _, Component[js.Object, js.Object, _]] = js.native
  /**
    * Returns a wrapper around all of the parents/ancestors of the wrapper. Does not include the node in the
    * current wrapper. Optionally, a selector can be provided and it will filter the parents by this selector.
    *
    * Note: can only be called on a wrapper of a single node.
    */
  def parents[P2](statelessComponent: StatelessComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, _]] = js.native
  /**
    * Returns a wrapper of the node that matches the provided reference name.
    *
    * NOTE: can only be called on a wrapper instance that is also the root instance.
    */
  def ref(refName: String): ReactWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
  @JSName("ref")
  def ref_P2S2[P2, S2](refName: String): ReactWrapper[P2, S2, Component[js.Object, js.Object, _]] = js.native
  def unmount(): this.type = js.native
}

