package typings.enzyme

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.cheerio.cheerio.Cheerio
import typings.enzyme.anon.Adapter
import typings.enzyme.anon.Dictkey
import typings.enzyme.anon.HasShouldComponentUpdateBug
import typings.enzyme.anon.IgnoreProps
import typings.enzyme.anon.OnSetState
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.SVGAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.NonNullable
import typings.std.Pick
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enzyme", "ElementClass")
  @js.native
  class ElementClass protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(props: js.Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @JSImport("enzyme", "EnzymeAdapter")
  @js.native
  class EnzymeAdapter () extends StObject {
    
    var wrapWithWrappingComponent: js.UndefOr[
        js.Function2[/* node */ ReactElement, /* options */ js.UndefOr[ShallowRendererProps], _]
      ] = js.native
  }
  
  @JSImport("enzyme", "ReactWrapper")
  @js.native
  class ReactWrapper[P, S, C] protected () extends CommonWrapper[P, S, C] {
    def this(nodes: js.Array[Element]) = this()
    def this(nodes: Element) = this()
    def this(nodes: js.Array[Element], root: ReactWrapper[_, _, Component[js.Object, js.Object, _]]) = this()
    def this(nodes: Element, root: ReactWrapper[_, _, Component[js.Object, js.Object, _]]) = this()
    def this(nodes: js.Array[Element], root: js.UndefOr[scala.Nothing], options: MountRendererProps) = this()
    def this(
      nodes: js.Array[Element],
      root: ReactWrapper[_, _, Component[js.Object, js.Object, _]],
      options: MountRendererProps
    ) = this()
    def this(nodes: Element, root: js.UndefOr[scala.Nothing], options: MountRendererProps) = this()
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
  
  @JSImport("enzyme", "ShallowWrapper")
  @js.native
  class ShallowWrapper[P, S, C] protected () extends CommonWrapper[P, S, C] {
    def this(nodes: js.Array[Element]) = this()
    def this(nodes: Element) = this()
    def this(nodes: js.Array[Element], root: ShallowWrapper[_, _, Component[js.Object, js.Object, _]]) = this()
    def this(nodes: Element, root: ShallowWrapper[_, _, Component[js.Object, js.Object, _]]) = this()
    def this(nodes: js.Array[Element], root: js.UndefOr[scala.Nothing], options: ShallowRendererProps) = this()
    def this(
      nodes: js.Array[Element],
      root: ShallowWrapper[_, _, Component[js.Object, js.Object, _]],
      options: ShallowRendererProps
    ) = this()
    def this(nodes: Element, root: js.UndefOr[scala.Nothing], options: ShallowRendererProps) = this()
    def this(
      nodes: Element,
      root: ShallowWrapper[_, _, Component[js.Object, js.Object, _]],
      options: ShallowRendererProps
    ) = this()
    
    /**
      * Returns a new wrapper with child at the specified index.
      */
    def childAt(index: Double): ShallowWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
    @JSName("childAt")
    def childAt_P2S2[P2, S2](index: Double): ShallowWrapper[P2, S2, Component[js.Object, js.Object, _]] = js.native
    
    def children(): ShallowWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
    def children(props: EnzymePropSelector): ShallowWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
    def children(selector: String): ShallowWrapper[HTMLAttributes, _, Component[js.Object, js.Object, _]] = js.native
    def children[P2](component: ComponentType[P2]): ShallowWrapper[P2, _, Component[js.Object, js.Object, _]] = js.native
    /**
      * Returns a new wrapper with all of the children of the node(s) in the current wrapper. Optionally, a selector
      * can be provided and it will filter the children by this selector.
      */
    def children[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, _]] = js.native
    
    def closest(props: EnzymePropSelector): ShallowWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
    def closest(selector: String): ShallowWrapper[HTMLAttributes, _, Component[js.Object, js.Object, _]] = js.native
    def closest[P2](component: ComponentType[P2]): ShallowWrapper[P2, _, Component[js.Object, js.Object, _]] = js.native
    /**
      * Returns a wrapper of the first element that matches the selector by traversing up through the current node's
      * ancestors in the tree, starting with itself.
      *
      * Note: can only be called on a wrapper of a single node.
      */
    def closest[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, _]] = js.native
    
    def dive[P2, S2](): ShallowWrapper[P2, S2, Component[js.Object, js.Object, _]] = js.native
    def dive[P2, S2](options: ShallowRendererProps): ShallowWrapper[P2, S2, Component[js.Object, js.Object, _]] = js.native
    /**
      * Shallow render the one non-DOM child of the current wrapper, and return a wrapper around the result.
      * NOTE: can only be called on wrapper of a single non-DOM component element node.
      */
    @JSName("dive")
    def dive_C2_ComponentObjectObjectWildcardP2S2[C2 /* <: Component[js.Object, js.Object, _] */, P2, S2](): ShallowWrapper[P2, S2, C2] = js.native
    @JSName("dive")
    def dive_C2_ComponentObjectObjectWildcardP2S2[C2 /* <: Component[js.Object, js.Object, _] */, P2, S2](options: ShallowRendererProps): ShallowWrapper[P2, S2, C2] = js.native
    @JSName("dive")
    def dive_P2S2C2[P2, S2, C2](): ShallowWrapper[P2, S2, C2] = js.native
    @JSName("dive")
    def dive_P2S2C2[P2, S2, C2](options: ShallowRendererProps): ShallowWrapper[P2, S2, C2] = js.native
    
    def filter(props: String): ShallowWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
    def filter(props: EnzymePropSelector): ShallowWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
    def filter[P2](component: ComponentType[P2]): ShallowWrapper[P2, _, Component[js.Object, js.Object, _]] = js.native
    /**
      * Removes nodes in the current wrapper that do not match the provided selector.
      * @param selector The selector to match.
      */
    def filter[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, _]] = js.native
    
    def find(props: EnzymePropSelector): ShallowWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
    def find(selector: String): ShallowWrapper[HTMLAttributes, _, Component[js.Object, js.Object, _]] = js.native
    def find[P2](component: ComponentType[P2]): ShallowWrapper[P2, _, Component[js.Object, js.Object, _]] = js.native
    /**
      * Find every node in the render tree that matches the provided selector.
      * @param selector The selector to match.
      */
    def find[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, _]] = js.native
    
    /**
      * Finds every node in the render tree that returns true for the provided predicate function.
      */
    def findWhere(
      predicate: js.Function1[/* wrapper */ ShallowWrapper[_, _, Component[js.Object, js.Object, _]], Boolean]
    ): ShallowWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
    
    @JSName("find")
    def find_props[C2 /* <: Component[js.Object, js.Object, _] */](
      componentClass: ComponentClass[
          /* import warning: importer.ImportType#apply Failed type conversion: C2['props'] */ js.Any
        ]
    ): ShallowWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: C2['props'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: C2['state'] */ js.Any, 
        C2
      ] = js.native
    
    /**
      * If a wrappingComponent was passed in options,
      * this methods returns a ShallowWrapper around the rendered wrappingComponent.
      * This ShallowWrapper can be used to update the wrappingComponent's props and state
      */
    def getWrappingComponent(): ShallowWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]] = js.native
    
    /**
      * Strips out all the not host-nodes from the list of nodes
      *
      * This method is useful if you want to check for the presence of host nodes
      * (actually rendered HTML elements) ignoring the React nodes.
      */
    def hostNodes(): ShallowWrapper[HTMLAttributes, js.Object, Component[js.Object, js.Object, _]] = js.native
    
    /**
      * Returns a wrapper with the direct parent of the node in the current wrapper.
      */
    def parent(): ShallowWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
    
    def parents(): ShallowWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
    def parents(props: EnzymePropSelector): ShallowWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
    def parents(selector: String): ShallowWrapper[HTMLAttributes, _, Component[js.Object, js.Object, _]] = js.native
    def parents[P2](component: ComponentType[P2]): ShallowWrapper[P2, _, Component[js.Object, js.Object, _]] = js.native
    /**
      * Returns a wrapper around all of the parents/ancestors of the wrapper. Does not include the node in the
      * current wrapper. Optionally, a selector can be provided and it will filter the parents by this selector.
      *
      * Note: can only be called on a wrapper of a single node.
      */
    def parents[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, _]] = js.native
    
    /**
      * Returns a wrapper of the node rendered by the provided render prop.
      */
    def renderProp[PropName /* <: /* keyof P */ String */](prop: PropName): js.Function1[
        /* params */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: P[PropName] */ js.Any
        ], 
        ShallowWrapper[_, scala.Nothing, Component[js.Object, js.Object, _]]
      ] = js.native
    
    def shallow(): ShallowWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
    def shallow(options: ShallowRendererProps): ShallowWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
    
    def unmount(): this.type = js.native
  }
  
  @JSImport("enzyme", "configure")
  @js.native
  def configure(options: Adapter): Unit = js.native
  
  @JSImport("enzyme", "mount")
  @js.native
  def mount[P](node: ReactElement): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  @JSImport("enzyme", "mount")
  @js.native
  def mount[P](node: ReactElement, options: MountRendererProps): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  @JSImport("enzyme", "mount")
  @js.native
  def mount_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement): ReactWrapper[P, S, C] = js.native
  @JSImport("enzyme", "mount")
  @js.native
  def mount_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, C] = js.native
  @JSImport("enzyme", "mount")
  @js.native
  def mount_PS[P, S](node: ReactElement): ReactWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  @JSImport("enzyme", "mount")
  @js.native
  def mount_PS[P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  
  @JSImport("enzyme", "render")
  @js.native
  def render[P, S](node: ReactElement): Cheerio = js.native
  @JSImport("enzyme", "render")
  @js.native
  def render[P, S](node: ReactElement, options: js.Any): Cheerio = js.native
  
  @JSImport("enzyme", "shallow")
  @js.native
  def shallow[P](node: ReactElement): ShallowWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  @JSImport("enzyme", "shallow")
  @js.native
  def shallow[P](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  @JSImport("enzyme", "shallow")
  @js.native
  def shallow_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement): ShallowWrapper[P, S, C] = js.native
  @JSImport("enzyme", "shallow")
  @js.native
  def shallow_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, C] = js.native
  @JSImport("enzyme", "shallow")
  @js.native
  def shallow_PS[P, S](node: ReactElement): ShallowWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  @JSImport("enzyme", "shallow")
  @js.native
  def shallow_PS[P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  
  @js.native
  trait CommonWrapper[P, S, C] extends StObject {
    
    /**
      * Returns a wrapper around the node at a given index of the current wrapper.
      */
    def at(index: Double): this.type = js.native
    
    def contains(node: String): Boolean = js.native
    def contains(node: js.Array[ReactElement]): Boolean = js.native
    def contains(node: Double): Boolean = js.native
    /**
      * Returns whether or not the current wrapper has a node anywhere in it's render tree that looks like the one passed in.
      */
    def contains(node: ReactElement): Boolean = js.native
    
    /**
      * Returns whether or not all the given react elements exists in the shallow render tree
      */
    def containsAllMatchingElements(nodes: js.Array[js.Array[ReactElement] | ReactElement]): Boolean = js.native
    
    /**
      * Returns whether or not one of the given react elements exists in the shallow render tree.
      */
    def containsAnyMatchingElements(nodes: js.Array[js.Array[ReactElement] | ReactElement]): Boolean = js.native
    
    def containsMatchingElement(node: js.Array[ReactElement]): Boolean = js.native
    /**
      * Returns whether or not a given react element exists in the shallow render tree.
      */
    def containsMatchingElement(node: ReactElement): Boolean = js.native
    
    /**
      * Returns the context hash for the root node of the wrapper. Optionally pass in a prop name and it will return just that value.
      */
    def context(): js.Any = js.native
    def context[T](key: String): T = js.native
    
    /**
      * Returns an html-like string of the wrapper for debugging purposes. Useful to print out to the console when
      * tests are not passing when you expect them to.
      */
    def debug(): String = js.native
    def debug(options: IgnoreProps): String = js.native
    
    /**
      * Returns whether or not the current render tree is equal to the given node, based on the expected value.
      */
    def equals(node: ReactElement): Boolean = js.native
    
    /**
      * Returns whether or not all of the nodes in the wrapper match the provided selector.
      */
    def every(selector: EnzymeSelector): Boolean = js.native
    
    /**
      * Returns whether or not all of the nodes in the wrapper pass the provided predicate function.
      */
    def everyWhere(fn: js.Function1[/* wrapper */ this.type, Boolean]): Boolean = js.native
    
    /**
      * Returns whether or not the current node exists.
      */
    def exists(): Boolean = js.native
    def exists(selector: EnzymeSelector): Boolean = js.native
    
    /**
      * Returns a new wrapper with only the nodes of the current wrapper that, when passed into the provided predicate function, return true.
      */
    def filterWhere(predicate: js.Function1[/* wrapper */ this.type, Boolean]): this.type = js.native
    
    /**
      * Reduce the set of matched nodes to the first in the set.
      */
    def first(): this.type = js.native
    
    /**
      * Iterates through each node of the current wrapper and executes the provided function with a wrapper around
      * the corresponding node passed in as the first argument.
      *
      * Returns itself.
      * @param fn A callback to be run for every node in the collection. Should expect a ShallowWrapper as the first
      *              argument, and will be run with a context of the original instance.
      */
    def forEach(fn: js.Function2[/* wrapper */ this.type, /* index */ Double, _]): this.type = js.native
    
    /**
      * Returns the node at a given index of the current wrapper.
      */
    def get(index: Double): ReactElement = js.native
    
    /**
      * Returns the outer most DOMComponent of the current wrapper.
      */
    def getDOMNode[T /* <: typings.std.Element */](): T = js.native
    
    /**
      * Returns the wrapper's underlying node.
      */
    def getElement(): ReactElement = js.native
    
    /**
      * Returns the wrapper's underlying node.
      */
    def getElements(): js.Array[ReactElement] = js.native
    
    /**
      * Returns the wrapper's underlying node.
      */
    def getNode(): ReactElement = js.native
    
    /**
      * Returns the wrapper's underlying nodes.
      */
    def getNodes(): js.Array[ReactElement] = js.native
    
    /**
      * Returns whether or not the current node has a className prop including the passed in class name.
      */
    def hasClass(className: String): Boolean = js.native
    def hasClass(className: RegExp): Boolean = js.native
    
    /**
      * Returns a string of the rendered HTML markup of the current render tree.
      *
      * Note: can only be called on a wrapper of a single node.
      */
    def html(): String = js.native
    
    /**
      * Gets the instance of the component being rendered as the root node passed into shallow().
      *
      * NOTE: can only be called on a wrapper instance that is also the root instance.
      */
    def instance(): C = js.native
    
    /**
      * Invokes a function prop.
      * @param invokePropName The function prop to call.
      * @param ...args The argments to the invokePropName function
      * @returns The value of the function.
      */
    def invoke[K /* <: NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: P[K] extends (arg : ...any): void | undefined? K : never}[keyof P] */ js.Any
      ] */](invokePropName: K): /* import warning: importer.ImportType#apply Failed type conversion: P[K] */ js.Any = js.native
    
    /**
      * Returns whether or not the current node matches a provided selector.
      */
    def is(selector: EnzymeSelector): Boolean = js.native
    
    /**
      * Returns whether or not the current node is empty.
      * @deprecated Use .exists() instead.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * Returns true if renderer returned null
      */
    def isEmptyRender(): Boolean = js.native
    
    /**
      * Returns the key value for the node of the current wrapper.
      * NOTE: can only be called on a wrapper of a single node.
      */
    def key(): String = js.native
    
    /**
      * Reduce the set of matched nodes to the last in the set.
      */
    def last(): this.type = js.native
    
    var length: Double = js.native
    
    /**
      * Maps the current array of nodes to another array. Each node is passed in as a ShallowWrapper to the map
      * function.
      * Returns an array of the returned values from the mapping function..
      * @param fn A mapping function to be run for every node in the collection, the results of which will be mapped
      *              to the returned array. Should expect a ShallowWrapper as the first argument, and will be run
      *              with a context of the original instance.
      */
    def map[V](fn: js.Function2[/* wrapper */ this.type, /* index */ Double, V]): js.Array[V] = js.native
    
    /**
      * Returns whether or not a given react element matches the shallow render tree.
      */
    def matchesElement(node: ReactElement): Boolean = js.native
    
    /**
      * Returns the name of the current node of the wrapper.
      */
    def name(): String = js.native
    
    /**
      * Returns a new wrapper with only the nodes of the current wrapper that don't match the provided selector.
      * This method is effectively the negation or inverse of filter.
      */
    def not(selector: EnzymeSelector): this.type = js.native
    
    /**
      * Returns the prop value for the node of the current wrapper with the provided key.
      *
      * NOTE: can only be called on a wrapper of a single node.
      */
    def prop[K /* <: /* keyof P */ String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: P[K] */ js.Any = js.native
    def prop[T](key: String): T = js.native
    
    /**
      * Returns the props hash for the current node of the wrapper.
      *
      * NOTE: can only be called on a wrapper of a single node.
      */
    def props(): P = js.native
    
    /**
      * Applies the provided reducing function to every node in the wrapper to reduce to a single value. Each node
      * is passed in as a ShallowWrapper, and is processed from left to right.
      */
    def reduce[R](fn: js.Function3[/* prevVal */ R, /* wrapper */ this.type, /* index */ Double, R]): R = js.native
    def reduce[R](fn: js.Function3[/* prevVal */ R, /* wrapper */ this.type, /* index */ Double, R], initialValue: R): R = js.native
    
    /**
      * Applies the provided reducing function to every node in the wrapper to reduce to a single value.
      * Each node is passed in as a ShallowWrapper, and is processed from right to left.
      */
    def reduceRight[R](fn: js.Function3[/* prevVal */ R, /* wrapper */ this.type, /* index */ Double, R]): R = js.native
    def reduceRight[R](fn: js.Function3[/* prevVal */ R, /* wrapper */ this.type, /* index */ Double, R], initialValue: R): R = js.native
    
    /**
      * Renders the component to static markup and returns a Cheerio wrapper around the result.
      */
    def render(): Cheerio = js.native
    
    /**
      * A method that sets the context of the root component, and re-renders. Useful for when you are wanting to
      * test how the component behaves over time with changing contexts.
      * Returns itself.
      *
      * NOTE: can only be called on a wrapper instance that is also the root instance.
      */
    def setContext(context: js.Any): this.type = js.native
    
    /**
      * A method that sets the props of the root component, and re-renders. Useful for when you are wanting to test
      * how the component behaves over time with changing props. Calling this, for instance, will call the
      * componentWillReceiveProps lifecycle method.
      *
      * Similar to setState, this method accepts a props object and will merge it in with the already existing props.
      * Returns itself.
      *
      * NOTE: can only be called on a wrapper instance that is also the root instance.
      */
    def setProps[K /* <: /* keyof P */ String */](props: Pick[P, K]): this.type = js.native
    def setProps[K /* <: /* keyof P */ String */](props: Pick[P, K], callback: js.Function0[Unit]): this.type = js.native
    
    /**
      * A method to invoke setState() on the root component instance similar to how you might in the definition of
      * the component, and re-renders. This method is useful for testing your component in hard to achieve states,
      * however should be used sparingly. If possible, you should utilize your component's external API in order to
      * get it into whatever state you want to test, in order to be as accurate of a test as possible. This is not
      * always practical, however.
      * Returns itself.
      *
      * NOTE: can only be called on a wrapper instance that is also the root instance.
      */
    def setState[K /* <: /* keyof S */ String */](state: Pick[S, K]): this.type = js.native
    def setState[K /* <: /* keyof S */ String */](state: Pick[S, K], callback: js.Function0[Unit]): this.type = js.native
    
    /**
      * Simulate events.
      * Returns itself.
      * @param args?
      */
    def simulate(event: String, args: js.Any*): this.type = js.native
    
    /**
      * Used to simulate throwing a rendering error. Pass an error to throw.
      * Returns itself.
      * @param error
      */
    def simulateError(error: js.Any): this.type = js.native
    
    /**
      * Returns a new wrapper with a subset of the nodes of the original wrapper, according to the rules of `Array#slice`.
      */
    def slice(): this.type = js.native
    def slice(begin: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    def slice(begin: Double): this.type = js.native
    def slice(begin: Double, end: Double): this.type = js.native
    
    /**
      * Returns whether or not any of the nodes in the wrapper match the provided selector.
      */
    def some(selector: EnzymeSelector): Boolean = js.native
    
    /**
      * Returns whether or not any of the nodes in the wrapper pass the provided predicate function.
      */
    def someWhere(fn: js.Function1[/* wrapper */ this.type, Boolean]): Boolean = js.native
    
    /**
      * Returns the state hash for the root node of the wrapper. Optionally pass in a prop name and it will return just that value.
      */
    def state(): S = js.native
    def state[K /* <: /* keyof S */ String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: S[K] */ js.Any = js.native
    def state[T](key: String): T = js.native
    
    /**
      * Taps into the wrapper method chain. Helpful for debugging.
      */
    def tap(intercepter: Intercepter[this.type]): this.type = js.native
    
    /**
      * Returns a string of the rendered text of the current render tree. This function should be looked at with
      * skepticism if being used to test what the actual HTML output of the component will be. If that is what you
      * would like to test, use enzyme's render function instead.
      *
      * Note: can only be called on a wrapper of a single node.
      */
    def text(): String = js.native
    
    /**
      * Returns the type of the current node of this wrapper. If it's a composite component, this will be the
      * component constructor. If it's native DOM node, it will be a string of the tag name.
      *
      * Note: can only be called on a wrapper of a single node.
      */
    def `type`(): String | ComponentClass[P] | StatelessComponent[P] = js.native
    
    /**
      * Forces a re-render. Useful to run before checking the render output if something external may be updating
      * the state of the component somewhere.
      * Returns itself.
      *
      * NOTE: can only be called on a wrapper instance that is also the root instance.
      */
    def update(): this.type = js.native
  }
  
  @js.native
  trait ComponentClass[Props]
    extends Instantiable1[/* props */ Props, Component[Props, js.Object, js.Any]]
       with Instantiable2[/* props */ Props, /* context */ js.Any, Component[Props, js.Object, js.Any]]
  
  type ComponentType[Props] = ComponentClass[Props] | StatelessComponent[Props]
  
  type EnzymePropSelector = StringDictionary[js.Any]
  
  type EnzymeSelector = String | StatelessComponent[js.Any] | ComponentClass[js.Any] | EnzymePropSelector
  
  type HTMLAttributes = AllHTMLAttributes[js.Object] with SVGAttributes[js.Object]
  
  type Intercepter[T] = js.Function1[/* intercepter */ T, Unit]
  
  @js.native
  trait Lifecycles
    extends // TODO Maybe some life cycle are missing
  /* lifecycleName */ StringDictionary[js.Any] {
    
    var componentDidUpdate: js.UndefOr[OnSetState] = js.native
    
    var getChildContext: js.UndefOr[Dictkey] = js.native
    
    var getDerivedStateFromProps: js.UndefOr[HasShouldComponentUpdateBug | Boolean] = js.native
    
    var setState: js.UndefOr[js.Any] = js.native
  }
  object Lifecycles {
    
    @scala.inline
    def apply(): Lifecycles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Lifecycles]
    }
    
    @scala.inline
    implicit class LifecyclesMutableBuilder[Self <: Lifecycles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentDidUpdate(value: OnSetState): Self = StObject.set(x, "componentDidUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentDidUpdateUndefined: Self = StObject.set(x, "componentDidUpdate", js.undefined)
      
      @scala.inline
      def setGetChildContext(value: Dictkey): Self = StObject.set(x, "getChildContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetChildContextUndefined: Self = StObject.set(x, "getChildContext", js.undefined)
      
      @scala.inline
      def setGetDerivedStateFromProps(value: HasShouldComponentUpdateBug | Boolean): Self = StObject.set(x, "getDerivedStateFromProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDerivedStateFromPropsUndefined: Self = StObject.set(x, "getDerivedStateFromProps", js.undefined)
      
      @scala.inline
      def setSetState(value: js.Any): Self = StObject.set(x, "setState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetStateUndefined: Self = StObject.set(x, "setState", js.undefined)
    }
  }
  
  @js.native
  trait MountRendererProps extends StObject {
    
    /**
      * DOM Element to attach the component to
      */
    var attachTo: js.UndefOr[HTMLElement | Null] = js.native
    
    /**
      * Merged contextTypes for all children of the wrapper
      */
    var childContextTypes: js.UndefOr[js.Object] = js.native
    
    /**
      * Context to be passed into the component
      */
    var context: js.UndefOr[js.Object] = js.native
    
    /**
      * A component that will render as a parent of the node.
      * It can be used to provide context to the `node`, among other things.
      * See the [getWrappingComponent() docs](https://airbnb.io/enzyme/docs/api/ShallowWrapper/getWrappingComponent.html) for an example.
      * **Note**: `wrappingComponent` must render its children.
      */
    var wrappingComponent: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Initial props to pass to the `wrappingComponent` if it is specified.
      */
    var wrappingComponentProps: js.UndefOr[js.Object] = js.native
  }
  object MountRendererProps {
    
    @scala.inline
    def apply(): MountRendererProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MountRendererProps]
    }
    
    @scala.inline
    implicit class MountRendererPropsMutableBuilder[Self <: MountRendererProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachTo(value: HTMLElement): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachToNull: Self = StObject.set(x, "attachTo", null)
      
      @scala.inline
      def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      @scala.inline
      def setChildContextTypes(value: js.Object): Self = StObject.set(x, "childContextTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildContextTypesUndefined: Self = StObject.set(x, "childContextTypes", js.undefined)
      
      @scala.inline
      def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setWrappingComponent(value: ComponentType[_]): Self = StObject.set(x, "wrappingComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappingComponentFunction2(value: (_, /* context */ js.UndefOr[js.Any]) => Element | Null): Self = StObject.set(x, "wrappingComponent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWrappingComponentProps(value: js.Object): Self = StObject.set(x, "wrappingComponentProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappingComponentPropsUndefined: Self = StObject.set(x, "wrappingComponentProps", js.undefined)
      
      @scala.inline
      def setWrappingComponentUndefined: Self = StObject.set(x, "wrappingComponent", js.undefined)
    }
  }
  
  type Parameters[T] = js.Any
  
  @js.native
  trait ShallowRendererProps extends StObject {
    
    var PROVIDER_VALUES: js.UndefOr[js.Any] = js.native
    
    var adapter: js.UndefOr[EnzymeAdapter] = js.native
    
    /* TODO what are these doing??? */
    var attachTo: js.UndefOr[js.Any] = js.native
    
    /**
      * Context to be passed into the component
      */
    var context: js.UndefOr[js.Any] = js.native
    
    // See https://github.com/airbnb/enzyme/blob/enzyme@3.10.0/docs/api/shallow.md#arguments
    /**
      * If set to true, componentDidMount is not called on the component, and componentDidUpdate is not called after
      * setProps and setContext. Default to false.
      */
    var disableLifecycleMethods: js.UndefOr[Boolean] = js.native
    
    /**
      * The legacy enableComponentDidUpdateOnSetState option should be matched by
      * `lifecycles: { componentDidUpdate: { onSetState: true } }`, for compatibility
      */
    var enableComponentDidUpdateOnSetState: js.UndefOr[Boolean] = js.native
    
    var hydrateIn: js.UndefOr[js.Any] = js.native
    
    /**
      * Enable experimental support for full react lifecycle methods
      */
    var lifecycleExperimental: js.UndefOr[Boolean] = js.native
    
    var lifecycles: js.UndefOr[Lifecycles] = js.native
    
    /**
      * the legacy supportPrevContextArgumentOfComponentDidUpdate option should be matched by
      * `lifecycles: { componentDidUpdate: { prevContext: true } }`, for compatibility
      */
    var supportPrevContextArgumentOfComponentDidUpdate: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to true, when rendering Suspense enzyme will replace all the lazy components in children
      * with fallback element prop. Otherwise it won't handle fallback of lazy component.
      * Default to true. Note: not supported in React < 16.6.
      */
    var suspenseFallback: js.UndefOr[Boolean] = js.native
    
    /**
      * A component that will render as a parent of the node.
      * It can be used to provide context to the `node`, among other things.
      * See the [getWrappingComponent() docs](https://airbnb.io/enzyme/docs/api/ShallowWrapper/getWrappingComponent.html) for an example.
      * **Note**: `wrappingComponent` must render its children.
      */
    var wrappingComponent: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Initial props to pass to the `wrappingComponent` if it is specified.
      */
    var wrappingComponentProps: js.UndefOr[js.Object] = js.native
  }
  object ShallowRendererProps {
    
    @scala.inline
    def apply(): ShallowRendererProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShallowRendererProps]
    }
    
    @scala.inline
    implicit class ShallowRendererPropsMutableBuilder[Self <: ShallowRendererProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: EnzymeAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      @scala.inline
      def setAttachTo(value: js.Any): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDisableLifecycleMethods(value: Boolean): Self = StObject.set(x, "disableLifecycleMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableLifecycleMethodsUndefined: Self = StObject.set(x, "disableLifecycleMethods", js.undefined)
      
      @scala.inline
      def setEnableComponentDidUpdateOnSetState(value: Boolean): Self = StObject.set(x, "enableComponentDidUpdateOnSetState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableComponentDidUpdateOnSetStateUndefined: Self = StObject.set(x, "enableComponentDidUpdateOnSetState", js.undefined)
      
      @scala.inline
      def setHydrateIn(value: js.Any): Self = StObject.set(x, "hydrateIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHydrateInUndefined: Self = StObject.set(x, "hydrateIn", js.undefined)
      
      @scala.inline
      def setLifecycleExperimental(value: Boolean): Self = StObject.set(x, "lifecycleExperimental", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifecycleExperimentalUndefined: Self = StObject.set(x, "lifecycleExperimental", js.undefined)
      
      @scala.inline
      def setLifecycles(value: Lifecycles): Self = StObject.set(x, "lifecycles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifecyclesUndefined: Self = StObject.set(x, "lifecycles", js.undefined)
      
      @scala.inline
      def setPROVIDER_VALUES(value: js.Any): Self = StObject.set(x, "PROVIDER_VALUES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPROVIDER_VALUESUndefined: Self = StObject.set(x, "PROVIDER_VALUES", js.undefined)
      
      @scala.inline
      def setSupportPrevContextArgumentOfComponentDidUpdate(value: Boolean): Self = StObject.set(x, "supportPrevContextArgumentOfComponentDidUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportPrevContextArgumentOfComponentDidUpdateUndefined: Self = StObject.set(x, "supportPrevContextArgumentOfComponentDidUpdate", js.undefined)
      
      @scala.inline
      def setSuspenseFallback(value: Boolean): Self = StObject.set(x, "suspenseFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspenseFallbackUndefined: Self = StObject.set(x, "suspenseFallback", js.undefined)
      
      @scala.inline
      def setWrappingComponent(value: ComponentType[_]): Self = StObject.set(x, "wrappingComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappingComponentFunction2(value: (_, /* context */ js.UndefOr[js.Any]) => Element | Null): Self = StObject.set(x, "wrappingComponent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWrappingComponentProps(value: js.Object): Self = StObject.set(x, "wrappingComponentProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappingComponentPropsUndefined: Self = StObject.set(x, "wrappingComponentProps", js.undefined)
      
      @scala.inline
      def setWrappingComponentUndefined: Self = StObject.set(x, "wrappingComponent", js.undefined)
    }
  }
  
  type StatelessComponent[Props] = js.Function2[/* props */ Props, /* context */ js.UndefOr[js.Any], Element | Null]
}
