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
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enzyme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
        js.Function2[/* node */ ReactElement, /* options */ js.UndefOr[ShallowRendererProps], js.Any]
      ] = js.native
  }
  
  @JSImport("enzyme", "ReactWrapper")
  @js.native
  class ReactWrapper[P, S, C] protected ()
    extends StObject
       with CommonWrapper[P, S, C] {
    def this(nodes: js.Array[Element]) = this()
    def this(nodes: Element) = this()
    def this(
      nodes: js.Array[Element],
      root: ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]]
    ) = this()
    def this(nodes: Element, root: ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]]) = this()
    def this(nodes: js.Array[Element], root: Unit, options: MountRendererProps) = this()
    def this(
      nodes: js.Array[Element],
      root: ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]],
      options: MountRendererProps
    ) = this()
    def this(nodes: Element, root: Unit, options: MountRendererProps) = this()
    def this(
      nodes: Element,
      root: ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]],
      options: MountRendererProps
    ) = this()
    
    /**
      * Returns a new wrapper with child at the specified index.
      */
    def childAt(index: Double): ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    @JSName("childAt")
    def childAt_P2S2[P2, S2](index: Double): ReactWrapper[P2, S2, Component[js.Object, js.Object, js.Any]] = js.native
    
    def children(): ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def children(props: EnzymePropSelector): ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def children(selector: String): ReactWrapper[HTMLAttributes, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def children[P2](component: ComponentType[P2]): ReactWrapper[P2, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    /**
      * Returns a new wrapper with all of the children of the node(s) in the current wrapper. Optionally, a selector
      * can be provided and it will filter the children by this selector.
      */
    def children[P2](statelessComponent: StatelessComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, js.Any]] = js.native
    
    def closest(props: EnzymePropSelector): ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def closest(selector: String): ReactWrapper[HTMLAttributes, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def closest[P2](component: ComponentType[P2]): ReactWrapper[P2, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    /**
      * Returns a wrapper of the first element that matches the selector by traversing up through the current node's
      * ancestors in the tree, starting with itself.
      *
      * Note: can only be called on a wrapper of a single node.
      */
    def closest[P2](statelessComponent: StatelessComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, js.Any]] = js.native
    
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
    
    def filter(props: String): ReactWrapper[P, S, Component[js.Object, js.Object, js.Any]] = js.native
    def filter(props: EnzymePropSelector): ReactWrapper[P, S, Component[js.Object, js.Object, js.Any]] = js.native
    def filter[P2](component: ComponentType[P2]): ReactWrapper[P2, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    /**
      * Removes nodes in the current wrapper that do not match the provided selector.
      * @param selector The selector to match.
      */
    def filter[P2](statelessComponent: StatelessComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, js.Any]] = js.native
    
    def find(props: EnzymePropSelector): ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def find(selector: String): ReactWrapper[HTMLAttributes, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def find[P2](component: ComponentType[P2]): ReactWrapper[P2, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    /**
      * Find every node in the render tree that matches the provided selector.
      * @param selector The selector to match.
      */
    def find[P2](statelessComponent: StatelessComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, js.Any]] = js.native
    
    /**
      * Finds every node in the render tree that returns true for the provided predicate function.
      */
    def findWhere(
      predicate: js.Function1[
          /* wrapper */ ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]], 
          Boolean
        ]
    ): ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    
    @JSName("find")
    def find_props[C2 /* <: Component[js.Object, js.Object, js.Any] */](
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
    def getWrappingComponent(): ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]] = js.native
    
    /**
      * Strips out all the not host-nodes from the list of nodes
      *
      * This method is useful if you want to check for the presence of host nodes
      * (actually rendered HTML elements) ignoring the React nodes.
      */
    def hostNodes(): ReactWrapper[HTMLAttributes, js.Object, Component[js.Object, js.Object, js.Any]] = js.native
    
    def mount(): this.type = js.native
    
    /**
      * Returns a wrapper with the direct parent of the node in the current wrapper.
      */
    def parent(): ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    
    def parents(): ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def parents(props: EnzymePropSelector): ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def parents(selector: String): ReactWrapper[HTMLAttributes, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def parents[P2](component: ComponentType[P2]): ReactWrapper[P2, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    /**
      * Returns a wrapper around all of the parents/ancestors of the wrapper. Does not include the node in the
      * current wrapper. Optionally, a selector can be provided and it will filter the parents by this selector.
      *
      * Note: can only be called on a wrapper of a single node.
      */
    def parents[P2](statelessComponent: StatelessComponent[P2]): ReactWrapper[P2, scala.Nothing, Component[js.Object, js.Object, js.Any]] = js.native
    
    /**
      * Returns a wrapper of the node that matches the provided reference name.
      *
      * NOTE: can only be called on a wrapper instance that is also the root instance.
      */
    def ref(refName: String): ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    @JSName("ref")
    def ref_P2S2[P2, S2](refName: String): ReactWrapper[P2, S2, Component[js.Object, js.Object, js.Any]] = js.native
    
    def unmount(): this.type = js.native
  }
  
  @JSImport("enzyme", "ShallowWrapper")
  @js.native
  class ShallowWrapper[P, S, C] protected ()
    extends StObject
       with CommonWrapper[P, S, C] {
    def this(nodes: js.Array[Element]) = this()
    def this(nodes: Element) = this()
    def this(
      nodes: js.Array[Element],
      root: ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]]
    ) = this()
    def this(nodes: Element, root: ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]]) = this()
    def this(nodes: js.Array[Element], root: Unit, options: ShallowRendererProps) = this()
    def this(
      nodes: js.Array[Element],
      root: ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]],
      options: ShallowRendererProps
    ) = this()
    def this(nodes: Element, root: Unit, options: ShallowRendererProps) = this()
    def this(
      nodes: Element,
      root: ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]],
      options: ShallowRendererProps
    ) = this()
    
    /**
      * Returns a new wrapper with child at the specified index.
      */
    def childAt(index: Double): ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    @JSName("childAt")
    def childAt_P2S2[P2, S2](index: Double): ShallowWrapper[P2, S2, Component[js.Object, js.Object, js.Any]] = js.native
    
    def children(): ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def children(props: EnzymePropSelector): ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def children(selector: String): ShallowWrapper[HTMLAttributes, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def children[P2](component: ComponentType[P2]): ShallowWrapper[P2, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    /**
      * Returns a new wrapper with all of the children of the node(s) in the current wrapper. Optionally, a selector
      * can be provided and it will filter the children by this selector.
      */
    def children[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, js.Any]] = js.native
    
    def closest(props: EnzymePropSelector): ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def closest(selector: String): ShallowWrapper[HTMLAttributes, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def closest[P2](component: ComponentType[P2]): ShallowWrapper[P2, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    /**
      * Returns a wrapper of the first element that matches the selector by traversing up through the current node's
      * ancestors in the tree, starting with itself.
      *
      * Note: can only be called on a wrapper of a single node.
      */
    def closest[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, js.Any]] = js.native
    
    def dive[P2, S2](): ShallowWrapper[P2, S2, Component[js.Object, js.Object, js.Any]] = js.native
    def dive[P2, S2](options: ShallowRendererProps): ShallowWrapper[P2, S2, Component[js.Object, js.Object, js.Any]] = js.native
    /**
      * Shallow render the one non-DOM child of the current wrapper, and return a wrapper around the result.
      * NOTE: can only be called on wrapper of a single non-DOM component element node.
      */
    @JSName("dive")
    def dive_C2_ComponentObjectObjectAnyP2S2[C2 /* <: Component[js.Object, js.Object, js.Any] */, P2, S2](): ShallowWrapper[P2, S2, C2] = js.native
    @JSName("dive")
    def dive_C2_ComponentObjectObjectAnyP2S2[C2 /* <: Component[js.Object, js.Object, js.Any] */, P2, S2](options: ShallowRendererProps): ShallowWrapper[P2, S2, C2] = js.native
    @JSName("dive")
    def dive_P2S2C2[P2, S2, C2](): ShallowWrapper[P2, S2, C2] = js.native
    @JSName("dive")
    def dive_P2S2C2[P2, S2, C2](options: ShallowRendererProps): ShallowWrapper[P2, S2, C2] = js.native
    
    def filter(props: String): ShallowWrapper[P, S, Component[js.Object, js.Object, js.Any]] = js.native
    def filter(props: EnzymePropSelector): ShallowWrapper[P, S, Component[js.Object, js.Object, js.Any]] = js.native
    def filter[P2](component: ComponentType[P2]): ShallowWrapper[P2, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    /**
      * Removes nodes in the current wrapper that do not match the provided selector.
      * @param selector The selector to match.
      */
    def filter[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, js.Any]] = js.native
    
    def find(props: EnzymePropSelector): ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def find(selector: String): ShallowWrapper[HTMLAttributes, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def find[P2](component: ComponentType[P2]): ShallowWrapper[P2, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    /**
      * Find every node in the render tree that matches the provided selector.
      * @param selector The selector to match.
      */
    def find[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, js.Any]] = js.native
    
    /**
      * Finds every node in the render tree that returns true for the provided predicate function.
      */
    def findWhere(
      predicate: js.Function1[
          /* wrapper */ ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]], 
          Boolean
        ]
    ): ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    
    @JSName("find")
    def find_props[C2 /* <: Component[js.Object, js.Object, js.Any] */](
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
    def getWrappingComponent(): ShallowWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]] = js.native
    
    /**
      * Strips out all the not host-nodes from the list of nodes
      *
      * This method is useful if you want to check for the presence of host nodes
      * (actually rendered HTML elements) ignoring the React nodes.
      */
    def hostNodes(): ShallowWrapper[HTMLAttributes, js.Object, Component[js.Object, js.Object, js.Any]] = js.native
    
    /**
      * Returns a wrapper with the direct parent of the node in the current wrapper.
      */
    def parent(): ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    
    def parents(): ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def parents(props: EnzymePropSelector): ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def parents(selector: String): ShallowWrapper[HTMLAttributes, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    def parents[P2](component: ComponentType[P2]): ShallowWrapper[P2, js.Any, Component[js.Object, js.Object, js.Any]] = js.native
    /**
      * Returns a wrapper around all of the parents/ancestors of the wrapper. Does not include the node in the
      * current wrapper. Optionally, a selector can be provided and it will filter the parents by this selector.
      *
      * Note: can only be called on a wrapper of a single node.
      */
    def parents[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, Component[js.Object, js.Object, js.Any]] = js.native
    
    /**
      * Returns a wrapper of the node rendered by the provided render prop.
      */
    def renderProp[PropName /* <: /* keyof P */ String */](prop: PropName): js.Function1[
        /* params */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: P[PropName] */ js.Any
        ], 
        ShallowWrapper[js.Any, scala.Nothing, Component[js.Object, js.Object, js.Any]]
      ] = js.native
    
    def shallow(): ShallowWrapper[P, S, Component[js.Object, js.Object, js.Any]] = js.native
    def shallow(options: ShallowRendererProps): ShallowWrapper[P, S, Component[js.Object, js.Object, js.Any]] = js.native
    
    def unmount(): this.type = js.native
  }
  
  @scala.inline
  def configure(options: Adapter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def mount[P](node: ReactElement): ReactWrapper[P, js.Any, Component[js.Object, js.Object, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(node.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, js.Any, Component[js.Object, js.Object, js.Any]]]
  @scala.inline
  def mount[P](node: ReactElement, options: MountRendererProps): ReactWrapper[P, js.Any, Component[js.Object, js.Object, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, js.Any, Component[js.Object, js.Object, js.Any]]]
  
  @scala.inline
  def mount_C_ComponentObjectObjectAnyPS[C /* <: Component[js.Object, js.Object, js.Any] */, P, S](node: ReactElement): ReactWrapper[P, S, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(node.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, S, C]]
  @scala.inline
  def mount_C_ComponentObjectObjectAnyPS[C /* <: Component[js.Object, js.Object, js.Any] */, P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, S, C]]
  
  @scala.inline
  def mount_PS[P, S](node: ReactElement): ReactWrapper[P, S, Component[js.Object, js.Object, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(node.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, S, Component[js.Object, js.Object, js.Any]]]
  @scala.inline
  def mount_PS[P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, Component[js.Object, js.Object, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, S, Component[js.Object, js.Object, js.Any]]]
  
  @scala.inline
  def render[P, S](node: ReactElement): Cheerio = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(node.asInstanceOf[js.Any]).asInstanceOf[Cheerio]
  @scala.inline
  def render[P, S](node: ReactElement, options: js.Any): Cheerio = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cheerio]
  
  @scala.inline
  def shallow[P](node: ReactElement): ShallowWrapper[P, js.Any, Component[js.Object, js.Object, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(node.asInstanceOf[js.Any]).asInstanceOf[ShallowWrapper[P, js.Any, Component[js.Object, js.Object, js.Any]]]
  @scala.inline
  def shallow[P](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, js.Any, Component[js.Object, js.Object, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, js.Any, Component[js.Object, js.Object, js.Any]]]
  
  @scala.inline
  def shallow_C_ComponentObjectObjectAnyPS[C /* <: Component[js.Object, js.Object, js.Any] */, P, S](node: ReactElement): ShallowWrapper[P, S, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(node.asInstanceOf[js.Any]).asInstanceOf[ShallowWrapper[P, S, C]]
  @scala.inline
  def shallow_C_ComponentObjectObjectAnyPS[C /* <: Component[js.Object, js.Object, js.Any] */, P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, S, C]]
  
  @scala.inline
  def shallow_PS[P, S](node: ReactElement): ShallowWrapper[P, S, Component[js.Object, js.Object, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(node.asInstanceOf[js.Any]).asInstanceOf[ShallowWrapper[P, S, Component[js.Object, js.Object, js.Any]]]
  @scala.inline
  def shallow_PS[P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, Component[js.Object, js.Object, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, S, Component[js.Object, js.Object, js.Any]]]
  
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
    def forEach(fn: js.Function2[/* wrapper */ this.type, /* index */ Double, js.Any]): this.type = js.native
    
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
    extends StObject
       with Instantiable1[/* props */ Props, Component[Props, js.Object, js.Any]]
       with Instantiable2[/* props */ Props, /* context */ js.Any, Component[Props, js.Object, js.Any]]
  
  type ComponentType[Props] = ComponentClass[Props] | StatelessComponent[Props]
  
  type EnzymePropSelector = StringDictionary[js.Any]
  
  type EnzymeSelector = String | StatelessComponent[js.Any] | ComponentClass[js.Any] | EnzymePropSelector
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.DOMAttributes because Already inherited
  - typings.react.mod.AriaAttributes because Already inherited
  - typings.react.mod.SVGAttributes because var conflicts: `aria-activedescendant`, `aria-atomic`, `aria-autocomplete`, `aria-busy`, `aria-checked`, `aria-colcount`, `aria-colindex`, `aria-colspan`, `aria-controls`, `aria-current`, `aria-describedby`, `aria-details`, `aria-disabled`, `aria-dropeffect`, `aria-errormessage`, `aria-expanded`, `aria-flowto`, `aria-grabbed`, `aria-haspopup`, `aria-hidden`, `aria-invalid`, `aria-keyshortcuts`, `aria-label`, `aria-labelledby`, `aria-level`, `aria-live`, `aria-modal`, `aria-multiline`, `aria-multiselectable`, `aria-orientation`, `aria-owns`, `aria-placeholder`, `aria-posinset`, `aria-pressed`, `aria-readonly`, `aria-relevant`, `aria-required`, `aria-roledescription`, `aria-rowcount`, `aria-rowindex`, `aria-rowspan`, `aria-selected`, `aria-setsize`, `aria-sort`, `aria-valuemax`, `aria-valuemin`, `aria-valuenow`, `aria-valuetext`, children, className, color, crossOrigin, dangerouslySetInnerHTML, height, href, id, lang, max, media, method, min, name, onAbort, onAnimationEnd, onAnimationIteration, onAnimationStart, onAuxClick, onBeforeInput, onBlur, onCanPlay, onCanPlayThrough, onChange, onClick, onCompositionEnd, onCompositionStart, onCompositionUpdate, onContextMenu, onCopy, onCut, onDoubleClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEncrypted, onEnded, onError, onFocus, onInput, onInvalid, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPaste, onPause, onPlay, onPlaying, onPointerCancel, onPointerDown, onPointerEnter, onPointerLeave, onPointerMove, onPointerOut, onPointerOver, onPointerUp, onProgress, onRateChange, onReset, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, onTransitionEnd, onVolumeChange, onWaiting, onWheel, role, style, tabIndex, target, `type`, width. Inlined fontFamily, x, points, slope, textAnchor, panose1, pointerEvents, shapeRendering, fontSize, pathLength, markerStart, in, strokeLinecap, repeatDur, strokeDashoffset, radius, alphabetic, vertOriginX, textLength, xmlBase, keyTimes, k3, fontVariant, lightingColor, overlinePosition, calcMode, contentScriptType, filterUnits, requiredExtensions, xlinkType, yChannelSelector, fillOpacity, g2, y2, kerning, viewBox, begin, colorRendering, xmlSpace, dy, floodColor, seed, targetY, xlinkHref, rx, fontSizeAdjust, maskUnits, y, strokeWidth, stitchTiles, underlinePosition, decelerate, keySplines, cx, requiredFeatures, strokeOpacity, paintOrder, allowReorder, local, mathematical, pointsAtY, xChannelSelector, exponent, from, kernelUnitLength, writingMode, d, unicodeBidi, ascent, strokeLinejoin, arabicForm, k, xlinkActuate, dur, by, viewTarget, format, edgeMode, attributeType, refY, u2, string, vMathematical, specularConstant, bbox, stroke, fontStretch, overflow, ry, stdDeviation, vAlphabetic, amplitude, elevation, vertAdvY, textRendering, ideographic, targetX, divisor, scale, xlinkArcrole, x1, repeatCount, fx, unitsPerEm, spreadMethod, xHeight, visibility, glyphName, limitingConeAngle, kernelMatrix, markerEnd, systemLanguage, numOctaves, stopColor, operator, patternContentUnits, capHeight, tableValues, vIdeographic, end, startOffset, externalResourcesRequired, xmlns, clip, dominantBaseline, spacing, xlinkShow, restart, focusable, r, u1, version, g1, origin, refX, strikethroughPosition, attributeName, x2, descent, stemh, gradientTransform, path, dx, baseFrequency, overlineThickness, specularExponent, baselineShift, surfaceScale, stopOpacity, to, orient, order, fontWeight, underlineThickness, letterSpacing, hanging, horizOriginX, mask, widths, z, fillRule, clipRule, glyphRef, accumulate, unicode, patternUnits, azimuth, xmlnsXlink, direction, xlinkTitle, k2, speed, colorInterpolation, maskContentUnits, cursor, markerUnits, colorProfile, colorInterpolationFilters, fill, intercept, glyphOrientationVertical, mode, rotate, pointsAtX, wordSpacing, y1, alignmentBaseline, clipPathUnits, fontStyle, vectorEffect, vHanging, values, in2, diffuseConstant, horizAdvX, pointsAtZ, strikethroughThickness, strokeDasharray, k4, vertOriginY, result, accentHeight, lengthAdjust, filterRes, imageRendering, gradientUnits, patternTransform, markerMid, markerHeight, stemv, strokeMiterlimit, renderingIntent, preserveAlpha, preserveAspectRatio, fy, zoomAndPan, cy, primitiveUnits, display, xmlLang, clipPath, textDecoration, orientation, unicodeRange, k1, markerWidth, offset, opacity, baseProfile, enableBackground, filter, xlinkRole, floodOpacity, contentStyleType, autoReverse, bias, additive, transform, glyphOrientationHorizontal, keyPoints */ trait HTMLAttributes
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
    
    @scala.inline
    def apply(): HTMLAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLAttributes]
    }
    
    @scala.inline
    implicit class HTMLAttributesMutableBuilder[Self <: HTMLAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentHeight(value: Double | String): Self = StObject.set(x, "accentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentHeightUndefined: Self = StObject.set(x, "accentHeight", js.undefined)
      
      @scala.inline
      def setAccumulate(value: none | sum): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
      
      @scala.inline
      def setAdditive(value: replace | sum): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
      
      @scala.inline
      def setAlignmentBaseline(
        value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
      ): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      @scala.inline
      def setAllowReorder(value: no | yes): Self = StObject.set(x, "allowReorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReorderUndefined: Self = StObject.set(x, "allowReorder", js.undefined)
      
      @scala.inline
      def setAlphabetic(value: Double | String): Self = StObject.set(x, "alphabetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphabeticUndefined: Self = StObject.set(x, "alphabetic", js.undefined)
      
      @scala.inline
      def setAmplitude(value: Double | String): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmplitudeUndefined: Self = StObject.set(x, "amplitude", js.undefined)
      
      @scala.inline
      def setArabicForm(value: initial | medial | terminal | isolated): Self = StObject.set(x, "arabicForm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArabicFormUndefined: Self = StObject.set(x, "arabicForm", js.undefined)
      
      @scala.inline
      def setAscent(value: Double | String): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
      
      @scala.inline
      def setAttributeType(value: String): Self = StObject.set(x, "attributeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeTypeUndefined: Self = StObject.set(x, "attributeType", js.undefined)
      
      @scala.inline
      def setAutoReverse(value: Booleanish): Self = StObject.set(x, "autoReverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoReverseUndefined: Self = StObject.set(x, "autoReverse", js.undefined)
      
      @scala.inline
      def setAzimuth(value: Double | String): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
      
      @scala.inline
      def setBaseFrequency(value: Double | String): Self = StObject.set(x, "baseFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseFrequencyUndefined: Self = StObject.set(x, "baseFrequency", js.undefined)
      
      @scala.inline
      def setBaseProfile(value: Double | String): Self = StObject.set(x, "baseProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseProfileUndefined: Self = StObject.set(x, "baseProfile", js.undefined)
      
      @scala.inline
      def setBaselineShift(value: Double | String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      @scala.inline
      def setBbox(value: Double | String): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      @scala.inline
      def setBegin(value: Double | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      @scala.inline
      def setBias(value: Double | String): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      @scala.inline
      def setBy(value: Double | String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByUndefined: Self = StObject.set(x, "by", js.undefined)
      
      @scala.inline
      def setCalcMode(value: Double | String): Self = StObject.set(x, "calcMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalcModeUndefined: Self = StObject.set(x, "calcMode", js.undefined)
      
      @scala.inline
      def setCapHeight(value: Double | String): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
      
      @scala.inline
      def setClip(value: Double | String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      @scala.inline
      def setClipPathUnits(value: Double | String): Self = StObject.set(x, "clipPathUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPathUnitsUndefined: Self = StObject.set(x, "clipPathUnits", js.undefined)
      
      @scala.inline
      def setClipRule(value: Double | String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setColorInterpolation(value: Double | String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
      
      @scala.inline
      def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
      
      @scala.inline
      def setColorProfile(value: Double | String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
      
      @scala.inline
      def setColorRendering(value: Double | String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
      
      @scala.inline
      def setContentScriptType(value: Double | String): Self = StObject.set(x, "contentScriptType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentScriptTypeUndefined: Self = StObject.set(x, "contentScriptType", js.undefined)
      
      @scala.inline
      def setContentStyleType(value: Double | String): Self = StObject.set(x, "contentStyleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleTypeUndefined: Self = StObject.set(x, "contentStyleType", js.undefined)
      
      @scala.inline
      def setCursor(value: Double | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      @scala.inline
      def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setDecelerate(value: Double | String): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecelerateUndefined: Self = StObject.set(x, "decelerate", js.undefined)
      
      @scala.inline
      def setDescent(value: Double | String): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
      
      @scala.inline
      def setDiffuseConstant(value: Double | String): Self = StObject.set(x, "diffuseConstant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffuseConstantUndefined: Self = StObject.set(x, "diffuseConstant", js.undefined)
      
      @scala.inline
      def setDirection(value: Double | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisplay(value: Double | String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setDivisor(value: Double | String): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
      
      @scala.inline
      def setDominantBaseline(value: Double | String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      @scala.inline
      def setDur(value: Double | String): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurUndefined: Self = StObject.set(x, "dur", js.undefined)
      
      @scala.inline
      def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      @scala.inline
      def setEdgeMode(value: Double | String): Self = StObject.set(x, "edgeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeModeUndefined: Self = StObject.set(x, "edgeMode", js.undefined)
      
      @scala.inline
      def setElevation(value: Double | String): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      @scala.inline
      def setEnableBackground(value: Double | String): Self = StObject.set(x, "enableBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBackgroundUndefined: Self = StObject.set(x, "enableBackground", js.undefined)
      
      @scala.inline
      def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setExponent(value: Double | String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      @scala.inline
      def setExternalResourcesRequired(value: Booleanish): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalResourcesRequiredUndefined: Self = StObject.set(x, "externalResourcesRequired", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillRule(value: nonzero | evenodd | inherit): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterRes(value: Double | String): Self = StObject.set(x, "filterRes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterResUndefined: Self = StObject.set(x, "filterRes", js.undefined)
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterUnits(value: Double | String): Self = StObject.set(x, "filterUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUnitsUndefined: Self = StObject.set(x, "filterUnits", js.undefined)
      
      @scala.inline
      def setFloodColor(value: Double | String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      @scala.inline
      def setFloodOpacity(value: Double | String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      @scala.inline
      def setFocusable(value: Booleanish | auto): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeAdjust(value: Double | String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStretch(value: Double | String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      @scala.inline
      def setFontStyle(value: Double | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontVariant(value: Double | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      @scala.inline
      def setFontWeight(value: Double | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setFormat(value: Double | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setFx(value: Double | String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      @scala.inline
      def setFy(value: Double | String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
      
      @scala.inline
      def setG1(value: Double | String): Self = StObject.set(x, "g1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG1Undefined: Self = StObject.set(x, "g1", js.undefined)
      
      @scala.inline
      def setG2(value: Double | String): Self = StObject.set(x, "g2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG2Undefined: Self = StObject.set(x, "g2", js.undefined)
      
      @scala.inline
      def setGlyphName(value: Double | String): Self = StObject.set(x, "glyphName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphNameUndefined: Self = StObject.set(x, "glyphName", js.undefined)
      
      @scala.inline
      def setGlyphOrientationHorizontal(value: Double | String): Self = StObject.set(x, "glyphOrientationHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphOrientationHorizontalUndefined: Self = StObject.set(x, "glyphOrientationHorizontal", js.undefined)
      
      @scala.inline
      def setGlyphOrientationVertical(value: Double | String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      @scala.inline
      def setGlyphRef(value: Double | String): Self = StObject.set(x, "glyphRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphRefUndefined: Self = StObject.set(x, "glyphRef", js.undefined)
      
      @scala.inline
      def setGradientTransform(value: String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
      
      @scala.inline
      def setGradientUnits(value: String): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
      
      @scala.inline
      def setHanging(value: Double | String): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
      
      @scala.inline
      def setHorizAdvX(value: Double | String): Self = StObject.set(x, "horizAdvX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizAdvXUndefined: Self = StObject.set(x, "horizAdvX", js.undefined)
      
      @scala.inline
      def setHorizOriginX(value: Double | String): Self = StObject.set(x, "horizOriginX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizOriginXUndefined: Self = StObject.set(x, "horizOriginX", js.undefined)
      
      @scala.inline
      def setIdeographic(value: Double | String): Self = StObject.set(x, "ideographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdeographicUndefined: Self = StObject.set(x, "ideographic", js.undefined)
      
      @scala.inline
      def setImageRendering(value: Double | String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
      
      @scala.inline
      def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn2(value: Double | String): Self = StObject.set(x, "in2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn2Undefined: Self = StObject.set(x, "in2", js.undefined)
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setIntercept(value: Double | String): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
      
      @scala.inline
      def setK(value: Double | String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK1(value: Double | String): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
      
      @scala.inline
      def setK2(value: Double | String): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
      
      @scala.inline
      def setK3(value: Double | String): Self = StObject.set(x, "k3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK3Undefined: Self = StObject.set(x, "k3", js.undefined)
      
      @scala.inline
      def setK4(value: Double | String): Self = StObject.set(x, "k4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK4Undefined: Self = StObject.set(x, "k4", js.undefined)
      
      @scala.inline
      def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      @scala.inline
      def setKernelMatrix(value: Double | String): Self = StObject.set(x, "kernelMatrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelMatrixUndefined: Self = StObject.set(x, "kernelMatrix", js.undefined)
      
      @scala.inline
      def setKernelUnitLength(value: Double | String): Self = StObject.set(x, "kernelUnitLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelUnitLengthUndefined: Self = StObject.set(x, "kernelUnitLength", js.undefined)
      
      @scala.inline
      def setKerning(value: Double | String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      @scala.inline
      def setKeyPoints(value: Double | String): Self = StObject.set(x, "keyPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPointsUndefined: Self = StObject.set(x, "keyPoints", js.undefined)
      
      @scala.inline
      def setKeySplines(value: Double | String): Self = StObject.set(x, "keySplines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySplinesUndefined: Self = StObject.set(x, "keySplines", js.undefined)
      
      @scala.inline
      def setKeyTimes(value: Double | String): Self = StObject.set(x, "keyTimes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTimesUndefined: Self = StObject.set(x, "keyTimes", js.undefined)
      
      @scala.inline
      def setLengthAdjust(value: Double | String): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: Double | String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLightingColor(value: Double | String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      @scala.inline
      def setLimitingConeAngle(value: Double | String): Self = StObject.set(x, "limitingConeAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitingConeAngleUndefined: Self = StObject.set(x, "limitingConeAngle", js.undefined)
      
      @scala.inline
      def setLocal(value: Double | String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      @scala.inline
      def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      @scala.inline
      def setMarkerHeight(value: Double | String): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
      
      @scala.inline
      def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      @scala.inline
      def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      @scala.inline
      def setMarkerUnits(value: Double | String): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUnitsUndefined: Self = StObject.set(x, "markerUnits", js.undefined)
      
      @scala.inline
      def setMarkerWidth(value: Double | String): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskContentUnits(value: Double | String): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMaskUnits(value: Double | String): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", js.undefined)
      
      @scala.inline
      def setMathematical(value: Double | String): Self = StObject.set(x, "mathematical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMathematicalUndefined: Self = StObject.set(x, "mathematical", js.undefined)
      
      @scala.inline
      def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNumOctaves(value: Double | String): Self = StObject.set(x, "numOctaves", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumOctavesUndefined: Self = StObject.set(x, "numOctaves", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double | String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOperator(value: Double | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setOrder(value: Double | String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrient(value: Double | String): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setOrientation(value: Double | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setOrigin(value: Double | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setOverflow(value: Double | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setOverlinePosition(value: Double | String): Self = StObject.set(x, "overlinePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlinePositionUndefined: Self = StObject.set(x, "overlinePosition", js.undefined)
      
      @scala.inline
      def setOverlineThickness(value: Double | String): Self = StObject.set(x, "overlineThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlineThicknessUndefined: Self = StObject.set(x, "overlineThickness", js.undefined)
      
      @scala.inline
      def setPaintOrder(value: Double | String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
      
      @scala.inline
      def setPanose1(value: Double | String): Self = StObject.set(x, "panose1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanose1Undefined: Self = StObject.set(x, "panose1", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathLength(value: Double | String): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPatternContentUnits(value: String): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
      
      @scala.inline
      def setPatternTransform(value: Double | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
      
      @scala.inline
      def setPatternUnits(value: String): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
      
      @scala.inline
      def setPointerEvents(value: Double | String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtX(value: Double | String): Self = StObject.set(x, "pointsAtX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtXUndefined: Self = StObject.set(x, "pointsAtX", js.undefined)
      
      @scala.inline
      def setPointsAtY(value: Double | String): Self = StObject.set(x, "pointsAtY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtYUndefined: Self = StObject.set(x, "pointsAtY", js.undefined)
      
      @scala.inline
      def setPointsAtZ(value: Double | String): Self = StObject.set(x, "pointsAtZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtZUndefined: Self = StObject.set(x, "pointsAtZ", js.undefined)
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setPreserveAlpha(value: Booleanish): Self = StObject.set(x, "preserveAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAlphaUndefined: Self = StObject.set(x, "preserveAlpha", js.undefined)
      
      @scala.inline
      def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      @scala.inline
      def setPrimitiveUnits(value: Double | String): Self = StObject.set(x, "primitiveUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimitiveUnitsUndefined: Self = StObject.set(x, "primitiveUnits", js.undefined)
      
      @scala.inline
      def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      @scala.inline
      def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRefX(value: Double | String): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
      
      @scala.inline
      def setRefY(value: Double | String): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
      
      @scala.inline
      def setRenderingIntent(value: Double | String): Self = StObject.set(x, "renderingIntent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderingIntentUndefined: Self = StObject.set(x, "renderingIntent", js.undefined)
      
      @scala.inline
      def setRepeatCount(value: Double | String): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
      
      @scala.inline
      def setRepeatDur(value: Double | String): Self = StObject.set(x, "repeatDur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDurUndefined: Self = StObject.set(x, "repeatDur", js.undefined)
      
      @scala.inline
      def setRequiredExtensions(value: Double | String): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredExtensionsUndefined: Self = StObject.set(x, "requiredExtensions", js.undefined)
      
      @scala.inline
      def setRequiredFeatures(value: Double | String): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
      
      @scala.inline
      def setRestart(value: Double | String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setRx(value: Double | String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: Double | String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      @scala.inline
      def setScale(value: Double | String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setShapeRendering(value: Double | String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      @scala.inline
      def setSlope(value: Double | String): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlopeUndefined: Self = StObject.set(x, "slope", js.undefined)
      
      @scala.inline
      def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setSpecularConstant(value: Double | String): Self = StObject.set(x, "specularConstant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecularConstantUndefined: Self = StObject.set(x, "specularConstant", js.undefined)
      
      @scala.inline
      def setSpecularExponent(value: Double | String): Self = StObject.set(x, "specularExponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecularExponentUndefined: Self = StObject.set(x, "specularExponent", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double | String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setSpreadMethod(value: String): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpreadMethodUndefined: Self = StObject.set(x, "spreadMethod", js.undefined)
      
      @scala.inline
      def setStartOffset(value: Double | String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      @scala.inline
      def setStdDeviation(value: Double | String): Self = StObject.set(x, "stdDeviation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdDeviationUndefined: Self = StObject.set(x, "stdDeviation", js.undefined)
      
      @scala.inline
      def setStemh(value: Double | String): Self = StObject.set(x, "stemh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStemhUndefined: Self = StObject.set(x, "stemh", js.undefined)
      
      @scala.inline
      def setStemv(value: Double | String): Self = StObject.set(x, "stemv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStemvUndefined: Self = StObject.set(x, "stemv", js.undefined)
      
      @scala.inline
      def setStitchTiles(value: Double | String): Self = StObject.set(x, "stitchTiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStitchTilesUndefined: Self = StObject.set(x, "stitchTiles", js.undefined)
      
      @scala.inline
      def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      @scala.inline
      def setStopOpacity(value: Double | String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      @scala.inline
      def setStrikethroughPosition(value: Double | String): Self = StObject.set(x, "strikethroughPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrikethroughPositionUndefined: Self = StObject.set(x, "strikethroughPosition", js.undefined)
      
      @scala.inline
      def setStrikethroughThickness(value: Double | String): Self = StObject.set(x, "strikethroughThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrikethroughThicknessUndefined: Self = StObject.set(x, "strikethroughThickness", js.undefined)
      
      @scala.inline
      def setString(value: Double | String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharray(value: String | Double): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      @scala.inline
      def setStrokeDashoffset(value: String | Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      @scala.inline
      def setStrokeLinecap(value: butt | round | square | inherit): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      @scala.inline
      def setStrokeMiterlimit(value: Double | String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setSurfaceScale(value: Double | String): Self = StObject.set(x, "surfaceScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSurfaceScaleUndefined: Self = StObject.set(x, "surfaceScale", js.undefined)
      
      @scala.inline
      def setSystemLanguage(value: Double | String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", js.undefined)
      
      @scala.inline
      def setTableValues(value: Double | String): Self = StObject.set(x, "tableValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableValuesUndefined: Self = StObject.set(x, "tableValues", js.undefined)
      
      @scala.inline
      def setTargetX(value: Double | String): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetXUndefined: Self = StObject.set(x, "targetX", js.undefined)
      
      @scala.inline
      def setTargetY(value: Double | String): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetYUndefined: Self = StObject.set(x, "targetY", js.undefined)
      
      @scala.inline
      def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      @scala.inline
      def setTextDecoration(value: Double | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      @scala.inline
      def setTextLength(value: Double | String): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
      
      @scala.inline
      def setTextRendering(value: Double | String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
      
      @scala.inline
      def setTo(value: Double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setU1(value: Double | String): Self = StObject.set(x, "u1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU1Undefined: Self = StObject.set(x, "u1", js.undefined)
      
      @scala.inline
      def setU2(value: Double | String): Self = StObject.set(x, "u2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU2Undefined: Self = StObject.set(x, "u2", js.undefined)
      
      @scala.inline
      def setUnderlinePosition(value: Double | String): Self = StObject.set(x, "underlinePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlinePositionUndefined: Self = StObject.set(x, "underlinePosition", js.undefined)
      
      @scala.inline
      def setUnderlineThickness(value: Double | String): Self = StObject.set(x, "underlineThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineThicknessUndefined: Self = StObject.set(x, "underlineThickness", js.undefined)
      
      @scala.inline
      def setUnicode(value: Double | String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeBidi(value: Double | String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
      
      @scala.inline
      def setUnicodeRange(value: Double | String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      @scala.inline
      def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
      
      @scala.inline
      def setUnitsPerEm(value: Double | String): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsPerEmUndefined: Self = StObject.set(x, "unitsPerEm", js.undefined)
      
      @scala.inline
      def setVAlphabetic(value: Double | String): Self = StObject.set(x, "vAlphabetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlphabeticUndefined: Self = StObject.set(x, "vAlphabetic", js.undefined)
      
      @scala.inline
      def setVHanging(value: Double | String): Self = StObject.set(x, "vHanging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVHangingUndefined: Self = StObject.set(x, "vHanging", js.undefined)
      
      @scala.inline
      def setVIdeographic(value: Double | String): Self = StObject.set(x, "vIdeographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVIdeographicUndefined: Self = StObject.set(x, "vIdeographic", js.undefined)
      
      @scala.inline
      def setVMathematical(value: Double | String): Self = StObject.set(x, "vMathematical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVMathematicalUndefined: Self = StObject.set(x, "vMathematical", js.undefined)
      
      @scala.inline
      def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setVectorEffect(value: Double | String): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setVertAdvY(value: Double | String): Self = StObject.set(x, "vertAdvY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertAdvYUndefined: Self = StObject.set(x, "vertAdvY", js.undefined)
      
      @scala.inline
      def setVertOriginX(value: Double | String): Self = StObject.set(x, "vertOriginX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertOriginXUndefined: Self = StObject.set(x, "vertOriginX", js.undefined)
      
      @scala.inline
      def setVertOriginY(value: Double | String): Self = StObject.set(x, "vertOriginY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertOriginYUndefined: Self = StObject.set(x, "vertOriginY", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      @scala.inline
      def setViewTarget(value: Double | String): Self = StObject.set(x, "viewTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewTargetUndefined: Self = StObject.set(x, "viewTarget", js.undefined)
      
      @scala.inline
      def setVisibility(value: Double | String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setWidths(value: Double | String): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      @scala.inline
      def setWordSpacing(value: Double | String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      @scala.inline
      def setWritingMode(value: Double | String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
      
      @scala.inline
      def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1(value: Double | String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      @scala.inline
      def setX2(value: Double | String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      @scala.inline
      def setXChannelSelector(value: String): Self = StObject.set(x, "xChannelSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXChannelSelectorUndefined: Self = StObject.set(x, "xChannelSelector", js.undefined)
      
      @scala.inline
      def setXHeight(value: Double | String): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXHeightUndefined: Self = StObject.set(x, "xHeight", js.undefined)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setXlinkActuate(value: String): Self = StObject.set(x, "xlinkActuate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkActuateUndefined: Self = StObject.set(x, "xlinkActuate", js.undefined)
      
      @scala.inline
      def setXlinkArcrole(value: String): Self = StObject.set(x, "xlinkArcrole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkArcroleUndefined: Self = StObject.set(x, "xlinkArcrole", js.undefined)
      
      @scala.inline
      def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
      
      @scala.inline
      def setXlinkRole(value: String): Self = StObject.set(x, "xlinkRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkRoleUndefined: Self = StObject.set(x, "xlinkRole", js.undefined)
      
      @scala.inline
      def setXlinkShow(value: String): Self = StObject.set(x, "xlinkShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkShowUndefined: Self = StObject.set(x, "xlinkShow", js.undefined)
      
      @scala.inline
      def setXlinkTitle(value: String): Self = StObject.set(x, "xlinkTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkTitleUndefined: Self = StObject.set(x, "xlinkTitle", js.undefined)
      
      @scala.inline
      def setXlinkType(value: String): Self = StObject.set(x, "xlinkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkTypeUndefined: Self = StObject.set(x, "xlinkType", js.undefined)
      
      @scala.inline
      def setXmlBase(value: String): Self = StObject.set(x, "xmlBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlBaseUndefined: Self = StObject.set(x, "xmlBase", js.undefined)
      
      @scala.inline
      def setXmlLang(value: String): Self = StObject.set(x, "xmlLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlLangUndefined: Self = StObject.set(x, "xmlLang", js.undefined)
      
      @scala.inline
      def setXmlSpace(value: String): Self = StObject.set(x, "xmlSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlSpaceUndefined: Self = StObject.set(x, "xmlSpace", js.undefined)
      
      @scala.inline
      def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
      
      @scala.inline
      def setXmlnsXlink(value: String): Self = StObject.set(x, "xmlnsXlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsXlinkUndefined: Self = StObject.set(x, "xmlnsXlink", js.undefined)
      
      @scala.inline
      def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: Double | String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      @scala.inline
      def setY2(value: Double | String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      @scala.inline
      def setYChannelSelector(value: String): Self = StObject.set(x, "yChannelSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYChannelSelectorUndefined: Self = StObject.set(x, "yChannelSelector", js.undefined)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setZ(value: Double | String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
      
      @scala.inline
      def setZoomAndPan(value: String): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomAndPanUndefined: Self = StObject.set(x, "zoomAndPan", js.undefined)
    }
  }
  
  type Intercepter[T] = js.Function1[/* intercepter */ T, Unit]
  
  trait Lifecycles
    extends StObject
       with // TODO Maybe some life cycle are missing
  /* lifecycleName */ StringDictionary[js.Any] {
    
    var componentDidUpdate: js.UndefOr[OnSetState] = js.undefined
    
    var getChildContext: js.UndefOr[Dictkey] = js.undefined
    
    var getDerivedStateFromProps: js.UndefOr[HasShouldComponentUpdateBug | Boolean] = js.undefined
    
    var setState: js.UndefOr[js.Any] = js.undefined
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
    var wrappingComponent: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Initial props to pass to the `wrappingComponent` if it is specified.
      */
    var wrappingComponentProps: js.UndefOr[js.Object] = js.undefined
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
      def setWrappingComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "wrappingComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappingComponentFunction2(value: (js.Any, /* context */ js.UndefOr[js.Any]) => Element | Null): Self = StObject.set(x, "wrappingComponent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWrappingComponentProps(value: js.Object): Self = StObject.set(x, "wrappingComponentProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappingComponentPropsUndefined: Self = StObject.set(x, "wrappingComponentProps", js.undefined)
      
      @scala.inline
      def setWrappingComponentUndefined: Self = StObject.set(x, "wrappingComponent", js.undefined)
    }
  }
  
  type Parameters[T] = js.Any
  
  trait ShallowRendererProps extends StObject {
    
    var PROVIDER_VALUES: js.UndefOr[js.Any] = js.undefined
    
    var adapter: js.UndefOr[EnzymeAdapter] = js.undefined
    
    /* TODO what are these doing??? */
    var attachTo: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Context to be passed into the component
      */
    var context: js.UndefOr[js.Any] = js.undefined
    
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
    
    var hydrateIn: js.UndefOr[js.Any] = js.undefined
    
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
    var wrappingComponent: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Initial props to pass to the `wrappingComponent` if it is specified.
      */
    var wrappingComponentProps: js.UndefOr[js.Object] = js.undefined
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
      def setWrappingComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "wrappingComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappingComponentFunction2(value: (js.Any, /* context */ js.UndefOr[js.Any]) => Element | Null): Self = StObject.set(x, "wrappingComponent", js.Any.fromFunction2(value))
      
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
