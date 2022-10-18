package typings.enzyme

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.enzyme.anon.Adapter
import typings.enzyme.anon.Dictkey
import typings.enzyme.anon.HasShouldComponentUpdateBug
import typings.enzyme.anon.IgnoreProps
import typings.enzyme.anon.OnSetState
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.Booleanish
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.react.reactStrings.`after-edge`
import typings.react.reactStrings.`before-edge`
import typings.react.reactStrings.`text-after-edge`
import typings.react.reactStrings.`text-before-edge`
import typings.react.reactStrings.alphabetic
import typings.react.reactStrings.auto
import typings.react.reactStrings.baseline
import typings.react.reactStrings.bevel
import typings.react.reactStrings.butt
import typings.react.reactStrings.central
import typings.react.reactStrings.evenodd
import typings.react.reactStrings.hanging
import typings.react.reactStrings.ideographic
import typings.react.reactStrings.inherit
import typings.react.reactStrings.initial
import typings.react.reactStrings.isolated
import typings.react.reactStrings.linearRGB
import typings.react.reactStrings.mathematical
import typings.react.reactStrings.medial
import typings.react.reactStrings.middle
import typings.react.reactStrings.miter
import typings.react.reactStrings.no
import typings.react.reactStrings.none
import typings.react.reactStrings.nonzero
import typings.react.reactStrings.replace
import typings.react.reactStrings.round
import typings.react.reactStrings.sRGB
import typings.react.reactStrings.square
import typings.react.reactStrings.sum
import typings.react.reactStrings.terminal
import typings.react.reactStrings.yes
import typings.std.HTMLElement
import typings.std.NonNullable
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enzyme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("enzyme", "ElementClass")
  @js.native
  open class ElementClass protected () extends Component[Any, Any, Any] {
    def this(props: Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Any, context: Any) = this()
  }
  
  @JSImport("enzyme", "EnzymeAdapter")
  @js.native
  open class EnzymeAdapter () extends StObject {
    
    var wrapWithWrappingComponent: js.UndefOr[
        js.Function2[/* node */ ReactElement, /* options */ js.UndefOr[ShallowRendererProps], Any]
      ] = js.native
  }
  
  @JSImport("enzyme", "ReactWrapper")
  @js.native
  open class ReactWrapper[P, S, C] protected ()
    extends StObject
       with CommonWrapper[P, S, C] {
    def this(nodes: js.Array[Element]) = this()
    def this(nodes: Element) = this()
    def this(nodes: js.Array[Element], root: ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]]) = this()
    def this(nodes: Element, root: ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]]) = this()
    def this(nodes: js.Array[Element], root: Unit, options: MountRendererProps) = this()
    def this(
      nodes: js.Array[Element],
      root: ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]],
      options: MountRendererProps
    ) = this()
    def this(nodes: Element, root: Unit, options: MountRendererProps) = this()
    def this(
      nodes: Element,
      root: ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]],
      options: MountRendererProps
    ) = this()
    
    /**
      * Returns a new wrapper with child at the specified index.
      */
    def childAt(index: Double): ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    @JSName("childAt")
    def childAt_P2S2[P2, S2](index: Double): ReactWrapper[P2, S2, Component[js.Object, js.Object, Any]] = js.native
    
    def children(): ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    def children(props: EnzymePropSelector): ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    def children(selector: String): ReactWrapper[HTMLAttributes, Any, Component[js.Object, js.Object, Any]] = js.native
    def children[P2](component: ComponentType[P2]): ReactWrapper[P2, Any, Component[js.Object, js.Object, Any]] = js.native
    /**
      * Returns a new wrapper with all of the children of the node(s) in the current wrapper. Optionally, a selector
      * can be provided and it will filter the children by this selector.
      */
    def children[P2](statelessComponent: FunctionComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, Any]] = js.native
    
    def closest(props: EnzymePropSelector): ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    def closest(selector: String): ReactWrapper[HTMLAttributes, Any, Component[js.Object, js.Object, Any]] = js.native
    def closest[P2](component: ComponentType[P2]): ReactWrapper[P2, Any, Component[js.Object, js.Object, Any]] = js.native
    /**
      * Returns a wrapper of the first element that matches the selector by traversing up through the current node's
      * ancestors in the tree, starting with itself.
      *
      * Note: can only be called on a wrapper of a single node.
      */
    def closest[P2](statelessComponent: FunctionComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, Any]] = js.native
    
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
    
    def filter(props: String): ReactWrapper[P, S, Component[js.Object, js.Object, Any]] = js.native
    def filter(props: EnzymePropSelector): ReactWrapper[P, S, Component[js.Object, js.Object, Any]] = js.native
    def filter[P2](component: ComponentType[P2]): ReactWrapper[P2, Any, Component[js.Object, js.Object, Any]] = js.native
    /**
      * Removes nodes in the current wrapper that do not match the provided selector.
      * @param selector The selector to match.
      */
    def filter[P2](statelessComponent: FunctionComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, Any]] = js.native
    
    def find(props: EnzymePropSelector): ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    def find(selector: String): ReactWrapper[HTMLAttributes, Any, Component[js.Object, js.Object, Any]] = js.native
    def find[P2](component: ComponentType[P2]): ReactWrapper[P2, Any, Component[js.Object, js.Object, Any]] = js.native
    /**
      * Find every node in the render tree that matches the provided selector.
      * @param selector The selector to match.
      */
    def find[P2](statelessComponent: FunctionComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, Any]] = js.native
    
    /**
      * Finds every node in the render tree that returns true for the provided predicate function.
      */
    def findWhere(
      predicate: js.Function1[
          /* wrapper */ ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]], 
          Boolean
        ]
    ): ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    
    @JSName("find")
    def find_props[C2 /* <: Component[js.Object, js.Object, Any] */](
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
    def getWrappingComponent(): ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, Any]] = js.native
    
    /**
      * Strips out all the not host-nodes from the list of nodes
      *
      * This method is useful if you want to check for the presence of host nodes
      * (actually rendered HTML elements) ignoring the React nodes.
      */
    def hostNodes(): ReactWrapper[HTMLAttributes, js.Object, Component[js.Object, js.Object, Any]] = js.native
    
    def mount(): this.type = js.native
    
    /**
      * Returns a wrapper with the direct parent of the node in the current wrapper.
      */
    def parent(): ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    
    def parents(): ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    def parents(props: EnzymePropSelector): ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    def parents(selector: String): ReactWrapper[HTMLAttributes, Any, Component[js.Object, js.Object, Any]] = js.native
    def parents[P2](component: ComponentType[P2]): ReactWrapper[P2, Any, Component[js.Object, js.Object, Any]] = js.native
    /**
      * Returns a wrapper around all of the parents/ancestors of the wrapper. Does not include the node in the
      * current wrapper. Optionally, a selector can be provided and it will filter the parents by this selector.
      *
      * Note: can only be called on a wrapper of a single node.
      */
    def parents[P2](statelessComponent: FunctionComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, Any]] = js.native
    
    /**
      * Returns a wrapper of the node that matches the provided reference name.
      *
      * NOTE: can only be called on a wrapper instance that is also the root instance.
      */
    def ref(refName: String): ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    @JSName("ref")
    def ref_P2S2[P2, S2](refName: String): ReactWrapper[P2, S2, Component[js.Object, js.Object, Any]] = js.native
    
    /**
      * Returns a wrapper of the node rendered by the provided render prop.
      */
    def renderProp[PropName /* <: /* keyof P */ String */](prop: PropName): js.Function1[
        /* params */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: P[PropName] */ js.Any
        ], 
        ReactWrapper[Any, scala.Nothing, Component[js.Object, js.Object, Any]]
      ] = js.native
    
    def unmount(): this.type = js.native
  }
  
  @JSImport("enzyme", "ShallowWrapper")
  @js.native
  open class ShallowWrapper[P, S, C] protected ()
    extends StObject
       with CommonWrapper[P, S, C] {
    def this(nodes: js.Array[Element]) = this()
    def this(nodes: Element) = this()
    def this(nodes: js.Array[Element], root: ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]]) = this()
    def this(nodes: Element, root: ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]]) = this()
    def this(nodes: js.Array[Element], root: Unit, options: ShallowRendererProps) = this()
    def this(
      nodes: js.Array[Element],
      root: ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]],
      options: ShallowRendererProps
    ) = this()
    def this(nodes: Element, root: Unit, options: ShallowRendererProps) = this()
    def this(
      nodes: Element,
      root: ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]],
      options: ShallowRendererProps
    ) = this()
    
    /**
      * Returns a new wrapper with child at the specified index.
      */
    def childAt(index: Double): ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    @JSName("childAt")
    def childAt_P2S2[P2, S2](index: Double): ShallowWrapper[P2, S2, Component[js.Object, js.Object, Any]] = js.native
    
    def children(): ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    def children(props: EnzymePropSelector): ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    def children(selector: String): ShallowWrapper[HTMLAttributes, Any, Component[js.Object, js.Object, Any]] = js.native
    def children[P2](component: ComponentType[P2]): ShallowWrapper[P2, Any, Component[js.Object, js.Object, Any]] = js.native
    /**
      * Returns a new wrapper with all of the children of the node(s) in the current wrapper. Optionally, a selector
      * can be provided and it will filter the children by this selector.
      */
    def children[P2](statelessComponent: FunctionComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, Any]] = js.native
    
    def closest(props: EnzymePropSelector): ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    def closest(selector: String): ShallowWrapper[HTMLAttributes, Any, Component[js.Object, js.Object, Any]] = js.native
    def closest[P2](component: ComponentType[P2]): ShallowWrapper[P2, Any, Component[js.Object, js.Object, Any]] = js.native
    /**
      * Returns a wrapper of the first element that matches the selector by traversing up through the current node's
      * ancestors in the tree, starting with itself.
      *
      * Note: can only be called on a wrapper of a single node.
      */
    def closest[P2](statelessComponent: FunctionComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, Any]] = js.native
    
    def dive[P2, S2](): ShallowWrapper[P2, S2, Component[js.Object, js.Object, Any]] = js.native
    def dive[P2, S2](options: ShallowRendererProps): ShallowWrapper[P2, S2, Component[js.Object, js.Object, Any]] = js.native
    /**
      * Shallow render the one non-DOM child of the current wrapper, and return a wrapper around the result.
      * NOTE: can only be called on wrapper of a single non-DOM component element node.
      */
    @JSName("dive")
    def dive_C2P2S2[C2 /* <: Component[js.Object, js.Object, Any] */, P2, S2](): ShallowWrapper[P2, S2, C2] = js.native
    @JSName("dive")
    def dive_C2P2S2[C2 /* <: Component[js.Object, js.Object, Any] */, P2, S2](options: ShallowRendererProps): ShallowWrapper[P2, S2, C2] = js.native
    @JSName("dive")
    def dive_P2S2C2[P2, S2, C2](): ShallowWrapper[P2, S2, C2] = js.native
    @JSName("dive")
    def dive_P2S2C2[P2, S2, C2](options: ShallowRendererProps): ShallowWrapper[P2, S2, C2] = js.native
    
    def filter(props: String): ShallowWrapper[P, S, Component[js.Object, js.Object, Any]] = js.native
    def filter(props: EnzymePropSelector): ShallowWrapper[P, S, Component[js.Object, js.Object, Any]] = js.native
    def filter[P2](component: ComponentType[P2]): ShallowWrapper[P2, Any, Component[js.Object, js.Object, Any]] = js.native
    /**
      * Removes nodes in the current wrapper that do not match the provided selector.
      * @param selector The selector to match.
      */
    def filter[P2](statelessComponent: FunctionComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, Any]] = js.native
    
    def find(props: EnzymePropSelector): ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    def find(selector: String): ShallowWrapper[HTMLAttributes, Any, Component[js.Object, js.Object, Any]] = js.native
    def find[P2](component: ComponentType[P2]): ShallowWrapper[P2, Any, Component[js.Object, js.Object, Any]] = js.native
    /**
      * Find every node in the render tree that matches the provided selector.
      * @param selector The selector to match.
      */
    def find[P2](statelessComponent: FunctionComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, Any]] = js.native
    
    /**
      * Finds every node in the render tree that returns true for the provided predicate function.
      */
    def findWhere(
      predicate: js.Function1[
          /* wrapper */ ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]], 
          Boolean
        ]
    ): ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    
    @JSName("find")
    def find_props[C2 /* <: Component[js.Object, js.Object, Any] */](
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
    def getWrappingComponent(): ShallowWrapper[js.Object, js.Object, Component[js.Object, js.Object, Any]] = js.native
    
    /**
      * Strips out all the not host-nodes from the list of nodes
      *
      * This method is useful if you want to check for the presence of host nodes
      * (actually rendered HTML elements) ignoring the React nodes.
      */
    def hostNodes(): ShallowWrapper[HTMLAttributes, js.Object, Component[js.Object, js.Object, Any]] = js.native
    
    /**
      * Returns a wrapper with the direct parent of the node in the current wrapper.
      */
    def parent(): ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    
    def parents(): ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    def parents(props: EnzymePropSelector): ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]] = js.native
    def parents(selector: String): ShallowWrapper[HTMLAttributes, Any, Component[js.Object, js.Object, Any]] = js.native
    def parents[P2](component: ComponentType[P2]): ShallowWrapper[P2, Any, Component[js.Object, js.Object, Any]] = js.native
    /**
      * Returns a wrapper around all of the parents/ancestors of the wrapper. Does not include the node in the
      * current wrapper. Optionally, a selector can be provided and it will filter the parents by this selector.
      *
      * Note: can only be called on a wrapper of a single node.
      */
    def parents[P2](statelessComponent: FunctionComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, Any]] = js.native
    
    /**
      * Returns a wrapper of the node rendered by the provided render prop.
      */
    def renderProp[PropName /* <: /* keyof P */ String */](prop: PropName): js.Function1[
        /* params */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: P[PropName] */ js.Any
        ], 
        ShallowWrapper[Any, scala.Nothing, Component[js.Object, js.Object, Any]]
      ] = js.native
    
    def shallow(): ShallowWrapper[P, S, Component[js.Object, js.Object, Any]] = js.native
    def shallow(options: ShallowRendererProps): ShallowWrapper[P, S, Component[js.Object, js.Object, Any]] = js.native
    
    def unmount(): this.type = js.native
  }
  
  inline def configure(options: Adapter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mount[P](node: ReactElement): ReactWrapper[P, Any, Component[js.Object, js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(node.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, Any, Component[js.Object, js.Object, Any]]]
  inline def mount[P](node: ReactElement, options: MountRendererProps): ReactWrapper[P, Any, Component[js.Object, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, Any, Component[js.Object, js.Object, Any]]]
  
  inline def mount_CPS[C /* <: Component[js.Object, js.Object, Any] */, P, S](node: ReactElement): ReactWrapper[P, S, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(node.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, S, C]]
  inline def mount_CPS[C /* <: Component[js.Object, js.Object, Any] */, P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, S, C]]
  
  inline def mount_PS[P, S](node: ReactElement): ReactWrapper[P, S, Component[js.Object, js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(node.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, S, Component[js.Object, js.Object, Any]]]
  inline def mount_PS[P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, Component[js.Object, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, S, Component[js.Object, js.Object, Any]]]
  
  inline def render[P, S](node: ReactElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def render[P, S](node: ReactElement, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def shallow[P](node: ReactElement): ShallowWrapper[P, Any, Component[js.Object, js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(node.asInstanceOf[js.Any]).asInstanceOf[ShallowWrapper[P, Any, Component[js.Object, js.Object, Any]]]
  inline def shallow[P](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, Any, Component[js.Object, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, Any, Component[js.Object, js.Object, Any]]]
  
  inline def shallow_CPS[C /* <: Component[js.Object, js.Object, Any] */, P, S](node: ReactElement): ShallowWrapper[P, S, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(node.asInstanceOf[js.Any]).asInstanceOf[ShallowWrapper[P, S, C]]
  inline def shallow_CPS[C /* <: Component[js.Object, js.Object, Any] */, P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, S, C]]
  
  inline def shallow_PS[P, S](node: ReactElement): ShallowWrapper[P, S, Component[js.Object, js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(node.asInstanceOf[js.Any]).asInstanceOf[ShallowWrapper[P, S, Component[js.Object, js.Object, Any]]]
  inline def shallow_PS[P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, Component[js.Object, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, S, Component[js.Object, js.Object, Any]]]
  
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
    def context(): Any = js.native
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
    def forEach(fn: js.Function2[/* wrapper */ this.type, /* index */ Double, Any]): this.type = js.native
    
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
    def hasClass(className: js.RegExp): Boolean = js.native
    
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
      * @param ...args The arguments to the invokePropName function
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
    def render(): Any = js.native
    
    /**
      * A method that sets the context of the root component, and re-renders. Useful for when you are wanting to
      * test how the component behaves over time with changing contexts.
      * Returns itself.
      *
      * NOTE: can only be called on a wrapper instance that is also the root instance.
      */
    def setContext(context: Any): this.type = js.native
    
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
    def simulate(event: String, args: Any*): this.type = js.native
    
    /**
      * Used to simulate throwing a rendering error. Pass an error to throw.
      * Returns itself.
      * @param error
      */
    def simulateError(error: Any): this.type = js.native
    
    /**
      * Returns a new wrapper with a subset of the nodes of the original wrapper, according to the rules of `Array#slice`.
      */
    def slice(): this.type = js.native
    def slice(begin: Double): this.type = js.native
    def slice(begin: Double, end: Double): this.type = js.native
    def slice(begin: Unit, end: Double): this.type = js.native
    
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
    def `type`(): String | ComponentClass[P] | FunctionComponent[P] = js.native
    
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
    extends StObject
       with Instantiable1[/* props */ Props, Component[Props, js.Object, Any]]
       with Instantiable2[/* props */ Props, /* context */ Any, Component[Props, js.Object, Any]]
  
  type ComponentType[Props] = ComponentClass[Props] | FunctionComponent[Props]
  
  type EnzymePropSelector = StringDictionary[Any]
  
  type EnzymeSelector = String | FunctionComponent[Any] | ComponentClass[Any] | EnzymePropSelector
  
  type FunctionComponent[Props] = js.Function2[/* props */ Props, /* context */ js.UndefOr[Any], Element | Null]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.DOMAttributes because Already inherited
  - typings.react.mod.AriaAttributes because Already inherited
  - typings.react.mod.SVGAttributes because var conflicts: `aria-activedescendant`, `aria-atomic`, `aria-autocomplete`, `aria-busy`, `aria-checked`, `aria-colcount`, `aria-colindex`, `aria-colspan`, `aria-controls`, `aria-current`, `aria-describedby`, `aria-details`, `aria-disabled`, `aria-dropeffect`, `aria-errormessage`, `aria-expanded`, `aria-flowto`, `aria-grabbed`, `aria-haspopup`, `aria-hidden`, `aria-invalid`, `aria-keyshortcuts`, `aria-label`, `aria-labelledby`, `aria-level`, `aria-live`, `aria-modal`, `aria-multiline`, `aria-multiselectable`, `aria-orientation`, `aria-owns`, `aria-placeholder`, `aria-posinset`, `aria-pressed`, `aria-readonly`, `aria-relevant`, `aria-required`, `aria-roledescription`, `aria-rowcount`, `aria-rowindex`, `aria-rowspan`, `aria-selected`, `aria-setsize`, `aria-sort`, `aria-valuemax`, `aria-valuemin`, `aria-valuenow`, `aria-valuetext`, children, className, color, crossOrigin, dangerouslySetInnerHTML, height, href, id, lang, max, media, method, min, name, onAbort, onAnimationEnd, onAnimationIteration, onAnimationStart, onAuxClick, onBeforeInput, onBlur, onCanPlay, onCanPlayThrough, onChange, onClick, onCompositionEnd, onCompositionStart, onCompositionUpdate, onContextMenu, onCopy, onCut, onDoubleClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEncrypted, onEnded, onError, onFocus, onInput, onInvalid, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPaste, onPause, onPlay, onPlaying, onPointerCancel, onPointerDown, onPointerEnter, onPointerLeave, onPointerMove, onPointerOut, onPointerOver, onPointerUp, onProgress, onRateChange, onReset, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, onTransitionEnd, onVolumeChange, onWaiting, onWheel, role, style, tabIndex, target, `type`, width. Inlined fontFamily, x, points, slope, textAnchor, panose1, pointerEvents, shapeRendering, fontSize, pathLength, markerStart, in, strokeLinecap, repeatDur, strokeDashoffset, radius, alphabetic, vertOriginX, textLength, xmlBase, keyTimes, k3, fontVariant, lightingColor, overlinePosition, calcMode, contentScriptType, filterUnits, requiredExtensions, xlinkType, yChannelSelector, fillOpacity, g2, y2, kerning, viewBox, begin, colorRendering, xmlSpace, dy, floodColor, seed, targetY, xlinkHref, rx, fontSizeAdjust, maskUnits, y, strokeWidth, stitchTiles, underlinePosition, decelerate, keySplines, cx, requiredFeatures, strokeOpacity, paintOrder, allowReorder, local, mathematical, pointsAtY, xChannelSelector, exponent, from, kernelUnitLength, writingMode, d, unicodeBidi, ascent, strokeLinejoin, arabicForm, k, xlinkActuate, dur, by, viewTarget, format, edgeMode, attributeType, refY, u2, string, vMathematical, specularConstant, bbox, stroke, fontStretch, overflow, ry, stdDeviation, vAlphabetic, amplitude, elevation, vertAdvY, textRendering, ideographic, targetX, divisor, scale, xlinkArcrole, x1, repeatCount, fx, unitsPerEm, spreadMethod, xHeight, visibility, glyphName, limitingConeAngle, kernelMatrix, markerEnd, systemLanguage, numOctaves, stopColor, operator, patternContentUnits, capHeight, tableValues, vIdeographic, end, startOffset, externalResourcesRequired, xmlns, clip, dominantBaseline, spacing, xlinkShow, restart, focusable, r, u1, version, g1, origin, refX, strikethroughPosition, attributeName, x2, descent, stemh, fr, gradientTransform, path, dx, baseFrequency, overlineThickness, specularExponent, baselineShift, surfaceScale, stopOpacity, to, orient, order, fontWeight, underlineThickness, letterSpacing, hanging, horizOriginX, mask, widths, z, fillRule, clipRule, glyphRef, accumulate, unicode, patternUnits, azimuth, xmlnsXlink, direction, xlinkTitle, k2, speed, colorInterpolation, maskContentUnits, cursor, markerUnits, colorProfile, colorInterpolationFilters, fill, intercept, glyphOrientationVertical, mode, rotate, pointsAtX, wordSpacing, y1, alignmentBaseline, clipPathUnits, fontStyle, vectorEffect, vHanging, values, in2, diffuseConstant, horizAdvX, pointsAtZ, strikethroughThickness, strokeDasharray, k4, vertOriginY, result, accentHeight, lengthAdjust, filterRes, imageRendering, gradientUnits, patternTransform, markerMid, markerHeight, stemv, strokeMiterlimit, renderingIntent, preserveAlpha, preserveAspectRatio, fy, zoomAndPan, cy, primitiveUnits, display, xmlLang, clipPath, textDecoration, orientation, unicodeRange, k1, markerWidth, offset, opacity, baseProfile, enableBackground, filter, xlinkRole, floodOpacity, contentStyleType, autoReverse, bias, additive, transform, glyphOrientationHorizontal, keyPoints */ trait HTMLAttributes
    extends StObject
       with AllHTMLAttributes[js.Object] {
    
    // SVG Specific attributes
    var accentHeight: js.UndefOr[Double | String] = js.undefined
    
    var accumulate: js.UndefOr[none | sum] = js.undefined
    
    var additive: js.UndefOr[replace | sum] = js.undefined
    
    var alignmentBaseline: js.UndefOr[
        auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
      ] = js.undefined
    
    var allowReorder: js.UndefOr[no | yes] = js.undefined
    
    var alphabetic: js.UndefOr[Double | String] = js.undefined
    
    var amplitude: js.UndefOr[Double | String] = js.undefined
    
    var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.undefined
    
    var ascent: js.UndefOr[Double | String] = js.undefined
    
    var attributeName: js.UndefOr[String] = js.undefined
    
    var attributeType: js.UndefOr[String] = js.undefined
    
    var autoReverse: js.UndefOr[Booleanish] = js.undefined
    
    var azimuth: js.UndefOr[Double | String] = js.undefined
    
    var baseFrequency: js.UndefOr[Double | String] = js.undefined
    
    var baseProfile: js.UndefOr[Double | String] = js.undefined
    
    var baselineShift: js.UndefOr[Double | String] = js.undefined
    
    var bbox: js.UndefOr[Double | String] = js.undefined
    
    var begin: js.UndefOr[Double | String] = js.undefined
    
    var bias: js.UndefOr[Double | String] = js.undefined
    
    var by: js.UndefOr[Double | String] = js.undefined
    
    var calcMode: js.UndefOr[Double | String] = js.undefined
    
    var capHeight: js.UndefOr[Double | String] = js.undefined
    
    var clip: js.UndefOr[Double | String] = js.undefined
    
    var clipPath: js.UndefOr[String] = js.undefined
    
    var clipPathUnits: js.UndefOr[Double | String] = js.undefined
    
    var clipRule: js.UndefOr[Double | String] = js.undefined
    
    var colorInterpolation: js.UndefOr[Double | String] = js.undefined
    
    var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.undefined
    
    var colorProfile: js.UndefOr[Double | String] = js.undefined
    
    var colorRendering: js.UndefOr[Double | String] = js.undefined
    
    var contentScriptType: js.UndefOr[Double | String] = js.undefined
    
    var contentStyleType: js.UndefOr[Double | String] = js.undefined
    
    var cursor: js.UndefOr[Double | String] = js.undefined
    
    var cx: js.UndefOr[Double | String] = js.undefined
    
    var cy: js.UndefOr[Double | String] = js.undefined
    
    var d: js.UndefOr[String] = js.undefined
    
    var decelerate: js.UndefOr[Double | String] = js.undefined
    
    var descent: js.UndefOr[Double | String] = js.undefined
    
    var diffuseConstant: js.UndefOr[Double | String] = js.undefined
    
    var direction: js.UndefOr[Double | String] = js.undefined
    
    var display: js.UndefOr[Double | String] = js.undefined
    
    var divisor: js.UndefOr[Double | String] = js.undefined
    
    var dominantBaseline: js.UndefOr[Double | String] = js.undefined
    
    var dur: js.UndefOr[Double | String] = js.undefined
    
    var dx: js.UndefOr[Double | String] = js.undefined
    
    var dy: js.UndefOr[Double | String] = js.undefined
    
    var edgeMode: js.UndefOr[Double | String] = js.undefined
    
    var elevation: js.UndefOr[Double | String] = js.undefined
    
    var enableBackground: js.UndefOr[Double | String] = js.undefined
    
    var end: js.UndefOr[Double | String] = js.undefined
    
    var exponent: js.UndefOr[Double | String] = js.undefined
    
    var externalResourcesRequired: js.UndefOr[Booleanish] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double | String] = js.undefined
    
    var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var filterRes: js.UndefOr[Double | String] = js.undefined
    
    var filterUnits: js.UndefOr[Double | String] = js.undefined
    
    var floodColor: js.UndefOr[Double | String] = js.undefined
    
    var floodOpacity: js.UndefOr[Double | String] = js.undefined
    
    var focusable: js.UndefOr[Booleanish | auto] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double | String] = js.undefined
    
    var fontSizeAdjust: js.UndefOr[Double | String] = js.undefined
    
    var fontStretch: js.UndefOr[Double | String] = js.undefined
    
    var fontStyle: js.UndefOr[Double | String] = js.undefined
    
    var fontVariant: js.UndefOr[Double | String] = js.undefined
    
    var fontWeight: js.UndefOr[Double | String] = js.undefined
    
    var format: js.UndefOr[Double | String] = js.undefined
    
    var fr: js.UndefOr[Double | String] = js.undefined
    
    var from: js.UndefOr[Double | String] = js.undefined
    
    var fx: js.UndefOr[Double | String] = js.undefined
    
    var fy: js.UndefOr[Double | String] = js.undefined
    
    var g1: js.UndefOr[Double | String] = js.undefined
    
    var g2: js.UndefOr[Double | String] = js.undefined
    
    var glyphName: js.UndefOr[Double | String] = js.undefined
    
    var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.undefined
    
    var glyphOrientationVertical: js.UndefOr[Double | String] = js.undefined
    
    var glyphRef: js.UndefOr[Double | String] = js.undefined
    
    var gradientTransform: js.UndefOr[String] = js.undefined
    
    var gradientUnits: js.UndefOr[String] = js.undefined
    
    var hanging: js.UndefOr[Double | String] = js.undefined
    
    var horizAdvX: js.UndefOr[Double | String] = js.undefined
    
    var horizOriginX: js.UndefOr[Double | String] = js.undefined
    
    var ideographic: js.UndefOr[Double | String] = js.undefined
    
    var imageRendering: js.UndefOr[Double | String] = js.undefined
    
    var in: js.UndefOr[String] = js.undefined
    
    var in2: js.UndefOr[Double | String] = js.undefined
    
    var intercept: js.UndefOr[Double | String] = js.undefined
    
    var k: js.UndefOr[Double | String] = js.undefined
    
    var k1: js.UndefOr[Double | String] = js.undefined
    
    var k2: js.UndefOr[Double | String] = js.undefined
    
    var k3: js.UndefOr[Double | String] = js.undefined
    
    var k4: js.UndefOr[Double | String] = js.undefined
    
    var kernelMatrix: js.UndefOr[Double | String] = js.undefined
    
    var kernelUnitLength: js.UndefOr[Double | String] = js.undefined
    
    var kerning: js.UndefOr[Double | String] = js.undefined
    
    var keyPoints: js.UndefOr[Double | String] = js.undefined
    
    var keySplines: js.UndefOr[Double | String] = js.undefined
    
    var keyTimes: js.UndefOr[Double | String] = js.undefined
    
    var lengthAdjust: js.UndefOr[Double | String] = js.undefined
    
    var letterSpacing: js.UndefOr[Double | String] = js.undefined
    
    var lightingColor: js.UndefOr[Double | String] = js.undefined
    
    var limitingConeAngle: js.UndefOr[Double | String] = js.undefined
    
    var local: js.UndefOr[Double | String] = js.undefined
    
    var markerEnd: js.UndefOr[String] = js.undefined
    
    var markerHeight: js.UndefOr[Double | String] = js.undefined
    
    var markerMid: js.UndefOr[String] = js.undefined
    
    var markerStart: js.UndefOr[String] = js.undefined
    
    var markerUnits: js.UndefOr[Double | String] = js.undefined
    
    var markerWidth: js.UndefOr[Double | String] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var maskContentUnits: js.UndefOr[Double | String] = js.undefined
    
    var maskUnits: js.UndefOr[Double | String] = js.undefined
    
    var mathematical: js.UndefOr[Double | String] = js.undefined
    
    var mode: js.UndefOr[Double | String] = js.undefined
    
    var numOctaves: js.UndefOr[Double | String] = js.undefined
    
    var offset: js.UndefOr[Double | String] = js.undefined
    
    var opacity: js.UndefOr[Double | String] = js.undefined
    
    var operator: js.UndefOr[Double | String] = js.undefined
    
    var order: js.UndefOr[Double | String] = js.undefined
    
    var orient: js.UndefOr[Double | String] = js.undefined
    
    var orientation: js.UndefOr[Double | String] = js.undefined
    
    var origin: js.UndefOr[Double | String] = js.undefined
    
    var overflow: js.UndefOr[Double | String] = js.undefined
    
    var overlinePosition: js.UndefOr[Double | String] = js.undefined
    
    var overlineThickness: js.UndefOr[Double | String] = js.undefined
    
    var paintOrder: js.UndefOr[Double | String] = js.undefined
    
    var panose1: js.UndefOr[Double | String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var pathLength: js.UndefOr[Double | String] = js.undefined
    
    var patternContentUnits: js.UndefOr[String] = js.undefined
    
    var patternTransform: js.UndefOr[Double | String] = js.undefined
    
    var patternUnits: js.UndefOr[String] = js.undefined
    
    var pointerEvents: js.UndefOr[Double | String] = js.undefined
    
    var points: js.UndefOr[String] = js.undefined
    
    var pointsAtX: js.UndefOr[Double | String] = js.undefined
    
    var pointsAtY: js.UndefOr[Double | String] = js.undefined
    
    var pointsAtZ: js.UndefOr[Double | String] = js.undefined
    
    var preserveAlpha: js.UndefOr[Booleanish] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var primitiveUnits: js.UndefOr[Double | String] = js.undefined
    
    var r: js.UndefOr[Double | String] = js.undefined
    
    var radius: js.UndefOr[Double | String] = js.undefined
    
    var refX: js.UndefOr[Double | String] = js.undefined
    
    var refY: js.UndefOr[Double | String] = js.undefined
    
    var renderingIntent: js.UndefOr[Double | String] = js.undefined
    
    var repeatCount: js.UndefOr[Double | String] = js.undefined
    
    var repeatDur: js.UndefOr[Double | String] = js.undefined
    
    var requiredExtensions: js.UndefOr[Double | String] = js.undefined
    
    var requiredFeatures: js.UndefOr[Double | String] = js.undefined
    
    var restart: js.UndefOr[Double | String] = js.undefined
    
    var result: js.UndefOr[String] = js.undefined
    
    var rotate: js.UndefOr[Double | String] = js.undefined
    
    var rx: js.UndefOr[Double | String] = js.undefined
    
    var ry: js.UndefOr[Double | String] = js.undefined
    
    var scale: js.UndefOr[Double | String] = js.undefined
    
    var seed: js.UndefOr[Double | String] = js.undefined
    
    var shapeRendering: js.UndefOr[Double | String] = js.undefined
    
    var slope: js.UndefOr[Double | String] = js.undefined
    
    var spacing: js.UndefOr[Double | String] = js.undefined
    
    var specularConstant: js.UndefOr[Double | String] = js.undefined
    
    var specularExponent: js.UndefOr[Double | String] = js.undefined
    
    var speed: js.UndefOr[Double | String] = js.undefined
    
    var spreadMethod: js.UndefOr[String] = js.undefined
    
    var startOffset: js.UndefOr[Double | String] = js.undefined
    
    var stdDeviation: js.UndefOr[Double | String] = js.undefined
    
    var stemh: js.UndefOr[Double | String] = js.undefined
    
    var stemv: js.UndefOr[Double | String] = js.undefined
    
    var stitchTiles: js.UndefOr[Double | String] = js.undefined
    
    var stopColor: js.UndefOr[String] = js.undefined
    
    var stopOpacity: js.UndefOr[Double | String] = js.undefined
    
    var strikethroughPosition: js.UndefOr[Double | String] = js.undefined
    
    var strikethroughThickness: js.UndefOr[Double | String] = js.undefined
    
    var string: js.UndefOr[Double | String] = js.undefined
    
    var stroke: js.UndefOr[String] = js.undefined
    
    var strokeDasharray: js.UndefOr[String | Double] = js.undefined
    
    var strokeDashoffset: js.UndefOr[String | Double] = js.undefined
    
    var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.undefined
    
    var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.undefined
    
    var strokeMiterlimit: js.UndefOr[Double | String] = js.undefined
    
    var strokeOpacity: js.UndefOr[Double | String] = js.undefined
    
    var strokeWidth: js.UndefOr[Double | String] = js.undefined
    
    var surfaceScale: js.UndefOr[Double | String] = js.undefined
    
    var systemLanguage: js.UndefOr[Double | String] = js.undefined
    
    var tableValues: js.UndefOr[Double | String] = js.undefined
    
    var targetX: js.UndefOr[Double | String] = js.undefined
    
    var targetY: js.UndefOr[Double | String] = js.undefined
    
    var textAnchor: js.UndefOr[String] = js.undefined
    
    var textDecoration: js.UndefOr[Double | String] = js.undefined
    
    var textLength: js.UndefOr[Double | String] = js.undefined
    
    var textRendering: js.UndefOr[Double | String] = js.undefined
    
    var to: js.UndefOr[Double | String] = js.undefined
    
    var transform: js.UndefOr[String] = js.undefined
    
    var u1: js.UndefOr[Double | String] = js.undefined
    
    var u2: js.UndefOr[Double | String] = js.undefined
    
    var underlinePosition: js.UndefOr[Double | String] = js.undefined
    
    var underlineThickness: js.UndefOr[Double | String] = js.undefined
    
    var unicode: js.UndefOr[Double | String] = js.undefined
    
    var unicodeBidi: js.UndefOr[Double | String] = js.undefined
    
    var unicodeRange: js.UndefOr[Double | String] = js.undefined
    
    var unitsPerEm: js.UndefOr[Double | String] = js.undefined
    
    var vAlphabetic: js.UndefOr[Double | String] = js.undefined
    
    var vHanging: js.UndefOr[Double | String] = js.undefined
    
    var vIdeographic: js.UndefOr[Double | String] = js.undefined
    
    var vMathematical: js.UndefOr[Double | String] = js.undefined
    
    var values: js.UndefOr[String] = js.undefined
    
    var vectorEffect: js.UndefOr[Double | String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    var vertAdvY: js.UndefOr[Double | String] = js.undefined
    
    var vertOriginX: js.UndefOr[Double | String] = js.undefined
    
    var vertOriginY: js.UndefOr[Double | String] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
    
    var viewTarget: js.UndefOr[Double | String] = js.undefined
    
    var visibility: js.UndefOr[Double | String] = js.undefined
    
    var widths: js.UndefOr[Double | String] = js.undefined
    
    var wordSpacing: js.UndefOr[Double | String] = js.undefined
    
    var writingMode: js.UndefOr[Double | String] = js.undefined
    
    var x: js.UndefOr[Double | String] = js.undefined
    
    var x1: js.UndefOr[Double | String] = js.undefined
    
    var x2: js.UndefOr[Double | String] = js.undefined
    
    var xChannelSelector: js.UndefOr[String] = js.undefined
    
    var xHeight: js.UndefOr[Double | String] = js.undefined
    
    var xlinkActuate: js.UndefOr[String] = js.undefined
    
    var xlinkArcrole: js.UndefOr[String] = js.undefined
    
    var xlinkHref: js.UndefOr[String] = js.undefined
    
    var xlinkRole: js.UndefOr[String] = js.undefined
    
    var xlinkShow: js.UndefOr[String] = js.undefined
    
    var xlinkTitle: js.UndefOr[String] = js.undefined
    
    var xlinkType: js.UndefOr[String] = js.undefined
    
    var xmlBase: js.UndefOr[String] = js.undefined
    
    var xmlLang: js.UndefOr[String] = js.undefined
    
    var xmlSpace: js.UndefOr[String] = js.undefined
    
    var xmlns: js.UndefOr[String] = js.undefined
    
    var xmlnsXlink: js.UndefOr[String] = js.undefined
    
    var y: js.UndefOr[Double | String] = js.undefined
    
    var y1: js.UndefOr[Double | String] = js.undefined
    
    var y2: js.UndefOr[Double | String] = js.undefined
    
    var yChannelSelector: js.UndefOr[String] = js.undefined
    
    var z: js.UndefOr[Double | String] = js.undefined
    
    var zoomAndPan: js.UndefOr[String] = js.undefined
  }
  object HTMLAttributes {
    
    inline def apply(): HTMLAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLAttributes]
    }
    
    extension [Self <: HTMLAttributes](x: Self) {
      
      inline def setAccentHeight(value: Double | String): Self = StObject.set(x, "accentHeight", value.asInstanceOf[js.Any])
      
      inline def setAccentHeightUndefined: Self = StObject.set(x, "accentHeight", js.undefined)
      
      inline def setAccumulate(value: none | sum): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
      
      inline def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
      
      inline def setAdditive(value: replace | sum): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
      
      inline def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
      
      inline def setAlignmentBaseline(
        value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
      ): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      inline def setAllowReorder(value: no | yes): Self = StObject.set(x, "allowReorder", value.asInstanceOf[js.Any])
      
      inline def setAllowReorderUndefined: Self = StObject.set(x, "allowReorder", js.undefined)
      
      inline def setAlphabetic(value: Double | String): Self = StObject.set(x, "alphabetic", value.asInstanceOf[js.Any])
      
      inline def setAlphabeticUndefined: Self = StObject.set(x, "alphabetic", js.undefined)
      
      inline def setAmplitude(value: Double | String): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
      
      inline def setAmplitudeUndefined: Self = StObject.set(x, "amplitude", js.undefined)
      
      inline def setArabicForm(value: initial | medial | terminal | isolated): Self = StObject.set(x, "arabicForm", value.asInstanceOf[js.Any])
      
      inline def setArabicFormUndefined: Self = StObject.set(x, "arabicForm", js.undefined)
      
      inline def setAscent(value: Double | String): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      inline def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
      
      inline def setAttributeType(value: String): Self = StObject.set(x, "attributeType", value.asInstanceOf[js.Any])
      
      inline def setAttributeTypeUndefined: Self = StObject.set(x, "attributeType", js.undefined)
      
      inline def setAutoReverse(value: Booleanish): Self = StObject.set(x, "autoReverse", value.asInstanceOf[js.Any])
      
      inline def setAutoReverseUndefined: Self = StObject.set(x, "autoReverse", js.undefined)
      
      inline def setAzimuth(value: Double | String): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      inline def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
      
      inline def setBaseFrequency(value: Double | String): Self = StObject.set(x, "baseFrequency", value.asInstanceOf[js.Any])
      
      inline def setBaseFrequencyUndefined: Self = StObject.set(x, "baseFrequency", js.undefined)
      
      inline def setBaseProfile(value: Double | String): Self = StObject.set(x, "baseProfile", value.asInstanceOf[js.Any])
      
      inline def setBaseProfileUndefined: Self = StObject.set(x, "baseProfile", js.undefined)
      
      inline def setBaselineShift(value: Double | String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      inline def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      inline def setBbox(value: Double | String): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setBegin(value: Double | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setBias(value: Double | String): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setBy(value: Double | String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
      
      inline def setByUndefined: Self = StObject.set(x, "by", js.undefined)
      
      inline def setCalcMode(value: Double | String): Self = StObject.set(x, "calcMode", value.asInstanceOf[js.Any])
      
      inline def setCalcModeUndefined: Self = StObject.set(x, "calcMode", js.undefined)
      
      inline def setCapHeight(value: Double | String): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
      
      inline def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
      
      inline def setClip(value: Double | String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      inline def setClipPathUnits(value: Double | String): Self = StObject.set(x, "clipPathUnits", value.asInstanceOf[js.Any])
      
      inline def setClipPathUnitsUndefined: Self = StObject.set(x, "clipPathUnits", js.undefined)
      
      inline def setClipRule(value: Double | String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setColorInterpolation(value: Double | String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
      
      inline def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
      
      inline def setColorProfile(value: Double | String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
      
      inline def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
      
      inline def setColorRendering(value: Double | String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
      
      inline def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
      
      inline def setContentScriptType(value: Double | String): Self = StObject.set(x, "contentScriptType", value.asInstanceOf[js.Any])
      
      inline def setContentScriptTypeUndefined: Self = StObject.set(x, "contentScriptType", js.undefined)
      
      inline def setContentStyleType(value: Double | String): Self = StObject.set(x, "contentStyleType", value.asInstanceOf[js.Any])
      
      inline def setContentStyleTypeUndefined: Self = StObject.set(x, "contentStyleType", js.undefined)
      
      inline def setCursor(value: Double | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      inline def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setDecelerate(value: Double | String): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
      
      inline def setDecelerateUndefined: Self = StObject.set(x, "decelerate", js.undefined)
      
      inline def setDescent(value: Double | String): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      inline def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
      
      inline def setDiffuseConstant(value: Double | String): Self = StObject.set(x, "diffuseConstant", value.asInstanceOf[js.Any])
      
      inline def setDiffuseConstantUndefined: Self = StObject.set(x, "diffuseConstant", js.undefined)
      
      inline def setDirection(value: Double | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisplay(value: Double | String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDivisor(value: Double | String): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
      
      inline def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
      
      inline def setDominantBaseline(value: Double | String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      inline def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      inline def setDur(value: Double | String): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
      
      inline def setDurUndefined: Self = StObject.set(x, "dur", js.undefined)
      
      inline def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setEdgeMode(value: Double | String): Self = StObject.set(x, "edgeMode", value.asInstanceOf[js.Any])
      
      inline def setEdgeModeUndefined: Self = StObject.set(x, "edgeMode", js.undefined)
      
      inline def setElevation(value: Double | String): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      inline def setEnableBackground(value: Double | String): Self = StObject.set(x, "enableBackground", value.asInstanceOf[js.Any])
      
      inline def setEnableBackgroundUndefined: Self = StObject.set(x, "enableBackground", js.undefined)
      
      inline def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setExponent(value: Double | String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      inline def setExternalResourcesRequired(value: Booleanish): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
      
      inline def setExternalResourcesRequiredUndefined: Self = StObject.set(x, "externalResourcesRequired", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillRule(value: nonzero | evenodd | inherit): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterRes(value: Double | String): Self = StObject.set(x, "filterRes", value.asInstanceOf[js.Any])
      
      inline def setFilterResUndefined: Self = StObject.set(x, "filterRes", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterUnits(value: Double | String): Self = StObject.set(x, "filterUnits", value.asInstanceOf[js.Any])
      
      inline def setFilterUnitsUndefined: Self = StObject.set(x, "filterUnits", js.undefined)
      
      inline def setFloodColor(value: Double | String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      inline def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      inline def setFloodOpacity(value: Double | String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      inline def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      inline def setFocusable(value: Booleanish | auto): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjust(value: Double | String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStretch(value: Double | String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      inline def setFontStyle(value: Double | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: Double | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontWeight(value: Double | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFormat(value: Double | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFr(value: Double | String): Self = StObject.set(x, "fr", value.asInstanceOf[js.Any])
      
      inline def setFrUndefined: Self = StObject.set(x, "fr", js.undefined)
      
      inline def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFx(value: Double | String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      inline def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      inline def setFy(value: Double | String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
      
      inline def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
      
      inline def setG1(value: Double | String): Self = StObject.set(x, "g1", value.asInstanceOf[js.Any])
      
      inline def setG1Undefined: Self = StObject.set(x, "g1", js.undefined)
      
      inline def setG2(value: Double | String): Self = StObject.set(x, "g2", value.asInstanceOf[js.Any])
      
      inline def setG2Undefined: Self = StObject.set(x, "g2", js.undefined)
      
      inline def setGlyphName(value: Double | String): Self = StObject.set(x, "glyphName", value.asInstanceOf[js.Any])
      
      inline def setGlyphNameUndefined: Self = StObject.set(x, "glyphName", js.undefined)
      
      inline def setGlyphOrientationHorizontal(value: Double | String): Self = StObject.set(x, "glyphOrientationHorizontal", value.asInstanceOf[js.Any])
      
      inline def setGlyphOrientationHorizontalUndefined: Self = StObject.set(x, "glyphOrientationHorizontal", js.undefined)
      
      inline def setGlyphOrientationVertical(value: Double | String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      inline def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      inline def setGlyphRef(value: Double | String): Self = StObject.set(x, "glyphRef", value.asInstanceOf[js.Any])
      
      inline def setGlyphRefUndefined: Self = StObject.set(x, "glyphRef", js.undefined)
      
      inline def setGradientTransform(value: String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
      
      inline def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
      
      inline def setGradientUnits(value: String): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
      
      inline def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
      
      inline def setHanging(value: Double | String): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
      
      inline def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
      
      inline def setHorizAdvX(value: Double | String): Self = StObject.set(x, "horizAdvX", value.asInstanceOf[js.Any])
      
      inline def setHorizAdvXUndefined: Self = StObject.set(x, "horizAdvX", js.undefined)
      
      inline def setHorizOriginX(value: Double | String): Self = StObject.set(x, "horizOriginX", value.asInstanceOf[js.Any])
      
      inline def setHorizOriginXUndefined: Self = StObject.set(x, "horizOriginX", js.undefined)
      
      inline def setIdeographic(value: Double | String): Self = StObject.set(x, "ideographic", value.asInstanceOf[js.Any])
      
      inline def setIdeographicUndefined: Self = StObject.set(x, "ideographic", js.undefined)
      
      inline def setImageRendering(value: Double | String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
      
      inline def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
      
      inline def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setIn2(value: Double | String): Self = StObject.set(x, "in2", value.asInstanceOf[js.Any])
      
      inline def setIn2Undefined: Self = StObject.set(x, "in2", js.undefined)
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setIntercept(value: Double | String): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
      
      inline def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
      
      inline def setK(value: Double | String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setK1(value: Double | String): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      inline def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
      
      inline def setK2(value: Double | String): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
      
      inline def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
      
      inline def setK3(value: Double | String): Self = StObject.set(x, "k3", value.asInstanceOf[js.Any])
      
      inline def setK3Undefined: Self = StObject.set(x, "k3", js.undefined)
      
      inline def setK4(value: Double | String): Self = StObject.set(x, "k4", value.asInstanceOf[js.Any])
      
      inline def setK4Undefined: Self = StObject.set(x, "k4", js.undefined)
      
      inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      inline def setKernelMatrix(value: Double | String): Self = StObject.set(x, "kernelMatrix", value.asInstanceOf[js.Any])
      
      inline def setKernelMatrixUndefined: Self = StObject.set(x, "kernelMatrix", js.undefined)
      
      inline def setKernelUnitLength(value: Double | String): Self = StObject.set(x, "kernelUnitLength", value.asInstanceOf[js.Any])
      
      inline def setKernelUnitLengthUndefined: Self = StObject.set(x, "kernelUnitLength", js.undefined)
      
      inline def setKerning(value: Double | String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      inline def setKeyPoints(value: Double | String): Self = StObject.set(x, "keyPoints", value.asInstanceOf[js.Any])
      
      inline def setKeyPointsUndefined: Self = StObject.set(x, "keyPoints", js.undefined)
      
      inline def setKeySplines(value: Double | String): Self = StObject.set(x, "keySplines", value.asInstanceOf[js.Any])
      
      inline def setKeySplinesUndefined: Self = StObject.set(x, "keySplines", js.undefined)
      
      inline def setKeyTimes(value: Double | String): Self = StObject.set(x, "keyTimes", value.asInstanceOf[js.Any])
      
      inline def setKeyTimesUndefined: Self = StObject.set(x, "keyTimes", js.undefined)
      
      inline def setLengthAdjust(value: Double | String): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
      
      inline def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
      
      inline def setLetterSpacing(value: Double | String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLightingColor(value: Double | String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      inline def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      inline def setLimitingConeAngle(value: Double | String): Self = StObject.set(x, "limitingConeAngle", value.asInstanceOf[js.Any])
      
      inline def setLimitingConeAngleUndefined: Self = StObject.set(x, "limitingConeAngle", js.undefined)
      
      inline def setLocal(value: Double | String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerHeight(value: Double | String): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
      
      inline def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
      
      inline def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setMarkerUnits(value: Double | String): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
      
      inline def setMarkerUnitsUndefined: Self = StObject.set(x, "markerUnits", js.undefined)
      
      inline def setMarkerWidth(value: Double | String): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
      
      inline def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskContentUnits(value: Double | String): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
      
      inline def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaskUnits(value: Double | String): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
      
      inline def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", js.undefined)
      
      inline def setMathematical(value: Double | String): Self = StObject.set(x, "mathematical", value.asInstanceOf[js.Any])
      
      inline def setMathematicalUndefined: Self = StObject.set(x, "mathematical", js.undefined)
      
      inline def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNumOctaves(value: Double | String): Self = StObject.set(x, "numOctaves", value.asInstanceOf[js.Any])
      
      inline def setNumOctavesUndefined: Self = StObject.set(x, "numOctaves", js.undefined)
      
      inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOpacity(value: Double | String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOperator(value: Double | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setOrder(value: Double | String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrient(value: Double | String): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setOrientation(value: Double | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOrigin(value: Double | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setOverflow(value: Double | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverlinePosition(value: Double | String): Self = StObject.set(x, "overlinePosition", value.asInstanceOf[js.Any])
      
      inline def setOverlinePositionUndefined: Self = StObject.set(x, "overlinePosition", js.undefined)
      
      inline def setOverlineThickness(value: Double | String): Self = StObject.set(x, "overlineThickness", value.asInstanceOf[js.Any])
      
      inline def setOverlineThicknessUndefined: Self = StObject.set(x, "overlineThickness", js.undefined)
      
      inline def setPaintOrder(value: Double | String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
      
      inline def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
      
      inline def setPanose1(value: Double | String): Self = StObject.set(x, "panose1", value.asInstanceOf[js.Any])
      
      inline def setPanose1Undefined: Self = StObject.set(x, "panose1", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathLength(value: Double | String): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
      
      inline def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPatternContentUnits(value: String): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
      
      inline def setPatternTransform(value: Double | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
      
      inline def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
      
      inline def setPatternUnits(value: String): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
      
      inline def setPointerEvents(value: Double | String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsAtX(value: Double | String): Self = StObject.set(x, "pointsAtX", value.asInstanceOf[js.Any])
      
      inline def setPointsAtXUndefined: Self = StObject.set(x, "pointsAtX", js.undefined)
      
      inline def setPointsAtY(value: Double | String): Self = StObject.set(x, "pointsAtY", value.asInstanceOf[js.Any])
      
      inline def setPointsAtYUndefined: Self = StObject.set(x, "pointsAtY", js.undefined)
      
      inline def setPointsAtZ(value: Double | String): Self = StObject.set(x, "pointsAtZ", value.asInstanceOf[js.Any])
      
      inline def setPointsAtZUndefined: Self = StObject.set(x, "pointsAtZ", js.undefined)
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPreserveAlpha(value: Booleanish): Self = StObject.set(x, "preserveAlpha", value.asInstanceOf[js.Any])
      
      inline def setPreserveAlphaUndefined: Self = StObject.set(x, "preserveAlpha", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setPrimitiveUnits(value: Double | String): Self = StObject.set(x, "primitiveUnits", value.asInstanceOf[js.Any])
      
      inline def setPrimitiveUnitsUndefined: Self = StObject.set(x, "primitiveUnits", js.undefined)
      
      inline def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRefX(value: Double | String): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
      
      inline def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
      
      inline def setRefY(value: Double | String): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
      
      inline def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
      
      inline def setRenderingIntent(value: Double | String): Self = StObject.set(x, "renderingIntent", value.asInstanceOf[js.Any])
      
      inline def setRenderingIntentUndefined: Self = StObject.set(x, "renderingIntent", js.undefined)
      
      inline def setRepeatCount(value: Double | String): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
      
      inline def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
      
      inline def setRepeatDur(value: Double | String): Self = StObject.set(x, "repeatDur", value.asInstanceOf[js.Any])
      
      inline def setRepeatDurUndefined: Self = StObject.set(x, "repeatDur", js.undefined)
      
      inline def setRequiredExtensions(value: Double | String): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
      
      inline def setRequiredExtensionsUndefined: Self = StObject.set(x, "requiredExtensions", js.undefined)
      
      inline def setRequiredFeatures(value: Double | String): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
      
      inline def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
      
      inline def setRestart(value: Double | String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRx(value: Double | String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double | String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      inline def setScale(value: Double | String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setShapeRendering(value: Double | String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      inline def setSlope(value: Double | String): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
      
      inline def setSlopeUndefined: Self = StObject.set(x, "slope", js.undefined)
      
      inline def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setSpecularConstant(value: Double | String): Self = StObject.set(x, "specularConstant", value.asInstanceOf[js.Any])
      
      inline def setSpecularConstantUndefined: Self = StObject.set(x, "specularConstant", js.undefined)
      
      inline def setSpecularExponent(value: Double | String): Self = StObject.set(x, "specularExponent", value.asInstanceOf[js.Any])
      
      inline def setSpecularExponentUndefined: Self = StObject.set(x, "specularExponent", js.undefined)
      
      inline def setSpeed(value: Double | String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setSpreadMethod(value: String): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
      
      inline def setSpreadMethodUndefined: Self = StObject.set(x, "spreadMethod", js.undefined)
      
      inline def setStartOffset(value: Double | String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      inline def setStdDeviation(value: Double | String): Self = StObject.set(x, "stdDeviation", value.asInstanceOf[js.Any])
      
      inline def setStdDeviationUndefined: Self = StObject.set(x, "stdDeviation", js.undefined)
      
      inline def setStemh(value: Double | String): Self = StObject.set(x, "stemh", value.asInstanceOf[js.Any])
      
      inline def setStemhUndefined: Self = StObject.set(x, "stemh", js.undefined)
      
      inline def setStemv(value: Double | String): Self = StObject.set(x, "stemv", value.asInstanceOf[js.Any])
      
      inline def setStemvUndefined: Self = StObject.set(x, "stemv", js.undefined)
      
      inline def setStitchTiles(value: Double | String): Self = StObject.set(x, "stitchTiles", value.asInstanceOf[js.Any])
      
      inline def setStitchTilesUndefined: Self = StObject.set(x, "stitchTiles", js.undefined)
      
      inline def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      inline def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      inline def setStopOpacity(value: Double | String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      inline def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      inline def setStrikethroughPosition(value: Double | String): Self = StObject.set(x, "strikethroughPosition", value.asInstanceOf[js.Any])
      
      inline def setStrikethroughPositionUndefined: Self = StObject.set(x, "strikethroughPosition", js.undefined)
      
      inline def setStrikethroughThickness(value: Double | String): Self = StObject.set(x, "strikethroughThickness", value.asInstanceOf[js.Any])
      
      inline def setStrikethroughThicknessUndefined: Self = StObject.set(x, "strikethroughThickness", js.undefined)
      
      inline def setString(value: Double | String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharray(value: String | Double): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      inline def setStrokeDashoffset(value: String | Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      inline def setStrokeLinecap(value: butt | round | square | inherit): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      inline def setStrokeMiterlimit(value: Double | String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      inline def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      inline def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setSurfaceScale(value: Double | String): Self = StObject.set(x, "surfaceScale", value.asInstanceOf[js.Any])
      
      inline def setSurfaceScaleUndefined: Self = StObject.set(x, "surfaceScale", js.undefined)
      
      inline def setSystemLanguage(value: Double | String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
      
      inline def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", js.undefined)
      
      inline def setTableValues(value: Double | String): Self = StObject.set(x, "tableValues", value.asInstanceOf[js.Any])
      
      inline def setTableValuesUndefined: Self = StObject.set(x, "tableValues", js.undefined)
      
      inline def setTargetX(value: Double | String): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
      
      inline def setTargetXUndefined: Self = StObject.set(x, "targetX", js.undefined)
      
      inline def setTargetY(value: Double | String): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
      
      inline def setTargetYUndefined: Self = StObject.set(x, "targetY", js.undefined)
      
      inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextDecoration(value: Double | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setTextLength(value: Double | String): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
      
      inline def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
      
      inline def setTextRendering(value: Double | String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
      
      inline def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
      
      inline def setTo(value: Double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setU1(value: Double | String): Self = StObject.set(x, "u1", value.asInstanceOf[js.Any])
      
      inline def setU1Undefined: Self = StObject.set(x, "u1", js.undefined)
      
      inline def setU2(value: Double | String): Self = StObject.set(x, "u2", value.asInstanceOf[js.Any])
      
      inline def setU2Undefined: Self = StObject.set(x, "u2", js.undefined)
      
      inline def setUnderlinePosition(value: Double | String): Self = StObject.set(x, "underlinePosition", value.asInstanceOf[js.Any])
      
      inline def setUnderlinePositionUndefined: Self = StObject.set(x, "underlinePosition", js.undefined)
      
      inline def setUnderlineThickness(value: Double | String): Self = StObject.set(x, "underlineThickness", value.asInstanceOf[js.Any])
      
      inline def setUnderlineThicknessUndefined: Self = StObject.set(x, "underlineThickness", js.undefined)
      
      inline def setUnicode(value: Double | String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeBidi(value: Double | String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
      
      inline def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
      
      inline def setUnicodeRange(value: Double | String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      inline def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
      
      inline def setUnitsPerEm(value: Double | String): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
      
      inline def setUnitsPerEmUndefined: Self = StObject.set(x, "unitsPerEm", js.undefined)
      
      inline def setVAlphabetic(value: Double | String): Self = StObject.set(x, "vAlphabetic", value.asInstanceOf[js.Any])
      
      inline def setVAlphabeticUndefined: Self = StObject.set(x, "vAlphabetic", js.undefined)
      
      inline def setVHanging(value: Double | String): Self = StObject.set(x, "vHanging", value.asInstanceOf[js.Any])
      
      inline def setVHangingUndefined: Self = StObject.set(x, "vHanging", js.undefined)
      
      inline def setVIdeographic(value: Double | String): Self = StObject.set(x, "vIdeographic", value.asInstanceOf[js.Any])
      
      inline def setVIdeographicUndefined: Self = StObject.set(x, "vIdeographic", js.undefined)
      
      inline def setVMathematical(value: Double | String): Self = StObject.set(x, "vMathematical", value.asInstanceOf[js.Any])
      
      inline def setVMathematicalUndefined: Self = StObject.set(x, "vMathematical", js.undefined)
      
      inline def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setVectorEffect(value: Double | String): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      inline def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVertAdvY(value: Double | String): Self = StObject.set(x, "vertAdvY", value.asInstanceOf[js.Any])
      
      inline def setVertAdvYUndefined: Self = StObject.set(x, "vertAdvY", js.undefined)
      
      inline def setVertOriginX(value: Double | String): Self = StObject.set(x, "vertOriginX", value.asInstanceOf[js.Any])
      
      inline def setVertOriginXUndefined: Self = StObject.set(x, "vertOriginX", js.undefined)
      
      inline def setVertOriginY(value: Double | String): Self = StObject.set(x, "vertOriginY", value.asInstanceOf[js.Any])
      
      inline def setVertOriginYUndefined: Self = StObject.set(x, "vertOriginY", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setViewTarget(value: Double | String): Self = StObject.set(x, "viewTarget", value.asInstanceOf[js.Any])
      
      inline def setViewTargetUndefined: Self = StObject.set(x, "viewTarget", js.undefined)
      
      inline def setVisibility(value: Double | String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setWidths(value: Double | String): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      inline def setWordSpacing(value: Double | String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      inline def setWritingMode(value: Double | String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
      
      inline def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double | String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      inline def setX2(value: Double | String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setXChannelSelector(value: String): Self = StObject.set(x, "xChannelSelector", value.asInstanceOf[js.Any])
      
      inline def setXChannelSelectorUndefined: Self = StObject.set(x, "xChannelSelector", js.undefined)
      
      inline def setXHeight(value: Double | String): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
      
      inline def setXHeightUndefined: Self = StObject.set(x, "xHeight", js.undefined)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXlinkActuate(value: String): Self = StObject.set(x, "xlinkActuate", value.asInstanceOf[js.Any])
      
      inline def setXlinkActuateUndefined: Self = StObject.set(x, "xlinkActuate", js.undefined)
      
      inline def setXlinkArcrole(value: String): Self = StObject.set(x, "xlinkArcrole", value.asInstanceOf[js.Any])
      
      inline def setXlinkArcroleUndefined: Self = StObject.set(x, "xlinkArcrole", js.undefined)
      
      inline def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
      
      inline def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
      
      inline def setXlinkRole(value: String): Self = StObject.set(x, "xlinkRole", value.asInstanceOf[js.Any])
      
      inline def setXlinkRoleUndefined: Self = StObject.set(x, "xlinkRole", js.undefined)
      
      inline def setXlinkShow(value: String): Self = StObject.set(x, "xlinkShow", value.asInstanceOf[js.Any])
      
      inline def setXlinkShowUndefined: Self = StObject.set(x, "xlinkShow", js.undefined)
      
      inline def setXlinkTitle(value: String): Self = StObject.set(x, "xlinkTitle", value.asInstanceOf[js.Any])
      
      inline def setXlinkTitleUndefined: Self = StObject.set(x, "xlinkTitle", js.undefined)
      
      inline def setXlinkType(value: String): Self = StObject.set(x, "xlinkType", value.asInstanceOf[js.Any])
      
      inline def setXlinkTypeUndefined: Self = StObject.set(x, "xlinkType", js.undefined)
      
      inline def setXmlBase(value: String): Self = StObject.set(x, "xmlBase", value.asInstanceOf[js.Any])
      
      inline def setXmlBaseUndefined: Self = StObject.set(x, "xmlBase", js.undefined)
      
      inline def setXmlLang(value: String): Self = StObject.set(x, "xmlLang", value.asInstanceOf[js.Any])
      
      inline def setXmlLangUndefined: Self = StObject.set(x, "xmlLang", js.undefined)
      
      inline def setXmlSpace(value: String): Self = StObject.set(x, "xmlSpace", value.asInstanceOf[js.Any])
      
      inline def setXmlSpaceUndefined: Self = StObject.set(x, "xmlSpace", js.undefined)
      
      inline def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
      
      inline def setXmlnsXlink(value: String): Self = StObject.set(x, "xmlnsXlink", value.asInstanceOf[js.Any])
      
      inline def setXmlnsXlinkUndefined: Self = StObject.set(x, "xmlnsXlink", js.undefined)
      
      inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double | String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      inline def setY2(value: Double | String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      inline def setYChannelSelector(value: String): Self = StObject.set(x, "yChannelSelector", value.asInstanceOf[js.Any])
      
      inline def setYChannelSelectorUndefined: Self = StObject.set(x, "yChannelSelector", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double | String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
      
      inline def setZoomAndPan(value: String): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
      
      inline def setZoomAndPanUndefined: Self = StObject.set(x, "zoomAndPan", js.undefined)
    }
  }
  
  type Intercepter[T] = js.Function1[/* intercepter */ T, Unit]
  
  trait Lifecycles
    extends StObject
       with // TODO Maybe some life cycle are missing
  /* lifecycleName */ StringDictionary[Any] {
    
    var componentDidUpdate: js.UndefOr[OnSetState] = js.undefined
    
    var getChildContext: js.UndefOr[Dictkey] = js.undefined
    
    var getDerivedStateFromProps: js.UndefOr[HasShouldComponentUpdateBug | Boolean] = js.undefined
    
    var setState: js.UndefOr[Any] = js.undefined
  }
  object Lifecycles {
    
    inline def apply(): Lifecycles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Lifecycles]
    }
    
    extension [Self <: Lifecycles](x: Self) {
      
      inline def setComponentDidUpdate(value: OnSetState): Self = StObject.set(x, "componentDidUpdate", value.asInstanceOf[js.Any])
      
      inline def setComponentDidUpdateUndefined: Self = StObject.set(x, "componentDidUpdate", js.undefined)
      
      inline def setGetChildContext(value: Dictkey): Self = StObject.set(x, "getChildContext", value.asInstanceOf[js.Any])
      
      inline def setGetChildContextUndefined: Self = StObject.set(x, "getChildContext", js.undefined)
      
      inline def setGetDerivedStateFromProps(value: HasShouldComponentUpdateBug | Boolean): Self = StObject.set(x, "getDerivedStateFromProps", value.asInstanceOf[js.Any])
      
      inline def setGetDerivedStateFromPropsUndefined: Self = StObject.set(x, "getDerivedStateFromProps", js.undefined)
      
      inline def setSetState(value: Any): Self = StObject.set(x, "setState", value.asInstanceOf[js.Any])
      
      inline def setSetStateUndefined: Self = StObject.set(x, "setState", js.undefined)
    }
  }
  
  trait MountRendererProps extends StObject {
    
    /**
      * DOM Element to attach the component to
      */
    var attachTo: js.UndefOr[HTMLElement | Null] = js.undefined
    
    /**
      * Merged contextTypes for all children of the wrapper
      */
    var childContextTypes: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Context to be passed into the component
      */
    var context: js.UndefOr[js.Object] = js.undefined
    
    /**
      * A component that will render as a parent of the node.
      * It can be used to provide context to the `node`, among other things.
      * See the [getWrappingComponent() docs](https://airbnb.io/enzyme/docs/api/ShallowWrapper/getWrappingComponent.html) for an example.
      * **Note**: `wrappingComponent` must render its children.
      */
    var wrappingComponent: js.UndefOr[ComponentType[Any]] = js.undefined
    
    /**
      * Initial props to pass to the `wrappingComponent` if it is specified.
      */
    var wrappingComponentProps: js.UndefOr[js.Object] = js.undefined
  }
  object MountRendererProps {
    
    inline def apply(): MountRendererProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MountRendererProps]
    }
    
    extension [Self <: MountRendererProps](x: Self) {
      
      inline def setAttachTo(value: HTMLElement): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      inline def setAttachToNull: Self = StObject.set(x, "attachTo", null)
      
      inline def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      inline def setChildContextTypes(value: js.Object): Self = StObject.set(x, "childContextTypes", value.asInstanceOf[js.Any])
      
      inline def setChildContextTypesUndefined: Self = StObject.set(x, "childContextTypes", js.undefined)
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setWrappingComponent(value: ComponentType[Any]): Self = StObject.set(x, "wrappingComponent", value.asInstanceOf[js.Any])
      
      inline def setWrappingComponentFunction2(value: (Any, /* context */ js.UndefOr[Any]) => Element | Null): Self = StObject.set(x, "wrappingComponent", js.Any.fromFunction2(value))
      
      inline def setWrappingComponentProps(value: js.Object): Self = StObject.set(x, "wrappingComponentProps", value.asInstanceOf[js.Any])
      
      inline def setWrappingComponentPropsUndefined: Self = StObject.set(x, "wrappingComponentProps", js.undefined)
      
      inline def setWrappingComponentUndefined: Self = StObject.set(x, "wrappingComponent", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (args : infer A): any ? A : never
    }}}
    */
  @js.native
  trait Parameters[T] extends StObject
  
  trait ShallowRendererProps extends StObject {
    
    var PROVIDER_VALUES: js.UndefOr[Any] = js.undefined
    
    var adapter: js.UndefOr[EnzymeAdapter] = js.undefined
    
    /* TODO what are these doing??? */
    var attachTo: js.UndefOr[Any] = js.undefined
    
    /**
      * Context to be passed into the component
      */
    var context: js.UndefOr[Any] = js.undefined
    
    // See https://github.com/airbnb/enzyme/blob/enzyme@3.10.0/docs/api/shallow.md#arguments
    /**
      * If set to true, componentDidMount is not called on the component, and componentDidUpdate is not called after
      * setProps and setContext. Default to false.
      */
    var disableLifecycleMethods: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The legacy enableComponentDidUpdateOnSetState option should be matched by
      * `lifecycles: { componentDidUpdate: { onSetState: true } }`, for compatibility
      */
    var enableComponentDidUpdateOnSetState: js.UndefOr[Boolean] = js.undefined
    
    var hydrateIn: js.UndefOr[Any] = js.undefined
    
    /**
      * Enable experimental support for full react lifecycle methods
      */
    var lifecycleExperimental: js.UndefOr[Boolean] = js.undefined
    
    var lifecycles: js.UndefOr[Lifecycles] = js.undefined
    
    /**
      * the legacy supportPrevContextArgumentOfComponentDidUpdate option should be matched by
      * `lifecycles: { componentDidUpdate: { prevContext: true } }`, for compatibility
      */
    var supportPrevContextArgumentOfComponentDidUpdate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true, when rendering Suspense enzyme will replace all the lazy components in children
      * with fallback element prop. Otherwise it won't handle fallback of lazy component.
      * Default to true. Note: not supported in React < 16.6.
      */
    var suspenseFallback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A component that will render as a parent of the node.
      * It can be used to provide context to the `node`, among other things.
      * See the [getWrappingComponent() docs](https://airbnb.io/enzyme/docs/api/ShallowWrapper/getWrappingComponent.html) for an example.
      * **Note**: `wrappingComponent` must render its children.
      */
    var wrappingComponent: js.UndefOr[ComponentType[Any]] = js.undefined
    
    /**
      * Initial props to pass to the `wrappingComponent` if it is specified.
      */
    var wrappingComponentProps: js.UndefOr[js.Object] = js.undefined
  }
  object ShallowRendererProps {
    
    inline def apply(): ShallowRendererProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShallowRendererProps]
    }
    
    extension [Self <: ShallowRendererProps](x: Self) {
      
      inline def setAdapter(value: EnzymeAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      inline def setAttachTo(value: Any): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      inline def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDisableLifecycleMethods(value: Boolean): Self = StObject.set(x, "disableLifecycleMethods", value.asInstanceOf[js.Any])
      
      inline def setDisableLifecycleMethodsUndefined: Self = StObject.set(x, "disableLifecycleMethods", js.undefined)
      
      inline def setEnableComponentDidUpdateOnSetState(value: Boolean): Self = StObject.set(x, "enableComponentDidUpdateOnSetState", value.asInstanceOf[js.Any])
      
      inline def setEnableComponentDidUpdateOnSetStateUndefined: Self = StObject.set(x, "enableComponentDidUpdateOnSetState", js.undefined)
      
      inline def setHydrateIn(value: Any): Self = StObject.set(x, "hydrateIn", value.asInstanceOf[js.Any])
      
      inline def setHydrateInUndefined: Self = StObject.set(x, "hydrateIn", js.undefined)
      
      inline def setLifecycleExperimental(value: Boolean): Self = StObject.set(x, "lifecycleExperimental", value.asInstanceOf[js.Any])
      
      inline def setLifecycleExperimentalUndefined: Self = StObject.set(x, "lifecycleExperimental", js.undefined)
      
      inline def setLifecycles(value: Lifecycles): Self = StObject.set(x, "lifecycles", value.asInstanceOf[js.Any])
      
      inline def setLifecyclesUndefined: Self = StObject.set(x, "lifecycles", js.undefined)
      
      inline def setPROVIDER_VALUES(value: Any): Self = StObject.set(x, "PROVIDER_VALUES", value.asInstanceOf[js.Any])
      
      inline def setPROVIDER_VALUESUndefined: Self = StObject.set(x, "PROVIDER_VALUES", js.undefined)
      
      inline def setSupportPrevContextArgumentOfComponentDidUpdate(value: Boolean): Self = StObject.set(x, "supportPrevContextArgumentOfComponentDidUpdate", value.asInstanceOf[js.Any])
      
      inline def setSupportPrevContextArgumentOfComponentDidUpdateUndefined: Self = StObject.set(x, "supportPrevContextArgumentOfComponentDidUpdate", js.undefined)
      
      inline def setSuspenseFallback(value: Boolean): Self = StObject.set(x, "suspenseFallback", value.asInstanceOf[js.Any])
      
      inline def setSuspenseFallbackUndefined: Self = StObject.set(x, "suspenseFallback", js.undefined)
      
      inline def setWrappingComponent(value: ComponentType[Any]): Self = StObject.set(x, "wrappingComponent", value.asInstanceOf[js.Any])
      
      inline def setWrappingComponentFunction2(value: (Any, /* context */ js.UndefOr[Any]) => Element | Null): Self = StObject.set(x, "wrappingComponent", js.Any.fromFunction2(value))
      
      inline def setWrappingComponentProps(value: js.Object): Self = StObject.set(x, "wrappingComponentProps", value.asInstanceOf[js.Any])
      
      inline def setWrappingComponentPropsUndefined: Self = StObject.set(x, "wrappingComponentProps", js.undefined)
      
      inline def setWrappingComponentUndefined: Self = StObject.set(x, "wrappingComponent", js.undefined)
    }
  }
}
