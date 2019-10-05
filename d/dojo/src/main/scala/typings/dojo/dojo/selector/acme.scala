package typings.dojo.dojo.selector

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/selector/acme.html
  *
  * Returns nodes which match the given CSS3 selector, searching the
  * entire document by default but optionally taking a node to scope
  * the search by. Returns an array.
  * dojo.query() is the swiss army knife of DOM node manipulation in
  * Dojo. Much like Prototype's "$$" (bling-bling) function or JQuery's
  * "$" function, dojo.query provides robust, high-performance
  * CSS-based node selector support with the option of scoping searches
  * to a particular sub-tree of a document.
  *
  * Supported Selectors:
  * acme supports a rich set of CSS3 selectors, including:
  *
  * class selectors (e.g., .foo)
  * node type selectors like span
  *   descendant selectors
  * > child element selectors
  * #foo style ID selectors
  * * universal selector
  * ~, the preceded-by sibling selector
  * +, the immediately preceded-by sibling selector
  * attribute queries:
  * [foo] attribute presence selector
  * [foo='bar'] attribute value exact match
  * [foo~='bar'] attribute value list item match
  * [foo^='bar'] attribute start match
  * [foo$='bar'] attribute end match
  * [foo*='bar'] attribute substring match
  *
  * :first-child, :last-child, and :only-child positional selectors
  * :empty content emtpy selector
  * :checked pseudo selector
  * :nth-child(n), :nth-child(2n+1) style positional calculations
  * :nth-child(even), :nth-child(odd) positional selectors
  * :not(...) negation pseudo selectors
  * Any legal combination of these selectors will work with
  * dojo.query(), including compound selectors ("," delimited).
  * Very complex and useful searches can be constructed with this
  * palette of selectors and when combined with functions for
  * manipulation presented by dojo/NodeList, many types of DOM
  * manipulation operations become very straightforward.
  *
  * Unsupported Selectors:
  * While dojo.query handles many CSS3 selectors, some fall outside of
  * what's reasonable for a programmatic node querying engine to
  * handle. Currently unsupported selectors include:
  *
  * namespace-differentiated selectors of any form
  * all :: pseduo-element selectors
  * certain pseudo-selectors which don't get a lot of day-to-day use:
  * :root, :lang(), :target, :focus
  *
  * all visual and state selectors:
  * :root, :active, :hover, :visited, :link,`:enabled`, `:disabled`
  * :*-of-type pseudo selectors
  *
  * dojo.query and XML Documents:
  * dojo.query (as of dojo 1.2) supports searching XML documents
  * in a case-sensitive manner. If an HTML document is served with
  * a doctype that forces case-sensitivity (e.g., XHTML 1.1
  * Strict), dojo.query() will detect this and "do the right
  * thing". Case sensitivity is dependent upon the document being
  * searched and not the query used. It is therefore possible to
  * use case-sensitive queries on strict sub-documents (iframes,
  * etc.) or XML documents while still assuming case-insensitivity
  * for a host/root document.
  *
  * Non-selector Queries:
  * If something other than a String is passed for the query,
  * dojo.query will return a new dojo/NodeList instance
  * constructed from that parameter alone and all further
  * processing will stop. This means that if you have a reference
  * to a node or NodeList, you can quickly construct a new NodeList
  * from the original by calling dojo.query(node) or
  * dojo.query(list).
  *
  * @param query The CSS3 expression to match against. For details on the syntax ofCSS3 selectors, see http://www.w3.org/TR/css3-selectors/#selectors
  * @param root       OptionalA DOMNode (or node id) to scope the search from. Optional.
  */
@js.native
trait acme extends js.Object {
  def apply(query: String): Unit = js.native
  def apply(query: String, root: String): Unit = js.native
  def apply(query: String, root: HTMLElement): Unit = js.native
  /**
    * function for filtering a NodeList based on a selector, optimized for simple selectors
    *
    * @param nodeList
    * @param filter
    * @param root               Optional
    */
  def filter(nodeList: js.Array[HTMLElement], filter: String): Unit = js.native
  def filter(nodeList: js.Array[HTMLElement], filter: String, root: String): Unit = js.native
  def filter(nodeList: js.Array[HTMLElement], filter: String, root: HTMLElement): Unit = js.native
}

