package typings.enzyme.enzymeMod

import typings.cheerio.Cheerio
import typings.enzyme.Anon_IgnoreProps
import typings.react.reactMod.ReactElement
import typings.std.Element
import typings.std.NonNullable
import typings.std.Pick
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonWrapper[P, S, C] extends js.Object {
  var length: Double = js.native
  /**
    * Returns a wrapper around the node at a given index of the current wrapper.
    */
  def at(index: Double): this.type = js.native
  def contains(node: String): Boolean = js.native
  def contains(node: js.Array[ReactElement]): Boolean = js.native
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
  def debug(options: Anon_IgnoreProps): String = js.native
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
  def getDOMNode[T /* <: Element */](): T = js.native
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
  def prop[K /* <: String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: P[K] */ js.Any = js.native
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
  def setProps[K /* <: String */](props: Pick[P, K]): this.type = js.native
  def setProps[K /* <: String */](props: Pick[P, K], callback: js.Function0[Unit]): this.type = js.native
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
  def setState[K /* <: String */](state: Pick[S, K]): this.type = js.native
  def setState[K /* <: String */](state: Pick[S, K], callback: js.Function0[Unit]): this.type = js.native
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
  def state[K /* <: String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: S[K] */ js.Any = js.native
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

